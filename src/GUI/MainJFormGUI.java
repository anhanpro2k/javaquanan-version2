/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author anhanpro2k
 */
public class MainJFormGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainJFormGUI
     */
    public MainJFormGUI() {
        initComponents();
        setEvent();
        setTitle("QUẢN LÝ QUÁN ĂN");
    }
    
    
    
    private void setEvent() {
        
        JPanel node = new HoaDonPanel();
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(node);
                jpnRoot.validate();
                jpnRoot.repaint();
        
        // Them su kien chuyen pannel cho nut App
        jlbApp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jpnApp.setBackground(new Color(0,136,212));
               
                
                JPanel node = new AppPanel();
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(node);
                jpnRoot.validate();
                jpnRoot.repaint();
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jpnApp.setBackground(new Color(8,166,255));
                
               
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jpnApp.setBackground(new Color(0,146,229));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jpnApp.setBackground(new Color(25,172,255));
            }
        });
        
        
        // Panel Nhan Vien
        jlbNhanVien.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jpnNhanVien.setBackground(new Color(0,136,212));
               
                
                JPanel node = new NhanVienPanel();
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(node);
                jpnRoot.validate();
                jpnRoot.repaint();
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jpnNhanVien.setBackground(new Color(8,166,255));
                
               
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jpnNhanVien.setBackground(new Color(0,146,229));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jpnNhanVien.setBackground(new Color(25,172,255));
            }
        });
        
        
        // Panel Menu
        jlbMenu.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jlbMenu.setBackground(new Color(0,136,212));
               
                
                JPanel node = new MenuPanel();
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(node);
                jpnRoot.validate();
                jpnRoot.repaint();
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jpnMenu.setBackground(new Color(8,166,255));
                
               
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jpnMenu.setBackground(new Color(0,146,229));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jpnMenu.setBackground(new Color(25,172,255));
            }
        });
        
        
        
        // Panel Loai Mon
        jlbLoaiMon.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jlbLoaiMon.setBackground(new Color(0,136,212));
               
                
                JPanel node = new LoaiMonPanel();
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(node);
                jpnRoot.validate();
                jpnRoot.repaint();
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jlbLoaiMon.setBackground(new Color(8,166,255));
                
               
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jlbLoaiMon.setBackground(new Color(0,146,229));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jlbLoaiMon.setBackground(new Color(25,172,255));
            }
        });
        
        
        //Panel Nhap Hang
        jlbNhapHang.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jpnNhapHang.setBackground(new Color(0,136,212));
               
                
                JPanel node = new NhapHangPanel();
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(node);
                jpnRoot.validate();
                jpnRoot.repaint();
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jpnNhapHang.setBackground(new Color(8,166,255));
                
               
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jpnNhapHang.setBackground(new Color(0,146,229));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jpnNhapHang.setBackground(new Color(25,172,255));
            }
        });
        
        
        
        
        
        //Panel thong ke
        
        jlbThongKe.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jpnThongKe.setBackground(new Color(0,136,212));
               
                
                JPanel node = new ThongKePanel();
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(node);
                jpnRoot.validate();
                jpnRoot.repaint();
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jpnThongKe.setBackground(new Color(8,166,255));
                
               
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jpnThongKe.setBackground(new Color(0,146,229));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jpnThongKe.setBackground(new Color(25,172,255));
            }
        });
        
        
        
        // Them su kien chuyen panel cho nut Don Hang
        jlbHoaDon.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jpnHoaDon.setBackground(new Color(0,136,212));
               
                
                JPanel node = new HoaDonPanel();
                jpnRoot.removeAll();
                jpnRoot.setLayout(new BorderLayout());
                jpnRoot.add(node);
                jpnRoot.validate();
                jpnRoot.repaint();
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jpnHoaDon.setBackground(new Color(8,166,255));
                
               
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jpnHoaDon.setBackground(new Color(0,146,229));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jpnHoaDon.setBackground(new Color(25,172,255));
            }
        });
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnHoaDon = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlbHoaDon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jpnMenu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jlbMenu = new javax.swing.JLabel();
        jpnApp = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jlbApp = new javax.swing.JLabel();
        jpnNhanVien = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jlbNhanVien = new javax.swing.JLabel();
        jpnNhapHang = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jlbNhapHang = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jlbThongKe = new javax.swing.JLabel();
        jpnLoaiMon = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jlbLoaiMon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jpnRoot = new javax.swing.JPanel();
        jlbHello = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(178, 227, 255));

        jPanel4.setBackground(new java.awt.Color(0, 124, 195));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-restaurant.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ QUÁN ĂN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jpnHoaDon.setBackground(new java.awt.Color(25, 172, 255));
        jpnHoaDon.setPreferredSize(new java.awt.Dimension(244, 50));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-purchase_order.png"))); // NOI18N

        jlbHoaDon.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jlbHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoaDon.setText("    Hóa Đơn");

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
        );
        jpnHoaDonLayout.setVerticalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-user.png"))); // NOI18N
        jLabel2.setText("Tên Nhân Viên:");

        jLabel3.setText("username");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-map_pin.png"))); // NOI18N
        jLabel4.setText("Chức vụ: ");

        jLabel5.setText("Role");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 124, 195));
        jButton1.setText("Đăng Xuất");

        jpnMenu.setBackground(new java.awt.Color(25, 172, 255));
        jpnMenu.setPreferredSize(new java.awt.Dimension(244, 50));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-restaurant_menu.png"))); // NOI18N

        jlbMenu.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jlbMenu.setForeground(new java.awt.Color(255, 255, 255));
        jlbMenu.setText("        Menu");

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addComponent(jlbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnApp.setBackground(new java.awt.Color(25, 172, 255));
        jpnApp.setPreferredSize(new java.awt.Dimension(244, 50));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-touchscreen.png"))); // NOI18N

        jlbApp.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jlbApp.setForeground(new java.awt.Color(255, 255, 255));
        jlbApp.setText("         App");

        javax.swing.GroupLayout jpnAppLayout = new javax.swing.GroupLayout(jpnApp);
        jpnApp.setLayout(jpnAppLayout);
        jpnAppLayout.setHorizontalGroup(
            jpnAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAppLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jlbApp, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnAppLayout.setVerticalGroup(
            jpnAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnAppLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
            .addComponent(jlbApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnNhanVien.setBackground(new java.awt.Color(25, 172, 255));
        jpnNhanVien.setPreferredSize(new java.awt.Dimension(244, 50));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-teamwork.png"))); // NOI18N

        jlbNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jlbNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhanVien.setText("     Nhân Viên");

        javax.swing.GroupLayout jpnNhanVienLayout = new javax.swing.GroupLayout(jpnNhanVien);
        jpnNhanVien.setLayout(jpnNhanVienLayout);
        jpnNhanVienLayout.setHorizontalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnNhanVienLayout.setVerticalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jlbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnNhapHang.setBackground(new java.awt.Color(25, 172, 255));
        jpnNhapHang.setPreferredSize(new java.awt.Dimension(244, 50));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-product.png"))); // NOI18N

        jlbNhapHang.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jlbNhapHang.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhapHang.setText("    Nhập Hàng");

        javax.swing.GroupLayout jpnNhapHangLayout = new javax.swing.GroupLayout(jpnNhapHang);
        jpnNhapHang.setLayout(jpnNhapHangLayout);
        jpnNhapHangLayout.setHorizontalGroup(
            jpnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhapHangLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
        );
        jpnNhapHangLayout.setVerticalGroup(
            jpnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhapHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jlbNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnThongKe.setBackground(new java.awt.Color(25, 172, 255));
        jpnThongKe.setPreferredSize(new java.awt.Dimension(244, 50));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-statistics.png"))); // NOI18N

        jlbThongKe.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jlbThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKe.setText("      Thống Kê");

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jlbThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnLoaiMon.setBackground(new java.awt.Color(25, 172, 255));
        jpnLoaiMon.setPreferredSize(new java.awt.Dimension(244, 50));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-purchase_order.png"))); // NOI18N

        jlbLoaiMon.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jlbLoaiMon.setForeground(new java.awt.Color(255, 255, 255));
        jlbLoaiMon.setText("       Loại Món");

        javax.swing.GroupLayout jpnLoaiMonLayout = new javax.swing.GroupLayout(jpnLoaiMon);
        jpnLoaiMon.setLayout(jpnLoaiMonLayout);
        jpnLoaiMonLayout.setHorizontalGroup(
            jpnLoaiMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLoaiMonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbLoaiMon, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
        );
        jpnLoaiMonLayout.setVerticalGroup(
            jpnLoaiMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLoaiMonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
            .addComponent(jlbLoaiMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnApp, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jpnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jpnLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jpnApp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jpnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -7, 300, 730));

        jpnRoot.setBackground(new java.awt.Color(255, 255, 255));

        jlbHello.setBackground(new java.awt.Color(144, 215, 255));
        jlbHello.setText("Giao diện chính");

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jlbHello)
                .addContainerGap(774, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlbHello)
                .addContainerGap(687, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainJFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFormGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbApp;
    private javax.swing.JLabel jlbHello;
    private javax.swing.JLabel jlbHoaDon;
    private javax.swing.JLabel jlbLoaiMon;
    private javax.swing.JLabel jlbMenu;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel jlbNhapHang;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JPanel jpnApp;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnLoaiMon;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnNhapHang;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnThongKe;
    // End of variables declaration//GEN-END:variables
}
