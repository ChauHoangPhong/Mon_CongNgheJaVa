/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamgiac;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Kiem_Tra {
    private ArrayList<TamGiac> dsTamGiac;

    public Kiem_Tra() {
        this.dsTamGiac = new ArrayList<>();
        nhapSoTamGiac();
    }

    public void nhapSoTamGiac() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tam giác: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            TamGiac tamGiac = new TamGiac();
            tamGiac.nhap();
            this.dsTamGiac.add(tamGiac);
        }
    }

    public void hienThiDanhSachTamGiac() {
        System.out.println("Danh sách tam giác: ");
        for (int i = 0; i < this.dsTamGiac.size(); i++) {
            System.out.println("Tam giác " + (i + 1));
            this.dsTamGiac.get(i).hienThi();
        }
    }

    public int demTamGiacVuong() {
        int count = 0;
        for (int i = 0; i < this.dsTamGiac.size(); i++) {
            if (this.dsTamGiac.get(i).kiemTraTamGiacVuong()) {
                count++;
            }
        }
        return count;
    }

    public void xoaTamGiacDauTien() {
        if (this.dsTamGiac.size() > 0) {
            this.dsTamGiac.remove(0);
        }
    }

    public static void main(String[] args) {
        Kiem_Tra kt = new Kiem_Tra();
        kt.hienThiDanhSachTamGiac();
        System.out.println("Số tam giác vuông trong danh sách: " + kt.demTamGiacVuong());
        kt.xoaTamGiacDauTien();
        kt.hienThiDanhSachTamGiac();
    }
}

