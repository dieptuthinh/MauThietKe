package app;

public class NhanVien {
    private String Ten;
    private String Tuoi;
    private String DiaChi;
    private Double TienLuong;
    private int TongGioLam;

    public NhanVien() {
    }

    public NhanVien(String Ten, String Tuoi, String DiaChi, Double TienLuong, int TongGioLam) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.TienLuong = TienLuong;
        this.TongGioLam = TongGioLam;
    }

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public String getTuoi() {
		return Tuoi;
	}

	public void setTuoi(String tuoi) {
		Tuoi = tuoi;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public Double getTienLuong() {
		return TienLuong;
	}

	public void setTienLuong(Double tienLuong) {
		TienLuong = tienLuong;
	}

	public int getTongGioLam() {
		return TongGioLam;
	}

	public void setTongGioLam(int tongGioLam) {
		TongGioLam = tongGioLam;
    }
    
    public double getTinhThuong() {
        if (TongGioLam >= 200)
        {
            return TienLuong * 0.2;
        } 
        else if (TienLuong >= 100)
        {
            return TienLuong * 0.1;
        } 
        else return 0;
    }


    public String getThongTin() {
        String HienThi = "";

        HienThi = "Ten: " + Ten + ", Tuoi:" + Tuoi + ", Dia chi:" + DiaChi + ", Tien luong:" + TienLuong + 
        ", Tong so gio lam:" + TongGioLam + ", Tien thuong: " + getTinhThuong();

        return HienThi;
    }

}