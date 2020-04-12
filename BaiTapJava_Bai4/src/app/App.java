package app;


public class App {
    public static void main(String[] args) throws Exception {
        XeNoiThanh nt1 = new XeNoiThanh("1","Ngo Ba Kha","1239",(double) 170000, "100", 10);
        XeNoiThanh nt2 = new XeNoiThanh("2","Huan Rose","1249",(double) 200000, "200", 15);
        XeNoiThanh nt3 = new XeNoiThanh("3","Tran Dinh Trong","1259",(double) 302000, "300", 30);

        XeNgoaiThanh ngt1 = new XeNgoaiThanh("4","Ho Ha Ngoc","4569",(double) 1000000,"Ha Tinh",2);
        XeNgoaiThanh ngt2 = new XeNgoaiThanh("5","Ngo Ba Nghi","4579",(double) 3000000,"Da Lat",4);
        XeNgoaiThanh ngt3 = new XeNgoaiThanh("6","Tran Thanh Tu Nhi","4589",(double) 9000000,"Quang Ngai",7);

        QuanLyChuyenXe DSChuyenXe = new QuanLyChuyenXe();
        DSChuyenXe.Them(nt1);
        DSChuyenXe.Them(nt2);
        DSChuyenXe.Them(nt3);
        DSChuyenXe.Them(ngt1);
        DSChuyenXe.Them(ngt2);
        DSChuyenXe.Them(ngt3);

        System.out.println("Thong tin tung chuyen xe:\n");
        DSChuyenXe.HienThi();

        System.out.println("Tong doanh thu cua xe noi thanh :" + DSChuyenXe.DoanhThuNoiThanh());
        System.out.println("Tong doanh thu cua xe ngoai thanh :" + DSChuyenXe.DoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu : " + DSChuyenXe.TongDoanhThu());
    }
}