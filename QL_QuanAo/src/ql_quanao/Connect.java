/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ql_quanao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pc
 */
public class Connect {

    public Connection con;
    public Connect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlquanao","root","");
    }
    public ResultSet GetData(String tbName) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "Select * from "+tbName;
        kq = sta.executeQuery(sql);
        return kq;
    }
    public void Insert(String Ma, String Loai, float kthuoc, String chatlieu) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Insert into quanao valueS('"+Ma+"','"+Loai+"',"+kthuoc+",'"+chatlieu+"')";
        sta.executeUpdate(sql);
    }
    public void Update(String Ma, String Loai, float kthuoc, String chatlieu) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Update quanao set Loai= '"+Loai+"', kthuoc="+kthuoc+", chatlieu='"+chatlieu+"' where Ma='"+Ma+"'";
        sta.executeUpdate(sql);
    }
    public void Delete( String Ma) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Delete from quanao where Ma='"+Ma+"'";
        sta.executeUpdate(sql);
    }
    public ResultSet GetTimkiem(String Ma) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "Select * from quanao where Ma='"+ Ma+"'";
        kq= sta.executeQuery(sql);
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
            Connect cn = new Connect();
            ResultSet rs = cn.GetData("quanao");
            while(rs.next()){
                dem++;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(""+dem);
    }
    
    
}
