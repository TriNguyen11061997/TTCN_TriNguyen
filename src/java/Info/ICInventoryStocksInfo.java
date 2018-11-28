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
public class ICInventoryStocksInfo {
    int ICInventoryStockID;
    String AAStatus;
    String ICInventoryStockName;
    Double ICInventoryStockQty;
    Double ICInventoryStockReceiptQty;
    Double ICInventoryStockShipmentQty;
    int FK_ICProductID;

    public ICInventoryStocksInfo() {
    }

    public ICInventoryStocksInfo(int ICInventoryStockID, String AAStatus, String ICInventoryStockName, Double ICInventoryStockQty, Double ICInventoryStockReceiptQty, Double ICInventoryStockShipmentQty, int FK_ICProductID) {
        this.ICInventoryStockID = ICInventoryStockID;
        this.AAStatus = AAStatus;
        this.ICInventoryStockName = ICInventoryStockName;
        this.ICInventoryStockQty = ICInventoryStockQty;
        this.ICInventoryStockReceiptQty = ICInventoryStockReceiptQty;
        this.ICInventoryStockShipmentQty = ICInventoryStockShipmentQty;
        this.FK_ICProductID = FK_ICProductID;
    }

    public int getICInventoryStockID() {
        return ICInventoryStockID;
    }

    public void setICInventoryStockID(int ICInventoryStockID) {
        this.ICInventoryStockID = ICInventoryStockID;
    }

    public String getAAStatus() {
        return AAStatus;
    }

    public void setAAStatus(String AAStatus) {
        this.AAStatus = AAStatus;
    }

    public String getICInventoryStockName() {
        return ICInventoryStockName;
    }

    public void setICInventoryStockName(String ICInventoryStockName) {
        this.ICInventoryStockName = ICInventoryStockName;
    }

    public Double getICInventoryStockQty() {
        return ICInventoryStockQty;
    }

    public void setICInventoryStockQty(Double ICInventoryStockQty) {
        this.ICInventoryStockQty = ICInventoryStockQty;
    }

    public Double getICInventoryStockReceiptQty() {
        return ICInventoryStockReceiptQty;
    }

    public void setICInventoryStockReceiptQty(Double ICInventoryStockReceiptQty) {
        this.ICInventoryStockReceiptQty = ICInventoryStockReceiptQty;
    }

    public Double getICInventoryStockShipmentQty() {
        return ICInventoryStockShipmentQty;
    }

    public void setICInventoryStockShipmentQty(Double ICInventoryStockShipmentQty) {
        this.ICInventoryStockShipmentQty = ICInventoryStockShipmentQty;
    }

    public int getFK_ICProductID() {
        return FK_ICProductID;
    }

    public void setFK_ICProductID(int FK_ICProductID) {
        this.FK_ICProductID = FK_ICProductID;
    }
    
    
}
