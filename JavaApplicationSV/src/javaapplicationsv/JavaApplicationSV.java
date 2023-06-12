/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationsv;


/**
 *
 * @author pc
 */
public class JavaApplicationSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ngay ns = new Ngay(30,1,2002);
        Ngay ns2 = new Ngay(03,8,2002);
        Ngay ns3 = new Ngay(30,1,2002);
        Lop lop1 = new Lop("14A11HN","CNTT");
        Lop lop2 = new Lop("14A13HN","CNTT");
        Lop lop3 = new Lop("14A13HN","QTKD");
        SinhVien sv = new SinhVien("20103100158","Châu Hoàng Phong",ns,9,lop1);
        SinhVien sv2 = new SinhVien("20103100790","Lê Thị Tuyết Nga",ns2,10,lop2);
        SinhVien sv3 = new SinhVien("20104100234","Nguyen Văn A",ns3,2,lop3);
        System.out.println("Tên Khoa sinh viên thứ 1: "+sv.bietTenKhoa());
        System.out.println("Tên Khoa sinh viên thứ 2: "+sv2.bietTenKhoa());
        System.out.println("Tên Khoa sinh viên thứ 3: "+sv3.bietTenKhoa());
        System.out.println("Sinh viên thi đạt ");
        System.out.println("Sv 1: "+sv.KtraDat());
        System.out.println("Sv 2: "+sv2.KtraDat());
        System.out.println("Sv 3: "+sv3.KtraDat());
        System.out.println("Sv1 trùng ngày sinh Sv2: "+sv.KtraCungNgaySinh(sv2));
        System.out.println("Sv1 trùng ngày sinh sv3: "+sv.KtraCungNgaySinh(sv3));
    }
    
}
