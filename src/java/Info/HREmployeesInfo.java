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
public class HREmployeesInfo {
    private int AREmployeeID;
    private String AAStatus;
    private String AACreatedUser;
    private String AAUpdatedUser;
    private Date AACreatedDate;
    private Date AAUpdatedDate;
    private String AREmployeeNo;
    private String AREmployeeName;
    private int AREmployeeGender;
    private Date AREmployeeBirthDay;
    private String AREmployeeStatus;
    private String AREmployeeDesc;
    private Byte[] AREmployeePicture;
    private String AREmployeeIDNumber;
    private String AREmployeeCardNumber;
    private String AREmployeeTaxNumber;
    private Date AREmployeeStartWorkingDate;
    private Date AREmployeeEndWorkingDate;
    private String AREmployeeTel1;
    private String AREmployeeTel2;
    private String AREmployeeEmail;
    private String AREmployeeContactAddress;
    private String AREmployeeContactAddressCity;
    private String AREmployeeContactAddressCountry;

    public HREmployeesInfo() {
    }

    public HREmployeesInfo(int AREmployeeID, String AAStatus, String AACreatedUser, String AAUpdatedUser, Date AACreatedDate, Date AAUpdatedDate, String AREmployeeNo, String AREmployeeName, int AREmployeeGender, Date AREmployeeBirthDay, String AREmployeeStatus, String AREmployeeDesc, Byte[] AREmployeePicture, String AREmployeeIDNumber, String AREmployeeCardNumber, String AREmployeeTaxNumber, Date AREmployeeStartWorkingDate, Date AREmployeeEndWorkingDate, String AREmployeeTel1, String AREmployeeTel2, String AREmployeeEmail, String AREmployeeContactAddress, String AREmployeeContactAddressCity, String AREmployeeContactAddressCountry) {
        this.AREmployeeID = AREmployeeID;
        this.AAStatus = AAStatus;
        this.AACreatedUser = AACreatedUser;
        this.AAUpdatedUser = AAUpdatedUser;
        this.AACreatedDate = AACreatedDate;
        this.AAUpdatedDate = AAUpdatedDate;
        this.AREmployeeNo = AREmployeeNo;
        this.AREmployeeName = AREmployeeName;
        this.AREmployeeGender = AREmployeeGender;
        this.AREmployeeBirthDay = AREmployeeBirthDay;
        this.AREmployeeStatus = AREmployeeStatus;
        this.AREmployeeDesc = AREmployeeDesc;
        this.AREmployeePicture = AREmployeePicture;
        this.AREmployeeIDNumber = AREmployeeIDNumber;
        this.AREmployeeCardNumber = AREmployeeCardNumber;
        this.AREmployeeTaxNumber = AREmployeeTaxNumber;
        this.AREmployeeStartWorkingDate = AREmployeeStartWorkingDate;
        this.AREmployeeEndWorkingDate = AREmployeeEndWorkingDate;
        this.AREmployeeTel1 = AREmployeeTel1;
        this.AREmployeeTel2 = AREmployeeTel2;
        this.AREmployeeEmail = AREmployeeEmail;
        this.AREmployeeContactAddress = AREmployeeContactAddress;
        this.AREmployeeContactAddressCity = AREmployeeContactAddressCity;
        this.AREmployeeContactAddressCountry = AREmployeeContactAddressCountry;
    }

    public int getAREmployeeID() {
        return AREmployeeID;
    }

    public void setAREmployeeID(int AREmployeeID) {
        this.AREmployeeID = AREmployeeID;
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

    public String getAREmployeeNo() {
        return AREmployeeNo;
    }

    public void setAREmployeeNo(String AREmployeeNo) {
        this.AREmployeeNo = AREmployeeNo;
    }

    public String getAREmployeeName() {
        return AREmployeeName;
    }

    public void setAREmployeeName(String AREmployeeName) {
        this.AREmployeeName = AREmployeeName;
    }

    public int getAREmployeeGender() {
        return AREmployeeGender;
    }

    public void setAREmployeeGender(int AREmployeeGender) {
        this.AREmployeeGender = AREmployeeGender;
    }

    public Date getAREmployeeBirthDay() {
        return AREmployeeBirthDay;
    }

    public void setAREmployeeBirthDay(Date AREmployeeBirthDay) {
        this.AREmployeeBirthDay = AREmployeeBirthDay;
    }

    public String getAREmployeeStatus() {
        return AREmployeeStatus;
    }

    public void setAREmployeeStatus(String AREmployeeStatus) {
        this.AREmployeeStatus = AREmployeeStatus;
    }

    public String getAREmployeeDesc() {
        return AREmployeeDesc;
    }

    public void setAREmployeeDesc(String AREmployeeDesc) {
        this.AREmployeeDesc = AREmployeeDesc;
    }

    public Byte[] getAREmployeePicture() {
        return AREmployeePicture;
    }

    public void setAREmployeePicture(Byte[] AREmployeePicture) {
        this.AREmployeePicture = AREmployeePicture;
    }

    public String getAREmployeeIDNumber() {
        return AREmployeeIDNumber;
    }

    public void setAREmployeeIDNumber(String AREmployeeIDNumber) {
        this.AREmployeeIDNumber = AREmployeeIDNumber;
    }

    public String getAREmployeeCardNumber() {
        return AREmployeeCardNumber;
    }

    public void setAREmployeeCardNumber(String AREmployeeCardNumber) {
        this.AREmployeeCardNumber = AREmployeeCardNumber;
    }

    public String getAREmployeeTaxNumber() {
        return AREmployeeTaxNumber;
    }

    public void setAREmployeeTaxNumber(String AREmployeeTaxNumber) {
        this.AREmployeeTaxNumber = AREmployeeTaxNumber;
    }

    public Date getAREmployeeStartWorkingDate() {
        return AREmployeeStartWorkingDate;
    }

    public void setAREmployeeStartWorkingDate(Date AREmployeeStartWorkingDate) {
        this.AREmployeeStartWorkingDate = AREmployeeStartWorkingDate;
    }

    public Date getAREmployeeEndWorkingDate() {
        return AREmployeeEndWorkingDate;
    }

    public void setAREmployeeEndWorkingDate(Date AREmployeeEndWorkingDate) {
        this.AREmployeeEndWorkingDate = AREmployeeEndWorkingDate;
    }

    public String getAREmployeeTel1() {
        return AREmployeeTel1;
    }

    public void setAREmployeeTel1(String AREmployeeTel1) {
        this.AREmployeeTel1 = AREmployeeTel1;
    }

    public String getAREmployeeTel2() {
        return AREmployeeTel2;
    }

    public void setAREmployeeTel2(String AREmployeeTel2) {
        this.AREmployeeTel2 = AREmployeeTel2;
    }

    public String getAREmployeeEmail() {
        return AREmployeeEmail;
    }

    public void setAREmployeeEmail(String AREmployeeEmail) {
        this.AREmployeeEmail = AREmployeeEmail;
    }

    public String getAREmployeeContactAddress() {
        return AREmployeeContactAddress;
    }

    public void setAREmployeeContactAddress(String AREmployeeContactAddress) {
        this.AREmployeeContactAddress = AREmployeeContactAddress;
    }

    public String getAREmployeeContactAddressCity() {
        return AREmployeeContactAddressCity;
    }

    public void setAREmployeeContactAddressCity(String AREmployeeContactAddressCity) {
        this.AREmployeeContactAddressCity = AREmployeeContactAddressCity;
    }

    public String getAREmployeeContactAddressCountry() {
        return AREmployeeContactAddressCountry;
    }

    public void setAREmployeeContactAddressCountry(String AREmployeeContactAddressCountry) {
        this.AREmployeeContactAddressCountry = AREmployeeContactAddressCountry;
    }
    
    
}
