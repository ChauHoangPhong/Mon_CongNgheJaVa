/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dlmang;
import java.util.Scanner;

public class DLMang {
    public static void main(String[] args) {
        // TODO code application logic here
    //    int[] a=new int[5];
    //   a[0]=1;
    //   a[1]=2;
    //    a[2]=3;
        //duyệt mảng
    //    for(int i=0;i<a.length;i++){
    //        System.out.println("Number"+a[i]);
    //   }
        //cho người dùng nhập vào số phần tử của mảng và in mảng người đã nhập
        //vd người dùng nhập n=5 //1 2 3 4 5 int ra 1 2 3 4 5
    Scanner nhap = new Scanner (System.in);
        System.out.print("Nhập vào số phần tử của mảng: ");
        int n = nhap.nextInt();
        int[] a=new int[n];
        nhap(a,n);
//        int b=Tong(2,3);
//        System.out.println("Tổng la: "+b);
       // for(int i=0;i<n;i++)
        //{
       //     a[i]= nhap.nextInt();
       // }
        for(int i=0;i<n;i++){
         System.out.println("Number"+a[i]);
        }
        //ham gom 2 loai có trả về, không trả về
        //in ra những số chẵn trong mảng
         System.out.print("Các số chẵn trong mảng là: ");
        for(int i=0;i<n;i++){
         if(a[i]%2==0){
             System.out.print(a[i]+" ");
         }
        }
        //Tính tổng các phần tử
        int sum=0;
        for(int i=0;i<n;i++){
         sum=sum +a[i];
        }
        System.out.println("Tổng la: "+sum);
    }
    pulic static int Tong(int a,int b){//hàm trả về
        return a+b;
    }
    public static void nhap(int a[],int n){//hàm không trả về
        Scanner nhap = new Scanner (System.in);
        System.out.println("Nhập vào mảng: ");
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]=nhap.nextInt();
        }
        
    }
}
