/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabuoi6.hamtao;

/**
 *
 * @author pc
 */
public class Phuongtrinhbac2 {
    public double a;
    public double b;
    public double c;
    public Phuongtrinhbac2(){}
    public Phuongtrinhbac2(double a,double b,double c){
        this.a=a;
        this.b=b; 
        this.c=c;
    } 
    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a=a;
    }
    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getc(){
        return c;
    }
    public void setc(double c){
        this.c=c;
    }
    public double tinhdelta(){
        return b*b-4*a*c;
    }
    public double tinhnghiem1(){
        return (-b+Math.sqrt(this.tinhdelta()))/2*a;
    }
    public double tinhnghiem2(){
        return (-b+Math.sqrt(this.tinhdelta()))/2*a;
    }
    public void hienthinghiem(){
        
    }
}
