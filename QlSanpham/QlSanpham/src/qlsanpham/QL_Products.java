/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlsanpham;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class QL_Products extends javax.swing.JFrame {

    /**
     * Creates new form QL_Products
     */
    public QL_Products() {
        initComponents();
        ShowTable();//Hiển thị dữ liệu khi khởi động
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
        txt_maSP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_tenSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_SoLuong = new javax.swing.JTextField();
        btn_Laydulieu = new javax.swing.JButton();
        btn_capnhat = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        btn_lammoi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_timkiem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfSoluongtimkiem = new javax.swing.JTextField();
        btn_timkiem_SL = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_next5 = new javax.swing.JButton();
        btn_Come_back = new javax.swing.JButton();
        btn_Come_back5 = new javax.swing.JButton();
        tfMatimkiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý sản phẩm");

        jLabel1.setText("Mã sản phẩm:");

        jLabel2.setText("Tên sản phẩm:");

        jLabel3.setText("Số lượng:");

        btn_Laydulieu.setText("Lấy dữ liệu");
        btn_Laydulieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LaydulieuMouseClicked(evt);
            }
        });
        btn_Laydulieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LaydulieuActionPerformed(evt);
            }
        });

        btn_capnhat.setText("Cập nhật");
        btn_capnhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_capnhatMouseClicked(evt);
            }
        });

        btn_them.setText("Thêm");
        btn_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themMouseClicked(evt);
            }
        });
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Thoat.setText("Thoát");
        btn_Thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ThoatMouseClicked(evt);
            }
        });
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng"
            }
        ));
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        tblSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSPKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP);

        btn_lammoi.setText("Làm mới");
        btn_lammoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_lammoiMouseClicked(evt);
            }
        });
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });

        jLabel4.setText("Tìm kiếm theo mã: ");

        btn_timkiem.setText("Tìm kiếm theo mã");
        btn_timkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_timkiemMouseClicked(evt);
            }
        });
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        jLabel5.setText("Tìm kiếm theo số lượng:");

        tfSoluongtimkiem.setToolTipText("Tìm những sản phẩm có số lượng nhỏ hơn giá trị này");

        btn_timkiem_SL.setText("Tìm kiếm theo số lượng");
        btn_timkiem_SL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_timkiem_SLMouseClicked(evt);
            }
        });

        btn_next.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_next.setText(">");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_next5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_next5.setText(">>");
        btn_next5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_next5ActionPerformed(evt);
            }
        });

        btn_Come_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Come_back.setText("<");
        btn_Come_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Come_backActionPerformed(evt);
            }
        });

        btn_Come_back5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Come_back5.setText("<<");
        btn_Come_back5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Come_back5MouseClicked(evt);
            }
        });
        btn_Come_back5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Come_back5ActionPerformed(evt);
            }
        });

        tfMatimkiem.setToolTipText("Nhập mã tìm kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_SoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txt_tenSP)
                                    .addComponent(txt_maSP)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMatimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(tfSoluongtimkiem))))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_capnhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_Laydulieu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_timkiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_timkiem_SL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Come_back)
                                .addGap(58, 58, 58)
                                .addComponent(btn_Come_back5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                                .addComponent(btn_next5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(btn_next))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_maSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Laydulieu)
                    .addComponent(btn_Xoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_tenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_capnhat)
                    .addComponent(btn_Thoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_lammoi)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_timkiem)
                    .addComponent(tfMatimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfSoluongtimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timkiem_SL))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_next5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Come_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Come_back5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //Đếm số dòng có trong bảng Products
    public int Dem() {
        int dem = 0;
        try {
            Connect_DB pt = new Connect_DB();
            ResultSet rs = pt.GetData("Products");
            while (rs.next()) {
                dem++;
            }

            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dangnhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dem;
    }

    public void ShowTable() {
     //   tblSP.removeAll();
        DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
        model.setRowCount(Dem());//Thiết lập số dòng của jtable = số dòng của bảng của DataBase
        try {
            Connect_DB pt = new Connect_DB();
            ResultSet rs = pt.GetData("Products");
            int i = 0;
            while (rs.next()) {
                tblSP.setValueAt(rs.getString("ID"), i, 0);
                tblSP.setValueAt(rs.getString("Name"), i, 1);
                tblSP.setValueAt(rs.getString("Number"), i, 2);
                i++;
            }
            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn_LaydulieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LaydulieuActionPerformed
        ShowTable();
    }//GEN-LAST:event_btn_LaydulieuActionPerformed
    public void capnhatDL() {
        Connect_DB pt;
        try {
            pt = new Connect_DB();
            pt.Update(txt_maSP.getText(), txt_tenSP.getText(), Integer.parseInt(txt_SoLuong.getText()));
            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn_capnhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_capnhatMouseClicked
        if (check(txt_maSP.getText()) == true) {
//         txt_maSP.setEnabled(false);
            capnhatDL();
            ShowTable();
            JOptionPane.showMessageDialog(null, "Bạn đã cập nhật thành công!");
        } else {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm không trùng với dữ liệu cần sửa!");

        }

    }//GEN-LAST:event_btn_capnhatMouseClicked
    public void Show_Detail() {
        try {
            Connect_DB pt = new Connect_DB();
            ResultSet rs = pt.GetData("Products");
            int i = tblSP.getSelectedRow();

            txt_maSP.setText((String) tblSP.getValueAt(i, 0));
            txt_tenSP.setText((String) tblSP.getValueAt(i, 1));
            txt_SoLuong.setText((String) tblSP.getValueAt(i, 2));

            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        Show_Detail();
    }//GEN-LAST:event_tblSPMouseClicked
    public void Insert() {
        String id = txt_maSP.getText();
        String tenSP = txt_tenSP.getText();
        int soluong = Integer.parseInt(txt_SoLuong.getText());
        Connect_DB pt;
        try {
            pt = new Connect_DB();
            pt.Insert(id, tenSP, soluong);
            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themMouseClicked
        txt_maSP.setEnabled(true);
        String id = txt_maSP.getText();
        String tensp = txt_tenSP.getText();
        String soluong = txt_SoLuong.getText();
        id = id.replaceAll(" ", "");
        tensp = tensp.replaceAll(" ", "");
        soluong = soluong.replaceAll(" ", "");
        if (txt_maSP.getText().equals("") == true || txt_tenSP.equals("") == true || txt_SoLuong.equals("") == true) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập dữ liệu!");
        } else {
            if (check(id) == true) {
                JOptionPane.showMessageDialog(null, "Mã sản phẩm bị trùng!!! Vui lòng nhập lại!!!");
            } else {
                Insert();
                ShowTable();
                JOptionPane.showMessageDialog(null, "Đã thêm thành công");

            }
        }
    }//GEN-LAST:event_btn_themMouseClicked

    private void btn_lammoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lammoiMouseClicked
        int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn format lại không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            txt_maSP.setText("");
            txt_maSP.setEnabled(true);
            txt_tenSP.setText("");
            txt_SoLuong.setText("");
            tfSoluongtimkiem.setText("");

        } 
    }//GEN-LAST:event_btn_lammoiMouseClicked
    public void Delete(String id) {

        Connect_DB pt;
        try {
            pt = new Connect_DB();
            pt.Delete(id);
            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean check(String ID) {
        boolean check = false;
        try {
            Connect_DB pt = new Connect_DB();

            ResultSet rs = pt.GetData("Products");
            while (rs.next()) {
                if (rs.getString(1).equals(ID) == true) {
                    check = true;
                }
            }
            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dangnhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        String id = txt_maSP.getText();
        if (check(id) == true) {
            int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa sản phẩm này không", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                Delete(id);
                ShowTable();
            } else {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm không trùng với mã sản phẩm trong database!!!");
        }
    }//GEN-LAST:event_btn_XoaActionPerformed
    public void Clear_Table() {
        DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
        model.setRowCount(0);
        model.setRowCount(Dem());
    }
  
    public void show_timkiem(String ID) {
        Clear_Table();
        try {
            Connect_DB pt = new Connect_DB();
            ResultSet rs = pt.GetData_TK(ID);
            int i = 0;
            while (rs.next()) {
                tblSP.setValueAt(rs.getString("ID"), i, 0);
                tblSP.setValueAt(rs.getString("Name"), i, 1);
                tblSP.setValueAt(rs.getString("Number"), i, 2);
                i++;
            }
            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            Dangnhap form = new Dangnhap();
            form.setVisible(true);
        } else {

        }
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_timkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_timkiemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_timkiemMouseClicked
    public void tim_sLuong(int sl) {
        Clear_Table();
        try {
            Connect_DB pt = new Connect_DB();
            ResultSet rs = pt.Getdata_Sluong(sl);
            int i = 0;
            while (rs.next()) {
                tblSP.setValueAt(rs.getString("ID"), i, 0);
                tblSP.setValueAt(rs.getString("Name"), i, 1);
                tblSP.setValueAt(rs.getString("Number"), i, 2);
                i++;
            }
            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QL_Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn_timkiem_SLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_timkiem_SLMouseClicked
        int soluong = Integer.parseInt(tfSoluongtimkiem.getText());
        tim_sLuong(soluong);

    }//GEN-LAST:event_btn_timkiem_SLMouseClicked

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        int i = tblSP.getSelectedRow();
        if (i >= Dem() - 1) {
            i = Dem() - 1;
            JOptionPane.showMessageDialog(null, "Đây là phần tử cuối cùng!!!");
        } else {
            i++;

        }
        tblSP.setRowSelectionInterval(i, i);
        Show_Detail();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_next5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next5ActionPerformed
        int i = tblSP.getSelectedRow();
        if (i + 5 >= Dem() - 1) {
            i = Dem() - 1;
            JOptionPane.showMessageDialog(null, "Đây là phần tử cuối cùng!!!");
        } else {
            i += 5;

        }
        tblSP.setRowSelectionInterval(i, i);
        Show_Detail();
    }//GEN-LAST:event_btn_next5ActionPerformed

    private void btn_Come_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Come_backActionPerformed
        int i = tblSP.getSelectedRow();

        if (i < 1) {
            i = 0;
            JOptionPane.showMessageDialog(null, "Đây là phần tử đầu tiên!!!");
        } else {
            i -= 1;

        }
        tblSP.setRowSelectionInterval(i, i);
        Show_Detail();
    }//GEN-LAST:event_btn_Come_backActionPerformed

    private void btn_Come_back5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Come_back5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Come_back5MouseClicked

    private void btn_Come_back5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Come_back5ActionPerformed
        int i = tblSP.getSelectedRow();
        if (i - 5 < 1) {
            i = 0;
            JOptionPane.showMessageDialog(null, "Đây là phần tử đầu tiên!!!");

        } else {
            i -= 5;
        }
        tblSP.setRowSelectionInterval(i, i);
        Show_Detail();
    }//GEN-LAST:event_btn_Come_back5ActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        String ID = tfMatimkiem.getText();
        show_timkiem(ID);
    }//GEN-LAST:event_btn_timkiemActionPerformed

    private void tblSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSPKeyReleased
     if(evt.getKeyCode()==KeyEvent.VK_UP||evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
        txt_maSP.setEditable(false);
        txt_maSP.setText((String) tblSP.getValueAt(tblSP.getSelectedRow(),0));
        txt_tenSP.setText((String) tblSP.getValueAt(tblSP.getSelectedRow(),1));
        txt_SoLuong.setText((String) tblSP.getValueAt(tblSP.getSelectedRow(),2));
        }
    
    }//GEN-LAST:event_tblSPKeyReleased

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void btn_LaydulieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LaydulieuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LaydulieuMouseClicked

    private void btn_ThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThoatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThoatMouseClicked

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
            java.util.logging.Logger.getLogger(QL_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Come_back;
    private javax.swing.JButton btn_Come_back5;
    private javax.swing.JButton btn_Laydulieu;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton btn_capnhat;
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_next5;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_timkiem_SL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField tfMatimkiem;
    private javax.swing.JTextField tfSoluongtimkiem;
    private javax.swing.JTextField txt_SoLuong;
    private javax.swing.JTextField txt_maSP;
    private javax.swing.JTextField txt_tenSP;
    // End of variables declaration//GEN-END:variables
}
