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
public class ARCartsInfo {

    private int ARCartID;
    private String AAStatus;
    private String ARCartNo;
    private String ARCartName;
    private int ARCartQty;
    private int FK_ICProductID;
    private int FK_ARCustomerID;
    private String ARCartStatus;
    private Date ARCartDate;
    private ICProductsInfo ICProduct;
    private ARCustomersInfo ARCustomer;

    public ARCartsInfo() {
    }

    public ARCartsInfo(int ARCartID, String AAStatus, String ARCartNo, String ARCartName, int ARCartQty, int FK_ICProductID, int FK_ARCustomerID, String ARCartStatus, Date ARCartDate, ICProductsInfo ICProduct, ARCustomersInfo ARCustomer) {
        this.ARCartID = ARCartID;
        this.AAStatus = AAStatus;
        this.ARCartNo = ARCartNo;
        this.ARCartName = ARCartName;
        this.ARCartQty = ARCartQty;
        this.FK_ICProductID = FK_ICProductID;
        this.FK_ARCustomerID = FK_ARCustomerID;
        this.ARCartStatus = ARCartStatus;
        this.ARCartDate = ARCartDate;
        this.ICProduct = ICProduct;
        this.ARCustomer = ARCustomer;
    }

    public int getARCartID() {
        return ARCartID;
    }

    public void setARCartID(int ARCartID) {
        this.ARCartID = ARCartID;
    }

    public String getAAStatus() {
        return AAStatus;
    }

    public void setAAStatus(String AAStatus) {
        this.AAStatus = AAStatus;
    }

    public String getARCartNo() {
        return ARCartNo;
    }

    public void setARCartNo(String ARCartNo) {
        this.ARCartNo = ARCartNo;
    }

    public String getARCartName() {
        return ARCartName;
    }

    public void setARCartName(String ARCartName) {
        this.ARCartName = ARCartName;
    }

    public int getARCartQty() {
        return ARCartQty;
    }

    public void setARCartQty(int ARCartQty) {
        this.ARCartQty = ARCartQty;
    }

    public int getFK_ICProductID() {
        return FK_ICProductID;
    }

    public void setFK_ICProductID(int FK_ICProductID) {
        this.FK_ICProductID = FK_ICProductID;
    }

    public int getFK_ARCustomerID() {
        return FK_ARCustomerID;
    }

    public void setFK_ARCustomerID(int FK_ARCustomerID) {
        this.FK_ARCustomerID = FK_ARCustomerID;
    }

    public String getARCartStatus() {
        return ARCartStatus;
    }

    public void setARCartStatus(String ARCartStatus) {
        this.ARCartStatus = ARCartStatus;
    }

    public Date getARCartDate() {
        return ARCartDate;
    }

    public void setARCartDate(Date ARCartDate) {
        this.ARCartDate = ARCartDate;
    }

    public ICProductsInfo getICProduct() {
        return ICProduct;
    }

    public void setICProduct(ICProductsInfo ICProduct) {
        this.ICProduct = ICProduct;
    }

    public ARCustomersInfo getARCustomer() {
        return ARCustomer;
    }

    public void setARCustomer(ARCustomersInfo ARCustomer) {
        this.ARCustomer = ARCustomer;
    }

    public void setARCartDate(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}