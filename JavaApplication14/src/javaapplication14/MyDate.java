/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author pc
 */
public class MyDate {
    private int Day;
    private int month;
    private int year;
    public MyDate(int Day,int month,int year){
       this.Day=Day;
       this.month=month;
       this.year=year;
    }
    public void printDay(){
        System.out.println("Day: "+this.Day);
    }
    public void printMonth(){
         System.out.println("Month: "+this.month);
    }
    public void printYear(){
         System.out.println("Year: "+this.year);
    }
    public void printDate(){
        System.out.println("Date: "+this.Day+" - "+this.month+" - "+this.year);
    }
}
