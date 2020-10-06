package Entity;

public class NhaCungCap {
    private String MaNhaCC;
    private String TenNhaCC;
    private String DiaChi;
    private String SoDT;
    private String MaSoThue;

    public NhaCungCap(String maNhaCC, String TenNhaCC, String DiaChi, String SoDT, String MaSoThue) {
        this.MaNhaCC = maNhaCC;
        this.TenNhaCC = TenNhaCC;
        this.DiaChi = DiaChi;
        this.SoDT = SoDT;
        this.MaSoThue = MaSoThue;
    }

    public NhaCungCap(){}

    public String getMaSoThue() {
        return MaSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        MaSoThue = maSoThue;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String soDT) {
        SoDT = soDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getTenNhaCC() {
        return TenNhaCC;
    }

    public void setTenNhaCC(String tenNhaCC) {
        TenNhaCC = tenNhaCC;
    }

    public String getMaNhaCC() {
        return MaNhaCC;
    }

    public void setMaNhaCC(String maNhaCC) {
        MaNhaCC = maNhaCC;
    }
}
