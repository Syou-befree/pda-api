package com.proud.adminapi.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user_detail", schema = "proud_group")
public class UserDetail {
  private int id;
  private String userId;
  private String telNo;
  private String email;
  private String firstName;
  private String lastName;
  private String firstNameKana;
  private String lastNameKana;
  private int age;
  private String zipCode;
  private String address;
  private String trainStation;
  private Timestamp recruitAt;
  private Timestamp quitAt;
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
  @Column(name = "tel_no")
  public String getTelNo() {
    return telNo;
  }

  public void setTelNo(String telNo) {
    this.telNo = telNo;
  }

  @Basic
  @Column(name = "email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Basic
  @Column(name = "first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Basic
  @Column(name = "last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Basic
  @Column(name = "first_name_kana")
  public String getFirstNameKana() {
    return firstNameKana;
  }

  public void setFirstNameKana(String firstNameKana) {
    this.firstNameKana = firstNameKana;
  }

  @Basic
  @Column(name = "last_name_kana")
  public String getLastNameKana() {
    return lastNameKana;
  }

  public void setLastNameKana(String lastNameKana) {
    this.lastNameKana = lastNameKana;
  }

  @Basic
  @Column(name = "age")
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Basic
  @Column(name = "zip_code")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  @Basic
  @Column(name = "address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Basic
  @Column(name = "train_station")
  public String getTrainStation() {
    return trainStation;
  }

  public void setTrainStation(String trainStation) {
    this.trainStation = trainStation;
  }

  @Basic
  @Column(name = "recruit_at")
  public Timestamp getRecruitAt() {
    return recruitAt;
  }

  public void setRecruitAt(Timestamp recruitAt) {
    this.recruitAt = recruitAt;
  }

  @Basic
  @Column(name = "quit_at")
  public Timestamp getQuitAt() {
    return quitAt;
  }

  public void setQuitAt(Timestamp quitAt) {
    this.quitAt = quitAt;
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
    UserDetail that = (UserDetail) o;
    return id == that.id &&
            age == that.age &&
            Objects.equals(userId, that.userId) &&
            Objects.equals(telNo, that.telNo) &&
            Objects.equals(email, that.email) &&
            Objects.equals(firstName, that.firstName) &&
            Objects.equals(lastName, that.lastName) &&
            Objects.equals(firstNameKana, that.firstNameKana) &&
            Objects.equals(lastNameKana, that.lastNameKana) &&
            Objects.equals(zipCode, that.zipCode) &&
            Objects.equals(address, that.address) &&
            Objects.equals(trainStation, that.trainStation) &&
            Objects.equals(recruitAt, that.recruitAt) &&
            Objects.equals(quitAt, that.quitAt) &&
            Objects.equals(createAt, that.createAt) &&
            Objects.equals(createBy, that.createBy) &&
            Objects.equals(updateAt, that.updateAt) &&
            Objects.equals(updateBy, that.updateBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, telNo, email, firstName, lastName, firstNameKana, lastNameKana, age, zipCode, address, trainStation, recruitAt, quitAt, createAt, createBy, updateAt, updateBy);
  }
}
