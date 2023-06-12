/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlhv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
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
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhocvien","root","");
    }
    public ResultSet GetData(String tbName) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "select * from "+tbName;
        kq = sta.executeQuery(sql);
        return kq;
    }
    public ResultSet GetTimkiem(String Hoten) throws SQLException{
        ResultSet kq =null;
        Statement sta = this.con.createStatement();
        String sql = "select * from hocvien where tenHv='"+Hoten+"'";
        kq = sta.executeQuery(sql);
        return kq;
    }
    public void Insert(String Ma, String Hoten, String Que, float Diem) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "insert into hocvien values ('"+ Ma +"','"+ Hoten +"','"
                +Que+"',"+Diem+")";
        sta.executeUpdate(sql);
    }
    public void Update(String Ma, String Hoten, String Que, float Diem) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Update hocvien set tenHv ='"+Hoten+"',queQuan='"+Que+
                "', diemThi ="+ Diem+ " where maHv='"+Ma+"'";
           sta.executeUpdate(sql);
    }
    public void Delete(String Ma) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Delete from hocvien where maHv='"+Ma+"'";
       sta.executeUpdate(sql);
    }
    /**
     * @param args the command line arguments
     */
    public void Close() throws SQLException {
        if(this.con !=null){
         this.con.close();
        }//To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int dem =0;
        try {
            Connect cn = new Connect();
            ResultSet rs = cn.GetData("hocvien");
            while (rs.next()){
                dem++;
            }
            cn.Close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
