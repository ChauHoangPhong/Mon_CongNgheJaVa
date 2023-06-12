/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demauqlhocvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
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
        Class.forName("com.mysql.cj.jdbc.Driver");//nap trinh dieu khien
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhocvien", "root","");
    }
    public ResultSet GetData(String tbName) throws SQLException{
        ResultSet kq = null;
        Statement statement = this.con.createStatement();
        String sql = "select *from "+tbName;
        kq = statement.executeQuery(sql);
        return kq;
    }
    public ResultSet GetTimKiem(String Hoten) throws SQLException{
        ResultSet kq = null;
        Statement statement = this.con.createStatement();
        String sql = "select * from `hocvien` where tenHv ='"+Hoten+"'";
        kq = statement.executeQuery(sql);
        return kq;
    }
  public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
        // TODO code application logic here
        int dem = 0;
        try {
            Connect pt = new Connect();
            ResultSet rs = pt.GetData("hocvien");
           while(rs.next()) {
                    dem++;
                }
          
            pt.Close();
        } catch (SQLException sqlException) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
                System.out.println("------------------------");

        System.out.println(dem);

    }

    

    void Close() throws SQLException {
        if (this.con != null) {
            this.con.close();
        }
    }//To change body of generated methods, choose Tools | Templates.
    
}
