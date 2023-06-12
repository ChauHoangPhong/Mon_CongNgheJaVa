/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationbophim;

/**
 *
 * @author pc
 */
public class JavaApplicationBoPhim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,2,2022);
        Ngay ngay2 = new Ngay(17,8,2020);
        Ngay ngay3 = new Ngay(19,1,2010);
        HangSX hang1 = new HangSX("Da ","Việt Nam");
        HangSX hang2 = new HangSX("Bóng Đá ","Mỹ");
        HangSX hang3 = new HangSX("Người ","Ba Lan");
        BoPhim bp1 = new BoPhim("Người Nhện",2022,ngay1,hang2,30000);
        BoPhim bp2 = new BoPhim("Bố Già",2020,ngay2,hang1,50000);
        BoPhim bp3 = new BoPhim("Robot",2022,ngay3,hang3,60000);
        System.out.println("So sánh giá bộ 1 rẻ hơn giá bộ 2: "+bp1.KtraGiaveRehon(bp2) );
        System.out.println("So sánh giá bộ 3 rẻ hơn giá bộ 2: "+bp3.KtraGiaveRehon(bp2) );
        System.out.println("Tên hãng sản xuất của bộ phim 1: "+bp1.layTenHangSanXuat());
        System.out.println("Bộ phim 1 giảm 30%: "+bp1.giaSauKM(30));
        System.out.println("Bộ phim 2 giảm 50%: "+bp2.giaSauKM(50));
        System.out.println("Bộ phim 3 giảm 20%: "+bp3.giaSauKM(20));
    }
    
}
