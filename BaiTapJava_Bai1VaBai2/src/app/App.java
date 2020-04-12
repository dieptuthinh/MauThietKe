package app;

public class App {
    public static void main(String[] args) throws Exception {
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Lee Van Dat");
        nv1.setTuoi("18");
        nv1.setDiaChi("Nha Trang - Khanh Hoa");
        nv1.setTienLuong((double) 2000000);
        nv1.setTongGioLam(200);
        System.out.println("Thong tin nhan vien cua Bai 1 la :\n" + nv1.getThongTin());


        NhanVien nv2 = new NhanVien();
        nv2.setTen("Tran Van Cau");
        nv2.setTuoi("19");
        nv2.setDiaChi("Dien Khanh - Khanh Hoa");
        nv2.setTienLuong((double) 3000000);
        nv2.setTongGioLam(300);
        System.out.println( nv2.getThongTin());


        System.out.println("\n In danh sach cac nhan vien Bai 2 la :");
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        NhanVien nv3 = new NhanVien("Nguyen Van Tinh", "20", "Khanh Hoa", (double) 200000, 225);
        NhanVien nv4 = new NhanVien("Le Quoc Trung", "18", "Khanh Hoa", (double) 600000, 195);
        NhanVien nv5 = new NhanVien("Truc Nhan", "21", "Khanh Hoa", (double) 830000, 99);

        quanLyNhanVien.them(nv1);
        quanLyNhanVien.them(nv2);
        quanLyNhanVien.them(nv3);
        quanLyNhanVien.them(nv4);
        quanLyNhanVien.them(nv5);

        quanLyNhanVien.inDS();

    }
}