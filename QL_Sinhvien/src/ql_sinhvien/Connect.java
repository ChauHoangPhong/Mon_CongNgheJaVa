/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ql_sinhvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv","root","");
    }
    public ResultSet GetData(String tbName) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "Select * from "+tbName;
        kq = sta.executeQuery(sql);
        return kq;
    }
    public ResultSet Get_Search(String Ten) throws SQLException{
        ResultSet kq = null;
        Statement sta = this.con.createStatement();
        String sql = "Select * from sinhvien where HoTen ='"+Ten+"'";
        kq = sta.executeQuery(sql);
        return kq;
    }
    public void Insert(String Ma, String HoTen,int NamSinh,String QueQuan,String DiaChi) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Insert into sinhvien values ('"+Ma+"','"+HoTen+"',"
                + NamSinh +",'"+QueQuan+"','"+DiaChi+"')";
        sta.executeUpdate(sql);
    }
    public void Update(String Ma, String HoTen, int NamSinh,String QueQuan,String DiaChi) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Update sinhvien set HoTen='"+HoTen+"', NamSinh="+NamSinh+",QueQuan='"
                +QueQuan+"',DiaChi='"+DiaChi+"'where Ma ='"+Ma+"'";
         sta.executeUpdate(sql);
    }
    public void Delete(String Ma) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Delete from sinhvien where Ma ='"+Ma+"'";
        sta.executeUpdate(sql);
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
            ResultSet rs = cn.GetData("sinhvien");
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
