/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg1;

import java.util.Objects;

/**
 *
 * @author pc
 */
public class Product {
    public long id;
    public String name;
    public String category;
    public double quantity;
    public Product(long id){
        this.id =id;
    }
    public Product(long id,String name,String category,double quantity){
        this.id=id;
        this.name=name;
        this.category=category;
        this.quantity=quantity;
    }

    Product(String id, String name, String category, String quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Product(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getName(){
        return name;
    }
    public long getId(){
        return id;
    }
    @Override
    public String toString(){
        return id+" - Name: "+name+" - "+category+" - "+quantity;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        Product other = (Product) obj;
        return Objects.equals(id, other.id);
    }
}
