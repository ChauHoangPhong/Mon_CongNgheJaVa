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
public class Sinhvien {
    private String ma;
    private String hoten;
    private int namsinh;
    private String lop;
    
    public Sinhvien(String ma, String hoten, int namsinh, String lop){
        this.ma = ma;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.lop = lop;
    }
    public Sinhvien(){
        
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập mã sinh viên: ");
        this.setMa(sc.nextLine());
        System.out.print(" Nhập họ tên: ");
        this.setHoten(sc.nextLine());
        System.out.print(" Nhập năm sinh: ");
        this.setNamsinh(sc.nextInt());
        Scanner sc2 = new Scanner(System.in);
        System.out.print(" Nhập lớp: ");
        this.setLop(sc2.nextLine());
    }
    public void xuat(){
        System.out.println(" Mã sinh viên:"+this.getMa());
        System.out.println(" Họ tên: "+this.getHoten());
        System.out.println(" Năm sinh: "+this.getNamsinh());
        System.out.println(" Lớp: "+this.getLop());
    }
}
