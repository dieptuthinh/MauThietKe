package app;

public class XeNoiThanh extends ChuyenXe {
    public String SoTuyen;
    public double SoKm;

    public XeNoiThanh(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu, String soTuyen, double soKm) {
        super(maSoChuyen, tenTaiXe, soXe, doanhThu);
        SoTuyen = soTuyen;
        SoKm = soKm;
    }

    public String getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        SoTuyen = soTuyen;
    }

    public double getSoKm() {
        return SoKm;
    }

    public void setSoKm(double soKm) {
        SoKm = soKm;
    }

    @Override
    public void HienThiTT() {
        System.out.println("Ma so: " + MaSoChuyen + ", Hoten:" + TenTaiXe + 
        ", So xe: " + SoXe + ", So tuyen : " + SoTuyen + ", So Km: " + SoKm + ", Doanh thu: " + DoanhThu + "\n" );
    }
    
}