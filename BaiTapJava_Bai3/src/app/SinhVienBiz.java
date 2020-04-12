package app;

public class SinhVienBiz extends SinhVienPoly {
    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz(String hoTen, String nganhHoc, double diemMarketing, double diemSales) {
        super(hoTen, nganhHoc);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales ) / 3;
    }
    

}