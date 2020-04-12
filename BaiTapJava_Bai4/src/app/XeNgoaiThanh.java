package app;

public class XeNgoaiThanh extends ChuyenXe {
    public String NoiDen;
    public int SoNgayDiDuoc;

    public XeNgoaiThanh(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu, String noiDen,
            int soNgayDiDuoc) {
        super(maSoChuyen, tenTaiXe, soXe, doanhThu);
        NoiDen = noiDen;
        SoNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String noiDen) {
        NoiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return SoNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        SoNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void HienThiTT() {
        System.out.println("Ma so: " + MaSoChuyen + ", Hoten:" + TenTaiXe + 
        ", So xe: " + SoXe + ", Noi den: " + NoiDen + ", So ngay: " + SoNgayDiDuoc + ", Doanh thu: " + DoanhThu+ "\n");
    }
    

}