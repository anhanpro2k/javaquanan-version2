/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.AppBUS;
import DTO.AppDTO;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhanpro2k
 */
public class AppPanel extends javax.swing.JPanel {

    /**
     * Creates new form AppPanel
     */
    public AppPanel() {
        initComponents();
        hienThiDanhSachApp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbXoa = new javax.swing.JLabel();
        jlbSua = new javax.swing.JLabel();
        jbtThem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DanhSachApp = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ChiTietApp = new javax.swing.JTable();
        SearchText = new javax.swing.JTextField();
        selectSearchBy = new javax.swing.JComboBox<>();
        Search = new javax.swing.JButton();
        Refesh = new javax.swing.JButton();
        Export = new javax.swing.JButton();
        Import = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(1067, 719));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Các App");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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

        jlbXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/xoa.png"))); // NOI18N
        jlbXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbXoaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbXoaMouseExited(evt);
            }
        });

        jlbSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/sua.png"))); // NOI18N
        jlbSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbSuaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbSuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbSuaMouseExited(evt);
            }
        });

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
        });

        DanhSachApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        DanhSachApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanhSachAppMouseClicked(evt);
            }
        });
        DanhSachApp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DanhSachAppKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(DanhSachApp);

        ChiTietApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thông Tin", "Nội Dung"
            }
        ));
        jScrollPane2.setViewportView(ChiTietApp);

        selectSearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã App", "Tên App", "Phí Hoa Hồng" }));

        Search.setText("Tìm Kiếm");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });

        Refesh.setText("Làm mới");
        Refesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefeshActionPerformed(evt);
            }
        });

        Export.setText("Export(Excel)");
        Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportActionPerformed(evt);
            }
        });

        Import.setText("Import(Excel)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlbSua))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Import)
                                        .addGap(18, 18, 18)
                                        .addComponent(Export)
                                        .addGap(46, 46, 46)
                                        .addComponent(Search)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(selectSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbXoa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Refesh, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchText)
                            .addComponent(selectSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search)
                            .addComponent(Refesh)
                            .addComponent(Export)
                            .addComponent(Import))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jlbXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseEntered
        jlbXoa.setIcon(new ImageIcon(getClass().getResource("../img/icon/xoa-hover.png")));
    }//GEN-LAST:event_jlbXoaMouseEntered

    private void jlbXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseExited
        jlbXoa.setIcon(new ImageIcon(getClass().getResource("../img/icon/xoa.png")));
    }//GEN-LAST:event_jlbXoaMouseExited

    private void jlbSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseEntered
        jlbSua.setIcon(new ImageIcon(getClass().getResource("../img/icon/sua-hover.png")));
    }//GEN-LAST:event_jlbSuaMouseEntered

    private void jlbSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseExited
        jlbSua.setIcon(new ImageIcon(getClass().getResource("../img/icon/sua.png")));
    }//GEN-LAST:event_jlbSuaMouseExited

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        AddApp addApp = new AddApp();
    }//GEN-LAST:event_jbtThemMouseClicked

    private void jbtThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseEntered
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them-hover.png")));
    }//GEN-LAST:event_jbtThemMouseEntered

    private void jbtThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseExited
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them.png")));
    }//GEN-LAST:event_jbtThemMouseExited

    private void DanhSachAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanhSachAppMouseClicked
        hienThiChiTietApp();
    }//GEN-LAST:event_DanhSachAppMouseClicked

    private void DanhSachAppKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DanhSachAppKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            hienThiChiTietApp();
        }
    }//GEN-LAST:event_DanhSachAppKeyReleased

    private void jlbXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseClicked
        if (DanhSachApp.getSelectedRow() != -1) {
            int input = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xoá?");
            if (input == 0) {
                AppDTO app = getRow();
                AppBUS appbus = new AppBUS();
                appbus.delApp(app.getMaApp());
                hienThiDanhSachApp();
                JOptionPane.showMessageDialog(null, "Đã xoá thành công!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn App cần xoá");
        }

    }//GEN-LAST:event_jlbXoaMouseClicked

    private void jlbSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseClicked
        if (DanhSachApp.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thông tin cần sửa!");
        } else {
            EditApp editApp = new EditApp();
        }
    }//GEN-LAST:event_jlbSuaMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        AppBUS.danhSachApp = null;
        AppBUS appbus = new AppBUS();
        AppBUS.danhSachApp = appbus.getDanhSachApp();
        String search = SearchText.getText();
        if (search.equals("")) {
        } else {
            if (selectSearchBy.getSelectedIndex() == 0) {
                AppBUS.danhSachApp = appbus.searchByID(search);
            } else if (selectSearchBy.getSelectedIndex() == 1) {
                AppBUS.danhSachApp = appbus.searchByName(search);
            } else {
                AppBUS.danhSachApp = appbus.searchByPhiHoaHong(search);
            }
            hienThiDanhSachApp();
        }
    }//GEN-LAST:event_SearchMouseClicked

    private void RefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefeshActionPerformed
        AppBUS.danhSachApp = null;
        hienThiDanhSachApp();
    }//GEN-LAST:event_RefeshActionPerformed

    private void ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportActionPerformed

    }//GEN-LAST:event_ExportActionPerformed

    public void exportExcel(JTable table) {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file + ".xls");
                BufferedWriter bwrite = new BufferedWriter(out);
                DefaultTableModel model = (DefaultTableModel) table.getModel();

                for (int j = 0; j < table.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j).toString() + "\t");
                }
                bwrite.write("\n");
                for (int j = 0; j < table.getRowCount(); j++) {
                    for (int k = 0; k < table.getColumnCount(); k++) {
                        bwrite.write(model.getValueAt(j, k).toString() + "\t");
                    }
                    bwrite.write("\n");
                }
                bwrite.close();
                JOptionPane.showMessageDialog(null, "Lưu file thành công");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi khi lưu file");
            }
        }
    }

    public static void hienThiDanhSachApp() {
        AppBUS appbus = new AppBUS();
        if (AppBUS.danhSachApp == null) {
            appbus.danhSachApp = appbus.getDanhSachApp();
        }
        String[] colTieuDe = new String[]{"Mã App", "Tên App", "Phí Hoa Hồng"};
        DefaultTableModel model = new DefaultTableModel(colTieuDe, 0);
        Object[] row;
        for (AppDTO app : AppBUS.danhSachApp) {
            row = new Object[3];
            row[0] = app.getMaApp();
            row[1] = app.getTenApp();
            row[2] = app.getPhiHoaHong();
            model.addRow(row);
        }
        DanhSachApp.setModel(model);
    }

    public static AppDTO getRow() {
        int selectedRow = DanhSachApp.getSelectedRow();
        AppDTO row = AppBUS.danhSachApp.get(selectedRow);
        return row;
    }

    public void hienThiChiTietApp() {
        AppDTO app = getRow();
        String colTieuDe[] = new String[]{"Thông tin", "Nội dung"};
        DefaultTableModel model = new DefaultTableModel(colTieuDe, 0);
        Object[] row;
        row = new Object[2];
        row[0] = "Mã App";
        row[1] = app.getMaApp();
        model.addRow(row);

        row = new Object[2];
        row[0] = "Tên App";
        row[1] = app.getTenApp();
        model.addRow(row);

        row = new Object[2];
        row[0] = "Phí Hoa Hồng";
        row[1] = app.getPhiHoaHong();
        model.addRow(row);
        ChiTietApp.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ChiTietApp;
    private static javax.swing.JTable DanhSachApp;
    private javax.swing.JButton Export;
    private javax.swing.JButton Import;
    private javax.swing.JButton Refesh;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jbtThem;
    private javax.swing.JLabel jlbSua;
    private javax.swing.JLabel jlbXoa;
    private javax.swing.JComboBox<String> selectSearchBy;
    // End of variables declaration//GEN-END:variables
}
