/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thisinh;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class tsKhoiA extends Thisinh {
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    public tsKhoiA(){
    }
    public tsKhoiA(float diemToan, float diemLy,float diemHoa, String Sobd, String Hoten,
            String Diachi, float uutien){
        super(Sobd,Hoten,Diachi,uutien);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println(" Nhập điểm toán: ");
        Scanner sc = new Scanner(System.in);
        this.setDiemToan(sc.nextFloat());
        System.out.println(" Nhập điểm Lý: ");
        this.setDiemLy(sc.nextFloat());
        System.out.println(" Nhập điểm Hóa: ");
        this.setDiemHoa(sc.nextFloat());
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("\nĐiểm Toán: "+this.getDiemToan());
        System.out.println("\nĐiểm Lý: "+this.getDiemLy());
        System.out.println("\nĐiểm Hóa: "+this.getDiemHoa());
    }
    public static void main(String[] args){
        tsKhoiA a = new tsKhoiA();
        a.nhap();
        a.xuat();
    }
}
