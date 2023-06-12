/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author pc
 */
public class HoadonCafeHoa {
    private String tenLoaicf;
    private double giaTien1kg;
    private double khoiLg;
    public HoadonCafeHoa(String tenLoaicf,double gia,double kl)
    {
        this.tenLoaicf=tenLoaicf;
        this.giaTien1kg=gia;
        this.khoiLg=kl;
    }
    public double tinhTongTien(){
        return this.giaTien1kg * this.khoiLg;
    }
    public boolean ktraKlglonHon(double khoilg){
//        if(this.khoiLg>khoilg){
//            return true;
//        }
//        else{
//            return false;
//        }
      return this.khoiLg>khoilg;
    }
    public boolean KtraTongtienlonhon500k(){
        return this.tinhTongTien()>500000;
    }
    public double giamgia(double x){
        if(this.tinhTongTien()>500000){
          return (x/100*this.tinhTongTien());  
        }else{
            return 0;
        }
        
    }
    public double giasaukhigiam(double x){
        return this.tinhTongTien() - this.giamgia(x);
    }
}
