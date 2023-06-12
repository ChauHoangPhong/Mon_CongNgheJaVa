/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Đề: Viết chương trình nhập vào 1 mảng gồm n số nguyên và thực hiện các công việc
//        sau:
//    Xuất các giá trị của mảng ra
//    Tìm giá trị lơn nhát, giá trị nhỏ nhất trong mảng
//    Tìm các số nguyên tố có trong mảng
//    Sắp xếp mảng theo thứ tự tăng dần
//    Menu
    
package tuan4_btl;
import java.util.Scanner;
public class Tuan4_BTL {
public static void nhap(int a[],int n){
    Scanner nhap= new Scanner(System.in);
    for(int i=0;i<n;i++){
        System.out.print("a["+i+"]= ");
        a[i]=nhap.nextInt();
    }
}   
public static void xuat(int a[],int n){
    //xuat giatri
                System.out.println("Giá trị sau khi xuất: ");
                for(int i=0;i<n;i++){
                System.out.println("a["+i+"]= "+a[i]);
                 }
} 
public static int max(int a[],int n){
    int max=a[0];
    for(int i=0;i<n;i++)
    {
        if(a[i]>max)
            max=a[i];
    }
    System.out.println("GTLN Max = "+max);
    return 0;
}


public static int min(int a[],int n){
    int min = a[0];
    for(int i=0;i<n;i++)
    { if(a[i]<min)
        min=a[i];
    }
    System.out.println("GTNN Min ="+min);
    return 0;
}
public static int snt(int a[],int n)
{
   System.out.print(" Các số nguyên tố trong mảng là: ");
    for(int i=0;i<n;i++){
         boolean check = true;
        if(a[i]<2){
            check =false;
        }
        int j=2;
        while(j<=Math.sqrt(a[i])){
         if(a[i]%j==0)
         {  check =false;
             break;
         }
         j++;
        }
        if(check){
            System.out.print(a[i]+" ");
        }
            
    }

}
public static int tangdan(int a[],int n){
    int tmp=a[0];
       System.out.print("Mảng theo thứ tự tăng dần là: "); 
    for(int i=0;i<n;i++)
    { for(int j=i+1;j<n;j++){
        if(a[i]>a[j]){
            tmp=a[i];
            a[i]=a[j];
            a[j]=tmp;
        } 
            
    }
    System.out.print(a[i]+" ");  
       
} 
        return 0;
}
public static void menu(int a[],int n){
 int luachon;
     System.out.println("\n\n\t\t===== MENU =====");
     System.out.println("\n\t1. Xuất giá trị mảng ra");
     System.out.println("\n\t2. Tìm giá trị lớn nhất của mảng");
     System.out.println("\n\t3. Tìm giá trị nhỏ nhất của mảng");
     System.out.println("\n\t4. Tìm số nguyên tố trong mảng");
     System.out.println("\n\t5. Sắp xếp mảng theo thứ tự tăng dần");
     System.out.println("\n\t6. Thoát khỏi Menu");
     System.out.println("\n\n\t\t===== END =====");
         System.out.print("\n----->Nhập chức năng bạn chọn: ");
         do{
         Scanner nhap = new Scanner(System.in);    
         luachon= nhap.nextInt();
         if(luachon<1||luachon>6)
         {
             System.out.println(" Bạn nhập sai !!!");
             System.out.print(" Mời bạn nhập lại: ");
         }
         }while(luachon<1||luachon>6);
         switch(luachon)
         {
             case 1:
             {
                 xuat(a,n); 
                break;
                }    
             
             case 2:
             {
                 max(a,n);
                 break;
             }
             case 3:
             {
                 min(a,n);
                 break;
             }
             case 4:
             {
                 snt(a,n);
                 break;
             }
             case 5:
             {
                 tangdan(a,n);
                 break;
             }default:
             {
                 System.out.println("Đã thoát khỏi Menu !!!");
                 break;
             }
     }
 
}
  public static void main(String[] args) {
     Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
     int n = nhap.nextInt();
     int[] a= new int[n];
     nhap(a,n);
     menu(a,n);
    }
}

    
