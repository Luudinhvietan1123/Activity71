package Entity;

import java.util.Date;

public class DangKiCungCap {
    private String MaDKCC;
    private Date NgayBatDauCungCap;
    private Date NgayKetThucCungCap;
    private int SoLuongXeDangKy;
    private String MaNhaCC;
    private String MaLoaiDV;
    private String DongXe;
    private String MaMP;

    public DangKiCungCap(){}

    public DangKiCungCap(String MaDKCC, Date NgayBatDauCungCap, Date NgayKetThucCungCap, int SoLuongXeDangki, String MaNhaCC, String MaLoaiDV, String DongXe, String MaMP){
        this.MaDKCC = MaDKCC;
        this.NgayBatDauCungCap = NgayBatDauCungCap;
        this.NgayKetThucCungCap = NgayKetThucCungCap;
        this.SoLuongXeDangKy = SoLuongXeDangki;
        this.MaNhaCC = MaNhaCC;
        this.MaLoaiDV = MaLoaiDV;
        this.DongXe = DongXe;
        this.MaMP = MaMP;
    }

    public String getMaMP() {
        return MaMP;
    }

    public void setMaMP(String maMP) {
        MaMP = maMP;
    }

    public String getDongXe() {
        return DongXe;
    }

    public void setDongXe(String dongXe) {
        DongXe = dongXe;
    }

    public String getMaLoaiDV() {
        return MaLoaiDV;
    }

    public void setMaLoaiDV(String maLoaiDV) {
        MaLoaiDV = maLoaiDV;
    }

    public String getMaNhaCC() {
        return MaNhaCC;
    }

    public void setMaNhaCC(String maNhaCC) {
        MaNhaCC = maNhaCC;
    }

    public int getSoLuongXeDangKy() {
        return SoLuongXeDangKy;
    }

    public void setSoLuongXeDangKy(int soLuongXeDangKy) {
        SoLuongXeDangKy = soLuongXeDangKy;
    }

    public Date getNgayKetThucCungCap() {
        return NgayKetThucCungCap;
    }

    public void setNgayKetThucCungCap(Date ngayKetThucCungCap) {
        NgayKetThucCungCap = ngayKetThucCungCap;
    }

    public Date getNgayBatDauCungCap() {
        return NgayBatDauCungCap;
    }

    public void setNgayBatDauCungCap(Date ngayBatDauCungCap) {
        NgayBatDauCungCap = ngayBatDauCungCap;
    }

    public String getMaDKCC() {
        return MaDKCC;
    }

    public void setMaDKCC(String maDKCC) {
        MaDKCC = maDKCC;
    }
}
