/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qldienthoai;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class QLDienthoai extends javax.swing.JFrame {

    /**
     * Creates new form QLDienthoai
     */
    public QLDienthoai() {
        initComponents();
        Show_Table();
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
        txtTimkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDienthoai = new javax.swing.JTable();
        btnTimkiem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTaids = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ ĐIỆN THOẠI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tên điện thoại");

        txtTimkiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tbDienthoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã ĐT", "Tên ĐT", "Số Lượng", "Đơn giá", "Mô tả", "Hãng sản xuất"
            }
        ));
        jScrollPane1.setViewportView(tbDienthoai);

        btnTimkiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseClicked(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTaids.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTaids.setText("Tải danh sách");
        btnTaids.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaidsMouseClicked(evt);
            }
        });
        btnTaids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaidsActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTaids, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimkiem)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnTaids)
                    .addComponent(btnThoat))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public int Dem(){
        int dem =0;
        try {
            Connect cn = new Connect();
            ResultSet rs = cn.GetData("dienthoai");
            while(rs.next()){
                dem++;
            }
            cn.Close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLDienthoai.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QLDienthoai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dem;
    }
    public void Show_Table(){
        DefaultTableModel mod = (DefaultTableModel) tbDienthoai.getModel();
        mod.setRowCount(Dem());
        try {
            Connect cn = new Connect();
            ResultSet rs = cn.GetData("dienthoai");
            int i =0;
            while(rs.next()){
                tbDienthoai.setValueAt(rs.getString("MaDT"), i, 0);
                tbDienthoai.setValueAt(rs.getString("TenDT"), i, 1);
                tbDienthoai.setValueAt(rs.getString("SoLuong"), i, 2);
                tbDienthoai.setValueAt(rs.getString("Dongia"), i, 3);
                tbDienthoai.setValueAt(rs.getString("Mota"), i, 4);
                tbDienthoai.setValueAt(rs.getString("HangSX"), i, 5);
                i++;
            }
            cn.Close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLDienthoai.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QLDienthoai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnTaidsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaidsMouseClicked
      Show_Table();       
    }//GEN-LAST:event_btnTaidsMouseClicked
 public void ClearTable(){
        DefaultTableModel mod = (DefaultTableModel) tbDienthoai.getModel();
        mod.setRowCount(0);
        mod.setRowCount(Dem());
    }
 public void Timkiem(String Ten){
     ClearTable();
        try {
            Connect con = new Connect();
            ResultSet rs = con.Get_timkiem(Ten);
            int i =0;
            while(rs.next()){
                tbDienthoai.setValueAt(rs.getString("MaDT"), i, 0);
                tbDienthoai.setValueAt(rs.getString("TenDT"), i, 1);
                tbDienthoai.setValueAt(rs.getString("SoLuong"), i, 2);
                tbDienthoai.setValueAt(rs.getString("Dongia"), i, 3);
                tbDienthoai.setValueAt(rs.getString("Mota"), i, 4);
                tbDienthoai.setValueAt(rs.getString("HangSX"), i, 5);
                i++;
            }
            con.Close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLDienthoai.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QLDienthoai.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    private void btnTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseClicked
         String Ten = txtTimkiem.getText();
         Timkiem(Ten);
    }//GEN-LAST:event_btnTimkiemMouseClicked

    private void btnTaidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaidsActionPerformed
         if (evt.getSource() == btnTaids) {
        // Lấy giá trị tìm kiếm từ ô nhập liệu
        String TenDienThoai = txtTimkiem.getText();

        // Nếu không có giá trị tìm kiếm nào được nhập, hiển thị toàn bộ dữ liệu
        if (TenDienThoai.trim().isEmpty()) {
            Show_Table();
        } else {
            // Nếu có giá trị tìm kiếm, tìm và hiển thị các điện thoại có tên tương ứng
            Timkiem(TenDienThoai);
        } 
         }// TODO add your handling code here:
    }//GEN-LAST:event_btnTaidsActionPerformed
   public boolean Delete(String Ma){
        try {
            Connect cn = new Connect();
            cn.Delete(Ma);
            cn.Close();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLDienthoai.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        } catch (SQLException ex) {
            Logger.getLogger(QLDienthoai.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
   }
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       if(evt.getSource()== btnXoa){
           //lay chi so hang duoc chon trong luoi
           int sohang = tbDienthoai.getSelectedRow();
           //neu chua chon hang nao thi hien thi thong bao loi
           if(sohang<0){
               JOptionPane.showMessageDialog(null,"Bạn chưa chọn điện thoại để xóa. ");
               return;
           }
           //lay thong tin dien thoai duoc chon
          String Ma = tbDienthoai.getValueAt(sohang,0).toString();
          //Hien thi thong tin xac nhan xoa
          int confirm = JOptionPane.showConfirmDialog(null,
                  "Bạn có muốn xóa điện thoại này không ?","Thông báo",
                  JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
          if(confirm == JOptionPane.YES_OPTION){
              //Xoa thong tin dien thoai can xoa
              if(Delete(Ma)){
                  Show_Table();
                  JOptionPane.showMessageDialog(null,"Xóa điện thoại thành công");
                  
              }else{
                  JOptionPane.showMessageDialog(null,"Xóa điện thoại không thành công");
              }
          }
       }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int rs = JOptionPane.showConfirmDialog(null, 
        "Bạn có muốn thoát không?","Thông báo",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(rs == JOptionPane.YES_OPTION){
            this.setVisible(false);
        }else{
            
        }        
                
    }//GEN-LAST:event_btnThoatActionPerformed
    
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
            java.util.logging.Logger.getLogger(QLDienthoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDienthoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDienthoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDienthoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDienthoai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaids;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDienthoai;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
