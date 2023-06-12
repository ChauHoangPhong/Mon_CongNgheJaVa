/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canbo;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Giangvien extends CanBo{
    private String boMon;
    private int thamNien;
    
    public Giangvien() {}
    
    public Giangvien(String maCB, String hoTen, String diaChi, String boMon, int thamNien) {
        super(maCB, hoTen, diaChi);
        this.boMon = boMon;
        this.thamNien = thamNien;
    }
    
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bo mon: ");
        boMon = sc.nextLine();
        System.out.print("Nhap tham nien: ");
        thamNien = sc.nextInt();
    }
    
    public void hienThi() {
        super.hienThi();
        System.out.println("Bo mon: " + boMon);
        System.out.println("Tham nien: " + thamNien);
    }
    
    public String getBoMon() {
        return boMon;
    }
    
    public int getThamNien() {
        return thamNien;
    }
}

class DanhSach {
    private Giangvien[] danhSachGiangVien;
    private int n;
    
    public DanhSach() {}
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong giang vien: ");
        n = sc.nextInt();
        danhSachGiangVien = new Giangvien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin giang vien thu " + (i+1) + ":");
            Giangvien gv = new Giangvien();
            gv.nhap();
            danhSachGiangVien[i] = gv;
        }
    }
    
    public void hienThi() {
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin giang vien thu " + (i+1) + ":");
            danhSachGiangVien[i].hienThi();
        }
    }
    
    public void timKiem() {
        System.out.println("Cac giang vien thuoc bo mon 'Mang may tinh va Cong nghe DTPT' co tham nien tren 15 nam la:");
        for (int i = 0; i < n; i++) {
            if (danhSachGiangVien[i].getBoMon().equals("Mang may tinh va Cong nghe DTPT") && danhSachGiangVien[i].getThamNien() > 15) {
                danhSachGiangVien[i].hienThi();
            }
        }
    }
    public static void main(String[] args) {
        DanhSach ds = new DanhSach();
        ds.nhap();
        System.out.println("Danh sach cac giang vien:");
        ds.hienThi();
        ds.timKiem();
    }
}
