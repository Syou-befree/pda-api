package com.proud.adminapi.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "proceeds", schema = "proud_group")
public class Proceeds {
  private int id;
  private String salesUserId;
  private String developUserId;
  private String customerName;
  private String customerSalesName;
  private String customerSalesTel;
  private int casePay;
  private String remoteStatus;
  private int commutingCost;
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
  @Column(name = "case_pay")
  public int getCasePay() {
    return casePay;
  }

  public void setCasePay(int casePay) {
    this.casePay = casePay;
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
    Proceeds proceeds = (Proceeds) o;
    return id == proceeds.id &&
            casePay == proceeds.casePay &&
            commutingCost == proceeds.commutingCost &&
            Objects.equals(salesUserId, proceeds.salesUserId) &&
            Objects.equals(developUserId, proceeds.developUserId) &&
            Objects.equals(customerName, proceeds.customerName) &&
            Objects.equals(customerSalesName, proceeds.customerSalesName) &&
            Objects.equals(customerSalesTel, proceeds.customerSalesTel) &&
            Objects.equals(remoteStatus, proceeds.remoteStatus) &&
            Objects.equals(activeFlg, proceeds.activeFlg) &&
            Objects.equals(createAt, proceeds.createAt) &&
            Objects.equals(createBy, proceeds.createBy) &&
            Objects.equals(updateAt, proceeds.updateAt) &&
            Objects.equals(updateBy, proceeds.updateBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, salesUserId, developUserId, customerName, customerSalesName, customerSalesTel, casePay, remoteStatus, commutingCost, activeFlg, createAt, createBy, updateAt, updateBy);
  }
}
