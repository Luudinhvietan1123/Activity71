package Entity;

public class LoaiDichVu {
    private String MaLoaiDV;
    private String TenLoaiDV;

    public LoaiDichVu() {
    }

    public LoaiDichVu(String MaLoaiDV, String TenLoaiDV){
        this.MaLoaiDV = MaLoaiDV;
        this.TenLoaiDV = TenLoaiDV;
    }

    public String getTenLoaiDV() {
        return TenLoaiDV;
    }

    public void setTenLoaiDV(String tenLoaiDV) {
        TenLoaiDV = tenLoaiDV;
    }

    public String getMaLoaiDV() {
        return MaLoaiDV;
    }

    public void setMaLoaiDV(String maLoaiDV) {
        MaLoaiDV = maLoaiDV;
    }
}
