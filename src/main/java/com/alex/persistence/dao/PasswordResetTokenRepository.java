package com.alex.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.persistence.model.PasswordResetToken;
import com.alex.persistence.model.User;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {

    PasswordResetToken findByToken(String token);

    PasswordResetToken findByUser(User user);

}
