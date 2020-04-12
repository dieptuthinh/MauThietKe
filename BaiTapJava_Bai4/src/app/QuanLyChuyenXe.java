package app;

import java.util.ArrayList;

public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> QLDSChuyenXe = new ArrayList<ChuyenXe>();


    public ArrayList<ChuyenXe> getQLDSChuyenXe() {
        return QLDSChuyenXe;
    }

    public void setQLDSChuyenXe(ArrayList<ChuyenXe> QLDSChuyenXe) {
        this.QLDSChuyenXe = QLDSChuyenXe;
    }

    public void Them(ChuyenXe x){
        QLDSChuyenXe.add(x);
    }

    public void HienThi()
    {
        for(int i = 0 ; i < QLDSChuyenXe.size(); i++){
            QLDSChuyenXe.get(i).HienThiTT();;
        }
    }

    public long DoanhThuNoiThanh()
    {
        long TongNoiThanh = 0;
        for(int i = 0 ; i < QLDSChuyenXe.size(); i++)
        {
           XeNoiThanh Noi = QLDSChuyenXe.get(i) instanceof XeNoiThanh ? ((XeNoiThanh) QLDSChuyenXe.get(i)) : null;
           if(Noi !=null) TongNoiThanh += Noi.DoanhThu;
        }
        return TongNoiThanh;
    }
    public long DoanhThuNgoaiThanh()
    {
        long TongNgoaiThanh = 0;
        for(int i = 0 ; i < QLDSChuyenXe.size(); i++)
        {
            XeNgoaiThanh Ngoai = QLDSChuyenXe.get(i) instanceof XeNgoaiThanh ? ((XeNgoaiThanh) QLDSChuyenXe.get(i)) : null;
            if(Ngoai !=null) TongNgoaiThanh+= Ngoai.DoanhThu;
        }
        return TongNgoaiThanh;
    }
    public long TongDoanhThu(){
        long Tong =0;
        for(int i=0;i<QLDSChuyenXe.size();i++){
           Tong+= QLDSChuyenXe.get(i).DoanhThu;
        }
        return Tong;
    }
    

}