/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg1;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class ProductManagement {
    public ArrayList<Product> danhSach;
    public ProductManagement(){
        this.danhSach = new ArrayList<Product>();
    }
    public void Add(Product product){
        this.danhSach.add(product);
    }
    public boolean kiemtraDanhSachRong(){
        return this.danhSach.isEmpty();
    }
    public void inDSProduct(){
        for(Product proDuct:danhSach){
            System.out.println(proDuct);
        }
    }
    public int laySoluongProduct(){
        return this.danhSach.size();
    }
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }
    public boolean Remove(Product product){
        return this.danhSach.remove(product);
    }
    public boolean kiemtraTonTai(Product product)
    {
        return this.danhSach.contains(product);
    }
    public void SearchByName(String name){
        for(Product proDuct : danhSach){
            if(proDuct.getName().indexOf(name)>=0){
                System.out.println(proDuct);
            }
            }
    }
    public void SearchById(Long id)
    {
        for(Product proDuct: danhSach){
            if(proDuct.getId()>=0){
                System.out.println(proDuct);
            }
        }
    }
}
