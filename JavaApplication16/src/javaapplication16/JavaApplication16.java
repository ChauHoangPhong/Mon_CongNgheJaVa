/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author pc
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyDate md = new MyDate(30,1,2002);
        MyDate md2= new MyDate(3,8,2002);
        MyDate md3= new MyDate(30,1,2002);
        System.out.println(md2);
        System.out.println(md3);
        md.setDay(30);
        System.out.println("Day "+md.getDay());
        md.setMonth(30);
        System.out.println("Month "+md.getMonth());
        md.setYear(2002);
        System.out.println("Year "+md.getYear());
        System.out.println("Md so sang bang Md3 "+md.equals(md3));
        System.out.println("Md so sanh bang Md2 "+md.equals(md2));
        System.out.println("Hashcode Md1 "+md.hashCode());
        System.out.println("Hashcode Md2 "+md2.hashCode());
        System.out.println("Hashcode Md3 "+md3.hashCode());
    }
    
}
