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
public class ARCustomerCommentsInfo {
    int ARCustomerCommentID;
    String AAStatus;
    String ARCustomerCommentDate;
    String ARCustomerCommentDesc;
    int FK_ARCustomerID;
    int FK_ICProductID;

    public ARCustomerCommentsInfo(){
        
    }
    
    public ARCustomerCommentsInfo(int ARCustomerCommentID, String AAStatus, String ARCustomerCommentDate, String ARCustomerCommentDesc, int FK_ARCustomerID, int FK_ICProductID) {
        this.ARCustomerCommentID = ARCustomerCommentID;
        this.AAStatus = AAStatus;
        this.ARCustomerCommentDate = ARCustomerCommentDate;
        this.ARCustomerCommentDesc = ARCustomerCommentDesc;
        this.FK_ARCustomerID = FK_ARCustomerID;
        this.FK_ICProductID = FK_ICProductID;
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

    public String getARCustomerCommentDate() {
        return ARCustomerCommentDate;
    }

    public void setARCustomerCommentDate(String ARCustomerCommentDate) {
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
