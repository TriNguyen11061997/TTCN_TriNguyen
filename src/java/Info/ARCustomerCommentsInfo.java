/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

import java.util.Date;

/**
 *
 * @author Trí Nguyễn
 */
public class ARCustomerCommentsInfo {
    int ARCustomerCommentID;
    String AAStatus;
    Date ARCustomerCommentDate;
    String ARCustomerCommentDesc;
    int FK_ARCustomerID;
    int FK_ICProductID;
    String customerName;
    HREmployeeCommentsInfo employeeComment;
    ARCustomersInfo customer;
    HREmployeesInfo employee;
    ICProductsInfo product;

    public ICProductsInfo getProduct() {
        return product;
    }

    public void setProduct(ICProductsInfo product) {
        this.product = product;
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
    
    

    public HREmployeeCommentsInfo getEmployeeComment() {
        return employeeComment;
    }

    public void setEmployeeComment(HREmployeeCommentsInfo employeeComment) {
        this.employeeComment = employeeComment;
    }
    
    

    public ARCustomerCommentsInfo(){
        
    }

    public ARCustomerCommentsInfo(int ARCustomerCommentID, String AAStatus, Date ARCustomerCommentDate, String ARCustomerCommentDesc, int FK_ARCustomerID, int FK_ICProductID, String customerName) {
        this.ARCustomerCommentID = ARCustomerCommentID;
        this.AAStatus = AAStatus;
        this.ARCustomerCommentDate = ARCustomerCommentDate;
        this.ARCustomerCommentDesc = ARCustomerCommentDesc;
        this.FK_ARCustomerID = FK_ARCustomerID;
        this.FK_ICProductID = FK_ICProductID;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    

    public int getARCustomerCommentID() {
        return ARCustomerCommentID;
    }

    public void setARCustomerCommentID(int ARCustomerCommentID) {
        this.ARCustomerCommentID = ARCustomerCommentID;
    }

    public String getAAStatus() {
        return AAStatus;
    }

    public void setAAStatus(String AAStatus) {
        this.AAStatus = AAStatus;
    }

    public Date getARCustomerCommentDate() {
        return ARCustomerCommentDate;
    }

    public void setARCustomerCommentDate(Date ARCustomerCommentDate) {
        this.ARCustomerCommentDate = ARCustomerCommentDate;
    }

    public String getARCustomerCommentDesc() {
        return ARCustomerCommentDesc;
    }

    public void setARCustomerCommentDesc(String ARCustomerCommentDesc) {
        this.ARCustomerCommentDesc = ARCustomerCommentDesc;
    }

    public int getFK_ARCustomerID() {
        return FK_ARCustomerID;
    }

    public void setFK_ARCustomerID(int FK_ARCustomerID) {
        this.FK_ARCustomerID = FK_ARCustomerID;
    }

    public int getFK_ICProductID() {
        return FK_ICProductID;
    }

    public void setFK_ICProductID(int FK_ICProductID) {
        this.FK_ICProductID = FK_ICProductID;
    }
    
    

   
    
}
