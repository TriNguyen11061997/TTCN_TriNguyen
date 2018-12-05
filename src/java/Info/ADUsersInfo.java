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
public class ADUsersInfo {

    private int ADUserID;
    private String AAStatus;
    private String AACreatedUser;
    private String AAUpdatedUser;
    private Date AACreatedDate;
    private Date AAUpdatedDate;
    private int FK_HREmployeeID;
    private int FK_ADUserGroupID;
    private String ADUserName;
    private String ADPassword;
    private int ADUserActiveCheck;
    private String ADUserResetToken;
    private HREmployeesInfo HREmployee;
    private ADUserGroupsInfo ADUserGroup;

    public ADUsersInfo() {
    }

    public ADUsersInfo(int ADUserID, String AAStatus, String AACreatedUser, String AAUpdatedUser, Date AACreatedDate, Date AAUpdatedDate, int FK_HREmployeeID, int FK_ADUserGroupID, String ADUserName, String ADPassword, int ADUserActiveCheck, String ADUserResetToken, HREmployeesInfo HREmployee, ADUserGroupsInfo ADUserGroup) {
        this.ADUserID = ADUserID;
        this.AAStatus = AAStatus;
        this.AACreatedUser = AACreatedUser;
        this.AAUpdatedUser = AAUpdatedUser;
        this.AACreatedDate = AACreatedDate;
        this.AAUpdatedDate = AAUpdatedDate;
        this.FK_HREmployeeID = FK_HREmployeeID;
        this.FK_ADUserGroupID = FK_ADUserGroupID;
        this.ADUserName = ADUserName;
        this.ADPassword = ADPassword;
        this.ADUserActiveCheck = ADUserActiveCheck;
        this.ADUserResetToken = ADUserResetToken;
        this.HREmployee = HREmployee;
        this.ADUserGroup = ADUserGroup;
    }

    public int getADUserID() {
        return ADUserID;
    }

    public void setADUserID(int ADUserID) {
        this.ADUserID = ADUserID;
    }

    public String getAAStatus() {
        return AAStatus;
    }

    public void setAAStatus(String AAStatus) {
        this.AAStatus = AAStatus;
    }

    public String getAACreatedUser() {
        return AACreatedUser;
    }

    public void setAACreatedUser(String AACreatedUser) {
        this.AACreatedUser = AACreatedUser;
    }

    public String getAAUpdatedUser() {
        return AAUpdatedUser;
    }

    public void setAAUpdatedUser(String AAUpdatedUser) {
        this.AAUpdatedUser = AAUpdatedUser;
    }

    public Date getAACreatedDate() {
        return AACreatedDate;
    }

    public void setAACreatedDate(Date AACreatedDate) {
        this.AACreatedDate = AACreatedDate;
    }

    public Date getAAUpdatedDate() {
        return AAUpdatedDate;
    }

    public void setAAUpdatedDate(Date AAUpdatedDate) {
        this.AAUpdatedDate = AAUpdatedDate;
    }

    public int getFK_HREmployeeID() {
        return FK_HREmployeeID;
    }

    public void setFK_HREmployeeID(int FK_HREmployeeID) {
        this.FK_HREmployeeID = FK_HREmployeeID;
    }

    public int getFK_ADUserGroupID() {
        return FK_ADUserGroupID;
    }

    public void setFK_ADUserGroupID(int FK_ADUserGroupID) {
        this.FK_ADUserGroupID = FK_ADUserGroupID;
    }

    public String getADUserName() {
        return ADUserName;
    }

    public void setADUserName(String ADUserName) {
        this.ADUserName = ADUserName;
    }

    public String getADPassword() {
        return ADPassword;
    }

    public void setADPassword(String ADPassword) {
        this.ADPassword = ADPassword;
    }

    public int getADUserActiveCheck() {
        return ADUserActiveCheck;
    }

    public void setADUserActiveCheck(int ADUserActiveCheck) {
        this.ADUserActiveCheck = ADUserActiveCheck;
    }

    public String getADUserResetToken() {
        return ADUserResetToken;
    }

    public void setADUserResetToken(String ADUserResetToken) {
        this.ADUserResetToken = ADUserResetToken;
    }

    public HREmployeesInfo getHREmployee() {
        return HREmployee;
    }

    public void setHREmployee(HREmployeesInfo HREmployee) {
        this.HREmployee = HREmployee;
    }

    public ADUserGroupsInfo getADUserGroup() {
        return ADUserGroup;
    }

    public void setADUserGroup(ADUserGroupsInfo ADUserGroup) {
        this.ADUserGroup = ADUserGroup;
    }
    
}
