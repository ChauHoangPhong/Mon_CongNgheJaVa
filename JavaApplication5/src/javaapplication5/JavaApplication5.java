/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //int n=5;
        //do{
        //    System.out.println("Hello world");
        //  n--;
        //}while(n>=5);//n>=5 n>5 hoặc n=5
        //ứng dụng để làm 1 cái menu lựa chọn
       // int n=4;//bắt đầu
        //while(n<10){//điều kiện dừng
          //  System.out.println("Xin chào");
        //    n++;//bước nhảy
       // }
    //sử dụng vòng lặp while nhập vào 1 số n và kiểm tra xem số n đó có phải là số nguyên tố hay không
    // số nguyên tố là số chia hết cho 1 và chính nó
    //đk bắt đầu
    //đk dừng
    //bước nhảy
    //5 là số nguyên tố
    //0 và 1 không phải là số nguyên tố if(n<2) else
            Scanner nhap = new Scanner (System.in);
            System.out.println("Nhập vào 1 số: ");
            int n = nhap.nextInt();
            boolean check =true;
        if(n<2){
            check =false;
        }
            
        int i=2;
        while (i<= Math.sqrt(n)){
         if(n%i==0)
         {
             check = false;
             break;
         }
         i++;
        }       
        if(check){
            System.out.println(n+" là số nguyên tố");
        }
        else{
            System.out.println(n+" không là số nguyên tố");
        }
       nhap.close();
    
    
    
}
