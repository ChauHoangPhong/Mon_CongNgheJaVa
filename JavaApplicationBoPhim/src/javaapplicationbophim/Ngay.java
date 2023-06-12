/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationbophim;

/**
 *
 * @author pc
 */
public class Ngay {
    private int ngay;
    private int thang;
    private int nam;
    public Ngay(int ngay,int thang,int nam )
    {
        this.ngay=ngay;
        this.thang=thang;
        this.nam=nam;
    }
    public int getNgay(){
        return this.ngay;
    }
    public int getThang(){
        return this.thang;
    }
    public int getNam(){
        return this.nam;
    }
    public void setNgay(int d){
        if(d>=1&&d<=31)
           this.ngay=d;
        
    }
    public void setThang(int m){
        if(m>=1&&m<=12)
           this.thang=m;
        
    }
    public void setNam(int y){
        if(y>=1)
           this.nam=y;
        
    }
}
