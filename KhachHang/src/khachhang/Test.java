/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khachhang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import khachhang.KhachHang;

/**
 *
 * @author pc
 */
public class Test{
    private List<KhachHang> listKhachHang;
    public Test(){
        this.listKhachHang = new ArrayList<>();
    }
    public void nhapDanhsachKhachHang(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập số lượng khách hàng: ");
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
            KhachHang khachHang = new KhachHang();
            System.out.println("\n(+}Nhập khách hàng thứ "+ (i+1)+": ");
            khachHang.NhapKhachHang();
            this.listKhachHang.add(khachHang);
        }
    }
    public void hienthiDSKHvaTongTien(){
        float Tongtien = 0;
        for(KhachHang khachHang: this.listKhachHang){
            khachHang.HienThiKhachHang();
            float tien = khachHang.Thanhtien();
            Tongtien +=tien;
            System.out.println("Tiền điện phải nộp: "+ tien +"VNĐ");
        }
        System.out.println("Tổng tiền điện phải nộp của tất cả khách hàng là: "+ Tongtien +"VNĐ" );
    }
    public void hienThiKhachHangVuotDinhMuc(){
        for(KhachHang khachHang: this.listKhachHang){
            if(khachHang.getSoKW()>khachHang.getDinhmuc()){
                khachHang.HienThiKhachHang();
            }
        }
    }
    public static void main(String[] args){
        Test test = new Test();
        test.nhapDanhsachKhachHang();
        System.out.println("\n ===== DANH SÁCH KHÁCH HÀNG =====\n");
        test.hienthiDSKHvaTongTien();
        System.out.println("\n ===== DANH SÁCH KHÁCH HÀNG VƯỢT ĐỊNH MỨC =====\n");
        test.hienThiKhachHangVuotDinhMuc();
    }
}
