/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationsv;

/**
 *
 * @author pc
 */
public class SinhVien {
    private String MSV;
    private String HoTen;
    private Ngay Ngaysinh;
    private double Dtb;
    private Lop lop;
    public SinhVien(String MSV,String HoTen,Ngay Ngaysinh,double Dtb,Lop lop)
    {
        this.MSV=MSV;
        this.HoTen=HoTen;
        this.Ngaysinh=Ngaysinh;
        this.Dtb = Dtb;
        this.lop=lop;
    }
    public String getMSV()
    {
        return this.MSV;
    }
    public void setMSV(String MSV){
        this.MSV=MSV;
    }
    public String getHoTen(){
        return this.HoTen;
    }
    public void setHoTen(String HoTen){
        this.HoTen=HoTen;
    }
    public Ngay getNgaysinh(){
        return this.Ngaysinh;
    }
    public void setNgaysinh(Ngay Ngaysinh)
    {
        this.Ngaysinh=Ngaysinh;
    }
    public double getDTB(){
        return this.Dtb;
    }
    public void setDTB(double Dtb){
        this.Dtb=Dtb;
    }
    public Lop getlop(){
        return this.lop;
    }
    public void setLop(Lop lop){
        this.lop=lop;
    }
    public String bietTenKhoa(){
        return this.lop.getTenKhoa();
    }
    public boolean KtraDat(){
        return this.Dtb >= 5 ;
    }
    public boolean KtraCungNgaySinh(SinhVien khac){
        return this.Ngaysinh.equals(khac.Ngaysinh);
    }
}
