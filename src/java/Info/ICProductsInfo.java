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
public class ICProductsInfo {

    private int ICProductID;
    private String AACreatedUser;
    private Date AACreatedDate;
    private String AAUpdatedUser;
    private Date AAUpdatedDate;
    private String AAStatus;
    private String ICProductNo;
    private String ICProductSupplierNumber;
    private Double ICProductSupplierPrice;
    private String ICProductName;
    private String ICProductDesc;
    private Boolean ICProductActiveCheck;
    private int FK_HREmployeeID;
    private String ICProductPromotion;
    private byte[] ICProductPicture1;
    private byte[] ICProductPicture2;
    private byte[] ICProductPicture3;
    private byte[] ICProductPicture4;
    private byte[] ICProductPicture5;
    private byte[] ICProductPicture6;
    private byte[] ICProductPicture7;
    private byte[] ICProductPicture8;
    private String ICProductVideo;
    private String ICProductDetailHeDieuHanh;

    public ICProductsInfo() {
    }

    public ICProductsInfo(int ICProductID, String AACreatedUser, Date AACreatedDate, String AAUpdatedUser, Date AAUpdatedDate, String AAStatus, String ICProductNo, String ICProductSupplierNumber, Double ICProductSupplierPrice, String ICProductName, String ICProductDesc, Boolean ICProductActiveCheck, int FK_HREmployeeID, String ICProductPromotion, byte[] ICProductPicture1, byte[] ICProductPicture2, byte[] ICProductPicture3, byte[] ICProductPicture4, byte[] ICProductPicture5, byte[] ICProductPicture6, byte[] ICProductPicture7, byte[] ICProductPicture8, String ICProductVideo, String ICProductDetailHeDieuHanh) {
        this.ICProductID = ICProductID;
        this.AACreatedUser = AACreatedUser;
        this.AACreatedDate = AACreatedDate;
        this.AAUpdatedUser = AAUpdatedUser;
        this.AAUpdatedDate = AAUpdatedDate;
        this.AAStatus = AAStatus;
        this.ICProductNo = ICProductNo;
        this.ICProductSupplierNumber = ICProductSupplierNumber;
        this.ICProductSupplierPrice = ICProductSupplierPrice;
        this.ICProductName = ICProductName;
        this.ICProductDesc = ICProductDesc;
        this.ICProductActiveCheck = ICProductActiveCheck;
        this.FK_HREmployeeID = FK_HREmployeeID;
        this.ICProductPromotion = ICProductPromotion;
        this.ICProductPicture1 = ICProductPicture1;
        this.ICProductPicture2 = ICProductPicture2;
        this.ICProductPicture3 = ICProductPicture3;
        this.ICProductPicture4 = ICProductPicture4;
        this.ICProductPicture5 = ICProductPicture5;
        this.ICProductPicture6 = ICProductPicture6;
        this.ICProductPicture7 = ICProductPicture7;
        this.ICProductPicture8 = ICProductPicture8;
        this.ICProductVideo = ICProductVideo;
        this.ICProductDetailHeDieuHanh = ICProductDetailHeDieuHanh;
    }

    public int getICProductID() {
        return ICProductID;
    }

    public void setICProductID(int ICProductID) {
        this.ICProductID = ICProductID;
    }

    public String getAACreatedUser() {
        return AACreatedUser;
    }

    public void setAACreatedUser(String AACreatedUser) {
        this.AACreatedUser = AACreatedUser;
    }

    public Date getAACreatedDate() {
        return AACreatedDate;
    }

    public void setAACreatedDate(Date AACreatedDate) {
        this.AACreatedDate = AACreatedDate;
    }

    public String getAAUpdatedUser() {
        return AAUpdatedUser;
    }

    public void setAAUpdatedUser(String AAUpdatedUser) {
        this.AAUpdatedUser = AAUpdatedUser;
    }

    public Date getAAUpdatedDate() {
        return AAUpdatedDate;
    }

    public void setAAUpdatedDate(Date AAUpdatedDate) {
        this.AAUpdatedDate = AAUpdatedDate;
    }

    public String getAAStatus() {
        return AAStatus;
    }

    public void setAAStatus(String AAStatus) {
        this.AAStatus = AAStatus;
    }

    public String getICProductNo() {
        return ICProductNo;
    }

    public void setICProductNo(String ICProductNo) {
        this.ICProductNo = ICProductNo;
    }

    public String getICProductSupplierNumber() {
        return ICProductSupplierNumber;
    }

    public void setICProductSupplierNumber(String ICProductSupplierNumber) {
        this.ICProductSupplierNumber = ICProductSupplierNumber;
    }

    public Double getICProductSupplierPrice() {
        return ICProductSupplierPrice;
    }

    public void setICProductSupplierPrice(Double ICProductSupplierPrice) {
        this.ICProductSupplierPrice = ICProductSupplierPrice;
    }

    public String getICProductName() {
        return ICProductName;
    }

    public void setICProductName(String ICProductName) {
        this.ICProductName = ICProductName;
    }

    public String getICProductDesc() {
        return ICProductDesc;
    }

    public void setICProductDesc(String ICProductDesc) {
        this.ICProductDesc = ICProductDesc;
    }

    public Boolean getICProductActiveCheck() {
        return ICProductActiveCheck;
    }

    public void setICProductActiveCheck(Boolean ICProductActiveCheck) {
        this.ICProductActiveCheck = ICProductActiveCheck;
    }

    public int getFK_HREmployeeID() {
        return FK_HREmployeeID;
    }

    public void setFK_HREmployeeID(int FK_HREmployeeID) {
        this.FK_HREmployeeID = FK_HREmployeeID;
    }

    public String getICProductPromotion() {
        return ICProductPromotion;
    }

    public void setICProductPromotion(String ICProductPromotion) {
        this.ICProductPromotion = ICProductPromotion;
    }

    public byte[] getICProductPicture1() {
        return ICProductPicture1;
    }

    public void setICProductPicture1(byte[] ICProductPicture1) {
        this.ICProductPicture1 = ICProductPicture1;
    }

    public byte[] getICProductPicture2() {
        return ICProductPicture2;
    }

    public void setICProductPicture2(byte[] ICProductPicture2) {
        this.ICProductPicture2 = ICProductPicture2;
    }

    public byte[] getICProductPicture3() {
        return ICProductPicture3;
    }

    public void setICProductPicture3(byte[] ICProductPicture3) {
        this.ICProductPicture3 = ICProductPicture3;
    }

    public byte[] getICProductPicture4() {
        return ICProductPicture4;
    }

    public void setICProductPicture4(byte[] ICProductPicture4) {
        this.ICProductPicture4 = ICProductPicture4;
    }

    public byte[] getICProductPicture5() {
        return ICProductPicture5;
    }

    public void setICProductPicture5(byte[] ICProductPicture5) {
        this.ICProductPicture5 = ICProductPicture5;
    }

    public byte[] getICProductPicture6() {
        return ICProductPicture6;
    }

    public void setICProductPicture6(byte[] ICProductPicture6) {
        this.ICProductPicture6 = ICProductPicture6;
    }

    public byte[] getICProductPicture7() {
        return ICProductPicture7;
    }

    public void setICProductPicture7(byte[] ICProductPicture7) {
        this.ICProductPicture7 = ICProductPicture7;
    }

    public byte[] getICProductPicture8() {
        return ICProductPicture8;
    }

    public void setICProductPicture8(byte[] ICProductPicture8) {
        this.ICProductPicture8 = ICProductPicture8;
    }

    public String getICProductVideo() {
        return ICProductVideo;
    }

    public void setICProductVideo(String ICProductVideo) {
        this.ICProductVideo = ICProductVideo;
    }

    public String getICProductDetailHeDieuHanh() {
        return ICProductDetailHeDieuHanh;
    }

    public void setICProductDetailHeDieuHanh(String ICProductDetailHeDieuHanh) {
        this.ICProductDetailHeDieuHanh = ICProductDetailHeDieuHanh;
    }
    
    
    

}
