/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author pc
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoadonCafe Hd = new HoadonCafe("Trung Nguyen",100000,1.5);
        HoadonCafe Hd2 = new HoadonCafe("Trung Nguyen",100000,5.5);
        System.out.println("Tong tien: "+ Hd.tinhTongTien());
        System.out.println("Tong tien Hd2 : "+ Hd2.tinhTongTien());
        System.out.println("Kiem tra khoi luong >2kg "+Hd.ktraKlglonHon(2));
        System.out.println("Kiem tra khoi luong >1kg "+Hd.ktraKlglonHon(1));
        System.out.println("Kiểm tra tổng tiền lớn hơn 500k "+Hd.KtraTongtienlonhon500k());
        System.out.println("Giam gia cua Hd "+Hd.giamgia(10));
        System.out.println("Giam gia cua Hd2 "+Hd2.giamgia(10));
        System.out.println("Sau giam gia cua Hd "+Hd.giasaukhigiam(10));
        System.out.println("Gia sau khi gia cua Hd2 "+Hd2.giasaukhigiam(10));
    }
    
}
