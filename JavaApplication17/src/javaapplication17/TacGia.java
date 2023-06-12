/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author pc
 */
public class TacGia {
    private String tenTacGia;
    private Ngay ngaySinh;
    public TacGia(String tenTacGia,Ngay ngaySinh)
    {
        this.tenTacGia=tenTacGia;
        this.ngaySinh=ngaySinh;
    }
    public String gettenTacGia(){
        return this.tenTacGia;
    }
    public void settenTacGia(String tenTacGia){
        this.tenTacGia=tenTacGia;
    } 
    public Ngay getNgaysinh(){
        return this.ngaySinh;
    }
    public void setNgaysinh(Ngay ngaySinh){
        this.ngaySinh = ngaySinh;
    }
}
