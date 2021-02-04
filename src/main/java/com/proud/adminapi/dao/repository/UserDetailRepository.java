package com.proud.adminapi.dao.repository;

import com.proud.adminapi.dao.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDetailRepository extends JpaRepository<UserDetail, Integer> {

  UserDetail findByUserId(String userId);

  @Query("from UserDetail")
  List<UserDetail> findAll();

}
