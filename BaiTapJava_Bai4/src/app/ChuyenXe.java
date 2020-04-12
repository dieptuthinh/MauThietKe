package app;

public abstract class ChuyenXe {
    public String MaSoChuyen;
    public String TenTaiXe;
    public String SoXe;
    public double DoanhThu;

    public ChuyenXe(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu) {
        MaSoChuyen = maSoChuyen;
        TenTaiXe = tenTaiXe;
        SoXe = soXe;
        DoanhThu = doanhThu;
    }

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        MaSoChuyen = maSoChuyen;
    }

    public String getTenTaiXe() {
        return TenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        TenTaiXe = tenTaiXe;
    }

    public String getSoXe() {
        return SoXe;
    }

    public void setSoXe(String soXe) {
        SoXe = soXe;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        DoanhThu = doanhThu;
    }

    public abstract void HienThiTT();
    
}