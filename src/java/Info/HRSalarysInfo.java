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
public class HRSalarysInfo {
    private int HRSalaryID;
    private int FK_HREmployeeID;
    private int HRSalaryMonth;
    private int HRSalaryYear;
    private double HRSalaryQty;
    private double HRSalaryBonus;
    private double HRSalaryBasic;
    private double HRSalaryToTal;
    private double HRSalaryReduce;
    private HREmployeesInfo employee;

    public HRSalarysInfo() {
    }

    public int getHRSalaryID() {
        return HRSalaryID;
    }

    public void setHRSalaryID(int HRSalaryID) {
        this.HRSalaryID = HRSalaryID;
    }

    public int getFK_HREmployeeID() {
        return FK_HREmployeeID;
    }

    public void setFK_HREmployeeID(int FK_HREmployeeID) {
        this.FK_HREmployeeID = FK_HREmployeeID;
    }

    public int getHRSalaryMonth() {
        return HRSalaryMonth;
    }

    public void setHRSalaryMonth(int HRSalaryMonth) {
        this.HRSalaryMonth = HRSalaryMonth;
    }

    public int getHRSalaryYear() {
        return HRSalaryYear;
    }

    public void setHRSalaryYear(int HRSalaryYear) {
        this.HRSalaryYear = HRSalaryYear;
    }

    public double getHRSalaryQty() {
        return HRSalaryQty;
    }

    public void setHRSalaryQty(double HRSalaryQty) {
        this.HRSalaryQty = HRSalaryQty;
    }

    public double getHRSalaryBonus() {
        return HRSalaryBonus;
    }

    public void setHRSalaryBonus(double HRSalaryBonus) {
        this.HRSalaryBonus = HRSalaryBonus;
    }

    public double getHRSalaryBasic() {
        return HRSalaryBasic;
    }

    public void setHRSalaryBasic(double HRSalaryBasic) {
        this.HRSalaryBasic = HRSalaryBasic;
    }

    public double getHRSalaryToTal() {
        return HRSalaryToTal;
    }

    public void setHRSalaryToTal(double HRSalaryToTal) {
        this.HRSalaryToTal = HRSalaryToTal;
    }

    public double getHRSalaryReduce() {
        return HRSalaryReduce;
    }

    public void setHRSalaryReduce(double HRSalaryReduce) {
        this.HRSalaryReduce = HRSalaryReduce;
    }

    public HREmployeesInfo getEmployee() {
        return employee;
    }

    public void setEmployee(HREmployeesInfo employee) {
        this.employee = employee;
    }
    
    
}
