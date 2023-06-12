/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhachhang;

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
   private final Connection con;
    public Connect() throws ClassNotFoundException,
            SQLException {
        //Nạp trình điều khiển
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Tạo kết nối
        String url="jdbc:mysql://localhost:3306/qlkh";//Đường dẫn vào Data Base
        this.con=DriverManager.getConnection(url,"root",""); 
    }
    public ResultSet GetData(String tbName) throws SQLException {
        ResultSet kq = null;
        Statement statement = this.con.createStatement();//tao doi tuong truy van 
        String sql = "select * from " + tbName;
        kq = statement.executeQuery(sql);//thuc thi truy van
        return kq;
    }
public ResultSet GetData_TK(String MaKH) throws SQLException {
        ResultSet kq = null;
        Statement statement = this.con.createStatement();
        String sql = "SELECT * FROM `khachhang` WHERE `MaKH`='" + MaKH + "'";
        kq = statement.executeQuery(sql);
        return kq;
    }
public void Update(String MaKH, String HoTen, int Tuoi, String Diachi) throws SQLException {
        Statement sta = this.con.createStatement();
        String sql1 = "Update khachhang set HoTen='" + HoTen + "' where MaKH = '" + MaKH + "'";
        String sql2 = "Update khachhang set Tuoi =" + Tuoi + " where MaKH = '" + MaKH + "'";
        String sql3 = "Update khachhang set Diachi =" + Diachi + " where MaKH = '" + MaKH + "'";
        sta.executeUpdate(sql1);
        sta.executeUpdate(sql2);
        sta.executeUpdate(sql3);    
    }
    private Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void Insert(String MaKH, String HoTen, int Tuoi, String Diachi) throws SQLException {

        Statement sta = this.con.createStatement();
        String sql1 = "Insert into khachhang values('" + MaKH + "','" + HoTen + "'," + Tuoi + " ,'" + Diachi + "')";
        sta.executeUpdate(sql1);
    }
    public void Delete(String MaKH) throws SQLException {
    try {
        Statement sta = this.con.createStatement();
        String sql = "DELETE FROM khachhang WHERE MaKH = '" + MaKH + "'";
        sta.executeUpdate(sql);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private boolean check(String MaKH) {
    boolean check = false;
    try {
        Connect pt = new Connect();

        ResultSet rs = pt.GetData("khachhang");
        while (rs.next()) {
            if (rs.getString("MaKH").equals(MaKH)) {
                check = true;
                break;
            }
        }
        pt.Close();
    } catch (SQLException | ClassNotFoundException ex) {
        ex.printStackTrace();
    }
    return check;
}


    public void Close() throws SQLException {
        if (this.con != null) {
            this.con.close();
        }
    }

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
        // TODO code application logic here
        int dem = 0;
        try {
            Connect pt = new Connect();
            ResultSet rs = pt.GetData("khachhang");
           while(rs.next()) {
                    dem++;
                }
          
            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } 
                System.out.println("------------------------");

        System.out.println(dem);

    }
}
