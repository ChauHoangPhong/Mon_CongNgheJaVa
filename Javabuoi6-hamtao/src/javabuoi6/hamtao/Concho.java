/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabuoi6.hamtao;

/**
 *
 * @author pc
 */
public class Concho extends DongVat{
    int soduoi;
    public void setDuoi(int soduoi){
        this.SetChan(5);
        this.soduoi = soduoi;
    }
   //phương thức hiển thị thông tin con chó hiển thị số chân và đuôi
    void hienthithongtinConcho(){
        System.out.println("So chan con cho "+sochan );
        System.out.println("So duoi con cho "+soduoi);
    }
}
