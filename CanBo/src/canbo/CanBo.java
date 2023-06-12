/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canbo;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CanBo {

    /**
     * @param args the command line arguments
     */
    private String maCB;
    private String hoTen;
    private String diaChi;
    
    public CanBo() {}
    
    public CanBo(String maCB, String hoTen, String diaChi) {
        this.maCB = maCB;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma CB: ");
        maCB = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }
    
    public void hienThi() {
        System.out.println("Ma CB: " + maCB);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
