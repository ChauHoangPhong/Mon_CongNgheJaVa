/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyHS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author pc
 */
public class Ketnoi {
    private final Connection con;
    public Ketnoi() throws ClassNotFoundException, SQLException{
       //Nạp trình điều khiển
        Class.forName("com.mysql.jdbc.Driver");
        //Tạo kết nối
        String url="jdbc:mysql://localhost:3306/qlhs";//Đường dẫn vào Data Base
        this.con=DriverManager.getConnection(url,"root","");
     }  
    public ResultSet GetData(String tbName) throws SQLException
    {
        ResultSet kq = null;
        Statement statement = this.con.createStatement();
        String sql = "select*from hocsinh";
        kq=statement.executeQuery(sql);
        return kq;
    }
    public void Insert(String MaHocSinh, String HoTen, int DiemToan,int DiemViet )throws SQLException{
        Statement sta = this.con.createStatement();
String sql1 = "INSERT INTO hocsinh VALUES ('" + MaHocSinh + "', '" + HoTen + "', " + DiemToan + ", " + DiemViet + ")";
    sta.executeUpdate(sql1);
    }
    public void Update(String MaHocSinh) throws SQLException{
        Statement sta = this.con.createStatement();
        String sql = "Delete hocsinh where ID ="+MaHocSinh+" ";
        sta.executeUpdate(sql);
    }
    public void Close() throws SQLException{
        if(this.con !=null){
            this.con.close();
        }
    }
     

}
