package com.proud.adminapi.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "password", schema = "proud_group")
public class Password {
  private int id;
  private String userId;
  private String password;
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
    Password password1 = (Password) o;
    return id == password1.id &&
            Objects.equals(userId, password1.userId) &&
            Objects.equals(password, password1.password) &&
            Objects.equals(createAt, password1.createAt) &&
            Objects.equals(createBy, password1.createBy) &&
            Objects.equals(updateAt, password1.updateAt) &&
            Objects.equals(updateBy, password1.updateBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, password, createAt, createBy, updateAt, updateBy);
  }
}
