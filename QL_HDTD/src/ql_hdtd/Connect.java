/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ql_hdtd;

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
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhd","root","");
    }
    public ResultSet GetData(String tbName) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "Select * from "+tbName;
        kq = sta.executeQuery(sql);
        return kq;
    }
    public void Insert(String Ma, String NgayLap, float SoKW, int DonGia, int Tong) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Insert into hoadon values('"+Ma+"','"+NgayLap+"',"
                +SoKW+","+DonGia+","+Tong+")";
        sta.executeUpdate(sql);
    }
    public void Update(String Ma, String NgayLap, float SoKW, int DonGia, int Tong) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Update hoadon set NgayLapHD='"+NgayLap+"',SoKW="+SoKW+
                ",DonGia="+DonGia+",Tong="+Tong+" where MaHD='"+Ma+"'";
        sta.executeUpdate(sql);
    }
    public void Delete(String Ma) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Delete from hoadon where MaHD='"+Ma+"'";
        sta.executeUpdate(sql);
    }
    public ResultSet Get_Search(String Name) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "Select * from hoadon where MaHD ='"+Name+"'";
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
            ResultSet rs = cn.GetData("hoadon");
            while(rs.next()){
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
