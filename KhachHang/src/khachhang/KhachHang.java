/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package khachhang;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class KhachHang {

    /**
     * @param args the command line arguments
     */
    public String MaKH;
    public String Hoten;
    public String Diachi;
    public String NgaylapHD;
    public float SoKW;
    public float Dongia;
    public float Dinhmuc;
    
    public KhachHang(){
        
    }
    
    public KhachHang(String MaKH,String Hoten,String NgaylapHD, float SoKW,
            float Dongia, float Dinhmuc){
        this.MaKH = MaKH;
        this.Hoten = Hoten;
        this.Diachi = Diachi;
        this.NgaylapHD = NgaylapHD;
        this.SoKW = SoKW;
        this.Dongia = Dongia;
        this.Dinhmuc = Dinhmuc;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getNgaylapHD() {
        return NgaylapHD;
    }

    public void setNgaylapHD(String NgaylapHD) {
        this.NgaylapHD = NgaylapHD;
    }

    public float getSoKW() {
        return SoKW;
    }

    public void setSoKW(float SoKW) {
        this.SoKW = SoKW;
    }

    public float getDongia() {
        return Dongia;
    }

    public void setDongia(float Dongia) {
        this.Dongia = Dongia;
    }

    public float getDinhmuc() {
        return Dinhmuc;
    }

    public void setDinhmuc(float Dinhmuc) {
        this.Dinhmuc = Dinhmuc;
    }
    public void NhapKhachHang(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập Mã Khách Hàng: ");
        this.MaKH = sc.nextLine();
        System.out.print(" Nhập Họ tên Khách Hàng: ");
        this.Hoten = sc.nextLine();
        System.out.print(" Nhập Địa chỉ: ");
        this.Diachi = sc.nextLine();
        System.out.print(" Ngày lập hóa đơn: ");
        this.NgaylapHD = sc.nextLine();
        System.out.print(" Nhập số KW tiêu thụ trong 1 tháng: ");
        this.SoKW = sc.nextFloat();
        System.out.print(" Nhập đơn giá của 1 Kw: ");
        this.Dongia = sc.nextFloat();
        System.out.print(" Nhập định mức tiêu thụ: ");
        this.Dinhmuc = sc.nextFloat();
    }
    public void HienThiKhachHang(){
        System.out.println(" Mã Khách Hàng: "+ this.MaKH);
        System.out.println(" Họ tên Khách Hàng: "+this.Hoten);
        System.out.println(" Địa chỉ: "+this.Diachi);
        System.out.println(" Ngày lập hóa đơn: "+this.NgaylapHD);
        System.out.println(" Số KW tiêu thụ trong 1 tháng: "+ this.SoKW);
        System.out.println(" Đơn giá 1 kW: "+this.Dongia);
        System.out.println(" Định mức tiêu thụ: "+this.Dinhmuc);
    }
    public float Thanhtien(){
        float Thanhtien = 0;
        if(this.SoKW <= this.Dinhmuc){
            Thanhtien = this.SoKW * this.Dongia;
        }else{
            Thanhtien = this.SoKW * this.Dongia *this.Dinhmuc 
                    + (this.SoKW - this.Dinhmuc)*this.Dongia*2.5f;
        }
        return Thanhtien;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
