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
public class ARSaleOrdersInfo {

    int ARSaleOrderID;
    Date AACreatedDate;
    String AACreatedUser;
    Date AAUpdatedDate;
    String AAUpdatedUser;
    String AAStatus;
    int FK_ARCustomerID;
    int FK_HREmployeeID;
    String ARSaleOrderNo;
    String ARSaleOrderName;
    String ARSaleOrderDesc;
    String ARSaleOrderComment;
    String ARSaleOrderStatus;
    Date ARSaleOrderDate;
    Double ARSaleOrderDiscountPerCent;
    Double ARSaleOrderDiscountAmount;
    Double ARSaleOrderTaxPercent;
    Double ARSaleOrderTaxAmount;
    Double ARSaleOrderShippingFees;
    Double ARSaleOrderTotalAmount;
    String ARSaleOrderPaymentMethod;
    String ARSaleOrderPaymentStatus;
    ARCustomersInfo customer;
    HREmployeesInfo employee;

    public ARSaleOrdersInfo() {
    }

    public ARSaleOrdersInfo(int ARSaleOrderID, Date AACreatedDate, String AACreatedUser, Date AAUpdatedDate, String AAUpdatedUser, String AAStatus, int FK_ARCustomerID, int FK_HREmployeeID, String ARSaleOrderNo, String ARSaleOrderName, String ARSaleOrderDesc, String ARSaleOrderComment, String ARSaleOrderStatus, Date ARSaleOrderDate, Double ARSaleOrderDiscountPerCent, Double ARSaleOrderDiscountAmount, Double ARSaleOrderTaxPercent, Double ARSaleOrderTaxAmount, Double ARSaleOrderShippingFees, Double ARSaleOrderTotalAmount, String ARSaleOrderPaymentMethod, String ARSaleOrderPaymentStatus, ARCustomersInfo customer, HREmployeesInfo employee) {
        this.ARSaleOrderID = ARSaleOrderID;
        this.AACreatedDate = AACreatedDate;
        this.AACreatedUser = AACreatedUser;
        this.AAUpdatedDate = AAUpdatedDate;
        this.AAUpdatedUser = AAUpdatedUser;
        this.AAStatus = AAStatus;
        this.FK_ARCustomerID = FK_ARCustomerID;
        this.FK_HREmployeeID = FK_HREmployeeID;
        this.ARSaleOrderNo = ARSaleOrderNo;
        this.ARSaleOrderName = ARSaleOrderName;
        this.ARSaleOrderDesc = ARSaleOrderDesc;
        this.ARSaleOrderComment = ARSaleOrderComment;
        this.ARSaleOrderStatus = ARSaleOrderStatus;
        this.ARSaleOrderDate = ARSaleOrderDate;
        this.ARSaleOrderDiscountPerCent = ARSaleOrderDiscountPerCent;
        this.ARSaleOrderDiscountAmount = ARSaleOrderDiscountAmount;
        this.ARSaleOrderTaxPercent = ARSaleOrderTaxPercent;
        this.ARSaleOrderTaxAmount = ARSaleOrderTaxAmount;
        this.ARSaleOrderShippingFees = ARSaleOrderShippingFees;
        this.ARSaleOrderTotalAmount = ARSaleOrderTotalAmount;
        this.ARSaleOrderPaymentMethod = ARSaleOrderPaymentMethod;
        this.ARSaleOrderPaymentStatus = ARSaleOrderPaymentStatus;
        this.customer = customer;
        this.employee = employee;
    }

    public int getARSaleOrderID() {
        return ARSaleOrderID;
    }

    public void setARSaleOrderID(int ARSaleOrderID) {
        this.ARSaleOrderID = ARSaleOrderID;
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

    public String getARSaleOrderNo() {
        return ARSaleOrderNo;
    }

    public void setARSaleOrderNo(String ARSaleOrderNo) {
        this.ARSaleOrderNo = ARSaleOrderNo;
    }

    public String getARSaleOrderName() {
        return ARSaleOrderName;
    }

    public void setARSaleOrderName(String ARSaleOrderName) {
        this.ARSaleOrderName = ARSaleOrderName;
    }

    public String getARSaleOrderDesc() {
        return ARSaleOrderDesc;
    }

    public void setARSaleOrderDesc(String ARSaleOrderDesc) {
        this.ARSaleOrderDesc = ARSaleOrderDesc;
    }

    public String getARSaleOrderComment() {
        return ARSaleOrderComment;
    }

    public void setARSaleOrderComment(String ARSaleOrderComment) {
        this.ARSaleOrderComment = ARSaleOrderComment;
    }

    public String getARSaleOrderStatus() {
        return ARSaleOrderStatus;
    }

    public void setARSaleOrderStatus(String ARSaleOrderStatus) {
        this.ARSaleOrderStatus = ARSaleOrderStatus;
    }

    public Date getARSaleOrderDate() {
        return ARSaleOrderDate;
    }

    public void setARSaleOrderDate(Date ARSaleOrderDate) {
        this.ARSaleOrderDate = ARSaleOrderDate;
    }

    public Double getARSaleOrderDiscountPerCent() {
        return ARSaleOrderDiscountPerCent;
    }

    public void setARSaleOrderDiscountPerCent(Double ARSaleOrderDiscountPerCent) {
        this.ARSaleOrderDiscountPerCent = ARSaleOrderDiscountPerCent;
    }

    public Double getARSaleOrderDiscountAmount() {
        return ARSaleOrderDiscountAmount;
    }

    public void setARSaleOrderDiscountAmount(Double ARSaleOrderDiscountAmount) {
        this.ARSaleOrderDiscountAmount = ARSaleOrderDiscountAmount;
    }

    public Double getARSaleOrderTaxPercent() {
        return ARSaleOrderTaxPercent;
    }

    public void setARSaleOrderTaxPercent(Double ARSaleOrderTaxPercent) {
        this.ARSaleOrderTaxPercent = ARSaleOrderTaxPercent;
    }

    public Double getARSaleOrderTaxAmount() {
        return ARSaleOrderTaxAmount;
    }

    public void setARSaleOrderTaxAmount(Double ARSaleOrderTaxAmount) {
        this.ARSaleOrderTaxAmount = ARSaleOrderTaxAmount;
    }

    public Double getARSaleOrderShippingFees() {
        return ARSaleOrderShippingFees;
    }

    public void setARSaleOrderShippingFees(Double ARSaleOrderShippingFees) {
        this.ARSaleOrderShippingFees = ARSaleOrderShippingFees;
    }

    public Double getARSaleOrderTotalAmount() {
        return ARSaleOrderTotalAmount;
    }

    public void setARSaleOrderTotalAmount(Double ARSaleOrderTotalAmount) {
        this.ARSaleOrderTotalAmount = ARSaleOrderTotalAmount;
    }

    public String getARSaleOrderPaymentMethod() {
        return ARSaleOrderPaymentMethod;
    }

    public void setARSaleOrderPaymentMethod(String ARSaleOrderPaymentMethod) {
        this.ARSaleOrderPaymentMethod = ARSaleOrderPaymentMethod;
    }

    public String getARSaleOrderPaymentStatus() {
        return ARSaleOrderPaymentStatus;
    }

    public void setARSaleOrderPaymentStatus(String ARSaleOrderPaymentStatus) {
        this.ARSaleOrderPaymentStatus = ARSaleOrderPaymentStatus;
    }

    public ARCustomersInfo getCustomer() {
        return customer;
    }

    public void setCustomer(ARCustomersInfo customer) {
        this.customer = customer;
    }

    public HREmployeesInfo getEmployee() {
        return employee;
    }

    public void setEmployee(HREmployeesInfo employee) {
        this.employee = employee;
    }
    //extra
    public double Sum;

}
