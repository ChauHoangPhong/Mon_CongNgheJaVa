/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManagement prm = new ProductManagement();
        int luachon=0;
        do{
            System.out.println("----MENU----");
            System.out.println("Vui lòng chọn chức năng");
            System.out.println("1.Thêm sản phẩm vào danh sách");
            System.out.println("2.Tìm kiếm một sản phẩm bằng tên");
            System.out.println("3.Tìm kiếm một sản phẩm bằng ID");
            System.out.println("4.Xóa một sản phẩm bằng ID");
            System.out.println("0.Thoát");
            System.out.print("Nhập lựa chọn: ");
            luachon = Integer.parseInt(sc.nextLine());
            if(luachon==1){
                System.out.println("Nhập Id: ");
                long id = sc.nextLong();
                System.out.print("Nhập name: ");
                String name = sc.nextLine();
                System.out.println("Nhập category: ");
                String category = sc.nextLine();
                System.out.println("Nhập quantity: ");
                double quantity = sc.nextDouble();
                Product proDuct = new Product(id,name,category,quantity);
                prm.Add(proDuct);
            }
            else if(luachon == 2){
                System.out.println("Nhập name: "); String name =sc.nextLine();
                System.out.println("Kết quả tìm kiếm: ");
                prm.SearchByName(name);
            }
            else if(luachon==3){
                System.out.println("Nhập id: "); long id = sc.nextLong();
                System.out.println("Kết quả tìm kiếm: ");
                prm.SearchById(id);
            }
            else if(luachon==4){
                System.out.println("Nhập ID: "); String id = sc.nextLine();
                Product product = new Product(id);
                System.out.println("Xóa một sản phẩm bằng ID: "+prm.Remove(product));
            }
        }while(luachon !=0);
    }
    
}
