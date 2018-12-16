/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

import java.sql.Date;

/**
 *
 * @author Trí Nguyễn
 */
public class ARSaleOrderItemsInfo {
    int ARSaleOrderItemID;
    Date AACreatedDate;
    String AACreatedUser;
    Date AAUpdatedDate;
    String AAUpdatedUser;
    String AAStatus;
    int FK_ARCustomerID;
    int FK_HREmployeeID;
    int FK_ARSaleOrderID;
    int FK_ICProductID;
    String ARSaleOrderItemNo;
    String ARSaleOrderItemName;
    String ARSaleOrderItemDesc;
    String ARSaleOrderItemComment;
    String ARSaleOrderItemStatus;
    Date ARSaleOrderItemDate;
    Double ARSaleOrderItemDiscountPerCent;
    Double ARSaleOrderItemDiscountAmount;
    Double ARSaleOrderItemTaxPercent;
    Double ARSaleOrderItemTaxAmount;
    Double ARSaleOrderItemShippingFees;
    Double ARSaleOrderItemTotalAmount;
    String ARSaleOrderItemPaymentMethod;
    String ARSaleOrderItemPaymentStatus;
    Double ARSaleOrderItemUnitCost;
    Double ARSaleOrderItemQty;

    public ARSaleOrderItemsInfo() {
    }

    public ARSaleOrderItemsInfo(int ARSaleOrderItemID, Date AACreatedDate, String AACreatedUser, Date AAUpdatedDate, String AAUpdatedUser, String AAStatus, int FK_ARCustomerID, int FK_HREmployeeID, int FK_ARSaleOrderID, int FK_ICProductID, String ARSaleOrderItemNo, String ARSaleOrderItemName, String ARSaleOrderItemDesc, String ARSaleOrderItemComment, String ARSaleOrderItemStatus, Date ARSaleOrderItemDate, Double ARSaleOrderItemDiscountPerCent, Double ARSaleOrderItemDiscountAmount, Double ARSaleOrderItemTaxPercent, Double ARSaleOrderItemTaxAmount, Double ARSaleOrderItemShippingFees, Double ARSaleOrderItemTotalAmount, String ARSaleOrderItemPaymentMethod, String ARSaleOrderItemPaymentStatus, Double ARSaleOrderItemUnitCost, Double ARSaleOrderItemQty) {
        this.ARSaleOrderItemID = ARSaleOrderItemID;
        this.AACreatedDate = AACreatedDate;
        this.AACreatedUser = AACreatedUser;
        this.AAUpdatedDate = AAUpdatedDate;
        this.AAUpdatedUser = AAUpdatedUser;
        this.AAStatus = AAStatus;
        this.FK_ARCustomerID = FK_ARCustomerID;
        this.FK_HREmployeeID = FK_HREmployeeID;
        this.FK_ARSaleOrderID = FK_ARSaleOrderID;
        this.FK_ICProductID = FK_ICProductID;
        this.ARSaleOrderItemNo = ARSaleOrderItemNo;
        this.ARSaleOrderItemName = ARSaleOrderItemName;
        this.ARSaleOrderItemDesc = ARSaleOrderItemDesc;
        this.ARSaleOrderItemComment = ARSaleOrderItemComment;
        this.ARSaleOrderItemStatus = ARSaleOrderItemStatus;
        this.ARSaleOrderItemDate = ARSaleOrderItemDate;
        this.ARSaleOrderItemDiscountPerCent = ARSaleOrderItemDiscountPerCent;
        this.ARSaleOrderItemDiscountAmount = ARSaleOrderItemDiscountAmount;
        this.ARSaleOrderItemTaxPercent = ARSaleOrderItemTaxPercent;
        this.ARSaleOrderItemTaxAmount = ARSaleOrderItemTaxAmount;
        this.ARSaleOrderItemShippingFees = ARSaleOrderItemShippingFees;
        this.ARSaleOrderItemTotalAmount = ARSaleOrderItemTotalAmount;
        this.ARSaleOrderItemPaymentMethod = ARSaleOrderItemPaymentMethod;
        this.ARSaleOrderItemPaymentStatus = ARSaleOrderItemPaymentStatus;
        this.ARSaleOrderItemUnitCost = ARSaleOrderItemUnitCost;
        this.ARSaleOrderItemQty = ARSaleOrderItemQty;
    }

    public int getARSaleOrderItemID() {
        return ARSaleOrderItemID;
    }

    public void setARSaleOrderItemID(int ARSaleOrderItemID) {
        this.ARSaleOrderItemID = ARSaleOrderItemID;
    }

    public Date getAACreatedDate() {
        return AACreatedDate;
    }

    public void setAACreatedDate(Date AACreatedDate) {
        this.AACreatedDate = AACreatedDate;
    }

    public String getAACreatedUser() {
        return AACreatedUser;
    }

    public void setAACreatedUser(String AACreatedUser) {
        this.AACreatedUser = AACreatedUser;
    }

    public Date getAAUpdatedDate() {
        return AAUpdatedDate;
    }

    public void setAAUpdatedDate(Date AAUpdatedDate) {
        this.AAUpdatedDate = AAUpdatedDate;
    }

    public String getAAUpdatedUser() {
        return AAUpdatedUser;
    }

    public void setAAUpdatedUser(String AAUpdatedUser) {
        this.AAUpdatedUser = AAUpdatedUser;
    }

    public String getAAStatus() {
        return AAStatus;
    }

    public void setAAStatus(String AAStatus) {
        this.AAStatus = AAStatus;
    }

    public int getFK_ARCustomerID() {
        return FK_ARCustomerID;
    }

    public void setFK_ARCustomerID(int FK_ARCustomerID) {
        this.FK_ARCustomerID = FK_ARCustomerID;
    }

    public int getFK_HREmployeeID() {
        return FK_HREmployeeID;
    }

    public void setFK_HREmployeeID(int FK_HREmployeeID) {
        this.FK_HREmployeeID = FK_HREmployeeID;
    }

    public int getFK_ARSaleOrderID() {
        return FK_ARSaleOrderID;
    }

    public void setFK_ARSaleOrderID(int FK_ARSaleOrderID) {
        this.FK_ARSaleOrderID = FK_ARSaleOrderID;
    }

    public int getFK_ICProductID() {
        return FK_ICProductID;
    }

    public void setFK_ICProductID(int FK_ICProductID) {
        this.FK_ICProductID = FK_ICProductID;
    }

    public String getARSaleOrderItemNo() {
        return ARSaleOrderItemNo;
    }

    public void setARSaleOrderItemNo(String ARSaleOrderItemNo) {
        this.ARSaleOrderItemNo = ARSaleOrderItemNo;
    }

    public String getARSaleOrderItemName() {
        return ARSaleOrderItemName;
    }

    public void setARSaleOrderItemName(String ARSaleOrderItemName) {
        this.ARSaleOrderItemName = ARSaleOrderItemName;
    }

    public String getARSaleOrderItemDesc() {
        return ARSaleOrderItemDesc;
    }

    public void setARSaleOrderItemDesc(String ARSaleOrderItemDesc) {
        this.ARSaleOrderItemDesc = ARSaleOrderItemDesc;
    }

    public String getARSaleOrderItemComment() {
        return ARSaleOrderItemComment;
    }

    public void setARSaleOrderItemComment(String ARSaleOrderItemComment) {
        this.ARSaleOrderItemComment = ARSaleOrderItemComment;
    }

    public String getARSaleOrderItemStatus() {
        return ARSaleOrderItemStatus;
    }

    public void setARSaleOrderItemStatus(String ARSaleOrderItemStatus) {
        this.ARSaleOrderItemStatus = ARSaleOrderItemStatus;
    }

    public Date getARSaleOrderItemDate() {
        return ARSaleOrderItemDate;
    }

    public void setARSaleOrderItemDate(Date ARSaleOrderItemDate) {
        this.ARSaleOrderItemDate = ARSaleOrderItemDate;
    }

    public Double getARSaleOrderItemDiscountPerCent() {
        return ARSaleOrderItemDiscountPerCent;
    }

    public void setARSaleOrderItemDiscountPerCent(Double ARSaleOrderItemDiscountPerCent) {
        this.ARSaleOrderItemDiscountPerCent = ARSaleOrderItemDiscountPerCent;
    }

    public Double getARSaleOrderItemDiscountAmount() {
        return ARSaleOrderItemDiscountAmount;
    }

    public void setARSaleOrderItemDiscountAmount(Double ARSaleOrderItemDiscountAmount) {
        this.ARSaleOrderItemDiscountAmount = ARSaleOrderItemDiscountAmount;
    }

    public Double getARSaleOrderItemTaxPercent() {
        return ARSaleOrderItemTaxPercent;
    }

    public void setARSaleOrderItemTaxPercent(Double ARSaleOrderItemTaxPercent) {
        this.ARSaleOrderItemTaxPercent = ARSaleOrderItemTaxPercent;
    }

    public Double getARSaleOrderItemTaxAmount() {
        return ARSaleOrderItemTaxAmount;
    }

    public void setARSaleOrderItemTaxAmount(Double ARSaleOrderItemTaxAmount) {
        this.ARSaleOrderItemTaxAmount = ARSaleOrderItemTaxAmount;
    }

    public Double getARSaleOrderItemShippingFees() {
        return ARSaleOrderItemShippingFees;
    }

    public void setARSaleOrderItemShippingFees(Double ARSaleOrderItemShippingFees) {
        this.ARSaleOrderItemShippingFees = ARSaleOrderItemShippingFees;
    }

    public Double getARSaleOrderItemTotalAmount() {
        return ARSaleOrderItemTotalAmount;
    }

    public void setARSaleOrderItemTotalAmount(Double ARSaleOrderItemTotalAmount) {
        this.ARSaleOrderItemTotalAmount = ARSaleOrderItemTotalAmount;
    }

    public String getARSaleOrderItemPaymentMethod() {
        return ARSaleOrderItemPaymentMethod;
    }

    public void setARSaleOrderItemPaymentMethod(String ARSaleOrderItemPaymentMethod) {
        this.ARSaleOrderItemPaymentMethod = ARSaleOrderItemPaymentMethod;
    }

    public String getARSaleOrderItemPaymentStatus() {
        return ARSaleOrderItemPaymentStatus;
    }

    public void setARSaleOrderItemPaymentStatus(String ARSaleOrderItemPaymentStatus) {
        this.ARSaleOrderItemPaymentStatus = ARSaleOrderItemPaymentStatus;
    }

    public Double getARSaleOrderItemUnitCost() {
        return ARSaleOrderItemUnitCost;
    }

    public void setARSaleOrderItemUnitCost(Double ARSaleOrderItemUnitCost) {
        this.ARSaleOrderItemUnitCost = ARSaleOrderItemUnitCost;
    }

    public Double getARSaleOrderItemQty() {
        return ARSaleOrderItemQty;
    }

    public void setARSaleOrderItemQty(Double ARSaleOrderItemQty) {
        this.ARSaleOrderItemQty = ARSaleOrderItemQty;
    }
    
    
}
