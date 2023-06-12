/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationbophim;

/**
 *
 * @author pc
 */
public class BoPhim {
    private String tenPhim;
    private int namSX;
    private Ngay ngayChieu;
    private HangSX hangSX;
    private double giaVe;
    public BoPhim(String tenPhim,int namSX,Ngay ngayChieu,HangSX hangSx,double giaVe)
    {
        this.tenPhim=tenPhim;
        this.namSX=namSX;
        this.ngayChieu=ngayChieu;
        this.hangSX=hangSx;
        this.giaVe=giaVe;
    }
    public String getTenPhim(){
        return this.tenPhim;
    }
    public void setTenPhim(String tenPhim){
        this.tenPhim=tenPhim;
    }
    public int getnamSX(){
        return this.namSX;
    }
    public void setNamSX(int namSX)
    {
        this.namSX=namSX;
    }
    public Ngay getNgayChieu()
    {
        return this.ngayChieu;
    }
    public void setNgayChieu(Ngay ngayChieu)
    {
        this.ngayChieu=ngayChieu;
    }
    public HangSX getHangSX()
    {
        return this.hangSX;
    }
    public void setHangSX(HangSX hangSX)
    {
        this.hangSX=hangSX;
    }
    public double getGiaVe()
    {
        return this.giaVe;
    }
    public void setGiaVe(double giaVe)
    {
        this.giaVe=giaVe;
    }
    public boolean KtraGiaveRehon(BoPhim Khac){
        return this.giaVe < Khac.giaVe;
    }
    public String layTenHangSanXuat(){
        return this.hangSX.getTenHangsx();
    }
    public double giaSauKM(double x)
    {
        return this.giaVe*(1-x/100);
    }
}
