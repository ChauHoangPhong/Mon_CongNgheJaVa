/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlnv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pc
 */
public class Connect {
    private Connection con;
    public Connect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlnhanvien","root","");
    }
    public ResultSet GetData(String tbName) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "Select * from "+tbName;
        kq = sta.executeQuery(sql);
        return kq;
    }
    public void Insert(String Manv,String Hoten, String Que ,float Hesoluong) throws SQLException{
            Statement sta = this.con.createStatement();
            String sql = "Insert into nhanvien values('"+Manv+"','"+Hoten+"','"
                    +Que+"',"+ Hesoluong+")";
            sta.executeUpdate(sql);
     
    }
    public void Update(String Manv, String Hoten, String Que, float Hesoluong) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Update nhanvien set HoTen='"+Hoten+"',Que='"+Que+
                "',HeSoLuong="+Hesoluong+" where MaNV='"+Manv+"'";
        sta.executeUpdate(sql);
    }
    public void Delete(String Ma) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql ="Delete from nhanvien where MaNV='"+Ma+"'";
        sta.executeUpdate(sql);
    }
    public ResultSet Timkiem(String Ten) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "Select*from nhanvien where HoTen ='"+Ten+"'";
        kq = sta.executeQuery(sql);
        return kq;
    }
    public void Close() throws SQLException{
        if(this.con != null){
            this.con.close();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dem =0;
        try {
            Connect con = new Connect();
            ResultSet rs = con.GetData("nhanvien");
            while(rs.next()){
                dem++;
            }
            con.Close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
   
    
}
