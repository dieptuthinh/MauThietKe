package app;

public abstract class SinhVienPoly {

    public String hoTen;
    public String nganhHoc;

    public SinhVienPoly() {
    }
    

    public SinhVienPoly(String hoTen, String nganhHoc) {
      this.hoTen = hoTen;
      this.nganhHoc = nganhHoc;
    }

    public String getHoTen() {
      return hoTen;
    }

    public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
    }

    public String getNganhHoc() {
      return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
      this.nganhHoc = nganhHoc;
    }

    public abstract double getDiem();

    public String getHocLuc()
    {
      String hocLuc;
      if(getDiem() < 5)
      {
        hocLuc = "Yeu";
      } 
      else if(getDiem() < 6.5)
      {
        hocLuc="Trung Binh";
      } 
      else if(getDiem() < 7.5) 
      {
        hocLuc="Kha";
      }
      else if(getDiem() < 9)
      {
        hocLuc = "Gioi";
      }
      else
      {
        hocLuc = "Xuat sac";
      } 
      return hocLuc;
  }

  public void Xuat()
  {
    System.out.println(" - Ho ten Sinh Vien : " + hoTen + ", Nganh : " + nganhHoc + ", Diem : "+ getDiem() + ", Hoc luc: " + getHocLuc());
  }

   

}