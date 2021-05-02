/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.LoaiJoinMonBUS;
import BUS.LoaiMonBUS;
import DTO.LoaiJoinMonDTO;
import DTO.LoaiMonDTO;
import DTO.MonDTO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhanpro2k
 */
public class LoaiMonPanel extends javax.swing.JPanel {
    DefaultTableModel modelLoaiJoinMon;
    DefaultTableModel modelLoai;
    /**
     * Creates new form AppPanel
     */
    public LoaiMonPanel() {
        initComponents();       
        CreateAttributeForTable();
        ReadDataForLoaiJoinMonTable();
        ReadDataForLoaiTable();
        setVisible(true);
        
    }
    
    public void CreateAttributeForTable(){
        // loai join mon
        
        loai_join_mon_ạn_table.getTableHeader().setFont(new Font("Arial", BOLD, 18)); //set font cho vector header
        loai_join_mon_ạn_table.setFont((new Font("Arial", 0, 18)));
        loai_join_mon_ạn_table.getTableHeader().setForeground(Color.black); //set màu chữ cho header
        loai_join_mon_ạn_table.getTableHeader().setPreferredSize(new Dimension(30, 40));//set độ dài độ rộng của header
        loai_join_mon_ạn_table.setRowHeight(40);
        loai_join_mon_ạn_table.setGridColor(Color.GREEN);
        loai_join_mon_ạn_table.setFillsViewportHeight(true);//hiển thị table     
        loai_join_mon_ạn_table.setShowGrid(true);
        loai_join_mon_ạn_table.getColumnModel().getColumn(0).setPreferredWidth(10);
        loai_join_mon_ạn_table.getColumnModel().getColumn(1).setPreferredWidth(40);
        loai_join_mon_ạn_table.getColumnModel().getColumn(2).setPreferredWidth(150);
        loai_join_mon_ạn_table.getColumnModel().getColumn(3).setPreferredWidth(50);
        loai_join_mon_ạn_table.getColumnModel().getColumn(4).setPreferredWidth(200);
        
        // loai
        loai_table.getTableHeader().setFont(new Font("Arial", BOLD, 18)); //set font cho vector header
        loai_table.setFont((new Font("Arial", 0, 18)));
        loai_table.getTableHeader().setForeground(Color.black); //set màu chữ cho header
        loai_table.getTableHeader().setPreferredSize(new Dimension(30, 40));//set độ dài độ rộng của header
        loai_table.setRowHeight(40);
        loai_table.setGridColor(Color.GREEN);
        loai_table.setFillsViewportHeight(true);//hiển thị table     
        loai_table.setShowGrid(true);
        loai_table.getColumnModel().getColumn(0).setPreferredWidth(40);
        loai_table.getColumnModel().getColumn(1).setPreferredWidth(50);
        loai_table.getColumnModel().getColumn(2).setPreferredWidth(150);
    }
    
    public void ReadDataForLoaiJoinMonTable(){     
        LoaiJoinMonBUS loai_join_mon_BUS = new LoaiJoinMonBUS();
        try {
            loai_join_mon_BUS.getDanhSachLoaiJoinMon();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String header[] = {"STT","Mã Loại","Tên Loại","Mã Món Ăn","Tên Món Ăn"};
        modelLoaiJoinMon = new DefaultTableModel(null, header);
        int temp= 1;
        for(LoaiJoinMonDTO loai_join_mon_an_DTO : LoaiJoinMonBUS.danhSachLoaiJoinMon){
            AddRowForLoaiJoinMon(loai_join_mon_an_DTO, temp);
            temp++;
        }
        loai_join_mon_ạn_table.setModel(modelLoaiJoinMon);
    }
    
    public void ReadDataForLoaiTable(){     
        LoaiMonBUS loai_BUS = new LoaiMonBUS();
        try {
            loai_BUS.getDanhSachLoaiMon();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String header[] = {"STT","Mã Loại","Tên Loại"};
        modelLoai = new DefaultTableModel(null, header);
        int temp= 1;
        for(LoaiMonDTO loai_DTO : LoaiMonBUS.danhSachLoaiMon){
            AddRowForLoai(loai_DTO, temp);
            temp++;
        }
        loai_table.setModel(modelLoai);
        
    }
    
    private void AddRowForLoai(LoaiMonDTO loai_DTO, int temp) {
        Vector row = new Vector();
        row.add(temp);
        row.add(loai_DTO.getMaLoai());
        row.add(loai_DTO.getTenLoai());  
        modelLoai.addRow(row);
    } 
    
    private void AddRowForLoaiJoinMon(LoaiJoinMonDTO loai_join_mon_DTO, int temp) {
        Vector row = new Vector();
        row.add(temp);
        row.add(loai_join_mon_DTO.getMaLoai());
        row.add(loai_join_mon_DTO.getTenLoai());  
        row.add(loai_join_mon_DTO.getMaMon());
        row.add(loai_join_mon_DTO.getTenMon());     
        modelLoaiJoinMon.addRow(row);
    }  
    
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
        loai_join_mon_ạn_table = new javax.swing.JTable();
        Search_JTF = new javax.swing.JTextField();
        Search_BTN = new javax.swing.JButton();
        refresh_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        loai_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ma_loai_JTF = new javax.swing.JTextField();
        ten_loai_JTF = new javax.swing.JTextField();
        clearn_btn = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(1067, 719));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Loại Món");

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

        loai_join_mon_ạn_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Loại", "Tên Loại", "Mã Món Ăn", "Tên Món Ăn"
            }
        ));
        loai_join_mon_ạn_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loai_join_mon_ạn_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(loai_join_mon_ạn_table);

        Search_BTN.setBackground(new java.awt.Color(0, 255, 255));
        Search_BTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Search_BTN.setText("Search");
        Search_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_BTNMouseClicked(evt);
            }
        });
        Search_BTN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Search_BTNKeyPressed(evt);
            }
        });

        refresh_btn.setBackground(new java.awt.Color(102, 255, 102));
        refresh_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refresh_btn.setText("Refresh");
        refresh_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh_btnMouseClicked(evt);
            }
        });
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });

        loai_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Mã loại", "Tên loại"
            }
        ));
        loai_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loai_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(loai_table);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Thông tin loại món ăn");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã Loại:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tên Loại:");

        ten_loai_JTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten_loai_JTFActionPerformed(evt);
            }
        });

        clearn_btn.setBackground(new java.awt.Color(102, 255, 102));
        clearn_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearn_btn.setText("Clearn");
        clearn_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearn_btnMouseClicked(evt);
            }
        });
        clearn_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearn_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ma_loai_JTF, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(ten_loai_JTF))
                        .addGap(18, 18, 18)
                        .addComponent(clearn_btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ma_loai_JTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ten_loai_JTF)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(clearn_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

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
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jlbSua))
                                    .addComponent(Search_JTF))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jlbXoa))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Search_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(refresh_btn)))))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlbXoa)
                                .addComponent(jlbSua))
                            .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search_JTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearn_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearn_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearn_btnActionPerformed

    private void clearn_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearn_btnMouseClicked
        ma_loai_JTF.setText("");
        ten_loai_JTF.setText("");
    }//GEN-LAST:event_clearn_btnMouseClicked

    private void ten_loai_JTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten_loai_JTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ten_loai_JTFActionPerformed

    private void loai_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loai_tableMouseClicked
        int  i = loai_table.getSelectedRow();
        if(i >=0){
            ma_loai_JTF.setText(String.valueOf(LoaiMonBUS.danhSachLoaiMon.get(i).getMaLoai()));
            ten_loai_JTF.setText(LoaiMonBUS.danhSachLoaiMon.get(i).getTenLoai());
        }
    }//GEN-LAST:event_loai_tableMouseClicked

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh_btnActionPerformed

    private void refresh_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_btnMouseClicked
        Search_JTF.setText("");
        modelLoaiJoinMon.setRowCount(0);
        int temp = 1;
        for (int i =0; i < LoaiJoinMonBUS.danhSachLoaiJoinMon.size();i++) {
            AddRowForLoaiJoinMon(LoaiJoinMonBUS.danhSachLoaiJoinMon.get(i), temp);
            temp++;
        }
    }//GEN-LAST:event_refresh_btnMouseClicked

    private void Search_BTNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_BTNKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_BTNKeyPressed

    private void Search_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_BTNMouseClicked
        if(Search_JTF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Có vẻ như bạn chưa nhập gì cả!!");
        }else{
            String temp = Search_JTF.getText();
            modelLoaiJoinMon.setRowCount(0);
            int stt = 1;
            try {
                for (int i =0; i < LoaiJoinMonBUS.TimKiemALL(temp).size();i++) {
                    AddRowForLoaiJoinMon(LoaiJoinMonBUS.TimKiemALL(temp).get(i), stt);
                    stt++;
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_Search_BTNMouseClicked

    private void loai_join_mon_ạn_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loai_join_mon_ạn_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loai_join_mon_ạn_tableMouseClicked

    private void jbtThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseExited
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them.png")));
    }//GEN-LAST:event_jbtThemMouseExited

    private void jbtThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseEntered
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them-hover.png")));
    }//GEN-LAST:event_jbtThemMouseEntered

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        LoaiMonBUS loai_mon_BUS = new LoaiMonBUS();
        String ma_loai = this.ma_loai_JTF.getText();
        String ten_loai = this.ten_loai_JTF.getText();
        if (ma_loai.equals("") || ten_loai.equals(""))
        JOptionPane.showMessageDialog(this,"Vui lòng nhập đầy đủ thông tin vào ô trống");
        else{
            if (loai_mon_BUS.checkID(Integer.valueOf(ma_loai_JTF.getText()), LoaiMonBUS.danhSachLoaiMon))
            JOptionPane.showMessageDialog(this,"ID Loại đã tồn tại");
            else{
                try{
                    LoaiMonDTO loai_mon_DTO = new LoaiMonDTO();
                    loai_mon_DTO.setMaLoai(Integer.valueOf(ma_loai));
                    loai_mon_DTO.setTenLoai(ten_loai);
                    loai_mon_BUS.AddLoaiMon(loai_mon_DTO);
                    JOptionPane.showMessageDialog(this,"Thêm Loại thành công!");
                    ma_loai_JTF.setText(null);
                    ten_loai_JTF.setText(null);
                } catch (Exception ae){
                    ae.printStackTrace();
                }
            }
        }
        RefreshForLoaiTable();
    }//GEN-LAST:event_jbtThemMouseClicked

    private void jlbSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseExited
        jlbSua.setIcon(new ImageIcon(getClass().getResource("../img/icon/sua.png")));
    }//GEN-LAST:event_jlbSuaMouseExited

    private void jlbSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseEntered
        jlbSua.setIcon(new ImageIcon(getClass().getResource("../img/icon/sua-hover.png")));
    }//GEN-LAST:event_jlbSuaMouseEntered

    private void jlbSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseClicked
        LoaiMonBUS loai_BUS = new LoaiMonBUS();
        LoaiMonDTO loai_DTO = new LoaiMonDTO();
        try {
            loai_DTO.setMaLoai(Integer.valueOf(ma_loai_JTF.getText()));
            loai_DTO.setTenLoai(ten_loai_JTF.getText());
            loai_BUS.ChangeLoaiMon(loai_DTO);
            JOptionPane.showMessageDialog(this, "Sửa thành công");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jlbSuaMouseClicked

    private void jlbXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseExited
        jlbXoa.setIcon(new ImageIcon(getClass().getResource("../img/icon/xoa.png")));
    }//GEN-LAST:event_jlbXoaMouseExited

    private void jlbXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseEntered
        jlbXoa.setIcon(new ImageIcon(getClass().getResource("../img/icon/xoa-hover.png")));
    }//GEN-LAST:event_jlbXoaMouseEntered

    private void jlbXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn Xoá không?", "Xoa Data",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        }
        LoaiMonBUS loai_BUS = new LoaiMonBUS();
        LoaiMonDTO loai_DTO = new LoaiMonDTO();
        try {
            loai_DTO.setMaLoai(Integer.valueOf(ma_loai_JTF.getText()));
            loai_BUS.DeleteLoaiMon(loai_DTO);
            System.out.println(" " + LoaiMonBUS.danhSachLoaiMon.size());
            JOptionPane.showMessageDialog(this, "Xoá thành công");
        } catch (Exception e) {
        }
        RefreshForLoaiTable();
    }//GEN-LAST:event_jlbXoaMouseClicked
    
    public void RefreshForLoaiTable(){
        modelLoai.setRowCount(0);
        int temp = 1;
        for (int i = 0; i < LoaiMonBUS.danhSachLoaiMon.size();i++) {
            AddRowForLoai(LoaiMonBUS.danhSachLoaiMon.get(i), temp);
            temp++;
        } 
        modelLoai.fireTableDataChanged();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search_BTN;
    private javax.swing.JTextField Search_JTF;
    private javax.swing.JButton clearn_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jbtThem;
    private javax.swing.JLabel jlbSua;
    private javax.swing.JLabel jlbXoa;
    private javax.swing.JTable loai_join_mon_ạn_table;
    private javax.swing.JTable loai_table;
    private javax.swing.JTextField ma_loai_JTF;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JTextField ten_loai_JTF;
    // End of variables declaration//GEN-END:variables
}
