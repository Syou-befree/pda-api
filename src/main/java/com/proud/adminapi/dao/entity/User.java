package com.proud.adminapi.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "proud_group")
public class User {
  private int id;
  private String userId;
  private String password;
  private String company;
  private String roleType;
  private String roleId;
  private String activeFlg;
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
  @Column(name = "password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Basic
  @Column(name = "company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  @Basic
  @Column(name = "role_type")
  public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  @Basic
  @Column(name = "role_id")
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
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
    User user = (User) o;
    return id == user.id &&
            Objects.equals(userId, user.userId) &&
            Objects.equals(password, user.password) &&
            Objects.equals(company, user.company) &&
            Objects.equals(roleType, user.roleType) &&
            Objects.equals(roleId, user.roleId) &&
            Objects.equals(activeFlg, user.activeFlg) &&
            Objects.equals(createAt, user.createAt) &&
            Objects.equals(createBy, user.createBy) &&
            Objects.equals(updateAt, user.updateAt) &&
            Objects.equals(updateBy, user.updateBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, password, company, roleType, roleId, activeFlg, createAt, createBy, updateAt, updateBy);
  }
}
