package JavaApplication1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author VuDoc
 */
public class Ketnoi {
    private final Connection conn;
    public Ketnoi() throws ClassNotFoundException, SQLException{
       //Nạp trình điều khiển
        Class.forName("com.mysql.jdbc.Driver");
        //Tạo kết nối
        String url="jdbc:mysql://localhost:3306/userinfo";//Đường dẫn vào Data Base
        this.conn=DriverManager.getConnection(url,"root","");
        if(conn != null) System.out.println("Kết nối thành công");
        else System.out.println("Kết nối không thành công");
        
     }   
   public ResultSet getData(String tbName) throws SQLException{
        
        ResultSet rs =null;
        //Tạo đối tượng Statement()
        Statement ts= this.conn.createStatement();
        String sql="select * from "+ tbName;
        //Kết quả trả về được lưu trong rs
        rs=ts.executeQuery(sql);
        return rs;
        
    }
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
    Ketnoi kn = new Ketnoi();
    ResultSet rs = null;
    rs = kn.getData("user");
    while(rs.next())
     {
        // System.out.print(rs.getString("id")+"   ");
         //System.out.print(rs.getString("Username")+ "   ");
         //System.out.print(rs.getString("Password")+ "   ");
         //System.out.println("");
         System.out.print(rs.getString(1)+ "   "); 
         System.out.print(rs.getString(2)+ "   ");
         System.out.print(rs.getString(3)+ "   ");
         System.out.println("");
     }  
}
}
