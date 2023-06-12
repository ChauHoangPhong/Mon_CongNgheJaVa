/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1.pkg26;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TheMuon extends Sinhvien{
    private int phieumuon;
    private String ngaymuon;
    private String hantra;
    private int Sohieu;
    
    public TheMuon(){
    }
    public TheMuon(String ma, String hoten, int namsinh, String lop, int phieumuon,
            String ngaymuon, String hantra, int Sohieu){
           super(ma,hoten,namsinh,lop);
           this.phieumuon = phieumuon;
           this.ngaymuon = ngaymuon;
           this.hantra = hantra;
           this.Sohieu = Sohieu;
    }

    public int getPhieumuon() {
        return phieumuon;
    }

    public void setPhieumuon(int phieumuon) {
        this.phieumuon = phieumuon;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getHantra() {
        return hantra;
    }

    public void setHantra(String hantra) {
        this.hantra = hantra;
    }

    public int getSohieu() {
        return Sohieu;
    }

    public void setSohieu(int Sohieu) {
        this.Sohieu = Sohieu;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập phiếu mượn: ");
        this.setPhieumuon(sc.nextInt());
        Scanner sc3 = new Scanner(System.in);
        System.out.print(" Nhập ngày mượn: ");
        this.setNgaymuon(sc3.nextLine());
        System.out.print(" Nhập hạn trả: ");
        this.setHantra(sc3.nextLine());
        System.out.print(" Nhập số hiệu sách: ");
        this.setSohieu(sc3.nextInt());
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println(" Số phiếu mượn: "+this.getPhieumuon());
        System.out.println(" Ngày mượn: "+this.getNgaymuon());
        System.out.println(" Hạn trả: "+this.getHantra());
        System.out.println(" Số hiệu sách: "+this.getSohieu());
    }
    public static void main(String[] args) {
       int n =100;
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên mượn sách: ");
        n = (sc.nextInt());
        TheMuon[] a = new TheMuon[n];
        for(int i =0;i<n;i++){
            a[i] = new TheMuon();
            System.out.println("Nhập thông tin thẻ thứ: "+(i+1));
            a[i].nhap();
            System.out.println("==============");
        }
        for(int i =0;i<n;i++){
            System.out.println("Thẻ mượn thứ: "+(i+1));
            a[i].xuat();
            System.out.println("---------------------");
        }
        System.out.println("Hiển thị sinh viên lớp công nghệ thông tin");
        for(int i =0;i<n;i++){
            if(a[i].getLop().equals("CNTT")){
                a[i].xuat();
                System.out.println(",,,,,,,,,,,,,,");
            }
        }
    }
}
