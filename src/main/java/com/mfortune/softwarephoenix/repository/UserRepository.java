package com.mfortune.softwarephoenix.repository;

import com.mfortune.softwarephoenix.domain.PhoenixUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<PhoenixUser, Integer> {
    Optional<PhoenixUser> findByUsername(String username);

}
