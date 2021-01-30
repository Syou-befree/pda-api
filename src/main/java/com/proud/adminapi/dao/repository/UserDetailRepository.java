package com.proud.adminapi.dao.repository;

import com.proud.adminapi.dao.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepository extends JpaRepository<UserDetail, Integer> {

}
