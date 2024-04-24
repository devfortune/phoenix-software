package com.mfortune.softwarephoenix.service.impl;

import com.mfortune.softwarephoenix.domain.PhoenixUser;
import com.mfortune.softwarephoenix.dto.UserSignupDto;
import com.mfortune.softwarephoenix.exceptions.DuplicateException;
import com.mfortune.softwarephoenix.exceptions.PasswordsDoNotMatchException;
import com.mfortune.softwarephoenix.repository.UserRepository;
import com.mfortune.softwarephoenix.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public PhoenixUser signup(UserSignupDto signupDto) {
        if (!signupDto.getPassword().equals(signupDto.getConfirmPassword())) {
            throw new PasswordsDoNotMatchException("Passwords do not match");
        }

        Optional<PhoenixUser> optionalUser = userRepository.findByUsername(signupDto.getUsername());
        optionalUser.ifPresent(s -> {
            throw new DuplicateException("User with username " + optionalUser.get().getUsername() + " already exists.");
        });

        PhoenixUser newPhoenixUser = new PhoenixUser();
        newPhoenixUser.setUsername(signupDto.getUsername());
        newPhoenixUser.setPassword(passwordEncoder.encode(signupDto.getPassword()));
        newPhoenixUser.setName(signupDto.getName());
        newPhoenixUser.setSurname(signupDto.getSurname());
        newPhoenixUser.setPatronymic(signupDto.getPatronymic());
        newPhoenixUser.setProfileImageUrl((signupDto.getImageUrl()));
        return userRepository.save(newPhoenixUser);
    }


}
