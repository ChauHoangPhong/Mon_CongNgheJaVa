/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thisinh;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Thisinh {

    /**
     * @param args the command line arguments
     */
    public String Sobd;
    public String Hoten;
    public String Diachi;
    private float uutien;
    
    
    public Thisinh(){
        
    }
    public Thisinh(String Sobd,String Hoten, String Diachi, float uutien){
        this.Sobd = Sobd;
        this.Hoten = Hoten;
        this.uutien = uutien;
    }

    public String getSobd() {
        return Sobd;
    }

    public void setSobd(String Sobd) {
        this.Sobd = Sobd;
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

    public float getUutien() {
        return uutien;
    }

    public void setUutien(float uutien) {
        this.uutien = uutien;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void nhap(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhập số báo danh: ");
        this.setSobd(sc.nextLine()); 
        System.out.println("Nhập họ tên: ");
        this.setHoten(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.setDiachi(sc.nextLine());
        System.out.println("Nhập mức độ ưu tiên: ");
        this.setUutien(sc.nextFloat());
    }
    public void xuat(){
        System.out.println("\n Số báo danh: "+this.getSobd());
        System.out.println("\n Họ tên: "+this.getHoten());
        System.out.println("\n Địa chỉ: "+this.getDiachi());
        System.out.println("\n Ưu tiên: "+this.getUutien());
    }
}
