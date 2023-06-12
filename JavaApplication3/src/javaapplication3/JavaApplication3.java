/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author pc
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sodien=400;
        
        if((0<=sodien)&&(sodien<=50)){
            System.out.println("So tien dien phai tra");
        }
        else if((50<sodien)&&(sodien<=100)){
            System.out.println("Gia ban dien la 1.734");
        }
        else if((100<sodien)&&(sodien<=200)){
            System.out.println("Gia ban dien la: ");
        }
        else if((200<sodien)&&(sodien<=300)){
            System.out.println("Gia tien dien la: ");
        }
        else if((300<sodien)&&(sodien<=400)){
            System.out.println("So tien dien phai tra la:");    
        }
        else{
            System.out.println("So tien dien phai tra");
        }
        
    
}
