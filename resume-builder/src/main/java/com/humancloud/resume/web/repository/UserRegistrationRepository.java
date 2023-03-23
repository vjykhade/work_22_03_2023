package com.humancloud.resume.web.repository;

import com.humancloud.resume.web.entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, String> {
    UserRegistration findByEmail(String email);
}
