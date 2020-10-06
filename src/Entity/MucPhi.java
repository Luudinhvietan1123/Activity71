package Entity;

public class MucPhi {
    private String MaMP;
    private String DonGia;
    private String MoTa;

    public MucPhi(){}

    public MucPhi(String MaMP, String DonGia, String MoTa){
        this.MaMP = MaMP;
        this.DonGia = DonGia;
        this.MoTa = MoTa;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String donGia) {
        DonGia = donGia;
    }

    public String getMaMP() {
        return MaMP;
    }

    public void setMaMP(String maMP) {
        MaMP = maMP;
    }
}
