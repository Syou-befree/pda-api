package com.proud.adminapi.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "login_user", schema = "proud_group")
public class LoginUser {
  private int id;
  private String userId;
  private String token;
  private String activeFlg;
  private Timestamp endAt;
  private Timestamp createAt;
  private String createBy;
  private Timestamp updateAt;
  private String updateBy;

  @Id
  @Column(name = "id")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Basic
  @Column(name = "token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Basic
  @Column(name = "active_flg")
  public String getActiveFlg() {
    return activeFlg;
  }

  public void setActiveFlg(String activeFlg) {
    this.activeFlg = activeFlg;
  }

  @Basic
  @Column(name = "end_at")
  public Timestamp getEndAt() {
    return endAt;
  }

  public void setEndAt(Timestamp endAt) {
    this.endAt = endAt;
  }

  @Basic
  @Column(name = "create_at")
  public Timestamp getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Timestamp createAt) {
    this.createAt = createAt;
  }

  @Basic
  @Column(name = "create_by")
  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  @Basic
  @Column(name = "update_at")
  public Timestamp getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Timestamp updateAt) {
    this.updateAt = updateAt;
  }

  @Basic
  @Column(name = "update_by")
  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LoginUser loginUser = (LoginUser) o;
    return id == loginUser.id &&
            Objects.equals(userId, loginUser.userId) &&
            Objects.equals(token, loginUser.token) &&
            Objects.equals(activeFlg, loginUser.activeFlg) &&
            Objects.equals(endAt, loginUser.endAt) &&
            Objects.equals(createAt, loginUser.createAt) &&
            Objects.equals(createBy, loginUser.createBy) &&
            Objects.equals(updateAt, loginUser.updateAt) &&
            Objects.equals(updateBy, loginUser.updateBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, token, activeFlg, endAt, createAt, createBy, updateAt, updateBy);
  }
}
