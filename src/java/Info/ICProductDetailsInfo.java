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
public class ICProductDetailsInfo {   
    int ICProductDetailID;
    int FK_ICProductID;
    String ICProductDetail3G;
    String ICProductDetail4G;
    String ICProductDetailSIM;
    String ICProductDetailKichThuoc;
    String ICProductDetailMauSac;
    String ICProductDetailTrongLuong;
    String ICProductDetailLoai;
    String ICProductDetailManHinh;
    String ICProductDetailAudio;
    String ICProductDetailRAM;
    String ICProductDetailBoNhoTrong;
    String ICProductDetailBluetooth;
    String ICProductDetailGPS;
    String ICProductDetailPin;
    String ICProductDetailWLAN;
    String ICProductDetailCameraChinh;
    String ICProductDetailCamaraPhu;
    String ICProductDetailQuayPhim;
    String ICProductDetailCPU;
    String ICProductDetailBaoHanh;
    String ICProductDetailDesc;
    private String ICProductDetailHeDieuHanh;
    private String ICProductDetailJack;
    private ICProductsInfo product;

    public ICProductsInfo getProduct() {
        return product;
    }

    public void setProduct(ICProductsInfo product) {
        this.product = product;
    }
    
    
    public ICProductDetailsInfo() {
    }

    public String getICProductDetailDesc() {
        return ICProductDetailDesc;
    }

    public void setICProductDetailDesc(String ICProductDetailDesc) {
        this.ICProductDetailDesc = ICProductDetailDesc;
    }
    

    public ICProductDetailsInfo(int ICProductDetailID, int FK_ICProductID, String ICProductDetail3G, String ICProductDetail4G, String ICProductDetailSIM, String ICProductDetailKichThuoc, String ICProductDetailMauSac, String ICProductDetailTrongLuong, String ICProductDetailLoai, String ICProductDetailManHinh, String ICProductDetailAudio, String ICProductDetailRAM, String ICProductDetailBoNhoTrong, String ICProductDetailBluetooth, String ICProductDetailGPS, String ICProductDetailPin, String ICProductDetailWLAN, String ICProductDetailCameraChinh, String ICProductDetailCamaraPhu, String ICProductDetailQuayPhim, String ICProductDetailCPU, String ICProductDetailBaoHanh, String ICProductDetailDesc, String ICProductDetailHeDieuHanh, String ICProductDetailJack, ICProductsInfo product) {
        this.ICProductDetailID = ICProductDetailID;
        this.FK_ICProductID = FK_ICProductID;
        this.ICProductDetail3G = ICProductDetail3G;
        this.ICProductDetail4G = ICProductDetail4G;
        this.ICProductDetailSIM = ICProductDetailSIM;
        this.ICProductDetailKichThuoc = ICProductDetailKichThuoc;
        this.ICProductDetailMauSac = ICProductDetailMauSac;
        this.ICProductDetailTrongLuong = ICProductDetailTrongLuong;
        this.ICProductDetailLoai = ICProductDetailLoai;
        this.ICProductDetailManHinh = ICProductDetailManHinh;
        this.ICProductDetailAudio = ICProductDetailAudio;
        this.ICProductDetailRAM = ICProductDetailRAM;
        this.ICProductDetailBoNhoTrong = ICProductDetailBoNhoTrong;
        this.ICProductDetailBluetooth = ICProductDetailBluetooth;
        this.ICProductDetailGPS = ICProductDetailGPS;
        this.ICProductDetailPin = ICProductDetailPin;
        this.ICProductDetailWLAN = ICProductDetailWLAN;
        this.ICProductDetailCameraChinh = ICProductDetailCameraChinh;
        this.ICProductDetailCamaraPhu = ICProductDetailCamaraPhu;
        this.ICProductDetailQuayPhim = ICProductDetailQuayPhim;
        this.ICProductDetailCPU = ICProductDetailCPU;
        this.ICProductDetailBaoHanh = ICProductDetailBaoHanh;
        this.ICProductDetailDesc = ICProductDetailDesc;
        this.ICProductDetailHeDieuHanh = ICProductDetailHeDieuHanh;
        this.ICProductDetailJack = ICProductDetailJack;
        this.product = product;
    }

    
    public int getICProductDetailID() {
        return ICProductDetailID;
    }

    public void setICProductDetailID(int ICProductDetailID) {
        this.ICProductDetailID = ICProductDetailID;
    }

    public int getFK_ICProductID() {
        return FK_ICProductID;
    }

    public void setFK_ICProductID(int FK_ICProductID) {
        this.FK_ICProductID = FK_ICProductID;
    }

    public String getICProductDetail3G() {
        return ICProductDetail3G;
    }

    public void setICProductDetail3G(String ICProductDetail3G) {
        this.ICProductDetail3G = ICProductDetail3G;
    }

    public String getICProductDetail4G() {
        return ICProductDetail4G;
    }

    public void setICProductDetail4G(String ICProductDetail4G) {
        this.ICProductDetail4G = ICProductDetail4G;
    }

    public String getICProductDetailSIM() {
        return ICProductDetailSIM;
    }

    public void setICProductDetailSIM(String ICProductDetailSIM) {
        this.ICProductDetailSIM = ICProductDetailSIM;
    }

    public String getICProductDetailKichThuoc() {
        return ICProductDetailKichThuoc;
    }

    public void setICProductDetailKichThuoc(String ICProductDetailKichThuoc) {
        this.ICProductDetailKichThuoc = ICProductDetailKichThuoc;
    }

    public String getICProductDetailMauSac() {
        return ICProductDetailMauSac;
    }

    public void setICProductDetailMauSac(String ICProductDetailMauSac) {
        this.ICProductDetailMauSac = ICProductDetailMauSac;
    }

    public String getICProductDetailTrongLuong() {
        return ICProductDetailTrongLuong;
    }

    public void setICProductDetailTrongLuong(String ICProductDetailTrongLuong) {
        this.ICProductDetailTrongLuong = ICProductDetailTrongLuong;
    }

    public String getICProductDetailLoai() {
        return ICProductDetailLoai;
    }

    public void setICProductDetailLoai(String ICProductDetailLoai) {
        this.ICProductDetailLoai = ICProductDetailLoai;
    }

    public String getICProductDetailManHinh() {
        return ICProductDetailManHinh;
    }

    public void setICProductDetailManHinh(String ICProductDetailManHinh) {
        this.ICProductDetailManHinh = ICProductDetailManHinh;
    }

    public String getICProductDetailAudio() {
        return ICProductDetailAudio;
    }

    public void setICProductDetailAudio(String ICProductDetailAudio) {
        this.ICProductDetailAudio = ICProductDetailAudio;
    }

    public String getICProductDetailBoNhoTrong() {
        return ICProductDetailBoNhoTrong;
    }

    public void setICProductDetailBoNhoTrong(String ICProductDetailBoNhoTrong) {
        this.ICProductDetailBoNhoTrong = ICProductDetailBoNhoTrong;
    }

    public String getICProductDetailBluetooth() {
        return ICProductDetailBluetooth;
    }

    public void setICProductDetailBluetooth(String ICProductDetailBluetooth) {
        this.ICProductDetailBluetooth = ICProductDetailBluetooth;
    }

    public String getICProductDetailGPS() {
        return ICProductDetailGPS;
    }

    public void setICProductDetailGPS(String ICProductDetailGPS) {
        this.ICProductDetailGPS = ICProductDetailGPS;
    }

    public String getICProductDetailPin() {
        return ICProductDetailPin;
    }

    public void setICProductDetailPin(String ICProductDetailPin) {
        this.ICProductDetailPin = ICProductDetailPin;
    }

    public String getICProductDetailWLAN() {
        return ICProductDetailWLAN;
    }

    public void setICProductDetailWLAN(String ICProductDetailWLAN) {
        this.ICProductDetailWLAN = ICProductDetailWLAN;
    }

    public String getICProductDetailCameraChinh() {
        return ICProductDetailCameraChinh;
    }

    public void setICProductDetailCameraChinh(String ICProductDetailCameraChinh) {
        this.ICProductDetailCameraChinh = ICProductDetailCameraChinh;
    }

    public String getICProductDetailCamaraPhu() {
        return ICProductDetailCamaraPhu;
    }

    public void setICProductDetailCamaraPhu(String ICProductDetailCamaraPhu) {
        this.ICProductDetailCamaraPhu = ICProductDetailCamaraPhu;
    }

    public String getICProductDetailQuayPhim() {
        return ICProductDetailQuayPhim;
    }

    public void setICProductDetailQuayPhim(String ICProductDetailQuayPhim) {
        this.ICProductDetailQuayPhim = ICProductDetailQuayPhim;
    }

    public String getICProductDetailCPU() {
        return ICProductDetailCPU;
    }

    public void setICProductDetailCPU(String ICProductDetailCPU) {
        this.ICProductDetailCPU = ICProductDetailCPU;
    }

    public String getICProductDetailBaoHanh() {
        return ICProductDetailBaoHanh;
    }

    public void setICProductDetailBaoHanh(String ICProductDetailBaoHanh) {
        this.ICProductDetailBaoHanh = ICProductDetailBaoHanh;
    }

    /**
     * @return the ICProductDetailHeDieuHanh
     */
    public String getICProductDetailHeDieuHanh() {
        return ICProductDetailHeDieuHanh;
    }

    /**
     * @param ICProductDetailHeDieuHanh the ICProductDetailHeDieuHanh to set
     */
    public void setICProductDetailHeDieuHanh(String ICProductDetailHeDieuHanh) {
        this.ICProductDetailHeDieuHanh = ICProductDetailHeDieuHanh;
    }



    /**
     * @return the ICProductDetailRAM
     */
    public String getICProductDetailRAM() {
        return ICProductDetailRAM;
    }

    /**
     * @param ICProductDetailRAM the ICProductDetailRAM to set
     */
    public void setICProductDetailRAM(String ICProductDetailRAM) {
        this.ICProductDetailRAM = ICProductDetailRAM;
    }

    /**
     * @return the ICProductDetailJack
     */
    public String getICProductDetailJack() {
        return ICProductDetailJack;
    }

    /**
     * @param ICProductDetailJack the ICProductDetailJack to set
     */
    public void setICProductDetailJack(String ICProductDetailJack) {
        this.ICProductDetailJack = ICProductDetailJack;
    }
    
    
}
