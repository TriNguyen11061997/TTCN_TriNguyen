/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

/**
 *
 * @author Trí Nguyễn
 */
public class HREmployeeCommentsInfo {
    int HREmployeeCommentID;
    int AAStatus;
    String HREmployeeCommentNo;
    String HREmployeeCommentDesc;
    int FK_ARCustomerCommentID;
    int FK_ICProductID;

    public HREmployeeCommentsInfo() {
    }

    public HREmployeeCommentsInfo(int HREmployeeCommentID, int AAStatus, String HREmployeeCommentNo, String HREmployeeCommentDesc, int FK_ARCustomerCommentID, int FK_ICProductID) {
        this.HREmployeeCommentID = HREmployeeCommentID;
        this.AAStatus = AAStatus;
        this.HREmployeeCommentNo = HREmployeeCommentNo;
        this.HREmployeeCommentDesc = HREmployeeCommentDesc;
        this.FK_ARCustomerCommentID = FK_ARCustomerCommentID;
        this.FK_ICProductID = FK_ICProductID;
    }

    public int getHREmployeeCommentID() {
        return HREmployeeCommentID;
    }

    public void setHREmployeeCommentID(int HREmployeeCommentID) {
        this.HREmployeeCommentID = HREmployeeCommentID;
    }

    public int getAAStatus() {
        return AAStatus;
    }

    public void setAAStatus(int AAStatus) {
        this.AAStatus = AAStatus;
    }

    public String getHREmployeeCommentNo() {
        return HREmployeeCommentNo;
    }

    public void setHREmployeeCommentNo(String HREmployeeCommentNo) {
        this.HREmployeeCommentNo = HREmployeeCommentNo;
    }

    public String getHREmployeeCommentDesc() {
        return HREmployeeCommentDesc;
    }

    public void setHREmployeeCommentDesc(String HREmployeeCommentDesc) {
        this.HREmployeeCommentDesc = HREmployeeCommentDesc;
    }

    public int getFK_ARCustomerCommentID() {
        return FK_ARCustomerCommentID;
    }

    public void setFK_ARCustomerCommentID(int FK_ARCustomerCommentID) {
        this.FK_ARCustomerCommentID = FK_ARCustomerCommentID;
    }

    public int getFK_ICProductID() {
        return FK_ICProductID;
    }

    public void setFK_ICProductID(int FK_ICProductID) {
        this.FK_ICProductID = FK_ICProductID;
    }
    
    
}
