/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public abstract class Connguoi {
String hoten,gioitinh,dc;
int tuoi;
void nhapTT(){
    Scanner in=new Scanner (System.in);
    this.hoten=in.nextInt();
    this.gioitinh=in.nextInt();
    this.dc=in.nextInt();
    this.tuoi=in.nextInt();
}
abstract void anUong();
abstract void dichuyen();
public abstract float tinhluong();
void inTT(){
    System.out.println("Ho Ten: "+this.hoten);
    System.out.println("Gioi tinh: "+this.gioitinh);
    System.out.println("Dia chi: "+this.dc);
    System.out.println("Tuoi: "+this.tuoi);
}
}
