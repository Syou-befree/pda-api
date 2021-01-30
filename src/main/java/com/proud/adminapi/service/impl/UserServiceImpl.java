package com.proud.adminapi.service.impl;

import com.proud.adminapi.dao.entity.User;
import com.proud.adminapi.dao.repository.PasswordRepository;
import com.proud.adminapi.dao.repository.UserRepository;
import com.proud.adminapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordRepository passwordRepository;

  @Override
  public User findByUserId(String userId) {
    return userRepository.findByUserId(userId);
  }

}
