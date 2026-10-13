/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import database.DBConnection;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Component;

public class notifications extends javax.swing.JFrame {

    private static int studentId;
private static String  studentName;
    public notifications(int studentId, String studentName)  {
          this.studentId = studentId;
          
        initComponents();
        
      pnlNotifications.setLayout(new javax.swing.BoxLayout(
        pnlNotifications,
        javax.swing.BoxLayout.Y_AXIS));
       loadNotifications();
    }
private void loadNotifications() {
    card1.setVisible(false);
    card2.setVisible(false);
    card3.setVisible(false);
    card4.setVisible(false);

    try {

        ResultSet rs = DBConnection.getNotifications(studentId);

        while (rs.next()) {

            String message = rs.getString("message");
            String status = rs.getString("status");
            String date = rs.getTimestamp("created_at").toString();

            if (message.toLowerCase().contains("approved")) {

                card1.setVisible(true);

                lblicon.setText(message);
                lblTittle.setText(status);
                lblicon1.setText(date);

            }

            else if (message.toLowerCase().contains("rejected")) {

                card2.setVisible(true);

                lblicon3.setText(message);
                lblTittle1.setText(status);
                lblicon4.setText(date);

            }

            else if (message.toLowerCase().contains("collection")) {

                card3.setVisible(true);

                lblMessage.setText(message);
                lblTittle2.setText(status);

            }

            else if (message.toLowerCase().contains("return")) {

                card4.setVisible(true);

                lblicon12.setText(message);
                lblTittle3.setText(status);
                lbldate.setText(date);

            }

        }

    } catch (SQLException ex) {
        ex.printStackTrace();
    }


}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplMain = new javax.swing.JPanel();
        jpnlMain = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlNotifications = new javax.swing.JPanel();
        card1 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lblTittle = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        lblicon2 = new javax.swing.JLabel();
        card3 = new javax.swing.JPanel();
        lblTittle2 = new javax.swing.JLabel();
        card2 = new javax.swing.JPanel();
        lblicon3 = new javax.swing.JLabel();
        lblTittle1 = new javax.swing.JLabel();
        lblicon4 = new javax.swing.JLabel();
        lblicon5 = new javax.swing.JLabel();
        card4 = new javax.swing.JPanel();
        lblicon9 = new javax.swing.JLabel();
        lblTittle3 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lblicon11 = new javax.swing.JLabel();
        lblicon12 = new javax.swing.JLabel();
        card5 = new javax.swing.JPanel();
        lblicon10 = new javax.swing.JLabel();
        lblTittle4 = new javax.swing.JLabel();
        lbldate1 = new javax.swing.JLabel();
        lblicon13 = new javax.swing.JLabel();
        lblicon14 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplMain.setBackground(new java.awt.Color(0, 0, 102));
        jplMain.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "my history", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jpnlMain.setBackground(new java.awt.Color(255, 255, 255));
        jpnlMain.setMaximumSize(new java.awt.Dimension(1004, 1214));

        jButton5.setText("view Details");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));

        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBack1.setText("Refresh");
        btnBack1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack1.setBorderPainted(false);
        btnBack1.setContentAreaFilled(false);
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jButton8.setText("Refresh");
        jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icons8-bell-50.png"))); // NOI18N
        jLabel2.setText("Stay updated with your latest alerts  ");

        jButton10.setText("close");
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Mark read");
        jButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("My Notifications");

        pnlNotifications.setBackground(new java.awt.Color(255, 255, 255));

        card1.setBackground(new java.awt.Color(0, 153, 0));
        card1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                card1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblicon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblicon.setText("Your laptop loan request has been approved.");

        lblTittle.setText("Unread");

        lblicon1.setText("06 Jul 2026");

        lblicon2.setText("Loan approved");

        javax.swing.GroupLayout card1Layout = new javax.swing.GroupLayout(card1);
        card1.setLayout(card1Layout);
        card1Layout.setHorizontalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTittle)
                .addGap(61, 61, 61))
            .addGroup(card1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblicon)
                    .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        card1Layout.setVerticalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1Layout.createSequentialGroup()
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblicon2)
                    .addComponent(lblTittle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblicon)
                .addGap(18, 18, 18)
                .addComponent(lblicon1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblTittle2.setText("Unread");

        javax.swing.GroupLayout card3Layout = new javax.swing.GroupLayout(card3);
        card3.setLayout(card3Layout);
        card3Layout.setHorizontalGroup(
            card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card3Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(lblTittle2)
                .addGap(87, 87, 87))
        );
        card3Layout.setVerticalGroup(
            card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card3Layout.createSequentialGroup()
                .addComponent(lblTittle2)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        card2.setBackground(new java.awt.Color(204, 0, 0));

        lblicon3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblicon3.setText(" Unfortunately your request has been rejected.");

        lblTittle1.setText("Unread");

        lblicon4.setText("06 Jul 2026");

        lblicon5.setText("Loan Rejected ");

        javax.swing.GroupLayout card2Layout = new javax.swing.GroupLayout(card2);
        card2.setLayout(card2Layout);
        card2Layout.setHorizontalGroup(
            card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTittle1)
                .addContainerGap())
            .addGroup(card2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblicon3)
                    .addComponent(lblicon4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        card2Layout.setVerticalGroup(
            card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card2Layout.createSequentialGroup()
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblicon5)
                    .addGroup(card2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTittle1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblicon3)
                .addGap(18, 18, 18)
                .addComponent(lblicon4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        card4.setBackground(new java.awt.Color(102, 102, 102));

        lblTittle3.setText("Unread");

        lbldate.setText("06 Jul 2026");

        lblicon11.setText("Return reminder ");

        lblicon12.setText("Please return before 15 July");

        javax.swing.GroupLayout card4Layout = new javax.swing.GroupLayout(card4);
        card4.setLayout(card4Layout);
        card4Layout.setHorizontalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon11, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTittle3)
                .addGap(38, 38, 38))
            .addGroup(card4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblicon12)
                    .addComponent(lblicon9)
                    .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        card4Layout.setVerticalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card4Layout.createSequentialGroup()
                .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblicon11)
                    .addComponent(lblTittle3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblicon9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblicon12)
                .addGap(10, 10, 10)
                .addComponent(lbldate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        card5.setBackground(new java.awt.Color(255, 153, 0));

        lblTittle4.setText("Unread");

        lbldate1.setText("06 Jul 2026");

        lblicon13.setText("Ready for collection");

        lblicon14.setText("Please return before 15 July");

        lblMessage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMessage.setText("Collect your laptop from ICT Office.");

        javax.swing.GroupLayout card5Layout = new javax.swing.GroupLayout(card5);
        card5.setLayout(card5Layout);
        card5Layout.setHorizontalGroup(
            card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon13, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTittle4)
                .addGap(50, 50, 50))
            .addGroup(card5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage)
                    .addGroup(card5Layout.createSequentialGroup()
                        .addComponent(lblicon10)
                        .addGap(18, 18, 18)
                        .addComponent(lblicon14))
                    .addComponent(lbldate1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        card5Layout.setVerticalGroup(
            card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card5Layout.createSequentialGroup()
                .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card5Layout.createSequentialGroup()
                        .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblicon13)
                            .addComponent(lblTittle4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblicon10)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card5Layout.createSequentialGroup()
                        .addComponent(lblicon14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldate1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlNotificationsLayout = new javax.swing.GroupLayout(pnlNotifications);
        pnlNotifications.setLayout(pnlNotificationsLayout);
        pnlNotificationsLayout.setHorizontalGroup(
            pnlNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotificationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlNotificationsLayout.setVerticalGroup(
            pnlNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotificationsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNotificationsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(pnlNotificationsLayout.createSequentialGroup()
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jpnlMainLayout = new javax.swing.GroupLayout(jpnlMain);
        jpnlMain.setLayout(jpnlMainLayout);
        jpnlMainLayout.setHorizontalGroup(
            jpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(243, 243, 243))
            .addGroup(jpnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(781, Short.MAX_VALUE))
            .addGroup(jpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnlMainLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jButton5)
                    .addGap(27, 27, 27)
                    .addComponent(btnBack)
                    .addGap(55, 55, 55)
                    .addComponent(jButton10)
                    .addGap(30, 30, 30)
                    .addComponent(btnBack1)
                    .addGap(46, 46, 46)
                    .addComponent(jButton11)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jpnlMainLayout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(pnlNotifications, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpnlMainLayout.setVerticalGroup(
            jpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlMainLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addGroup(jpnlMainLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(pnlNotifications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton11)
                        .addComponent(btnBack1)
                        .addComponent(jButton10)
                        .addComponent(btnBack))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1244, Short.MAX_VALUE))
        );

        jButton3.setBackground(new java.awt.Color(0, 102, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icons8-bell-50.png"))); // NOI18N
        jButton3.setText("Notifications");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icons8-history-folder-50.png"))); // NOI18N
        jButton2.setText(" My history");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icons8-profile-50.png"))); // NOI18N
        jButton1.setText("Profile");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icons8-logout-50.png"))); // NOI18N
        jButton4.setText("Logout");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 102));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icons8-resume-50.png"))); // NOI18N
        jButton7.setText("Request laptop");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 102));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icons8-bar-chart-24.png"))); // NOI18N
        jButton6.setText("Reports");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 0, 102));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icons8-home-50.png"))); // NOI18N
        jButton12.setText("Dashboard");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplMainLayout = new javax.swing.GroupLayout(jplMain);
        jplMain.setLayout(jplMainLayout);
        jplMainLayout.setHorizontalGroup(
            jplMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplMainLayout.createSequentialGroup()
                .addGroup(jplMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jplMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jplMainLayout.createSequentialGroup()
                                .addGroup(jplMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jplMainLayout.createSequentialGroup()
                        .addGroup(jplMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplMainLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton2))
                            .addGroup(jplMainLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jplMainLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jplMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 225, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jplMainLayout.setVerticalGroup(
            jplMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplMainLayout.createSequentialGroup()
                .addGroup(jplMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplMainLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jplMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jplMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     notifications nf = new notifications( studentId,studentName);

    nf.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();

    new log().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StudentDashboard dashboard = new StudentDashboard(studentName,studentId);
        dashboard.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      new laptopRequests().setVisible(true);
             this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          this.dispose();
    new Reports().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void card1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_card1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_card1AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.dispose();
    new adminDashboard1().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {

            // Replace 202309 with a valid student ID for testing
            new notifications(studentId,studentName).setVisible(true);

        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JPanel card3;
    private javax.swing.JPanel card4;
    private javax.swing.JPanel card5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jplMain;
    private javax.swing.JPanel jpnlMain;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JLabel lblTittle1;
    private javax.swing.JLabel lblTittle2;
    private javax.swing.JLabel lblTittle3;
    private javax.swing.JLabel lblTittle4;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldate1;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblicon10;
    private javax.swing.JLabel lblicon11;
    private javax.swing.JLabel lblicon12;
    private javax.swing.JLabel lblicon13;
    private javax.swing.JLabel lblicon14;
    private javax.swing.JLabel lblicon2;
    private javax.swing.JLabel lblicon3;
    private javax.swing.JLabel lblicon4;
    private javax.swing.JLabel lblicon5;
    private javax.swing.JLabel lblicon9;
    private javax.swing.JPanel pnlNotifications;
    // End of variables declaration//GEN-END:variables

  

   
}
