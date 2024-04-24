package com.mfortune.softwarephoenix.controller;

import com.mfortune.softwarephoenix.config.JwtHelper;
import com.mfortune.softwarephoenix.domain.PhoenixUser;
import com.mfortune.softwarephoenix.dto.LoginDto;
import com.mfortune.softwarephoenix.dto.UserSignupDto;
import com.mfortune.softwarephoenix.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class  AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<Void> registerUser(@Valid @RequestBody UserSignupDto signupDto) throws Exception {
        PhoenixUser phoenixUser = userService.signup(signupDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping(value = "/login")
    public ResponseEntity<String> login(@Valid @RequestBody LoginDto loginDto) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));
        String token = JwtHelper.generateToken(loginDto.getUsername());
        return ResponseEntity.ok(token);
    }

}
