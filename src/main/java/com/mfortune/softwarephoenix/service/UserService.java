package com.mfortune.softwarephoenix.service;

import com.mfortune.softwarephoenix.domain.PhoenixUser;
import com.mfortune.softwarephoenix.dto.UserSignupDto;

public interface UserService {
    PhoenixUser signup(UserSignupDto signupDto) throws Exception;
}
