package com.learning.springsecurityjpa;

import com.learning.springsecurityjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findUserByUsername(String username);
}
