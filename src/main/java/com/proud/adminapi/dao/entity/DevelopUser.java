package com.proud.adminapi.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "develop_user", schema = "proud_group")
public class DevelopUser {
  private int id;
  private String userId;
  private String company;
  private String office;
  private String mainManagerId;
  private String caseManagerId;
  private String developLanguage;
  private String framework;
  private String os;
  private int salary;
  private String status;
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
  @Column(name = "main_manager_id")
  public String getMainManagerId() {
    return mainManagerId;
  }

  public void setMainManagerId(String mainManagerId) {
    this.mainManagerId = mainManagerId;
  }

  @Basic
  @Column(name = "case_manager_id")
  public String getCaseManagerId() {
    return caseManagerId;
  }

  public void setCaseManagerId(String caseManagerId) {
    this.caseManagerId = caseManagerId;
  }

  @Basic
  @Column(name = "develop_language")
  public String getDevelopLanguage() {
    return developLanguage;
  }

  public void setDevelopLanguage(String developLanguage) {
    this.developLanguage = developLanguage;
  }

  @Basic
  @Column(name = "framework")
  public String getFramework() {
    return framework;
  }

  public void setFramework(String framework) {
    this.framework = framework;
  }

  @Basic
  @Column(name = "os")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
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
  @Column(name = "status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
    DevelopUser that = (DevelopUser) o;
    return id == that.id &&
            salary == that.salary &&
            Objects.equals(userId, that.userId) &&
            Objects.equals(company, that.company) &&
            Objects.equals(office, that.office) &&
            Objects.equals(mainManagerId, that.mainManagerId) &&
            Objects.equals(caseManagerId, that.caseManagerId) &&
            Objects.equals(developLanguage, that.developLanguage) &&
            Objects.equals(framework, that.framework) &&
            Objects.equals(os, that.os) &&
            Objects.equals(status, that.status) &&
            Objects.equals(remoteStatus, that.remoteStatus) &&
            Objects.equals(activeFlg, that.activeFlg) &&
            Objects.equals(createAt, that.createAt) &&
            Objects.equals(createBy, that.createBy) &&
            Objects.equals(updateAt, that.updateAt) &&
            Objects.equals(updateBy, that.updateBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, company, office, mainManagerId, caseManagerId, developLanguage, framework, os, salary, status, remoteStatus, activeFlg, createAt, createBy, updateAt, updateBy);
  }
}
