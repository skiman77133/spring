package com.alex.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.persistence.model.User;
import com.alex.persistence.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

    VerificationToken findByToken(String token);

    VerificationToken findByUser(User user);

}
