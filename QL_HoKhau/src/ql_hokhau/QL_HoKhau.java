/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ql_hokhau;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
/**
 *
 * @author pc
 */
public class QL_HoKhau extends javax.swing.JFrame {

    /**
     * Creates new form QL_HoKhau
     */
    public QL_HoKhau() {
        initComponents();
        ShowTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGioitinh = new javax.swing.JTextField();
        btnHienthi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoKhau = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ HỘ KHẨU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Số CCCD");

        txtSo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Họ Tên");

        txtHoTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Địa Chỉ");

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Giới Tính");

        txtGioitinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnHienthi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHienthi.setText("Hiển Thị");
        btnHienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthiActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tìm kiếm theo tên");

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTimkiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        tbHoKhau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Số CCCD", "Họ Tên", "Địa chỉ", "Giới tính"
            }
        ));
        tbHoKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoKhauMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHoKhau);

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimkiem))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(29, 29, 29)
                                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(29, 29, 29)
                                            .addComponent(txtSo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(29, 29, 29)
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(29, 29, 29)
                                            .addComponent(txtGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSua)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnXoa))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(btnHienthi)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnThem)
                                .addComponent(btnThoat))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHienthi)
                            .addComponent(btnThoat))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ShowTable(){
        DefaultTableModel mod = (DefaultTableModel) tbHoKhau.getModel();
       mod.setRowCount(Dem());
        try {
            Connect cn = new Connect();
            ResultSet rs = cn.GetData("hokhau");
            int i =0;
            while(rs.next()){
                tbHoKhau.setValueAt(rs.getString("SoCCCD"), i, 0);
                tbHoKhau.setValueAt(rs.getString("HoTen"), i, 1);
                tbHoKhau.setValueAt(rs.getString("DiaChi"), i, 2);
                tbHoKhau.setValueAt(rs.getString("GioiTinh"), i, 3);
                i++;
            }
            cn.Close();
        } catch (SQLException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnHienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthiActionPerformed
        ShowTable();
    }//GEN-LAST:event_btnHienthiActionPerformed
    public boolean check(String So){
        boolean check = false;
        try {
            Connect cn = new Connect();
            ResultSet rs = cn.GetData("hokhau");
            while(rs.next()){
                if(rs.getString(1).equals(So)==true){
                    check = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
    public void Insert(){
        String So = txtSo.getText();
        String HoTen = txtHoTen.getText();
        String DiaChi = txtDiaChi.getText();
        String Gioitinh = txtGioitinh.getText();
        try {
            Connect cn = new Connect();
            cn.Insert(So, HoTen, DiaChi, Gioitinh);
            cn.Close();
        } catch (SQLException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        txtSo.setEnabled(true);
        String So = txtSo.getText();
        String HoTen = txtHoTen.getText();
        String DiaChi = txtDiaChi.getText();
        String Gioitinh = txtGioitinh.getText();
         So = So.replaceAll("", "");
         HoTen = HoTen.replaceAll("", "");
         DiaChi = DiaChi.replaceAll("", "");
         Gioitinh = Gioitinh.replaceAll("", "");
         
         if(txtSo.getText().equals("")==true||txtHoTen.getText().equals("")==true||
                 txtDiaChi.getText().equals("")==true||txtGioitinh.getText().equals("")==true){
             JOptionPane.showMessageDialog(null,"Bạn chưa nhập đủ dữ liệu");
         }else{
             if(check(So)==true){
                 JOptionPane.showMessageDialog(null,"Số CCCD bị trùng với dữ liệu");
             }else{
                 Insert();
                 ShowTable();
                 JOptionPane.showMessageDialog(null,"Bạn đã thêm thành công!!!");
             }
         }
    }//GEN-LAST:event_btnThemActionPerformed
    public void Update(){
        try {
            Connect cn = new Connect();
            cn.Update(txtSo.getText(),txtHoTen.getText(), txtDiaChi.getText(), txtGioitinh.getText());
            cn.Close();
        } catch (SQLException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(check(txtSo.getText())==true){
            Update();
            ShowTable();
          JOptionPane.showMessageDialog(null,"Bạn đã sửa thành công!!!");
        }else{
             JOptionPane.showMessageDialog(null,"Số CCCD không trùng với dữ liệu !!!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed
    public void ShowDetail(){
        try {
            Connect cn = new Connect();
            ResultSet rs = cn.GetData("hokhau");
            int i = tbHoKhau.getSelectedRow();
            
            txtSo.setText((String) tbHoKhau.getValueAt(i, 0));
            txtHoTen.setText((String) tbHoKhau.getValueAt(i, 1));
            txtDiaChi.setText((String) tbHoKhau.getValueAt(i, 2));
            txtGioitinh.setText((String) tbHoKhau.getValueAt(i, 3));
        } catch (SQLException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void tbHoKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoKhauMouseClicked
        ShowDetail();
    }//GEN-LAST:event_tbHoKhauMouseClicked
    public void Delete(String So){
        try {
            Connect cn = new Connect();
            cn.Delete(So);
            cn.Close();
        } catch (SQLException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String So = txtSo.getText();
        if(check(So)==true){
            int rs = JOptionPane.showConfirmDialog(null,"Bạn có muốn xóa hộ khẩu này không?","Thông báo", 
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(rs == JOptionPane.YES_OPTION){
                Delete(So);
                ShowTable();
                JOptionPane.showMessageDialog(null,"bạn đã xóa thành công !!!");
            }else{
                
            }
        }else{
            JOptionPane.showMessageDialog(null,"Số hộ khẩu cần xóa không trùng với dữ liệu,xin vui lòng nhập lại !!!");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int rs = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát chương trình không?","Thông báo", 
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(rs == JOptionPane.YES_OPTION){
              this.setVisible(false);
            }else{
                
            }
    }//GEN-LAST:event_btnThoatActionPerformed
   public void ClearTable(){
       DefaultTableModel mod = (DefaultTableModel) tbHoKhau.getModel();
       mod.setRowCount(0);
       mod.setRowCount(Dem());
   }
   public void Search(String HoTen){
       ClearTable();
        try {
            Connect cn = new Connect();
            ResultSet rs = cn.Search(HoTen);
            int i =0;
            while(rs.next()){
               tbHoKhau.setValueAt(rs.getString("SoCCCD"), i, 0);
                tbHoKhau.setValueAt(rs.getString("HoTen"), i, 1);
                tbHoKhau.setValueAt(rs.getString("DiaChi"), i, 2);
                tbHoKhau.setValueAt(rs.getString("GioiTinh"), i, 3);
                i++;
            }
            cn.Close();
        } catch (SQLException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
       String HoTen = txtTimKiem.getText();
       Search(HoTen);
    }//GEN-LAST:event_btnTimkiemActionPerformed
    public int Dem(){
        int dem =0;
        try {
            Connect cn = new Connect();
            ResultSet rs = cn.GetData("hokhau");
            while(rs.next()){
                dem++;
            }
            cn.Close();
        } catch (SQLException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_HoKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dem;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QL_HoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_HoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_HoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_HoKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_HoKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienthi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHoKhau;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGioitinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtSo;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
