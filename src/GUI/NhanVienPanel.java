/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.NhanVienBus;
import BUS.TaiKhoanBUS;
import DTO.NhanVienDTO;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import sun.tools.java.Constants;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFChartSheet;


/**
 *
 * @author anhanpro2k
 */
public class NhanVienPanel extends javax.swing.JPanel {

    /**
     * Creates new form AppPanel
     */
    public NhanVienPanel() {
        initComponents();
        hienThiDanhSachNhanVien();
        Details.setModel(new DefaultTableModel(new String[]{"Thông tin", "Nội dung"}, 0));
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
        DanhSachNhanVien = new javax.swing.JTable();
        Search_Text = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Combobox_Search = new javax.swing.JComboBox<>();
        refresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Details = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1067, 719));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Nhân Viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        DanhSachNhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        DanhSachNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanhSachNhanVienMouseClicked(evt);
            }
        });
        DanhSachNhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DanhSachNhanVienKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(DanhSachNhanVien);

        Search.setText("Search");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });

        Combobox_Search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Nhân Viên", "Tên" }));
        Combobox_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combobox_SearchActionPerformed(evt);
            }
        });

        refresh.setText("Làm mới");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });

        Details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ));
        jScrollPane2.setViewportView(Details);
        if (Details.getColumnModel().getColumnCount() > 0) {
            Details.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            Details.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            Details.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            Details.getColumnModel().getColumn(3).setHeaderValue("Title 4");
            Details.getColumnModel().getColumn(4).setHeaderValue("null");
        }

        jLabel2.setText("Chi tiết nhân viên");

        jButton1.setText("Expore (Excel)");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Import (Excel)");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1))
                                .addComponent(jLabel2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Combobox_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlbSua)
                                .addGap(18, 18, 18)
                                .addComponent(jlbXoa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(refresh)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(174, 174, 174))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 102, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jlbSua, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlbXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(refresh)
                                    .addComponent(Combobox_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Search)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        AddNhanVien addNV = new AddNhanVien();
        addNV.setLocationRelativeTo(null);
        addNV.setVisible(true);
        AddNhanVien.hienthidanhsachchucvu();
    }//GEN-LAST:event_jbtThemMouseClicked

    private void jbtThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseEntered
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them-hover.png")));
    }//GEN-LAST:event_jbtThemMouseEntered

    private void jbtThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseExited
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them.png")));
    }//GEN-LAST:event_jbtThemMouseExited

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded

    }//GEN-LAST:event_formComponentAdded

    private void Combobox_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combobox_SearchActionPerformed

    }//GEN-LAST:event_Combobox_SearchActionPerformed

    private void DanhSachNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanhSachNhanVienMouseClicked
        getRow();
        hienThiChiTietNhanVien();
    }//GEN-LAST:event_DanhSachNhanVienMouseClicked

    private void DanhSachNhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DanhSachNhanVienKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            getRow();
            hienThiChiTietNhanVien();
        }
    }//GEN-LAST:event_DanhSachNhanVienKeyReleased

    private void jlbXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseClicked
        NhanVienBus nvbus = new NhanVienBus();
        TaiKhoanBUS tkbus = new TaiKhoanBUS();
        if (DanhSachNhanVien.getSelectedRow() != -1) {
            int input = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắc xoá nhân viên này?");
            if (input == 0) {
                NhanVienDTO nv = getRow();
                nvbus.delNV(nv.getMaNV());
                tkbus.delTaiKhoan(nv.getMaTK());
                hienThiDanhSachNhanVien();
                JOptionPane.showMessageDialog(this, "Đã xoá thành công!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên để xoá!");
            return;
        }
    }//GEN-LAST:event_jlbXoaMouseClicked

    private void jlbSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseClicked
        if (DanhSachNhanVien.getSelectedRow() != -1) {
            EditNhanVien edit = new EditNhanVien();
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên để thực hiện chức năng!");
        }

    }//GEN-LAST:event_jlbSuaMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        NhanVienBus.dsnv = null;
        NhanVienBus nvb = new NhanVienBus();
        nvb.getList();
        if (Search_Text.getText().equals("")) {
        } else {
            if (Combobox_Search.getSelectedIndex() == 0) {
                NhanVienBus.dsnv = nvb.timNhanVienTheoMaNV(Search_Text.getText());
            } else if (Combobox_Search.getSelectedIndex() == 1) {
                NhanVienBus.dsnv = nvb.timNhanVienTheoTen(Search_Text.getText());
            }
        }
        hienThiDanhSachNhanVien();;
    }//GEN-LAST:event_SearchMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        NhanVienBus.dsnv = null;
        hienThiDanhSachNhanVien();
        Details.setModel(new DefaultTableModel(new String[]{"Thông tin", "Nội dung"}, 0));

    }//GEN-LAST:event_refreshMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        exportExcel(DanhSachNhanVien);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        importExcelToJtableJava();
    }//GEN-LAST:event_jButton2MouseClicked

    public static void hienThiDanhSachNhanVien() {
        NhanVienBus nhanVienBus = new NhanVienBus();
        if (NhanVienBus.dsnv == null) {
            nhanVienBus.getList();
        }
        String colTieuDe[] = new String[]{"Mã Nhân Viên", "Mã Chức Vụ", "Tên Nhân Viên", "Điện Thoại", "Mã Tài Khoản"};
        DefaultTableModel model = new DefaultTableModel(colTieuDe, 0);
        Object[] row;
        for (NhanVienDTO nv : NhanVienBus.dsnv) {
            row = new Object[5];
            row[0] = nv.getMaNV();
            row[1] = nv.getMaCV();
            row[2] = nv.getTenNV();
            row[3] = nv.getDienThoai();
            row[4] = nv.getMaTK();
            model.addRow(row);
        }
        DanhSachNhanVien.setModel(model);
    }

    public void hienThiChiTietNhanVien() {
        NhanVienDTO nv = getRow();
        String colTieuDe[] = new String[]{"Thông tin", "Nội dung"};
        DefaultTableModel model = new DefaultTableModel(colTieuDe, 0);
        Object[] row;
        row = new Object[2];
        row[0] = "Mã nhân viên";
        row[1] = nv.getMaNV();
        model.addRow(row);

        row = new Object[2];
        row[0] = "Tên nhân viên";
        row[1] = nv.getTenNV();
        model.addRow(row);

        row = new Object[2];
        row[0] = "Số điện thoại";
        row[1] = nv.getDienThoai();
        model.addRow(row);

        row = new Object[2];
        row[0] = "Mã chức vụ";
        row[1] = nv.getMaCV();
        model.addRow(row);

        row = new Object[2];
        row[0] = "Mã Tài Khoản";
        row[1] = nv.getMaTK();
        model.addRow(row);

        Details.setModel(model);

    }

    public static NhanVienDTO getRow() {
        int selectedRow = DanhSachNhanVien.getSelectedRow();
        NhanVienDTO row = NhanVienBus.dsnv.get(selectedRow);
        return row;
    }

    public void exportExcel(JTable table) {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file + ".xls");
                BufferedWriter bwrite = new BufferedWriter(out);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                //Ten cot
                for (int j = 0; j < table.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j).toString() + "\t");
                }
                bwrite.write("\n");
                //Lay du lieu dong
                for (int j = 0; j < table.getRowCount(); j++) {
                    for (int k = 0; k < table.getColumnCount(); k++) {
                        bwrite.write(model.getValueAt(j, k).toString() + "\t");
                    }
                    bwrite.write("\n");
                }
                bwrite.close();
                JOptionPane.showMessageDialog(null, "Lưu file thành công!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi khi lưu file!");
            }
        }
    }

    public void importExcelToJtableJava() {

        File excelFile;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelImportToJTable = null;
        JFileChooser excelFileChooser = new JFileChooser();
        excelFileChooser.setDialogTitle("Select Excel File");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showOpenDialog(null);
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            try {
                excelFile = excelFileChooser.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelImportToJTable = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelImportToJTable.getSheetAt(0);
                DefaultTableModel model = new DefaultTableModel(new String[]{"Mã Nhân Viên", "Mã Chức Vụ", "Tên Nhân Viên", "Điện Thoại", "Mã Tài Khoản"},0);
                for (int row = 1; row <= excelSheet.getLastRowNum(); row++) {
                    XSSFRow excelRow = excelSheet.getRow(row);

                    XSSFCell excelMaNV = excelRow.getCell(0);
                    XSSFCell excelMaCV = excelRow.getCell(1);
                    XSSFCell excelTenNV = excelRow.getCell(2);
                    XSSFCell excelSDT = excelRow.getCell(3);
                    XSSFCell excelMaTK = excelRow.getCell(4);
                    String MaNV = NumberToTextConverter.toText(excelMaNV.getNumericCellValue());
                    String MaCV = NumberToTextConverter.toText(excelMaCV.getNumericCellValue());
                    String SDT = NumberToTextConverter.toText(excelSDT.getNumericCellValue());
                    String MaTK = NumberToTextConverter.toText(excelMaTK.getNumericCellValue());
                    model.addRow(new Object[]{MaNV, excelTenNV, SDT, MaCV, MaTK});
                }
                DanhSachNhanVien.setModel(model);
                JOptionPane.showMessageDialog(null, "Imported Successfully !!.....");
            } catch (IOException iOException) {
                JOptionPane.showMessageDialog(null, iOException.getMessage());
            } finally {
                try {
                    if (excelFIS != null) {
                        excelFIS.close();
                    }
                    if (excelBIS != null) {
                        excelBIS.close();
                    }
                    if (excelImportToJTable != null) {
                        excelImportToJTable.close();
                    }
                } catch (IOException iOException) {
                    JOptionPane.showMessageDialog(null, iOException.getMessage());
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combobox_Search;
    private static javax.swing.JTable DanhSachNhanVien;
    private javax.swing.JTable Details;
    private javax.swing.JButton Search;
    private javax.swing.JTextField Search_Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jbtThem;
    private javax.swing.JLabel jlbSua;
    private javax.swing.JLabel jlbXoa;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
