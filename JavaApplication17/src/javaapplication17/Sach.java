/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author pc
 */
public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXB;
    private TacGia tacGia;
    public Sach(String tenSach,double giaBan,int namXB,TacGia tacGia)
    {
        this.tenSach=tenSach;
        this.giaBan=giaBan;
        this.namXB=namXB;
        this.tacGia=tacGia;
    }
    public String getTenSach(){
        return this.tenSach;
    }
    public void setTenSach(String tenSach)
    {
        this.tenSach=tenSach;
    }
    public double getgiaBan(){
        return this.giaBan;
    }
    public void setgiaBan(double giaBan){
        this.giaBan=giaBan;
    }
    public int getNamXB(){
        return this.namXB;
    }
    public void setNamXB(int namXB){
        this.namXB=namXB;
    }
    public TacGia getTacGia(){
        return this.tacGia;
    }
    public void setTacGia(TacGia tacGia)
    {
        this.tacGia=tacGia;
    }
    public void inTenSach(){
        System.out.println("Tên Sách: "+ this.tenSach);
    }
    public boolean KtracungNamXB(Sach sachKhac){
//        if(this.namXB==sachKhac.namXB){
//            return true;
//        }
//        else{
//            return false;
//        }
       return this.namXB==sachKhac.namXB;
    }
    public double giaSaukhiGiam(double x){
        return this.giaBan *(1-x/100);
    }
}
