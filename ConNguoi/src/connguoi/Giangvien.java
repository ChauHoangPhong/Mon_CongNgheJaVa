/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connguoi;

/**
 *
 * @author pc
 */
public class Giangvien  extends ConNguoi{
    float lcb,gioday;
    int tuoi;
    public Giangvien(String ten,int ns,String diachi,String gt,float lcb,float gioday){
            this.ten=ten;
            this.ns=ns;
            this.diachi=diachi;
            this.gt=gt;
            this.lcb=lcb;
            this.gioday=gioday;
            this.tuoi();
    }
    public float luong(){
        return lcb*gioday;
    }
    void hienthithongtingv(){
        System.out.println(" Tên GV "+ten);
        System.out.println(" Nam sinh "+ns);
        System.out.println(" Địa chỉ "+diachi);
        System.out.println(" Giới tính "+gt);
        System.out.println(" Lương cơ bản "+lcb);
        System.out.println(" Giờ dạy "+gioday);
        System.out.println(" Tuoi "+tuoi);
    }
}
