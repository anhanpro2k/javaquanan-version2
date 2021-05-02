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
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhanpro2k
 */
public class MenuPanel extends javax.swing.JPanel {
    DefaultTableModel modelMon;
    /**
     * Creates new form AppPanel
     */
    public MenuPanel() {
        initComponents();
        CreateAttributeForTable();
        ReadDateForPanel_1_2_3_4();
        setVisible(true);
    }
    
    public void CreateAttributeForTable(){
         //------------------------------------------------------------------------------------------------ Mon khai vi
        khai_vi_table.getTableHeader().setFont(new Font("Arial", BOLD, 18)); //set font cho vector header
        khai_vi_table.setFont((new Font("Arial", 0, 18)));
        khai_vi_table.getTableHeader().setForeground(Color.BLACK.black); //set màu chữ cho header
        khai_vi_table.getTableHeader().setPreferredSize(new Dimension(30, 40));//set độ dài độ rộng của header
        khai_vi_table.setRowHeight(40);
        khai_vi_table.setGridColor(Color.GREEN);
        khai_vi_table.setFillsViewportHeight(true);//hiển thị table     
        khai_vi_table.setShowGrid(true);
        khai_vi_table.getColumnModel().getColumn(0).setPreferredWidth(10);
        khai_vi_table.getColumnModel().getColumn(1).setPreferredWidth(40);
        khai_vi_table.getColumnModel().getColumn(2).setPreferredWidth(150);
        khai_vi_table.getColumnModel().getColumn(3).setPreferredWidth(50);
        khai_vi_table.getColumnModel().getColumn(4).setPreferredWidth(200);
        //------------------------------------------------------------------------------------------------ Mon Nuoc
        mon_nuoc_table.getTableHeader().setFont(new Font("Arial", BOLD, 18)); //set font cho vector header
        mon_nuoc_table.setFont((new Font("Arial", 0, 18)));
        mon_nuoc_table.getTableHeader().setForeground(Color.BLACK.black); //set màu chữ cho header
        mon_nuoc_table.getTableHeader().setPreferredSize(new Dimension(30, 40));//set độ dài độ rộng của header
        mon_nuoc_table.setRowHeight(40);
        mon_nuoc_table.setGridColor(Color.GREEN);
        mon_nuoc_table.setFillsViewportHeight(true);//hiển thị table     
        mon_nuoc_table.setShowGrid(true);
        mon_nuoc_table.getColumnModel().getColumn(0).setPreferredWidth(10);
        mon_nuoc_table.getColumnModel().getColumn(1).setPreferredWidth(40);
        mon_nuoc_table.getColumnModel().getColumn(2).setPreferredWidth(150);
        mon_nuoc_table.getColumnModel().getColumn(3).setPreferredWidth(50);
        mon_nuoc_table.getColumnModel().getColumn(4).setPreferredWidth(200);
         //------------------------------------------------------------------------------------------------ Mon Com
        mon_com_table.getTableHeader().setFont(new Font("Arial", BOLD, 18)); //set font cho vector header
        mon_com_table.setFont((new Font("Arial", 0, 18)));
        mon_com_table.getTableHeader().setForeground(Color.BLACK.black); //set màu chữ cho header
        mon_com_table.getTableHeader().setPreferredSize(new Dimension(30, 40));//set độ dài độ rộng của header
        mon_com_table.setRowHeight(40);
        mon_com_table.setGridColor(Color.GREEN);
        mon_com_table.setFillsViewportHeight(true);//hiển thị table     
        mon_com_table.setShowGrid(true);
        mon_com_table.getColumnModel().getColumn(0).setPreferredWidth(10);
        mon_com_table.getColumnModel().getColumn(1).setPreferredWidth(40);
        mon_com_table.getColumnModel().getColumn(2).setPreferredWidth(150);
        mon_com_table.getColumnModel().getColumn(3).setPreferredWidth(50);
        mon_com_table.getColumnModel().getColumn(4).setPreferredWidth(200);
         //------------------------------------------------------------------------------------------------ Mon Canh
        mon_canhi_table.getTableHeader().setFont(new Font("Arial", BOLD, 18)); //set font cho vector header
        mon_canhi_table.setFont((new Font("Arial", 0, 18)));
        mon_canhi_table.getTableHeader().setForeground(Color.BLACK.black); //set màu chữ cho header
        mon_canhi_table.getTableHeader().setPreferredSize(new Dimension(30, 40));//set độ dài độ rộng của header
        mon_canhi_table.setRowHeight(40);
        mon_canhi_table.setGridColor(Color.GREEN);
        mon_canhi_table.setFillsViewportHeight(true);//hiển thị table     
        mon_canhi_table.setShowGrid(true);
        mon_canhi_table.getColumnModel().getColumn(0).setPreferredWidth(10);
        mon_canhi_table.getColumnModel().getColumn(1).setPreferredWidth(40);
        mon_canhi_table.getColumnModel().getColumn(2).setPreferredWidth(150);
        mon_canhi_table.getColumnModel().getColumn(3).setPreferredWidth(50);
        mon_canhi_table.getColumnModel().getColumn(4).setPreferredWidth(200);
    }
    
    public void ReadDateForPanel_1_2_3_4(){
        for (int i = 1; i <= 4; i++) {
            ReadDataForLoaiTableTemp(i);
            if(i == 1){
                khai_vi_table.setModel(modelMon);
            }
            if(i == 2){
                mon_nuoc_table.setModel(modelMon);
            }
            if(i == 3){
                mon_com_table.setModel(modelMon);
            }
            if(i == 4){
                mon_canhi_table.setModel(modelMon);
            }
        }
    }
    
    public void ReadDataForLoaiTableTemp(int i){     
        MonBUS mon_BUS = new MonBUS();
        try {
            mon_BUS.getDanhSachMonTheoMaLoai(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String header[] = {"STT","Mã món ăn","Tên món","Giá bán","Tình trạng"};
        modelMon = new DefaultTableModel(null, header);
        int temp= 1;
        for(MonDTO mon_DTO : MonBUS.danhSachMonTheoLoai){
            AddRowForMon(mon_DTO, temp);
            temp++;
        }
    }
    
    private void AddRowForMon(MonDTO mon_DTO, int temp) {
        Vector row = new Vector();
        row.add(temp);
        row.add(mon_DTO.getMaMon());
        row.add(mon_DTO.getTenMon());  
        row.add(mon_DTO.getGiaBan());
        row.add(mon_DTO.isTinhTrang()); 
        modelMon.addRow(row);
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabbed_pane = new javax.swing.JTabbedPane();
        mon_khai_vi_Panel_p1 = new javax.swing.JPanel();
        Search_JTF_p1 = new javax.swing.JTextField();
        Search_btn_p1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        khai_vi_table = new javax.swing.JTable();
        mon_nuoc_panel_p2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mon_nuoc_table = new javax.swing.JTable();
        Search_JTF_p2 = new javax.swing.JTextField();
        Search_btn_p2 = new javax.swing.JButton();
        mon_com_panel_p3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mon_com_table = new javax.swing.JTable();
        Search_JTF_p3 = new javax.swing.JTextField();
        Search_btn_p3 = new javax.swing.JButton();
        mon_canh_panel_p4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        mon_canhi_table = new javax.swing.JTable();
        Search_JTF_p4 = new javax.swing.JTextField();
        Search_btn_p4 = new javax.swing.JButton();

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

        tabbed_pane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbed_pane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbed_paneMouseClicked(evt);
            }
        });

        mon_khai_vi_Panel_p1.setBackground(new java.awt.Color(153, 204, 255));
        mon_khai_vi_Panel_p1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Search_JTF_p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_JTF_p1ActionPerformed(evt);
            }
        });

        Search_btn_p1.setText("Search");
        Search_btn_p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_btn_p1MouseClicked(evt);
            }
        });

        khai_vi_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã món ăn", "Tên món", "Giá bán", "Tình trạng"
            }
        ));
        khai_vi_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khai_vi_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(khai_vi_table);
        khai_vi_table.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout mon_khai_vi_Panel_p1Layout = new javax.swing.GroupLayout(mon_khai_vi_Panel_p1);
        mon_khai_vi_Panel_p1.setLayout(mon_khai_vi_Panel_p1Layout);
        mon_khai_vi_Panel_p1Layout.setHorizontalGroup(
            mon_khai_vi_Panel_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mon_khai_vi_Panel_p1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(mon_khai_vi_Panel_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(mon_khai_vi_Panel_p1Layout.createSequentialGroup()
                        .addComponent(Search_JTF_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search_btn_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 475, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mon_khai_vi_Panel_p1Layout.setVerticalGroup(
            mon_khai_vi_Panel_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mon_khai_vi_Panel_p1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(mon_khai_vi_Panel_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_JTF_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_btn_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        tabbed_pane.addTab("Khai vị", mon_khai_vi_Panel_p1);

        mon_nuoc_panel_p2.setBackground(new java.awt.Color(255, 102, 102));

        mon_nuoc_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã món ăn", "Tên món", "Giá bán", "Tình trạng"
            }
        ));
        mon_nuoc_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mon_nuoc_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mon_nuoc_table);

        Search_JTF_p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_JTF_p2ActionPerformed(evt);
            }
        });

        Search_btn_p2.setText("Search");
        Search_btn_p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_btn_p2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mon_nuoc_panel_p2Layout = new javax.swing.GroupLayout(mon_nuoc_panel_p2);
        mon_nuoc_panel_p2.setLayout(mon_nuoc_panel_p2Layout);
        mon_nuoc_panel_p2Layout.setHorizontalGroup(
            mon_nuoc_panel_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mon_nuoc_panel_p2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(mon_nuoc_panel_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(mon_nuoc_panel_p2Layout.createSequentialGroup()
                        .addComponent(Search_JTF_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search_btn_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 477, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mon_nuoc_panel_p2Layout.setVerticalGroup(
            mon_nuoc_panel_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mon_nuoc_panel_p2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(mon_nuoc_panel_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_JTF_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_btn_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
        );

        tabbed_pane.addTab("Món nước", mon_nuoc_panel_p2);

        mon_com_panel_p3.setBackground(new java.awt.Color(102, 255, 102));

        mon_com_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã món ăn", "Tên món", "Giá bán", "Tình trạng"
            }
        ));
        mon_com_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mon_com_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(mon_com_table);

        Search_JTF_p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_JTF_p3ActionPerformed(evt);
            }
        });

        Search_btn_p3.setText("Search");
        Search_btn_p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_btn_p3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mon_com_panel_p3Layout = new javax.swing.GroupLayout(mon_com_panel_p3);
        mon_com_panel_p3.setLayout(mon_com_panel_p3Layout);
        mon_com_panel_p3Layout.setHorizontalGroup(
            mon_com_panel_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mon_com_panel_p3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(mon_com_panel_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(mon_com_panel_p3Layout.createSequentialGroup()
                        .addComponent(Search_JTF_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search_btn_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 477, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mon_com_panel_p3Layout.setVerticalGroup(
            mon_com_panel_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mon_com_panel_p3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(mon_com_panel_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_JTF_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_btn_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
        );

        tabbed_pane.addTab("Món cơm", mon_com_panel_p3);

        mon_canh_panel_p4.setBackground(new java.awt.Color(102, 255, 255));

        mon_canhi_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã món ăn", "Tên món", "Giá bán", "Tình trạng"
            }
        ));
        mon_canhi_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mon_canhi_tableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(mon_canhi_table);

        Search_JTF_p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_JTF_p4ActionPerformed(evt);
            }
        });

        Search_btn_p4.setText("Search");
        Search_btn_p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_btn_p4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mon_canh_panel_p4Layout = new javax.swing.GroupLayout(mon_canh_panel_p4);
        mon_canh_panel_p4.setLayout(mon_canh_panel_p4Layout);
        mon_canh_panel_p4Layout.setHorizontalGroup(
            mon_canh_panel_p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mon_canh_panel_p4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(mon_canh_panel_p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(mon_canh_panel_p4Layout.createSequentialGroup()
                        .addComponent(Search_JTF_p4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search_btn_p4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 477, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mon_canh_panel_p4Layout.setVerticalGroup(
            mon_canh_panel_p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mon_canh_panel_p4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(mon_canh_panel_p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_JTF_p4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_btn_p4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
        );

        tabbed_pane.addTab("Món canh", mon_canh_panel_p4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbed_pane))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(tabbed_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void Search_JTF_p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_JTF_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_JTF_p1ActionPerformed

    private void khai_vi_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khai_vi_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_khai_vi_tableMouseClicked

    private void tabbed_paneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbed_paneMouseClicked
        // select the last tab
//        tabbed_pane.setSelectedIndex(tabbed_pane.getTabCount()-1);
//        System.out.println("New Index:" + tabbed_pane.getSelectedIndex());
    }//GEN-LAST:event_tabbed_paneMouseClicked

    private void mon_nuoc_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mon_nuoc_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mon_nuoc_tableMouseClicked

    private void Search_JTF_p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_JTF_p2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_JTF_p2ActionPerformed

    private void mon_com_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mon_com_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mon_com_tableMouseClicked

    private void Search_JTF_p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_JTF_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_JTF_p3ActionPerformed

    private void mon_canhi_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mon_canhi_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mon_canhi_tableMouseClicked

    private void Search_JTF_p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_JTF_p4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_JTF_p4ActionPerformed

    private void Search_btn_p4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_btn_p4MouseClicked
        SeachForAll(Search_JTF_p4);
    }//GEN-LAST:event_Search_btn_p4MouseClicked

    private void Search_btn_p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_btn_p1MouseClicked
        SeachForAll(Search_JTF_p1);
    }//GEN-LAST:event_Search_btn_p1MouseClicked

    private void Search_btn_p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_btn_p2MouseClicked
        SeachForAll(Search_JTF_p2);
    }//GEN-LAST:event_Search_btn_p2MouseClicked

    private void Search_btn_p3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_btn_p3MouseClicked
        SeachForAll(Search_JTF_p3);
    }//GEN-LAST:event_Search_btn_p3MouseClicked

    public void SeachForAll(JTextField temp_JTF){
        if(temp_JTF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Có vẻ như bạn chưa nhập gì cả!!");
        }else{
            String temp = temp_JTF.getText();
            modelMon.setRowCount(0);
            int stt = 1;
            System.out.println(" " +MonBUS.TimKiemALL(temp).size() );
            try {
                for (int i =0; i < MonBUS.TimKiemALL(temp).size();i++) {
                    System.out.println("1");
                    AddRowForMon(MonBUS.TimKiemALL(temp).get(i), stt);
                    stt++;
                }
            } catch (Exception e) {
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search_JTF_p1;
    private javax.swing.JTextField Search_JTF_p2;
    private javax.swing.JTextField Search_JTF_p3;
    private javax.swing.JTextField Search_JTF_p4;
    private javax.swing.JButton Search_btn_p1;
    private javax.swing.JButton Search_btn_p2;
    private javax.swing.JButton Search_btn_p3;
    private javax.swing.JButton Search_btn_p4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable khai_vi_table;
    private javax.swing.JPanel mon_canh_panel_p4;
    private javax.swing.JTable mon_canhi_table;
    private javax.swing.JPanel mon_com_panel_p3;
    private javax.swing.JTable mon_com_table;
    private javax.swing.JPanel mon_khai_vi_Panel_p1;
    private javax.swing.JPanel mon_nuoc_panel_p2;
    private javax.swing.JTable mon_nuoc_table;
    private javax.swing.JTabbedPane tabbed_pane;
    // End of variables declaration//GEN-END:variables
}
