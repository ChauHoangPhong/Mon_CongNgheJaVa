/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author pc
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ngay ngay1 = new Ngay(30,1,2002);
       Ngay ngay2= new Ngay(14,3,2002);
       Ngay ngay3= new Ngay(3,8,2002);
       TacGia tacgia1= new TacGia("Lê Thị Tuyết Nga",ngay3);
       TacGia tacgia2= new TacGia("Châu Hoàng Phong",ngay1);
       TacGia tacgia3= new TacGia("Nguyễn Van A",ngay2);
       Sach sc1 =new Sach("Lập trình C++ ",50000,2021,tacgia2);
       Sach sc2 = new Sach("Văn Học ",10000,2021,tacgia1);
       Sach sc3 = new Sach("Toán Học ",20000,2022,tacgia3);
       sc1.inTenSach();
       sc2.inTenSach();
       sc3.inTenSach();
       System.out.println("So sánh NXB của sách 1 và 2 "+ sc1.KtracungNamXB(sc2));
       System.out.println("So sánh NXB của sách 2 và 3 "+ sc2.KtracungNamXB(sc3));
       System.out.println("Sách 1 giảm 50%: "+sc1.giaSaukhiGiam(50));
       System.out.println("Sách 2 giảm 20%: "+sc2.giaSaukhiGiam(20));
       System.out.println("Sách 3 giảm 10%: "+sc3.giaSaukhiGiam(10));
    }
    
}
