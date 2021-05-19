/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.LoaiJoinMonBUS;
import BUS.MonBUS;
import DTO.MonDTO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author anhanpro2k
 */
public class MenuPanel extends javax.swing.JPanel {

    DefaultTableModel modelMon;
    Vector headerMon;
    private MonBUS monBUS;

    /**
     * Creates new form AppPanel
     */
    public MenuPanel() {
        initComponents();
        monBUS = new MonBUS();
        loadData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMon = new javax.swing.JTable();
        jbtThem = new javax.swing.JLabel();
        jlbSua = new javax.swing.JLabel();
        jlbXoa = new javax.swing.JLabel();
        jlbIn1 = new javax.swing.JLabel();
        jtfTimKiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1067, 719));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtbMon);

        jbtThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/them.png"))); // NOI18N
        jbtThem.setPreferredSize(new java.awt.Dimension(148, 49));
        jbtThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtThemMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtThemMousePressed(evt);
            }
        });

        jlbSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/sua.png"))); // NOI18N
        jlbSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbSuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbSuaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbSuaMousePressed(evt);
            }
        });

        jlbXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/xoa.png"))); // NOI18N
        jlbXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbXoaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbXoaMousePressed(evt);
            }
        });

        jlbIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/btn-excel.png"))); // NOI18N
        jlbIn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbIn1MousePressed(evt);
            }
        });

        jtfTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTimKiemActionPerformed(evt);
            }
        });
        jtfTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfTimKiemKeyPressed(evt);
            }
        });

        jLabel2.setText("Tìm Kiếm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbSua)
                .addGap(24, 24, 24)
                .addComponent(jlbXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbIn1)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbIn1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtThemMouseClicked

    private void jbtThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseEntered
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them-hover.png")));
    }//GEN-LAST:event_jbtThemMouseEntered

    private void jbtThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseExited
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them.png")));
    }//GEN-LAST:event_jbtThemMouseExited

    private void jlbSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseEntered
        jlbSua.setIcon(new ImageIcon(getClass().getResource("../img/icon/sua-hover.png")));
    }//GEN-LAST:event_jlbSuaMouseEntered

    private void jlbSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseExited
        jlbSua.setIcon(new ImageIcon(getClass().getResource("../img/icon/sua.png")));
    }//GEN-LAST:event_jlbSuaMouseExited

    private void jlbXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseEntered
        jlbXoa.setIcon(new ImageIcon(getClass().getResource("../img/icon/xoa-hover.png")));
    }//GEN-LAST:event_jlbXoaMouseEntered

    private void jlbXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseExited
        jlbXoa.setIcon(new ImageIcon(getClass().getResource("../img/icon/xoa.png")));
    }//GEN-LAST:event_jlbXoaMouseExited

    private void jbtThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMousePressed
        MenuThem menuThemGUI = new MenuThem(this);
        menuThemGUI.setVisible(true);
    }//GEN-LAST:event_jbtThemMousePressed

    private void jtfTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimKiemActionPerformed

    }//GEN-LAST:event_jtfTimKiemActionPerformed

    private void jtfTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimKiemKeyPressed
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelMon);
        jtbMon.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtfTimKiem.getText().trim()));        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTimKiemKeyPressed

    private void jlbSuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMousePressed
        if (jtbMon.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn món cần sửa");
            return;
        }
        int i = Integer.parseInt(jtbMon.getValueAt(jtbMon.getSelectedRow(), 0).toString());
        MenuSua menuSua = new MenuSua(this, monBUS.getMonTheoMaMon(i));
        menuSua.setVisible(true);
    }//GEN-LAST:event_jlbSuaMousePressed

    private void jlbXoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMousePressed

        if (jtbMon.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn món cần xóa");
            return;
        }
        monBUS.DeleteMon(Integer.parseInt(jtbMon.getValueAt(jtbMon.getSelectedRow(), 0).toString()));
        JOptionPane.showMessageDialog(this, "Xóa món thành công!");
        loadData();
    }//GEN-LAST:event_jlbXoaMousePressed

    private void jlbIn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbIn1MousePressed
        exportExcel(jtbMon);
    }//GEN-LAST:event_jlbIn1MousePressed

    public void exportExcel(JTable table) {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file + ".xls");
                BufferedWriter bwrite = new BufferedWriter(out);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                // ten Cot
                for (int j = 0; j < table.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j) + "\t");
                }
                bwrite.write("\n");
                // Lay du lieu dong
                for (int j = 0; j < table.getRowCount(); j++) {
                    for (int k = 0; k < table.getColumnCount(); k++) {
                        bwrite.write(model.getValueAt(j, k) + "\t");
                    }
                    bwrite.write("\n");
                }
                bwrite.close();
                JOptionPane.showMessageDialog(null, "Lưu file thành công!");
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, "Lỗi khi lưu file!");
            }
        }
    }

    void loadData() {
        headerMon = new Vector();
        headerMon.add("Mã món");
        headerMon.add("Mã loại món");
        headerMon.add("Tên món");
        headerMon.add("Giá Bán");
        modelMon = new DefaultTableModel(headerMon, 0);
        for (MonDTO mon : monBUS.danhSachMon) {
            Vector row = new Vector();
            row.add(mon.getMaMon());
            row.add(mon.getMaLoaiMon());
            row.add(mon.getTenMon());
            row.add(mon.getGiaBan());

            modelMon.addRow(row);
        }
        jtbMon.setModel(modelMon);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jbtThem;
    private javax.swing.JLabel jlbIn1;
    private javax.swing.JLabel jlbSua;
    private javax.swing.JLabel jlbXoa;
    private javax.swing.JTable jtbMon;
    private javax.swing.JTextField jtfTimKiem;
    // End of variables declaration//GEN-END:variables
}
