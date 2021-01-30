package com.proud.adminapi.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "case", schema = "proud_group")
public class Case {
  private int id;
  private String salesUserId;
  private String developUserId;
  private String customerName;
  private String customerSalesName;
  private String customerSalesTel;
  private String customerSalesMail;
  private int casePay;
  private String developLanguage;
  private String remoteStatus;
  private int commutingCost;
  private Timestamp startAt;
  private Timestamp endAt;
  private String caseDetail;
  private String deleteFlg;
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
  @Column(name = "sales_user_id")
  public String getSalesUserId() {
    return salesUserId;
  }

  public void setSalesUserId(String salesUserId) {
    this.salesUserId = salesUserId;
  }

  @Basic
  @Column(name = "develop_user_id")
  public String getDevelopUserId() {
    return developUserId;
  }

  public void setDevelopUserId(String developUserId) {
    this.developUserId = developUserId;
  }

  @Basic
  @Column(name = "customer_name")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  @Basic
  @Column(name = "customer_sales_name")
  public String getCustomerSalesName() {
    return customerSalesName;
  }

  public void setCustomerSalesName(String customerSalesName) {
    this.customerSalesName = customerSalesName;
  }

  @Basic
  @Column(name = "customer_sales_tel")
  public String getCustomerSalesTel() {
    return customerSalesTel;
  }

  public void setCustomerSalesTel(String customerSalesTel) {
    this.customerSalesTel = customerSalesTel;
  }

  @Basic
  @Column(name = "customer_sales_mail")
  public String getCustomerSalesMail() {
    return customerSalesMail;
  }

  public void setCustomerSalesMail(String customerSalesMail) {
    this.customerSalesMail = customerSalesMail;
  }

  @Basic
  @Column(name = "case_pay")
  public int getCasePay() {
    return casePay;
  }

  public void setCasePay(int casePay) {
    this.casePay = casePay;
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
  @Column(name = "remote_status")
  public String getRemoteStatus() {
    return remoteStatus;
  }

  public void setRemoteStatus(String remoteStatus) {
    this.remoteStatus = remoteStatus;
  }

  @Basic
  @Column(name = "commuting_cost")
  public int getCommutingCost() {
    return commutingCost;
  }

  public void setCommutingCost(int commutingCost) {
    this.commutingCost = commutingCost;
  }

  @Basic
  @Column(name = "start_at")
  public Timestamp getStartAt() {
    return startAt;
  }

  public void setStartAt(Timestamp startAt) {
    this.startAt = startAt;
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
  @Column(name = "case_detail")
  public String getCaseDetail() {
    return caseDetail;
  }

  public void setCaseDetail(String caseDetail) {
    this.caseDetail = caseDetail;
  }

  @Basic
  @Column(name = "delete_flg")
  public String getDeleteFlg() {
    return deleteFlg;
  }

  public void setDeleteFlg(String deleteFlg) {
    this.deleteFlg = deleteFlg;
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
    Case aCase = (Case) o;
    return id == aCase.id &&
            casePay == aCase.casePay &&
            commutingCost == aCase.commutingCost &&
            Objects.equals(salesUserId, aCase.salesUserId) &&
            Objects.equals(developUserId, aCase.developUserId) &&
            Objects.equals(customerName, aCase.customerName) &&
            Objects.equals(customerSalesName, aCase.customerSalesName) &&
            Objects.equals(customerSalesTel, aCase.customerSalesTel) &&
            Objects.equals(customerSalesMail, aCase.customerSalesMail) &&
            Objects.equals(developLanguage, aCase.developLanguage) &&
            Objects.equals(remoteStatus, aCase.remoteStatus) &&
            Objects.equals(startAt, aCase.startAt) &&
            Objects.equals(endAt, aCase.endAt) &&
            Objects.equals(caseDetail, aCase.caseDetail) &&
            Objects.equals(deleteFlg, aCase.deleteFlg) &&
            Objects.equals(activeFlg, aCase.activeFlg) &&
            Objects.equals(createAt, aCase.createAt) &&
            Objects.equals(createBy, aCase.createBy) &&
            Objects.equals(updateAt, aCase.updateAt) &&
            Objects.equals(updateBy, aCase.updateBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, salesUserId, developUserId, customerName, customerSalesName, customerSalesTel, customerSalesMail, casePay, developLanguage, remoteStatus, commutingCost, startAt, endAt, caseDetail, deleteFlg, activeFlg, createAt, createBy, updateAt, updateBy);
  }
}
