/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationbophim;

/**
 *
 * @author pc
 */
public class HangSX {
    private String tenHangsx,quocGia;
    public HangSX(String tenHangsx,String quocGia){
        this.tenHangsx=tenHangsx;
        this.quocGia=quocGia;
    }
    public String getTenHangsx(){
        return this.tenHangsx;
    }
    public void setTenHangsx(String tenHangsx){
        this.tenHangsx=tenHangsx;
    }
    public String getQuocGia(){
        return this.quocGia;
    }
    public void setQuocGia(String quocGia){
        this.quocGia=quocGia;
    }
}
