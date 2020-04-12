package app;

public class App {
    public static void main(String[] args) {
        System.out.println("Thong tin sinh vien : ");
        SinhVienIT IT = new SinhVienIT("Le Quoc Mot", "CNTT", 10, 10, 10);
        SinhVienIT IT2 = new SinhVienIT("Le Quoc Mot Ruoi", "CNTT", 7, 7, 7);
        SinhVienBiz BIZ = new SinhVienBiz("Tran Van Hai", "Biz", 5, 5);
        IT.Xuat();
        IT2.Xuat();
        BIZ.Xuat();
        // System.out.println("diem: " + BIZ.getDiem());
        // System.out.println("hoc luc: " + BIZ.getHocLuc());


    }
}