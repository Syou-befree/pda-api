package com.proud.adminapi.dao.repository;

import com.proud.adminapi.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  User findByUserId(String userId);

}
