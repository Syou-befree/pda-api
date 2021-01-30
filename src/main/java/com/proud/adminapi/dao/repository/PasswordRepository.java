package com.proud.adminapi.dao.repository;

import com.proud.adminapi.dao.entity.Password;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRepository extends JpaRepository<Password, Integer> {

  Password findByUserId(String userId);
}