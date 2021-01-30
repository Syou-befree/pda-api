package com.proud.adminapi.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sales_user", schema = "proud_group")
public class SalesUser {
  private int id;
  private String userId;
  private String company;
  private String office;
  private int manageNumber;
  private int salary;
  private String remoteStatus;
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
  @Column(name = "company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  @Basic
  @Column(name = "office")
  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  @Basic
  @Column(name = "manage_number")
  public int getManageNumber() {
    return manageNumber;
  }

  public void setManageNumber(int manageNumber) {
    this.manageNumber = manageNumber;
  }

  @Basic
  @Column(name = "salary")
  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Basic
  @Column(name = "remote_status")
  public String getRemoteStatus() {
    return remoteStatus;
  }

  public void setRemoteStatus(String remoteStatus) {
    this.remoteStatus = remoteStatus;
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
    SalesUser salesUser = (SalesUser) o;
    return id == salesUser.id &&
            manageNumber == salesUser.manageNumber &&
            salary == salesUser.salary &&
            Objects.equals(userId, salesUser.userId) &&
            Objects.equals(company, salesUser.company) &&
            Objects.equals(office, salesUser.office) &&
            Objects.equals(remoteStatus, salesUser.remoteStatus) &&
            Objects.equals(activeFlg, salesUser.activeFlg) &&
            Objects.equals(createAt, salesUser.createAt) &&
            Objects.equals(createBy, salesUser.createBy) &&
            Objects.equals(updateAt, salesUser.updateAt) &&
            Objects.equals(updateBy, salesUser.updateBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, company, office, manageNumber, salary, remoteStatus, activeFlg, createAt, createBy, updateAt, updateBy);
  }
}
