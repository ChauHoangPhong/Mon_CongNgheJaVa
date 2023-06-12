/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ql_hokhau;

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
    public Connect() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ql_hokhau","root","");
    }
    public ResultSet GetData(String tbName) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "Select * from "+tbName;
        kq = sta.executeQuery(sql);
        return kq;
    }
    public void Insert(String So, String HoTen,String DiaChi, String Gioitinh) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Insert into hokhau values ('"+So+"','"+ HoTen+"','"+DiaChi+
                "','"+Gioitinh+"')";
        sta.executeUpdate(sql);
    }
    public void Update(String So, String HoTen,String DiaChi, String Gioitinh) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Update hokhau set HoTen='"+HoTen+"',DiaChi='"+ DiaChi+"',GioiTinh='"+Gioitinh+
                "'where SoCCCD='"+So+"'";
        sta.executeUpdate(sql);
    }
    public void Delete(String So) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql ="Delete from hokhau where SoCCCD='"+So+"'";
        sta.executeUpdate(sql);
    }
    public ResultSet Search(String HoTen) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "Select*from hokhau where HoTen='"+HoTen+"'";
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
            Connect cn = new Connect();
            ResultSet rs = cn.GetData("hokhau");
            while(rs.next()){
                dem++;
            }
            cn.Close();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
