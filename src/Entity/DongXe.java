package Entity;

public class DongXe {
    private String DongXe;
    private String HangXe;
    private int SoChoNgoi;

    public DongXe(){}

    public DongXe(String DongXe, String HangXe, int SoChoNgoi){
        this.DongXe = DongXe;
        this.HangXe = HangXe;
        this.SoChoNgoi = SoChoNgoi;
    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        SoChoNgoi = soChoNgoi;
    }

    public String getHangXe() {
        return HangXe;
    }

    public void setHangXe(String hangXe) {
        HangXe = hangXe;
    }

    public String getDongXe() {
        return DongXe;
    }

    public void setDongXe(String dongXe) {
        DongXe = dongXe;
    }
}
