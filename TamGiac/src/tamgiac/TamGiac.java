/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamgiac;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TamGiac {
    private double canh1;
    private double canh2;
    private double canh3;

    public TamGiac() {
        this.canh1 = 0;
        this.canh2 = 0;
        this.canh3 = 0;
    }

    public TamGiac(double a, double b, double c) {
        if (this.check(a, b, c)) {
            this.canh1 = a;
            this.canh2 = b;
            this.canh3 = c;
        } else {
            System.out.println("Không phải tam giác");
        }
    }

    public boolean check(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh 1: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh 2: ");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh 3: ");
        double c = sc.nextDouble();
        if (this.check(a, b, c)) {
            this.canh1 = a;
            this.canh2 = b;
            this.canh3 = c;
        } else {
            System.out.println("Không phải tam giác. Vui lòng nhập lại.");
            nhap();
        }
    }

    public void hienThi() {
        System.out.println("3 cạnh của tam giác: " + this.canh1 + ", " + this.canh2 + ", " + this.canh3);
    }

    public boolean kiemTraTamGiacVuong() {
        double a = this.canh1 * this.canh1 + this.canh2 * this.canh2;
        double b = this.canh3 * this.canh3;
        double c = this.canh2 * this.canh2 + this.canh3 * this.canh3;
        double d = this.canh1 * this.canh1;
        double e = this.canh1 * this.canh1 + this.canh3 * this.canh3;
        double f = this.canh2 * this.canh2;
        if (a == b || c == d || e == f) {
            return true;
        }
        return false;
    }
}

