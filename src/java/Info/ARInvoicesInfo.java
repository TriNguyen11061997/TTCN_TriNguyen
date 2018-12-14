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
public class ARInvoicesInfo {

    private int ARInvoiceID;
    private String ARInvoiceNo;
    private String ARInvoiceName;
    private Date ARInvoiceDate;
    private String ARInvoiceDesc;
    private int FK_ARCustomersID;
    private String ARInvoiceStatus;
    private int FK_HREmployeeID;
    private double ARInvoiceFeeShipment;
    private double ARInvoiceTotalAmount;
    private double ARInvoiceDiscountAmount;
    private String ARInvoicePaymentMethod;
    private String ARInvoicePaymentStatus;
    private int FK_ARSaleOrderID;
    private ARCustomersInfo customer;
    private HREmployeesInfo employee;
    private ARSaleOrdersInfo saleorder;

    public ARInvoicesInfo() {
    }

    public ARInvoicesInfo(int ARInvoiceID, String ARInvoiceNo, String ARInvoiceName, Date ARInvoiceDate, String ARInvoiceDesc, int FK_ARCustomersID, String ARInvoiceStatus, int FK_HREmployeeID, double ARInvoiceFeeShipment, double ARInvoiceTotalAmount, double ARInvoiceDiscountAmount, String ARInvoicePaymentMethod, String ARInvoicePaymentStatus, int FK_ARSaleOrderID, ARCustomersInfo customer, HREmployeesInfo employee, ARSaleOrdersInfo saleorder) {
        this.ARInvoiceID = ARInvoiceID;
        this.ARInvoiceNo = ARInvoiceNo;
        this.ARInvoiceName = ARInvoiceName;
        this.ARInvoiceDate = ARInvoiceDate;
        this.ARInvoiceDesc = ARInvoiceDesc;
        this.FK_ARCustomersID = FK_ARCustomersID;
        this.ARInvoiceStatus = ARInvoiceStatus;
        this.FK_HREmployeeID = FK_HREmployeeID;
        this.ARInvoiceFeeShipment = ARInvoiceFeeShipment;
        this.ARInvoiceTotalAmount = ARInvoiceTotalAmount;
        this.ARInvoiceDiscountAmount = ARInvoiceDiscountAmount;
        this.ARInvoicePaymentMethod = ARInvoicePaymentMethod;
        this.ARInvoicePaymentStatus = ARInvoicePaymentStatus;
        this.FK_ARSaleOrderID = FK_ARSaleOrderID;
        this.customer = customer;
        this.employee = employee;
        this.saleorder = saleorder;
    }

    public int getARInvoiceID() {
        return ARInvoiceID;
    }

    public void setARInvoiceID(int ARInvoiceID) {
        this.ARInvoiceID = ARInvoiceID;
    }

    public String getARInvoiceNo() {
        return ARInvoiceNo;
    }

    public void setARInvoiceNo(String ARInvoiceNo) {
        this.ARInvoiceNo = ARInvoiceNo;
    }

    public String getARInvoiceName() {
        return ARInvoiceName;
    }

    public void setARInvoiceName(String ARInvoiceName) {
        this.ARInvoiceName = ARInvoiceName;
    }

    public Date getARInvoiceDate() {
        return ARInvoiceDate;
    }

    public void setARInvoiceDate(Date ARInvoiceDate) {
        this.ARInvoiceDate = ARInvoiceDate;
    }

    public String getARInvoiceDesc() {
        return ARInvoiceDesc;
    }

    public void setARInvoiceDesc(String ARInvoiceDesc) {
        this.ARInvoiceDesc = ARInvoiceDesc;
    }

    public int getFK_ARCustomersID() {
        return FK_ARCustomersID;
    }

    public void setFK_ARCustomersID(int FK_ARCustomersID) {
        this.FK_ARCustomersID = FK_ARCustomersID;
    }

    public String getARInvoiceStatus() {
        return ARInvoiceStatus;
    }

    public void setARInvoiceStatus(String ARInvoiceStatus) {
        this.ARInvoiceStatus = ARInvoiceStatus;
    }

    public int getFK_HREmployeeID() {
        return FK_HREmployeeID;
    }

    public void setFK_HREmployeeID(int FK_HREmployeeID) {
        this.FK_HREmployeeID = FK_HREmployeeID;
    }

    public double getARInvoiceFeeShipment() {
        return ARInvoiceFeeShipment;
    }

    public void setARInvoiceFeeShipment(double ARInvoiceFeeShipment) {
        this.ARInvoiceFeeShipment = ARInvoiceFeeShipment;
    }

    public double getARInvoiceTotalAmount() {
        return ARInvoiceTotalAmount;
    }

    public void setARInvoiceTotalAmount(double ARInvoiceTotalAmount) {
        this.ARInvoiceTotalAmount = ARInvoiceTotalAmount;
    }

    public double getARInvoiceDiscountAmount() {
        return ARInvoiceDiscountAmount;
    }

    public void setARInvoiceDiscountAmount(double ARInvoiceDiscountAmount) {
        this.ARInvoiceDiscountAmount = ARInvoiceDiscountAmount;
    }

    public String getARInvoicePaymentMethod() {
        return ARInvoicePaymentMethod;
    }

    public void setARInvoicePaymentMethod(String ARInvoicePaymentMethod) {
        this.ARInvoicePaymentMethod = ARInvoicePaymentMethod;
    }

    public String getARInvoicePaymentStatus() {
        return ARInvoicePaymentStatus;
    }

    public void setARInvoicePaymentStatus(String ARInvoicePaymentStatus) {
        this.ARInvoicePaymentStatus = ARInvoicePaymentStatus;
    }

    public int getFK_ARSaleOrderID() {
        return FK_ARSaleOrderID;
    }

    public void setFK_ARSaleOrderID(int FK_ARSaleOrderID) {
        this.FK_ARSaleOrderID = FK_ARSaleOrderID;
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

    public ARSaleOrdersInfo getSaleorder() {
        return saleorder;
    }

    public void setSaleorder(ARSaleOrdersInfo saleorder) {
        this.saleorder = saleorder;
    }

}
