package app;

public class App {
    public static void main(String[] args) throws Exception {
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Lee Van Dat");
        nv1.setTuoi("18");
        nv1.setDiaChi("Nha Trang - Khanh Hoa");
        nv1.setTienLuong((double) 2000000);
        nv1.setTongGioLam(200);
        System.out.println("Thong tin nhan vien:\n" + nv1.getThongTin());


        NhanVien nv2 = new NhanVien();
        nv2.setTen("Tran Van Cau");
        nv2.setTuoi("19");
        nv2.setDiaChi("Dien Khanh - Khanh Hoa");
        nv2.setTienLuong((double) 3000000);
        nv2.setTongGioLam(300);
        System.out.println(nv2.getThongTin());

    }
}