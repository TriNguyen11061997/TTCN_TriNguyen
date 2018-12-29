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
public class GENumberingsInfo {

    private int GENumberingID;
    private String GENumberingName;
    private int GENumberingNumber;
    private String GETableName;

    public GENumberingsInfo() {
    }

    public GENumberingsInfo(int GENumberingID, String GENumberingName, int GENumberingNumber, String GETableName) {
        this.GENumberingID = GENumberingID;
        this.GENumberingName = GENumberingName;
        this.GENumberingNumber = GENumberingNumber;
        this.GETableName = GETableName;
    }

    public int getGENumberingID() {
        return GENumberingID;
    }

    public void setGENumberingID(int GENumberingID) {
        this.GENumberingID = GENumberingID;
    }

    public String getGENumberingName() {
        return GENumberingName;
    }

    public void setGENumberingName(String GENumberingName) {
        this.GENumberingName = GENumberingName;
    }

    public int getGENumberingNumber() {
        return GENumberingNumber;
    }

    public void setGENumberingNumber(int GENumberingNumber) {
        this.GENumberingNumber = GENumberingNumber;
    }

    public String getGETableName() {
        return GETableName;
    }

    public void setGETableName(String GETableName) {
        this.GETableName = GETableName;
    }

}
