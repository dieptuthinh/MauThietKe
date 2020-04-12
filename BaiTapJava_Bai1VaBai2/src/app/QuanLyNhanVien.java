package app;

import java.util.ArrayList;

public class QuanLyNhanVien implements interfaceIQuanLy {
    ArrayList<NhanVien> DanhSachNhanVien = new ArrayList<NhanVien>();

    @Override
    public void them(NhanVien nv) {
        DanhSachNhanVien.add(nv);
        
    }

    @Override
    public void inDS() {
        for (int i = 0; i < DanhSachNhanVien.size(); i++) {
            //System.out.println(i+1+"--------------------------");
            System.out.println(i+1 + " " + DanhSachNhanVien.get(i).getThongTin());
        }
    }
}