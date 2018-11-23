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
public class ADUserGroupsInfo {

    private int ADUserGroupID;
    private String AAStatus;
    private String ADUserGroupName;
    private String ADUserGroupDesc;

    public ADUserGroupsInfo() {
    }

    public ADUserGroupsInfo(int ADUserGroupID, String AAStatus, String ADUserGroupName, String ADUserGroupDesc) {
        this.ADUserGroupID = ADUserGroupID;
        this.AAStatus = AAStatus;
        this.ADUserGroupName = ADUserGroupName;
        this.ADUserGroupDesc = ADUserGroupDesc;
    }

    public int getADUserGroupID() {
        return ADUserGroupID;
    }

    public void setADUserGroupID(int ADUserGroupID) {
        this.ADUserGroupID = ADUserGroupID;
    }

    public String getAAStatus() {
        return AAStatus;
    }

    public void setAAStatus(String AAStatus) {
        this.AAStatus = AAStatus;
    }

    public String getADUserGroupName() {
        return ADUserGroupName;
    }

    public void setADUserGroupName(String ADUserGroupName) {
        this.ADUserGroupName = ADUserGroupName;
    }

    public String getADUserGroupDesc() {
        return ADUserGroupDesc;
    }

    public void setADUserGroupDesc(String ADUserGroupDesc) {
        this.ADUserGroupDesc = ADUserGroupDesc;
    }
    
    
}
