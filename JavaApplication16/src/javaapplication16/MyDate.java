/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author pc
 */
class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(int day,int month,int year){
        if(day>=1&&day<=31){
            this.day=day;
        }else{
            this.day=1;
        }
        if(month>=1&&month<=12){
            this.month=month;
        }else{
            this.month=1;
        }
        if(year>=0){
            this.year=year;
        }
        else{
            this.year=1;
        }
    }
    public int getDay(){
        return this.day;
    }
    public void setDay(int d){
        if(d>=1&&d<=31)
           this.day=d;
        
    }
    public int getMonth(){
        return this.month;
    }
    public void setMonth(int m){
        if(m>=1&&m<=12)
           this.month=m;
        
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int y){
        if(y>=1)
           this.year=y;
        
    }
    //in ra thông số,tóm tắt thông tin đối tượng
    @Override
    public String toString(){  
        return this.day+"/"+this.month+"/"+this.year;
    }
    //equals so sánh bằng
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass()!= obj.getClass())
            return false;
        MyDate other =(MyDate) obj;
        if(this.day != other.day)
            return false;
        if(this.month != other.month)
            return false;
        if(this.year != other.year)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.day;
        hash = 83 * hash + this.month;
        hash = 83 * hash + this.year;
        return hash;
    }

}
