/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calmstreetcoffeshop;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.lang.System.Logger;
import static java.nio.file.Files.lines;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 21654
 */
public class TabelsAndOrders extends javax.swing.JFrame {

    Connect cnx = new Connect();
    Statement st;
    Timer timer;

    public TabelsAndOrders() {
        initComponents();
        Icon();
        setheader();
        disable_menue();
        //get_ticket_number ();
        update_ticket_btn.setEnabled(false);
        update_ticket_btn.setVisible(false);
        remove_ticket_btn.setEnabled(false);
        remove_ticket_btn.setVisible(false);
        jButton26.setEnabled(false);
        jButton26.setVisible(false);
        ticket_num.setVisible(true);
        jDateChooser1.setVisible(false);
        waiters.setVisible(false);
        waiters.setEnabled(false);
        ticketNoLabel.setVisible(false);bill_id.setVisible(false);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //time
                Date date = new Date();
                DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                String time = timeFormat.format(date);
                time_label.setText(time);
                //date
                Date date2 = new Date();
                DateFormat timeFormat2 = new SimpleDateFormat("dd-MM-yyyy");
                String time2 = timeFormat2.format(date2);
                date_label.setText(time2);
            }
        };
        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        date_label = new javax.swing.JLabel();
        time_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton18 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        waiter = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        pass_waiter = new javax.swing.JPasswordField();
        jButton20 = new javax.swing.JButton();
        iddrink = new javax.swing.JLabel();
        price_txt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        capucino = new javax.swing.JButton();
        express = new javax.swing.JButton();
        cafe_turc = new javax.swing.JButton();
        capucin = new javax.swing.JButton();
        cafe_creme = new javax.swing.JButton();
        american = new javax.swing.JButton();
        express_special = new javax.swing.JButton();
        capucin_special = new javax.swing.JButton();
        creme_special = new javax.swing.JButton();
        chocolat_lait = new javax.swing.JButton();
        chocolat_chaud = new javax.swing.JButton();
        citronade = new javax.swing.JButton();
        orange = new javax.swing.JButton();
        banane = new javax.swing.JButton();
        fraise = new javax.swing.JButton();
        citronade_amandes = new javax.swing.JButton();
        cocktail_fruits = new javax.swing.JButton();
        milkshake = new javax.swing.JButton();
        chocolat = new javax.swing.JButton();
        orio = new javax.swing.JButton();
        cookie = new javax.swing.JButton();
        the_menthe = new javax.swing.JButton();
        the_amande = new javax.swing.JButton();
        infusion = new javax.swing.JButton();
        crepe_suree = new javax.swing.JButton();
        crepe_salee = new javax.swing.JButton();
        guaffre_sucree = new javax.swing.JButton();
        hookah_love = new javax.swing.JButton();
        hookah_apple = new javax.swing.JButton();
        hookah_menthos = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        menue = new javax.swing.JLabel();
        drink_num = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        update_order_btn = new javax.swing.JButton();
        remove_order_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticket = new javax.swing.JTextArea();
        Gateau = new javax.swing.JButton();
        gateau_spetial = new javax.swing.JButton();
        croissant = new javax.swing.JButton();
        cake = new javax.swing.JButton();
        water1l = new javax.swing.JButton();
        watermini = new javax.swing.JButton();
        logged_in = new javax.swing.JLabel();
        label_drink = new javax.swing.JLabel();
        label_qte = new javax.swing.JLabel();
        total_lab = new javax.swing.JLabel();
        total_ticket_label = new javax.swing.JLabel();
        tot_ticket = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_ticket = new javax.swing.JTable();
        jwajem = new javax.swing.JButton();
        jwajem_calm = new javax.swing.JButton();
        coke = new javax.swing.JButton();
        fanta = new javax.swing.JButton();
        orangina = new javax.swing.JButton();
        kamthari = new javax.swing.JButton();
        waiter_logged_in = new javax.swing.JLabel();
        ticket_num = new javax.swing.JLabel();
        ticketNoLabel = new javax.swing.JLabel();
        bill_id = new javax.swing.JTextField();
        update_ticket_btn = new javax.swing.JButton();
        remove_ticket_btn = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        waiters = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calm Street Coffeeshop - Main page -POS developed by Bouzidi Imed - Whatsapp: 54058988");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        date_label.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        date_label.setForeground(new java.awt.Color(255, 255, 255));
        date_label.setText("Date");

        time_label.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        time_label.setForeground(new java.awt.Color(255, 255, 255));
        time_label.setText("time");

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calm Street Coffeeshop");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tables and drinks");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Admin login");

        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Admin password");

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setForeground(new java.awt.Color(0, 0, 0));
        jButton17.setText("Connect");
        jButton17.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setText("Disconnect");
        jButton18.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Admin dashboard");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(119, 119, 119))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Waiter user name");

        waiter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                waiterFocusLost(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Waiter password");

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setForeground(new java.awt.Color(0, 0, 0));
        jButton19.setText("Connect");
        jButton19.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setForeground(new java.awt.Color(0, 0, 0));
        jButton20.setText("Disconnect");
        jButton20.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(waiter, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_waiter, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(waiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(pass_waiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        iddrink.setForeground(new java.awt.Color(255, 255, 255));
        iddrink.setText("jLabel4");

        price_txt.setText("jTextField2");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Create admin account");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iddrink, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(date_label)
                                        .addComponent(time_label))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel25)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(iddrink, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(30, 30, 30))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Menue");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\21654\\Documents\\NetBeansProjects\\CalmStreetCoffeshop\\icons\\icons8-café-48.png")); // NOI18N
        jButton1.setText("Cafés");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-orange-juice-50.png"))); // NOI18N
        jButton2.setText("Jus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-crepe-60.png"))); // NOI18N
        jButton3.setText("Crépes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-thé-50.png"))); // NOI18N
        jButton4.setText("Thé");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 0, 0));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-croissant-50.png"))); // NOI18N
        jButton21.setText("Délice");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-modern-hookah-50.png"))); // NOI18N
        jButton5.setText("Hookah");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 0, 0));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-soda-bottle-48.png"))); // NOI18N
        jButton23.setText("Soda");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 0, 0));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-bottle-of-water-50.png"))); // NOI18N
        jButton24.setText("Eau minéral");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(255, 255, 255));
        jButton31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 0, 0));
        jButton31.setText("Jwajem");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jDesktopPane1.setBackground(new java.awt.Color(25, 70, 110));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        capucino.setBackground(new java.awt.Color(255, 255, 255));
        capucino.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        capucino.setForeground(new java.awt.Color(0, 0, 0));
        capucino.setText("Capucino");
        capucino.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        capucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capucinoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(capucino);
        capucino.setBounds(10, 320, 210, 100);

        express.setBackground(new java.awt.Color(255, 255, 255));
        express.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        express.setForeground(new java.awt.Color(0, 0, 0));
        express.setText("Express");
        express.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        express.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expressActionPerformed(evt);
            }
        });
        jDesktopPane1.add(express);
        express.setBounds(230, 90, 220, 100);

        cafe_turc.setBackground(new java.awt.Color(255, 255, 255));
        cafe_turc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cafe_turc.setForeground(new java.awt.Color(0, 0, 0));
        cafe_turc.setText("Café turc");
        cafe_turc.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        cafe_turc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafe_turcActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cafe_turc);
        cafe_turc.setBounds(10, 90, 210, 100);

        capucin.setBackground(new java.awt.Color(255, 255, 255));
        capucin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        capucin.setForeground(new java.awt.Color(0, 0, 0));
        capucin.setText("Capucin");
        capucin.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        capucin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capucinActionPerformed(evt);
            }
        });
        jDesktopPane1.add(capucin);
        capucin.setBounds(460, 90, 210, 100);

        cafe_creme.setBackground(new java.awt.Color(255, 255, 255));
        cafe_creme.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cafe_creme.setForeground(new java.awt.Color(0, 0, 0));
        cafe_creme.setText("Café créme");
        cafe_creme.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        cafe_creme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafe_cremeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cafe_creme);
        cafe_creme.setBounds(230, 440, 220, 100);

        american.setBackground(new java.awt.Color(255, 255, 255));
        american.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        american.setForeground(new java.awt.Color(0, 0, 0));
        american.setText("Américan");
        american.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        american.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanActionPerformed(evt);
            }
        });
        jDesktopPane1.add(american);
        american.setBounds(10, 440, 210, 100);

        express_special.setBackground(new java.awt.Color(255, 255, 255));
        express_special.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        express_special.setForeground(new java.awt.Color(0, 0, 0));
        express_special.setText("Express spécial");
        express_special.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        express_special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                express_specialActionPerformed(evt);
            }
        });
        jDesktopPane1.add(express_special);
        express_special.setBounds(10, 210, 210, 100);

        capucin_special.setBackground(new java.awt.Color(255, 255, 255));
        capucin_special.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        capucin_special.setForeground(new java.awt.Color(0, 0, 0));
        capucin_special.setText("Capucin spécial");
        capucin_special.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        capucin_special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capucin_specialActionPerformed(evt);
            }
        });
        jDesktopPane1.add(capucin_special);
        capucin_special.setBounds(230, 210, 220, 100);

        creme_special.setBackground(new java.awt.Color(255, 255, 255));
        creme_special.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        creme_special.setForeground(new java.awt.Color(0, 0, 0));
        creme_special.setText("Café créme spécial");
        creme_special.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        creme_special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creme_specialActionPerformed(evt);
            }
        });
        jDesktopPane1.add(creme_special);
        creme_special.setBounds(460, 210, 210, 100);

        chocolat_lait.setBackground(new java.awt.Color(255, 255, 255));
        chocolat_lait.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chocolat_lait.setForeground(new java.awt.Color(0, 0, 0));
        chocolat_lait.setText("Chocolat au lait");
        chocolat_lait.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        chocolat_lait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolat_laitActionPerformed(evt);
            }
        });
        jDesktopPane1.add(chocolat_lait);
        chocolat_lait.setBounds(230, 320, 220, 100);

        chocolat_chaud.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chocolat_chaud.setForeground(new java.awt.Color(0, 0, 0));
        chocolat_chaud.setText("Chocolat chaud ");
        chocolat_chaud.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        chocolat_chaud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolat_chaudActionPerformed(evt);
            }
        });
        jDesktopPane1.add(chocolat_chaud);
        chocolat_chaud.setBounds(460, 320, 210, 100);

        citronade.setBackground(new java.awt.Color(255, 255, 255));
        citronade.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        citronade.setForeground(new java.awt.Color(0, 0, 0));
        citronade.setText("Citronade");
        citronade.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        citronade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citronadeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(citronade);
        citronade.setBounds(10, 90, 210, 100);

        orange.setBackground(new java.awt.Color(255, 255, 255));
        orange.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        orange.setForeground(new java.awt.Color(0, 0, 0));
        orange.setText("Orange");
        orange.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(orange);
        orange.setBounds(230, 90, 220, 100);

        banane.setBackground(new java.awt.Color(255, 255, 255));
        banane.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        banane.setForeground(new java.awt.Color(0, 0, 0));
        banane.setText("Banane");
        banane.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        banane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(banane);
        banane.setBounds(460, 90, 210, 100);

        fraise.setBackground(new java.awt.Color(255, 255, 255));
        fraise.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fraise.setForeground(new java.awt.Color(0, 0, 0));
        fraise.setText("Fraise");
        fraise.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        fraise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fraiseActionPerformed(evt);
            }
        });
        jDesktopPane1.add(fraise);
        fraise.setBounds(10, 210, 210, 100);

        citronade_amandes.setBackground(new java.awt.Color(255, 255, 255));
        citronade_amandes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        citronade_amandes.setForeground(new java.awt.Color(0, 0, 0));
        citronade_amandes.setText("Citronade amandes");
        citronade_amandes.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        citronade_amandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citronade_amandesActionPerformed(evt);
            }
        });
        jDesktopPane1.add(citronade_amandes);
        citronade_amandes.setBounds(230, 210, 220, 100);

        cocktail_fruits.setBackground(new java.awt.Color(255, 255, 255));
        cocktail_fruits.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cocktail_fruits.setForeground(new java.awt.Color(0, 0, 0));
        cocktail_fruits.setText("Cocktail");
        cocktail_fruits.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        cocktail_fruits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocktail_fruitsActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cocktail_fruits);
        cocktail_fruits.setBounds(460, 210, 210, 100);

        milkshake.setBackground(new java.awt.Color(255, 255, 255));
        milkshake.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        milkshake.setForeground(new java.awt.Color(0, 0, 0));
        milkshake.setText("Milkshake");
        milkshake.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        milkshake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milkshakeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(milkshake);
        milkshake.setBounds(10, 320, 210, 100);

        chocolat.setBackground(new java.awt.Color(255, 255, 255));
        chocolat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chocolat.setForeground(new java.awt.Color(0, 0, 0));
        chocolat.setText("Chocolat");
        chocolat.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        chocolat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolatActionPerformed(evt);
            }
        });
        jDesktopPane1.add(chocolat);
        chocolat.setBounds(230, 320, 220, 100);

        orio.setBackground(new java.awt.Color(255, 255, 255));
        orio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        orio.setForeground(new java.awt.Color(0, 0, 0));
        orio.setText("Orio");
        orio.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        orio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orioActionPerformed(evt);
            }
        });
        jDesktopPane1.add(orio);
        orio.setBounds(460, 320, 210, 100);

        cookie.setBackground(new java.awt.Color(255, 255, 255));
        cookie.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cookie.setForeground(new java.awt.Color(0, 0, 0));
        cookie.setText("Cookies");
        cookie.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        cookie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cookie);
        cookie.setBounds(10, 440, 210, 100);

        the_menthe.setBackground(new java.awt.Color(255, 255, 255));
        the_menthe.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        the_menthe.setForeground(new java.awt.Color(0, 0, 0));
        the_menthe.setText("Thé menthe");
        the_menthe.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        the_menthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                the_mentheActionPerformed(evt);
            }
        });
        jDesktopPane1.add(the_menthe);
        the_menthe.setBounds(10, 90, 210, 100);

        the_amande.setBackground(new java.awt.Color(255, 255, 255));
        the_amande.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        the_amande.setForeground(new java.awt.Color(0, 0, 0));
        the_amande.setText("Thé au amandes");
        the_amande.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        the_amande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                the_amandeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(the_amande);
        the_amande.setBounds(230, 90, 220, 100);

        infusion.setBackground(new java.awt.Color(255, 255, 255));
        infusion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        infusion.setForeground(new java.awt.Color(0, 0, 0));
        infusion.setText("Infusion");
        infusion.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        infusion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infusionActionPerformed(evt);
            }
        });
        jDesktopPane1.add(infusion);
        infusion.setBounds(460, 90, 210, 100);

        crepe_suree.setBackground(new java.awt.Color(255, 255, 255));
        crepe_suree.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        crepe_suree.setForeground(new java.awt.Color(0, 0, 0));
        crepe_suree.setText("Crépe sucrée");
        crepe_suree.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        crepe_suree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crepe_sureeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(crepe_suree);
        crepe_suree.setBounds(10, 90, 210, 100);

        crepe_salee.setBackground(new java.awt.Color(255, 255, 255));
        crepe_salee.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        crepe_salee.setForeground(new java.awt.Color(0, 0, 0));
        crepe_salee.setText("Crépe salée");
        crepe_salee.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        crepe_salee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crepe_saleeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(crepe_salee);
        crepe_salee.setBounds(230, 90, 220, 100);

        guaffre_sucree.setBackground(new java.awt.Color(255, 255, 255));
        guaffre_sucree.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        guaffre_sucree.setForeground(new java.awt.Color(0, 0, 0));
        guaffre_sucree.setText("Gaufre sucrée");
        guaffre_sucree.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        guaffre_sucree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guaffre_sucreeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(guaffre_sucree);
        guaffre_sucree.setBounds(460, 90, 210, 100);

        hookah_love.setBackground(new java.awt.Color(255, 255, 255));
        hookah_love.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hookah_love.setForeground(new java.awt.Color(0, 0, 0));
        hookah_love.setText("Chicha gout");
        hookah_love.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        hookah_love.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hookah_loveActionPerformed(evt);
            }
        });
        jDesktopPane1.add(hookah_love);
        hookah_love.setBounds(10, 90, 210, 100);

        hookah_apple.setBackground(new java.awt.Color(255, 255, 255));
        hookah_apple.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hookah_apple.setForeground(new java.awt.Color(0, 0, 0));
        hookah_apple.setText("Chicha normal");
        hookah_apple.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        hookah_apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hookah_appleActionPerformed(evt);
            }
        });
        jDesktopPane1.add(hookah_apple);
        hookah_apple.setBounds(230, 90, 220, 100);

        hookah_menthos.setBackground(new java.awt.Color(255, 255, 255));
        hookah_menthos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hookah_menthos.setForeground(new java.awt.Color(0, 0, 0));
        hookah_menthos.setText("Chicha Jirak");
        hookah_menthos.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        hookah_menthos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hookah_menthosActionPerformed(evt);
            }
        });
        jDesktopPane1.add(hookah_menthos);
        hookah_menthos.setBounds(460, 90, 210, 100);

        jDesktopPane2.setBackground(new java.awt.Color(0, 0, 0));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("8");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("9");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("4");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("7");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("6");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("2");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("3");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("-");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("=");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("5");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(0, 0, 0));
        jButton22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("+");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jButton25.setBackground(new java.awt.Color(0, 0, 0));
        jButton25.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("-->");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(0, 0, 0));
        jButton29.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("<--");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jDesktopPane2);
        jDesktopPane2.setBounds(680, 30, 270, 370);

        jDesktopPane3.setBackground(new java.awt.Color(0, 0, 0));

        menue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        menue.setForeground(new java.awt.Color(255, 255, 255));

        drink_num.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        drink_num.setForeground(new java.awt.Color(255, 255, 255));

        jButton27.setBackground(new java.awt.Color(255, 255, 255));
        jButton27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 0, 0));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-plus-30.png"))); // NOI18N
        jButton27.setText("Add");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        update_order_btn.setBackground(new java.awt.Color(255, 255, 255));
        update_order_btn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        update_order_btn.setForeground(new java.awt.Color(0, 0, 0));
        update_order_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-approuver-et-mettre-à-jour-30.png"))); // NOI18N
        update_order_btn.setText("Update");
        update_order_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_order_btnActionPerformed(evt);
            }
        });

        remove_order_btn.setBackground(new java.awt.Color(255, 255, 255));
        remove_order_btn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        remove_order_btn.setForeground(new java.awt.Color(0, 0, 0));
        remove_order_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-supprimer-pour-toujours-30.png"))); // NOI18N
        remove_order_btn.setText("Remove");
        remove_order_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_order_btnActionPerformed(evt);
            }
        });

        jDesktopPane3.setLayer(menue, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(drink_num, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(update_order_btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(remove_order_btn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menue, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(drink_num, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_order_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(remove_order_btn)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update_order_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remove_order_btn))
                    .addComponent(drink_num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jDesktopPane1.add(jDesktopPane3);
        jDesktopPane3.setBounds(10, 20, 660, 60);

        ticket.setEditable(false);
        ticket.setColumns(20);
        ticket.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ticket.setRows(5);
        jScrollPane1.setViewportView(ticket);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(960, 360, 310, 270);

        Gateau.setBackground(new java.awt.Color(255, 255, 255));
        Gateau.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Gateau.setForeground(new java.awt.Color(0, 0, 0));
        Gateau.setText("Gateau");
        Gateau.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        Gateau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GateauActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Gateau);
        Gateau.setBounds(10, 90, 210, 100);

        gateau_spetial.setBackground(new java.awt.Color(255, 255, 255));
        gateau_spetial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        gateau_spetial.setForeground(new java.awt.Color(0, 0, 0));
        gateau_spetial.setText("Gateau spécial");
        gateau_spetial.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        gateau_spetial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gateau_spetialActionPerformed(evt);
            }
        });
        jDesktopPane1.add(gateau_spetial);
        gateau_spetial.setBounds(230, 90, 220, 100);

        croissant.setBackground(new java.awt.Color(255, 255, 255));
        croissant.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        croissant.setForeground(new java.awt.Color(0, 0, 0));
        croissant.setText("Croissant");
        croissant.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        croissant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                croissantActionPerformed(evt);
            }
        });
        jDesktopPane1.add(croissant);
        croissant.setBounds(460, 90, 210, 100);

        cake.setBackground(new java.awt.Color(255, 255, 255));
        cake.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cake.setForeground(new java.awt.Color(0, 0, 0));
        cake.setText("Cake");
        cake.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cakeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cake);
        cake.setBounds(10, 210, 210, 100);

        water1l.setBackground(new java.awt.Color(255, 255, 255));
        water1l.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        water1l.setForeground(new java.awt.Color(0, 0, 0));
        water1l.setText("Eau minéral 1L");
        water1l.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        water1l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                water1lActionPerformed(evt);
            }
        });
        jDesktopPane1.add(water1l);
        water1l.setBounds(10, 90, 210, 100);

        watermini.setBackground(new java.awt.Color(255, 255, 255));
        watermini.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        watermini.setForeground(new java.awt.Color(0, 0, 0));
        watermini.setText("Eau minéral 1/2L");
        watermini.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        watermini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterminiActionPerformed(evt);
            }
        });
        jDesktopPane1.add(watermini);
        watermini.setBounds(230, 90, 220, 100);

        logged_in.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        logged_in.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(logged_in);
        logged_in.setBounds(960, 20, 90, 29);

        label_drink.setForeground(new java.awt.Color(0, 0, 0));
        label_drink.setText("jLabel4");
        jDesktopPane1.add(label_drink);
        label_drink.setBounds(320, 580, 70, 30);

        label_qte.setForeground(new java.awt.Color(0, 0, 0));
        label_qte.setText("jLabel4");
        jDesktopPane1.add(label_qte);
        label_qte.setBounds(230, 570, 70, 40);

        total_lab.setForeground(new java.awt.Color(0, 0, 0));
        total_lab.setText("jLabel4");
        jDesktopPane1.add(total_lab);
        total_lab.setBounds(400, 590, 41, 16);

        total_ticket_label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        total_ticket_label.setForeground(new java.awt.Color(0, 0, 0));
        total_ticket_label.setText("Total");
        jDesktopPane1.add(total_ticket_label);
        total_ticket_label.setBounds(680, 410, 110, 19);

        tot_ticket.setBackground(new java.awt.Color(0, 0, 0));
        tot_ticket.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tot_ticket.setForeground(new java.awt.Color(0, 0, 0));
        tot_ticket.setText("0");
        jDesktopPane1.add(tot_ticket);
        tot_ticket.setBounds(810, 410, 90, 20);

        user_name.setForeground(new java.awt.Color(0, 0, 0));
        user_name.setText("jLabel4");
        jDesktopPane1.add(user_name);
        user_name.setBounds(490, 450, 90, 16);

        tab_ticket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Quantity", "Drink", "price", "Total", "date", "time", "waiter", "bill_no"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_ticketMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab_ticket);
        if (tab_ticket.getColumnModel().getColumnCount() > 0) {
            tab_ticket.getColumnModel().getColumn(0).setMinWidth(0);
            tab_ticket.getColumnModel().getColumn(0).setPreferredWidth(0);
            tab_ticket.getColumnModel().getColumn(0).setMaxWidth(0);
            tab_ticket.getColumnModel().getColumn(5).setMinWidth(0);
            tab_ticket.getColumnModel().getColumn(5).setPreferredWidth(0);
            tab_ticket.getColumnModel().getColumn(5).setMaxWidth(0);
            tab_ticket.getColumnModel().getColumn(6).setMinWidth(0);
            tab_ticket.getColumnModel().getColumn(6).setPreferredWidth(0);
            tab_ticket.getColumnModel().getColumn(6).setMaxWidth(0);
            tab_ticket.getColumnModel().getColumn(7).setMinWidth(0);
            tab_ticket.getColumnModel().getColumn(7).setPreferredWidth(0);
            tab_ticket.getColumnModel().getColumn(7).setMaxWidth(0);
            tab_ticket.getColumnModel().getColumn(8).setMinWidth(0);
            tab_ticket.getColumnModel().getColumn(8).setPreferredWidth(0);
            tab_ticket.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        jDesktopPane1.add(jScrollPane2);
        jScrollPane2.setBounds(960, 60, 310, 290);

        jwajem.setBackground(new java.awt.Color(255, 255, 255));
        jwajem.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jwajem.setForeground(new java.awt.Color(0, 0, 0));
        jwajem.setText("Jwajem");
        jwajem.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jwajem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jwajemActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jwajem);
        jwajem.setBounds(10, 90, 210, 100);

        jwajem_calm.setBackground(new java.awt.Color(255, 255, 255));
        jwajem_calm.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jwajem_calm.setForeground(new java.awt.Color(0, 0, 0));
        jwajem_calm.setText("Jwajem Calmstreet");
        jwajem_calm.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jwajem_calm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jwajem_calmActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jwajem_calm);
        jwajem_calm.setBounds(230, 90, 220, 100);

        coke.setBackground(new java.awt.Color(255, 255, 255));
        coke.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        coke.setForeground(new java.awt.Color(0, 0, 0));
        coke.setText("Coke");
        coke.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        coke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(coke);
        coke.setBounds(10, 90, 210, 100);

        fanta.setBackground(new java.awt.Color(255, 255, 255));
        fanta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fanta.setForeground(new java.awt.Color(0, 0, 0));
        fanta.setText("Fanta");
        fanta.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        fanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(fanta);
        fanta.setBounds(230, 90, 220, 100);

        orangina.setBackground(new java.awt.Color(255, 255, 255));
        orangina.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        orangina.setForeground(new java.awt.Color(0, 0, 0));
        orangina.setText("Orangina");
        orangina.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        orangina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oranginaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(orangina);
        orangina.setBounds(460, 90, 210, 100);

        kamthari.setBackground(new java.awt.Color(255, 255, 255));
        kamthari.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kamthari.setForeground(new java.awt.Color(0, 0, 0));
        kamthari.setText("Kamthari");
        kamthari.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        kamthari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kamthariActionPerformed(evt);
            }
        });
        jDesktopPane1.add(kamthari);
        kamthari.setBounds(10, 210, 210, 100);

        waiter_logged_in.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        waiter_logged_in.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(waiter_logged_in);
        waiter_logged_in.setBounds(1060, 20, 90, 29);

        ticket_num.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ticket_num.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(ticket_num);
        ticket_num.setBounds(1160, 20, 90, 20);

        ticketNoLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ticketNoLabel.setForeground(new java.awt.Color(0, 0, 0));
        ticketNoLabel.setText("Ticket:");
        jDesktopPane1.add(ticketNoLabel);
        ticketNoLabel.setBounds(680, 470, 70, 24);

        bill_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_idActionPerformed(evt);
            }
        });
        bill_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bill_idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bill_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bill_idKeyTyped(evt);
            }
        });
        jDesktopPane1.add(bill_id);
        bill_id.setBounds(760, 470, 180, 24);

        update_ticket_btn.setBackground(new java.awt.Color(255, 255, 255));
        update_ticket_btn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        update_ticket_btn.setForeground(new java.awt.Color(0, 0, 0));
        update_ticket_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-approuver-et-mettre-à-jour-30.png"))); // NOI18N
        update_ticket_btn.setText("Update ticket");
        update_ticket_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ticket_btnActionPerformed(evt);
            }
        });
        jDesktopPane1.add(update_ticket_btn);
        update_ticket_btn.setBounds(680, 600, 260, 30);

        remove_ticket_btn.setBackground(new java.awt.Color(255, 255, 255));
        remove_ticket_btn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        remove_ticket_btn.setForeground(new java.awt.Color(0, 0, 0));
        remove_ticket_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calmstreetcoffeshop/icons8-supprimer-pour-toujours-30.png"))); // NOI18N
        remove_ticket_btn.setText("Remove ticket");
        remove_ticket_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_ticket_btnActionPerformed(evt);
            }
        });
        jDesktopPane1.add(remove_ticket_btn);
        remove_ticket_btn.setBounds(680, 550, 260, 30);

        jButton26.setBackground(new java.awt.Color(255, 255, 255));
        jButton26.setForeground(new java.awt.Color(0, 0, 0));
        jButton26.setText("get bill");
        jButton26.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton26);
        jButton26.setBounds(860, 510, 80, 30);

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jDateChooser1.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jDateChooser1.setMinimumSize(new java.awt.Dimension(30, 20));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(30, 30));
        jDesktopPane1.add(jDateChooser1);
        jDateChooser1.setBounds(680, 430, 260, 30);

        waiters.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Waiters" }));
        jDesktopPane1.add(waiters);
        waiters.setBounds(680, 510, 160, 26);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void  Icon(){     
JFrame f=new JFrame();     
Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\21654\\Documents\\NetBeansProjects\\CalmStreetCoffeshop\\icons\\icon.png");    
this.setIconImage(icon);    
     
}
    public void update_last() {
        get_total();
        get_price();
        double new_tot = Double.parseDouble(price_txt.getText()) * Integer.parseInt(drink_num.getText());
        try {
            DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
            String query = "update orders set qte ='" + Integer.parseInt(drink_num.getText()) + "', total='" + new_tot + "' where drink ='" + label_drink.getText().toLowerCase() + "'";
            st = cnx.obtenircon().createStatement();
            st.execute(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    public void select_last() {
        try {
            DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
            String query = "select  idorders, qte, drink, total, price, name_waiter, time, date, bill_no from orders2 ORDER BY idorders DESC LIMIT 1";
            st = cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                table.addRow(new Object[]{rs.getInt("idorders"), rs.getInt("qte"), rs.getString("drink"), rs.getDouble("price"), rs.getDouble("total"),rs.getString("date"), rs.getString("time"), rs.getString("name_waiter"),rs.getString("bill_no") });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    public void setheader() {
        String header = " Welcome          ";
        ticket.setText(header.toUpperCase(Locale.ITALY) + "\n" + " To Calm Street Coffeeshop \n");
    }
    double total_drink;

    void get_total() {

        try {
            st = cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select total from orders2 where drink ='" + label_drink.getText().toLowerCase() + "'");
            while (rs.next()) {
                total_drink = rs.getDouble("total");

                System.out.println(total_drink);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
        void getwaiters (){
              try {
            st = cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select user_name from serveur ");
            while (rs.next()) {
                String waiter  = rs.getString("user_name");
                waiters.addItem(waiter);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }  
        }
    void get_price() {

        try {
            st = cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select price from drink where name ='" + label_drink.getText().toLowerCase() + "'");
            while (rs.next()) {
                Double price = rs.getDouble("price");
                price_txt.setText(price.toString());
                price_bill=price;
                System.out.println(price);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        orange.setVisible(false);
        citronade.setVisible(false);
        orange.setEnabled(false);
        citronade.setEnabled(false);
        cafe_creme.setVisible(true);
        chocolat_lait.setVisible(true);
        capucin_special.setVisible(true);
        cafe_creme.setEnabled(true);
        chocolat_lait.setEnabled(true);
        capucin_special.setEnabled(true);
        american.setVisible(true);
        chocolat_chaud.setVisible(true);
        creme_special.setVisible(true);
        american.setEnabled(true);
        chocolat_chaud.setEnabled(true);
        creme_special.setEnabled(true);
        capucino.setVisible(true);
        express_special.setVisible(true);
        express.setVisible(true);
        capucino.setEnabled(true);
        express_special.setEnabled(true);
        express.setEnabled(true);
        cafe_turc.setVisible(true);
        capucin.setVisible(true);
        cafe_turc.setEnabled(true);
        capucin.setEnabled(true);
        //////
        banane.setVisible(false);
        fraise.setVisible(false);
        banane.setEnabled(false);
        fraise.setEnabled(false);
        citronade_amandes.setVisible(false);
        cocktail_fruits.setVisible(false);
        citronade_amandes.setEnabled(false);
        cocktail_fruits.setEnabled(false);
        milkshake.setVisible(false);
        chocolat.setVisible(false);
        milkshake.setEnabled(false);
        chocolat.setEnabled(false);
        orio.setVisible(false);
        cookie.setVisible(false);
        orio.setEnabled(false);
        cookie.setEnabled(false);
        ////////
        the_menthe.setVisible(false);
        the_menthe.setEnabled(false);
        the_amande.setVisible(false);
        the_amande.setEnabled(false);
        infusion.setVisible(false);
        infusion.setEnabled(false);
        ////////
        crepe_suree.setVisible(false);
        crepe_suree.setEnabled(false);
        crepe_salee.setVisible(false);
        crepe_salee.setEnabled(false);
        guaffre_sucree.setVisible(false);
        guaffre_sucree.setEnabled(false);
        ////////
        hookah_love.setVisible(false);
        hookah_menthos.setVisible(false);
        hookah_love.setEnabled(false);
        hookah_menthos.setEnabled(false);
        hookah_apple.setVisible(false);
        hookah_apple.setEnabled(false);
        /////
        Gateau.setVisible(false);
        Gateau.setEnabled(false);
        gateau_spetial.setVisible(false);
        gateau_spetial.setEnabled(false);
        croissant.setVisible(false);
        croissant.setEnabled(false);
        cake.setVisible(false);
        cake.setEnabled(false);
        /////////
        water1l.setVisible(false);
        water1l.setEnabled(false);
        watermini.setVisible(false);
        watermini.setEnabled(false);
        /////jwajem
        jwajem.setVisible(false);
        jwajem_calm.setVisible(false);
        jwajem.setEnabled(false);
        jwajem_calm.setEnabled(false);
        //soda
        coke.setVisible(false);
        coke.setEnabled(false);
        fanta.setVisible(false);
        fanta.setEnabled(false);
        orangina.setVisible(false);
        orangina.setEnabled(false);
        kamthari.setVisible(false);
        kamthari.setEnabled(false);
        menue.setText("Cafés");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clicked_soda = 0;
        cafe_creme.setVisible(false);
        chocolat_lait.setVisible(false);
        capucin_special.setVisible(false);
        cafe_creme.setEnabled(false);
        chocolat_lait.setEnabled(false);
        capucin_special.setEnabled(false);
        american.setVisible(false);
        chocolat_chaud.setVisible(false);
        creme_special.setVisible(false);
        american.setEnabled(false);
        chocolat_chaud.setEnabled(false);
        creme_special.setEnabled(false);
        capucino.setVisible(false);
        express_special.setVisible(false);
        express.setVisible(false);
        capucino.setEnabled(false);
        express_special.setEnabled(false);
        express.setEnabled(false);
        cafe_turc.setVisible(false);
        capucin.setVisible(false);
        cafe_turc.setEnabled(false);
        capucin.setEnabled(false);
        //////
        the_menthe.setVisible(false);
        the_menthe.setEnabled(false);
        the_amande.setVisible(false);
        the_amande.setEnabled(false);
        infusion.setVisible(false);
        infusion.setEnabled(false);
        ///////
        orange.setVisible(true);
        citronade.setVisible(true);
        orange.setEnabled(true);
        citronade.setEnabled(true);
        banane.setVisible(true);
        fraise.setVisible(true);
        banane.setEnabled(true);
        fraise.setEnabled(true);
        citronade_amandes.setVisible(true);
        cocktail_fruits.setVisible(true);
        citronade_amandes.setEnabled(true);
        cocktail_fruits.setEnabled(true);
        milkshake.setVisible(true);
        chocolat.setVisible(true);
        milkshake.setEnabled(true);
        chocolat.setEnabled(true);
        orio.setVisible(true);
        cookie.setVisible(true);
        orio.setEnabled(true);
        cookie.setEnabled(true);
        /////////
        crepe_suree.setVisible(false);
        crepe_suree.setEnabled(false);
        crepe_salee.setVisible(false);
        crepe_salee.setEnabled(false);
        guaffre_sucree.setVisible(false);
        guaffre_sucree.setEnabled(false);
        //////////
        hookah_love.setVisible(false);
        hookah_menthos.setVisible(false);
        hookah_love.setEnabled(false);
        hookah_menthos.setEnabled(false);
        hookah_apple.setVisible(false);
        hookah_apple.setEnabled(false);
        //////////
        Gateau.setVisible(false);
        Gateau.setEnabled(false);
        gateau_spetial.setVisible(false);
        gateau_spetial.setEnabled(false);
        croissant.setVisible(false);
        croissant.setEnabled(false);
        cake.setVisible(false);
        cake.setEnabled(false);
        //////////
        water1l.setVisible(false);
        water1l.setEnabled(false);
        watermini.setVisible(false);
        watermini.setEnabled(false);
        /////jwajem
        jwajem.setVisible(false);
        jwajem_calm.setVisible(false);
        jwajem.setEnabled(false);
        jwajem_calm.setEnabled(false);
        //soda
        coke.setVisible(false);
        coke.setEnabled(false);
        fanta.setVisible(false);
        fanta.setEnabled(false);
        orangina.setVisible(false);
        orangina.setEnabled(false);
        kamthari.setVisible(false);
        kamthari.setEnabled(false);
        menue.setText("Jus");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ///////////cafes ////////////
        clicked_soda = 0;
        cafe_creme.setVisible(false);
        chocolat_lait.setVisible(false);
        capucin_special.setVisible(false);
        cafe_creme.setEnabled(false);
        chocolat_lait.setEnabled(false);
        capucin_special.setEnabled(false);
        american.setVisible(false);
        chocolat_chaud.setVisible(false);
        creme_special.setVisible(false);
        american.setEnabled(false);
        chocolat_chaud.setEnabled(false);
        creme_special.setEnabled(false);
        capucino.setVisible(false);
        express_special.setVisible(false);
        express.setVisible(false);
        capucino.setEnabled(false);
        express_special.setEnabled(false);
        express.setEnabled(false);
        cafe_turc.setVisible(false);
        capucin.setVisible(false);
        cafe_turc.setEnabled(false);
        capucin.setEnabled(false);
        ////////////juces //////////
        orange.setVisible(false);
        citronade.setVisible(false);
        banane.setVisible(false);
        fraise.setVisible(false);
        orange.setEnabled(false);
        citronade.setEnabled(false);
        banane.setEnabled(false);
        fraise.setEnabled(false);
        citronade_amandes.setVisible(false);
        cocktail_fruits.setVisible(false);
        citronade_amandes.setEnabled(false);
        cocktail_fruits.setEnabled(false);
        milkshake.setVisible(false);
        chocolat.setVisible(false);
        milkshake.setEnabled(false);
        chocolat.setEnabled(false);
        orio.setVisible(false);
        cookie.setVisible(false);
        orio.setEnabled(false);
        cookie.setEnabled(false);
        /////////tea/////////////
        the_menthe.setVisible(false);
        the_menthe.setEnabled(false);
        the_amande.setVisible(false);
        the_amande.setEnabled(false);
        infusion.setVisible(false);
        infusion.setEnabled(false);
        //////////grépes////////
        crepe_suree.setVisible(true);
        crepe_suree.setEnabled(true);
        crepe_salee.setVisible(true);
        crepe_salee.setEnabled(true);
        guaffre_sucree.setVisible(true);
        guaffre_sucree.setEnabled(true);
        ///////////
        Gateau.setVisible(false);
        Gateau.setEnabled(false);
        gateau_spetial.setVisible(false);
        gateau_spetial.setEnabled(false);
        croissant.setVisible(false);
        croissant.setEnabled(false);
        cake.setVisible(false);
        cake.setEnabled(false);
        ////////////
        water1l.setVisible(false);
        water1l.setEnabled(false);
        watermini.setVisible(false);
        watermini.setEnabled(false);
        /////jwajem
        jwajem.setVisible(false);
        jwajem_calm.setVisible(false);
        jwajem.setEnabled(false);
        jwajem_calm.setEnabled(false);
        //soda
        coke.setVisible(false);
        coke.setEnabled(false);
        fanta.setVisible(false);
        fanta.setEnabled(false);
        orangina.setVisible(false);
        orangina.setEnabled(false);
        kamthari.setVisible(false);
        kamthari.setEnabled(false);
        menue.setText("Crépes");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clicked_soda = 0;
        ///////////cafes ////////////
        cafe_creme.setVisible(false);
        chocolat_lait.setVisible(false);
        capucin_special.setVisible(false);
        cafe_creme.setEnabled(false);
        chocolat_lait.setEnabled(false);
        capucin_special.setEnabled(false);
        american.setVisible(false);
        chocolat_chaud.setVisible(false);
        creme_special.setVisible(false);
        american.setEnabled(false);
        chocolat_chaud.setEnabled(false);
        creme_special.setEnabled(false);
        capucino.setVisible(false);
        express_special.setVisible(false);
        express.setVisible(false);
        capucino.setEnabled(false);
        express_special.setEnabled(false);
        express.setEnabled(false);
        cafe_turc.setVisible(false);
        capucin.setVisible(false);
        cafe_turc.setEnabled(false);
        capucin.setEnabled(false);
        ////////////juces //////////
        orange.setVisible(false);
        citronade.setVisible(false);
        banane.setVisible(false);
        fraise.setVisible(false);
        orange.setEnabled(false);
        citronade.setEnabled(false);
        banane.setEnabled(false);
        fraise.setEnabled(false);
        citronade_amandes.setVisible(false);
        cocktail_fruits.setVisible(false);
        citronade_amandes.setEnabled(false);
        cocktail_fruits.setEnabled(false);
        milkshake.setVisible(false);
        chocolat.setVisible(false);
        milkshake.setEnabled(false);
        chocolat.setEnabled(false);
        orio.setVisible(false);
        cookie.setVisible(false);
        orio.setEnabled(false);
        cookie.setEnabled(false);
        ///////////
        the_menthe.setVisible(true);
        the_menthe.setEnabled(true);
        the_amande.setVisible(true);
        the_amande.setEnabled(true);
        infusion.setVisible(true);
        infusion.setEnabled(true);
        ///////////
        crepe_suree.setVisible(false);
        crepe_suree.setEnabled(false);
        crepe_salee.setVisible(false);
        crepe_salee.setEnabled(false);
        guaffre_sucree.setVisible(false);
        guaffre_sucree.setEnabled(false);
        //////////
        hookah_love.setVisible(false);
        hookah_menthos.setVisible(false);
        hookah_love.setEnabled(false);
        hookah_menthos.setEnabled(false);
        hookah_apple.setVisible(false);
        hookah_apple.setEnabled(false);
        //////////
        Gateau.setVisible(false);
        Gateau.setEnabled(false);
        gateau_spetial.setVisible(false);
        gateau_spetial.setEnabled(false);
        croissant.setVisible(false);
        croissant.setEnabled(false);
        cake.setVisible(false);
        cake.setEnabled(false);
        //////////
        water1l.setVisible(false);
        water1l.setEnabled(false);
        watermini.setVisible(false);
        watermini.setEnabled(false);
        /////jwajem
        jwajem.setVisible(false);
        jwajem_calm.setVisible(false);
        jwajem.setEnabled(false);
        jwajem_calm.setEnabled(false);
        //soda
        coke.setVisible(false);
        coke.setEnabled(false);
        fanta.setVisible(false);
        fanta.setEnabled(false);
        orangina.setVisible(false);
        orangina.setEnabled(false);
        kamthari.setVisible(false);
        kamthari.setEnabled(false);
        menue.setText("Thé");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String query;
        String logadmin = jTextField6.getText();
        String passwordadmin = jPasswordField2.getText();
        try {
            query = "select idadmin, name, password from admin";
            st = cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String idadmin = rs.getString("name");
                String passadmin = rs.getString("password");
                String id = rs.getString("idadmin");
                System.out.println(idadmin);
                System.out.println(logadmin);
                System.out.println(passwordadmin);
                System.out.println(passadmin);
                if ((idadmin.equals(logadmin)) && (passwordadmin.equals(passadmin))) {
                    System.out.println("equals");
                    jButton17.setBackground(Color.green);
                    jButton17.setText("Connected");
                    jLabel24.setVisible(true);
                    jButton1.setEnabled(true);
                    jButton2.setEnabled(true);
                    jButton4.setEnabled(true);
                    jButton21.setEnabled(true);
                    jButton5.setEnabled(true);
                    jButton23.setEnabled(true);
                    jButton24.setEnabled(true);
                    jButton3.setEnabled(true);
                    jButton27.setEnabled(true);
                    update_order_btn.setEnabled(true);
                    remove_order_btn.setEnabled(true);
                    //jButton26.setEnabled(false);
                    jButton31.setEnabled(true);
                    jTextField6.setText("");
                    jPasswordField2.setText("");
                    ticketNoLabel.setVisible(true);
                    bill_id.setVisible(true);
                    update_ticket_btn.setEnabled(true);
                    update_ticket_btn.setVisible(true);
                    remove_ticket_btn.setEnabled(true);
                    remove_ticket_btn.setVisible(true);
                    jButton26.setEnabled(true);
                    jButton26.setVisible(true);
                    jDateChooser1.setVisible(true);
                    waiter_logged_in.setText("Admin");
                    waiters.setVisible(true);
                    waiters.setEnabled(true);
                    if (jButton19.getText().equals("Connected")){
                        ticket_num.setText(String.valueOf(ticket_num.getText()));
                    }
                    else{
                        ticket_num.setText(String.valueOf(0));
                    }
                    getwaiters ();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Verifier");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erreur");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        Admin_home ah = new Admin_home();
        ah.setVisible(true);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        CreateAdmin ca = new CreateAdmin();
        ca.setVisible(true);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if (jButton19.getText().equals("Connected")) {
            JOptionPane.showMessageDialog(rootPane, "Waiter already connected");
        } else {
            String query;
            String log = waiter.getText();
            String password = pass_waiter.getText();
            try {
                query = "select idserveur, nom, user_name, password from serveur where user_name='" + log + "'";
                st = cnx.obtenircon().createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    String id2 = rs.getString("user_name");
                    String pass2 = rs.getString("password");
                    String name=rs.getString("nom");
                    String id_waiter = rs.getString("idserveur");
                    System.out.println(id2);
                    System.out.println(pass2);
                    System.out.println(log);
                    System.out.println(password);
                    
                    if ((log.equals(id2)) && (pass2.equals(password))) {
                        logged_in.setText("Serveur: ");
                        waiter.setText("");
                        pass_waiter.setText("");
                        jButton19.setBackground(Color.green);
                        jButton19.setText("Connected");
                        user_name.setText(log);
                        waiter_logged_in.setText(name);
                        jButton1.setEnabled(true);
                        jButton2.setEnabled(true);
                        jButton4.setEnabled(true);
                        jButton21.setEnabled(true);
                        jButton5.setEnabled(true);
                        jButton23.setEnabled(true);
                        jButton24.setEnabled(true);
                        jButton3.setEnabled(true);
                        jButton27.setEnabled(true);
                        update_order_btn.setEnabled(true);
                        remove_order_btn.setEnabled(true);
                        ticket_num.setText(String.valueOf(0));
                        jButton31.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Verifier");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        clicked_soda = 0;
        ///////////cafes ////////////
        cafe_creme.setVisible(false);
        chocolat_lait.setVisible(false);
        capucin_special.setVisible(false);
        cafe_creme.setEnabled(false);
        chocolat_lait.setEnabled(false);
        capucin_special.setEnabled(false);
        american.setVisible(false);
        chocolat_chaud.setVisible(false);
        creme_special.setVisible(false);
        american.setEnabled(false);
        chocolat_chaud.setEnabled(false);
        creme_special.setEnabled(false);
        capucino.setVisible(false);
        express_special.setVisible(false);
        express.setVisible(false);
        capucino.setEnabled(false);
        express_special.setEnabled(false);
        express.setEnabled(false);
        cafe_turc.setVisible(false);
        capucin.setVisible(false);
        cafe_turc.setEnabled(false);
        capucin.setEnabled(false);
        ////////////juces //////////
        orange.setVisible(false);
        citronade.setVisible(false);
        banane.setVisible(false);
        fraise.setVisible(false);
        orange.setEnabled(false);
        citronade.setEnabled(false);
        banane.setEnabled(false);
        fraise.setEnabled(false);
        citronade_amandes.setVisible(false);
        cocktail_fruits.setVisible(false);
        citronade_amandes.setEnabled(false);
        cocktail_fruits.setEnabled(false);
        milkshake.setVisible(false);
        chocolat.setVisible(false);
        milkshake.setEnabled(false);
        chocolat.setEnabled(false);
        orio.setVisible(false);
        cookie.setVisible(false);
        orio.setEnabled(false);
        cookie.setEnabled(false);
        /////////tea/////////////
        the_menthe.setVisible(false);
        the_menthe.setEnabled(false);
        the_amande.setVisible(false);
        the_amande.setEnabled(false);
        infusion.setVisible(false);
        infusion.setEnabled(false);
        //////////grépes////////
        crepe_suree.setVisible(false);
        crepe_suree.setEnabled(false);
        crepe_salee.setVisible(false);
        crepe_salee.setEnabled(false);
        guaffre_sucree.setVisible(false);
        guaffre_sucree.setEnabled(false);
        /////////jwajem/////////////
        /////jwajem
        jwajem.setVisible(false);
        jwajem_calm.setVisible(false);
        jwajem.setEnabled(false);
        jwajem_calm.setEnabled(false);
        /////////hookah ////////////
        hookah_love.setVisible(false);
        hookah_menthos.setVisible(false);
        hookah_love.setEnabled(false);
        hookah_menthos.setEnabled(false);
        hookah_apple.setVisible(false);
        hookah_apple.setEnabled(false);
        ///////////Delices///////////////
        Gateau.setVisible(true);
        Gateau.setEnabled(true);
        gateau_spetial.setVisible(true);
        gateau_spetial.setEnabled(true);
        croissant.setVisible(true);
        croissant.setEnabled(true);
        cake.setVisible(true);
        cake.setEnabled(true);
        ////////
        water1l.setVisible(false);
        water1l.setEnabled(false);
        watermini.setVisible(false);
        watermini.setEnabled(false);
        //soda
        coke.setVisible(false);
        coke.setEnabled(false);
        fanta.setVisible(false);
        fanta.setEnabled(false);
        orangina.setVisible(false);
        orangina.setEnabled(false);
        kamthari.setVisible(false);
        kamthari.setEnabled(false);
        menue.setText("Délice");
    }//GEN-LAST:event_jButton21ActionPerformed
    int clicked_cocktail = 0;
    private void cocktail_fruitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocktail_fruitsActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        clicked_cookies = 0;
        clicked_orio = 0;
        clicked_chocolat = 0;
        clicked_milkshake = 0;
        clicked_citronade = 0;
        clicked_orange = 0;
        clicked_banane = 0;
        clicked_fraise = 0;
        clicked_citronade_amande = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(cocktail_fruits.getText());
        label_drink.setText("cocktail");
        clicked_cocktail++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_cocktail);
        System.out.println(clicked_cocktail);
        jTextField1.setText(clicked_cocktail + " " + cocktail_fruits.getText());
        /*
        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());System.out.print(tot);
        insert_order();
        update_last();
        select_last();
         */
    }//GEN-LAST:event_cocktail_fruitsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ///////////cafes ////////////
        clicked_soda = 0;
        cafe_creme.setVisible(false);
        chocolat_lait.setVisible(false);
        capucin_special.setVisible(false);
        cafe_creme.setEnabled(false);
        chocolat_lait.setEnabled(false);
        capucin_special.setEnabled(false);
        american.setVisible(false);
        chocolat_chaud.setVisible(false);
        creme_special.setVisible(false);
        american.setEnabled(false);
        chocolat_chaud.setEnabled(false);
        creme_special.setEnabled(false);
        capucino.setVisible(false);
        express_special.setVisible(false);
        express.setVisible(false);
        capucino.setEnabled(false);
        express_special.setEnabled(false);
        express.setEnabled(false);
        cafe_turc.setVisible(false);
        capucin.setVisible(false);
        cafe_turc.setEnabled(false);
        capucin.setEnabled(false);
        ////////////juces //////////
        orange.setVisible(false);
        citronade.setVisible(false);
        banane.setVisible(false);
        fraise.setVisible(false);
        orange.setEnabled(false);
        citronade.setEnabled(false);
        banane.setEnabled(false);
        fraise.setEnabled(false);
        citronade_amandes.setVisible(false);
        cocktail_fruits.setVisible(false);
        citronade_amandes.setEnabled(false);
        cocktail_fruits.setEnabled(false);
        milkshake.setVisible(false);
        chocolat.setVisible(false);
        milkshake.setEnabled(false);
        chocolat.setEnabled(false);
        orio.setVisible(false);
        cookie.setVisible(false);
        orio.setEnabled(false);
        cookie.setEnabled(false);
        /////////tea/////////////
        the_menthe.setVisible(false);
        the_menthe.setEnabled(false);
        the_amande.setVisible(false);
        the_amande.setEnabled(false);
        infusion.setVisible(false);
        infusion.setEnabled(false);
        //////////grépes////////
        crepe_suree.setVisible(false);
        crepe_suree.setEnabled(false);
        crepe_salee.setVisible(false);
        crepe_salee.setEnabled(false);
        guaffre_sucree.setVisible(false);
        guaffre_sucree.setEnabled(false);
        hookah_love.setVisible(true);
        hookah_menthos.setVisible(true);
        hookah_love.setEnabled(true);
        hookah_menthos.setEnabled(true);
        hookah_apple.setVisible(true);
        hookah_apple.setEnabled(true);
        ///////////delice////////
        Gateau.setVisible(false);
        Gateau.setEnabled(false);
        gateau_spetial.setVisible(false);
        gateau_spetial.setEnabled(false);
        croissant.setVisible(false);
        croissant.setEnabled(false);
        cake.setVisible(false);
        cake.setEnabled(false);
        ////////////
        water1l.setVisible(false);
        water1l.setEnabled(false);
        watermini.setVisible(false);
        watermini.setEnabled(false);
        /////jwajem
        jwajem.setVisible(false);
        jwajem_calm.setVisible(false);
        jwajem.setEnabled(false);
        jwajem_calm.setEnabled(false);
        //soda
        coke.setVisible(false);
        coke.setEnabled(false);
        fanta.setVisible(false);
        fanta.setEnabled(false);
        orangina.setVisible(false);
        orangina.setEnabled(false);
        kamthari.setVisible(false);
        kamthari.setEnabled(false);
        menue.setText("Hookah");
    }//GEN-LAST:event_jButton5ActionPerformed
    int clicked_capucino = 0;
    private void capucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capucinoActionPerformed
        clickedexp = 0;
        clickedcapucin = 0;
        clickedexpspec = 0;
        clickedcapspec = 0;
        clicked_creme_spec = 0;
        clicked_chocolat_lait = 0;
        clicked_chocolat_chaud = 0;
        cliced_american = 0;
        clicked_creme = 0;
        clicked_soda = 0;
        reset_jwajem();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(capucino.getText());
        label_drink.setText("capucino");
        clicked_capucino++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_capucino);
        System.out.println(clicked_capucino);
        jTextField1.setText(clicked_capucino + " " + capucino.getText());
        /*
        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());System.out.print(tot);
        insert_order();
        update_last();
        select_last();*/
    }//GEN-LAST:event_capucinoActionPerformed
    int clicked_soda = 0;
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        ///////////cafes ////////////
        cafe_creme.setVisible(false);
        chocolat_lait.setVisible(false);
        capucin_special.setVisible(false);
        cafe_creme.setEnabled(false);
        chocolat_lait.setEnabled(false);
        capucin_special.setEnabled(false);
        american.setVisible(false);
        chocolat_chaud.setVisible(false);
        creme_special.setVisible(false);
        american.setEnabled(false);
        chocolat_chaud.setEnabled(false);
        creme_special.setEnabled(false);
        capucino.setVisible(false);
        express_special.setVisible(false);
        express.setVisible(false);
        capucino.setEnabled(false);
        express_special.setEnabled(false);
        express.setEnabled(false);
        cafe_turc.setVisible(false);
        capucin.setVisible(false);
        cafe_turc.setEnabled(false);
        capucin.setEnabled(false);
        ////////////juces //////////
        orange.setVisible(false);
        citronade.setVisible(false);
        banane.setVisible(false);
        fraise.setVisible(false);
        orange.setEnabled(false);
        citronade.setEnabled(false);
        banane.setEnabled(false);
        fraise.setEnabled(false);
        citronade_amandes.setVisible(false);
        cocktail_fruits.setVisible(false);
        citronade_amandes.setEnabled(false);
        cocktail_fruits.setEnabled(false);
        milkshake.setVisible(false);
        chocolat.setVisible(false);
        milkshake.setEnabled(false);
        chocolat.setEnabled(false);
        orio.setVisible(false);
        cookie.setVisible(false);
        orio.setEnabled(false);
        cookie.setEnabled(false);
        ///////////
        the_menthe.setVisible(false);
        the_menthe.setEnabled(false);
        the_amande.setVisible(false);
        the_amande.setEnabled(false);
        infusion.setVisible(false);
        infusion.setEnabled(false);
        ///////////
        crepe_suree.setVisible(false);
        crepe_suree.setEnabled(false);
        crepe_salee.setVisible(false);
        crepe_salee.setEnabled(false);
        guaffre_sucree.setVisible(false);
        guaffre_sucree.setEnabled(false);
        //////////
        hookah_love.setVisible(false);
        hookah_menthos.setVisible(false);
        hookah_love.setEnabled(false);
        hookah_menthos.setEnabled(false);
        hookah_apple.setVisible(false);
        hookah_apple.setEnabled(false);
        //////////
        Gateau.setVisible(false);
        Gateau.setEnabled(false);
        gateau_spetial.setVisible(false);
        gateau_spetial.setEnabled(false);
        croissant.setVisible(false);
        croissant.setEnabled(false);
        cake.setVisible(false);
        cake.setEnabled(false);
        //////////
        /////jwajem
        jwajem.setVisible(false);
        jwajem_calm.setVisible(false);
        jwajem.setEnabled(false);
        jwajem_calm.setEnabled(false);
        
        water1l.setVisible(false);
        water1l.setEnabled(false);
        watermini.setVisible(false);
        watermini.setEnabled(false);
        //soda
        coke.setVisible(true);
        coke.setEnabled(true);
        fanta.setVisible(true);
        fanta.setEnabled(true);
        orangina.setVisible(true);
        orangina.setEnabled(true);
        kamthari.setVisible(true);
        kamthari.setEnabled(true);
        menue.setText("Canette");
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        ///////////cafes ////////////
        clicked_soda = 0;
        cafe_creme.setVisible(false);
        chocolat_lait.setVisible(false);
        capucin_special.setVisible(false);
        cafe_creme.setEnabled(false);
        chocolat_lait.setEnabled(false);
        capucin_special.setEnabled(false);
        american.setVisible(false);
        chocolat_chaud.setVisible(false);
        creme_special.setVisible(false);
        american.setEnabled(false);
        chocolat_chaud.setEnabled(false);
        creme_special.setEnabled(false);
        capucino.setVisible(false);
        express_special.setVisible(false);
        express.setVisible(false);
        capucino.setEnabled(false);
        express_special.setEnabled(false);
        express.setEnabled(false);
        cafe_turc.setVisible(false);
        capucin.setVisible(false);
        cafe_turc.setEnabled(false);
        capucin.setEnabled(false);
        ////////////juces //////////
        orange.setVisible(false);
        citronade.setVisible(false);
        banane.setVisible(false);
        fraise.setVisible(false);
        orange.setEnabled(false);
        citronade.setEnabled(false);
        banane.setEnabled(false);
        fraise.setEnabled(false);
        citronade_amandes.setVisible(false);
        cocktail_fruits.setVisible(false);
        citronade_amandes.setEnabled(false);
        cocktail_fruits.setEnabled(false);
        milkshake.setVisible(false);
        chocolat.setVisible(false);
        milkshake.setEnabled(false);
        chocolat.setEnabled(false);
        orio.setVisible(false);
        cookie.setVisible(false);
        orio.setEnabled(false);
        cookie.setEnabled(false);
        /////////tea/////////////
        the_menthe.setVisible(false);
        the_menthe.setEnabled(false);
        the_amande.setVisible(false);
        the_amande.setEnabled(false);
        infusion.setVisible(false);
        infusion.setEnabled(false);
        //////////grépes////////
        crepe_suree.setVisible(false);
        crepe_suree.setEnabled(false);
        crepe_salee.setVisible(false);
        crepe_salee.setEnabled(false);
        guaffre_sucree.setVisible(false);
        guaffre_sucree.setEnabled(false);
        /////////jwajem/////////////
        /////jwajem
        jwajem.setVisible(false);
        jwajem_calm.setVisible(false);
        jwajem.setEnabled(false);
        jwajem_calm.setEnabled(false);
        /////////hookah ////////////
        hookah_love.setVisible(false);
        hookah_menthos.setVisible(false);
        hookah_love.setEnabled(false);
        hookah_menthos.setEnabled(false);
        hookah_apple.setVisible(false);
        hookah_apple.setEnabled(false);
        ///////////Delices///////////////
        Gateau.setVisible(false);
        Gateau.setEnabled(false);
        gateau_spetial.setVisible(false);
        gateau_spetial.setEnabled(false);
        croissant.setVisible(false);
        croissant.setEnabled(false);
        cake.setVisible(false);
        cake.setEnabled(false);
        ////////////////water//////////
        water1l.setVisible(true);
        water1l.setEnabled(true);
        watermini.setVisible(true);
        watermini.setEnabled(true);
        /////////
        //soda
        coke.setVisible(false);
        coke.setEnabled(false);
        fanta.setVisible(false);
        fanta.setEnabled(false);
        orangina.setVisible(false);
        orangina.setEnabled(false);
        kamthari.setVisible(false);
        kamthari.setEnabled(false);
        menue.setText("Eau minéral");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        double waiter_taking;
        //ticket.setText(ticket.getText()+"\n"+"Total="+tot_ticket.getText()+"\n"+"Visit us again"+"\n"+date_label.getText()+"\n"+time_label.getText());
        //get_ticket_number ();
        int nbr = Integer.parseInt(ticket_num.getText());
        nbr++;
        ticket_num.setText(String.valueOf(nbr));
        int bill_num = Integer.parseInt(ticket_num.getText());
        ticket_num.setText(String.valueOf(bill_num));
        update_taking();
        waiter_taking = get_taking_waiter();
        System.out.println("Waiter taking " + waiter_taking);
        ticket.setText("");
        setheader();
        insert_stats();
        getValuesFromTable();
        //insertbill();
        //update_bill();
        table.setRowCount(0);
        tot_ticket.setText(String.valueOf(0));
        ticket_num.setText(String.valueOf(nbr));
        
    }//GEN-LAST:event_jButton15ActionPerformed

    int clicked = 0;
    private void cafe_turcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafe_turcActionPerformed
        clickedexp = 0;
        clickedcapucin = 0;
        clickedexpspec = 0;
        clickedcapspec = 0;
        clicked_creme_spec = 0;
        clicked_capucino = 0;
        clicked_chocolat_lait = 0;
        clicked_chocolat_chaud = 0;
        cliced_american = 0;
        clicked_creme = 0;
        //
        clicked_soda = 0;
        reset_soda();
        reset_jwajem();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        drink_num.setText(String.valueOf(1));
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(cafe_turc.getText());
        label_drink.setText("Café turc");
        drink_num.setText("" + clicked);
        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.println(tot);

        clicked++;
        ///numb = String.valueOf(clicked);
        drink_num.setText(String.valueOf(clicked));
        jTextField1.setText(clicked + " " + cafe_turc.getText());
        System.out.println(clicked);
        /*insert_order();
        update_last();
        select_last(); 
        int rows = table.getRowCount();System.out.println("Row count "+rows);
        if (rows>1){
            table.removeRow( rows - 2);System.out.println("Removed row "+rows);
        }*/

    }//GEN-LAST:event_cafe_turcActionPerformed
    int clickedexp = 0;

    private void expressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expressActionPerformed
        clicked = 0;
        clickedcapucin = 0;
        clickedexpspec = 0;
        clickedcapspec = 0;
        clicked_creme_spec = 0;
        clicked_capucino = 0;
        clicked_chocolat_lait = 0;
        clicked_chocolat_chaud = 0;
        cliced_american = 0;
        clicked_creme = 0;
        clicked_soda = 0;
        reset_soda();
        reset_jwajem();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(express.getText());
        label_drink.setText("express");
        /* String numb = jTextField1.getText().substring(0,1); 
        System.out.println("number "+ numb);
        char numb2 = numb.charAt(0);System.out.println("Char "+numb2);*/
        clickedexp++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clickedexp);
        System.out.println(clickedexp);
        jTextField1.setText(clickedexp + " " + express.getText());

        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.print(tot);
        /*insert_order();
        update_last();
        select_last();
        table.addRow(new Object[]{"Column 1", "Column 2", "Column 3"});
        int rows = table.getRowCount();System.out.println("Row count "+rows);
        if (rows>1){
            table.removeRow( rows - 2);System.out.println("Removed row "+rows);
        }
         */
    }//GEN-LAST:event_expressActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink first !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            /*if(Character.isDigit(numb2)){
            int res = JOptionPane.showConfirmDialog(rootPane, "Place an other order ?");
            if (res==0){jTextField1.setText("");}
        }else{*/
            get_price();
            drink_num.setText("" + 1);
            double tot = Double.parseDouble(price_txt.getText()) * 1;
            jTextField1.setText(drink_num.getText() + " " + jTextField1.getText());
            jTextField1.setText(jTextField1.getText() + " " + price_txt.getText() + " " + tot);
        }


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
      if(bill_id.getText().isEmpty()){
      
        int clicked = Integer.parseInt(drink_num.getText());
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            clicked++;
            numb = String.valueOf(clicked);
            drink_num.setText(numb);
            System.out.println(clicked);
            get_price();
            double tot = clicked * price_bill;
            String text_details = jTextField1.getText().substring(1, jTextField1.getText().length());
            String tot_string = String.valueOf(tot);
            int lenght_tot = tot_string.length();
            System.out.println("totl lenght" + lenght_tot);
            int lenght = jTextField1.getText().length();
            String total_sub = jTextField1.getText().substring(1, jTextField1.getText().length() - lenght_tot);
            System.out.println("Total sub" + total_sub);
            jTextField1.setText(numb + " " + total_sub + " " + tot);
            //getSumTotalsticket();
        }
      }else{
          int clicked = qte_drink_bill;
          System.out.println("Quantity "+clicked);
          System.out.println("price bill"+price_bill);
          String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            qte_drink_bill++;
            numb = String.valueOf(qte_drink_bill);
            drink_num.setText(numb);
            System.out.println(qte_drink_bill);
            get_price();
            double tot = qte_drink_bill * price_bill;
            String text_details = jTextField1.getText().substring(1, jTextField1.getText().length());
            String tot_string = String.valueOf(tot);
            int lenght_tot = tot_string.length();
            System.out.println("totl lenght" + lenght_tot);
            int lenght = jTextField1.getText().length();
            String total_sub = jTextField1.getText().substring(1, jTextField1.getText().length() - lenght_tot);
            System.out.println("Total sub" + total_sub);
            jTextField1.setText(numb + " " + total_sub + " " + tot);
            //getSumTotalsticket();
      }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink first !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            /* if(Character.isDigit(numb2)){
            int res = JOptionPane.showConfirmDialog(rootPane, "Place an other order ?");
            if (res==0){jTextField1.setText("");}
        }else{*/
            get_price();
            drink_num.setText("" + 2);
            double tot = Double.parseDouble(price_txt.getText()) * 2;
            jTextField1.setText(jButton12.getText() + " " + label_drink.getText());
            jTextField1.setText(jTextField1.getText() + " " + price_txt.getText());
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        if(bill_id.getText().isEmpty()){
            
                double total_ticket = Double.parseDouble(tot_ticket.getText());
                String numb = jTextField1.getText().substring(0, 1);
                int number = Integer.parseInt(String.valueOf(numb));
                System.out.println(number);
                if (number == Integer.parseInt(drink_num.getText())) {
                    get_price();
                    double price = Double.parseDouble(price_txt.getText());
                    double tot = price * Integer.parseInt(drink_num.getText());
                    //ticket.append(jTextField1.getText()+" "+tot+"\n");
                    total_lab.setText("" + tot);
                    total_ticket = tot + total_ticket;
                    tot_ticket.setText("" + total_ticket);
                    
                }
                insert_order();
                
                drink_num.setText(String.valueOf(0));
                clicked = 0;
                select_last();
                drink_num.setText(String.valueOf(0));
            
        }else{
            insert_bill_update();
            //insert_bill();
            table.setRowCount(0);
            get_bill();
            getSumTotalsticket();
        }
    }//GEN-LAST:event_jButton25ActionPerformed
    int clickedcapucin = 0;
    private void capucinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capucinActionPerformed
        clicked_soda = 0;
        clickedexp = 0;
        clickedexpspec = 0;
        clickedcapspec = 0;
        clicked_creme_spec = 0;
        clicked_capucino = 0;
        clicked_chocolat_lait = 0;
        clicked_chocolat_chaud = 0;
        cliced_american = 0;
        clicked_creme = 0;
        reset_jwajem();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_soda();
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(capucin.getText());
        label_drink.setText("capucin");
        clickedcapucin++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clickedcapucin);
        System.out.println(clickedcapucin);
        jTextField1.setText(clickedcapucin + " " + capucin.getText());

        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.print(tot);
        /*insert_order();
        update_last();
        select_last();*/
    }//GEN-LAST:event_capucinActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink first !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            /*if(Character.isDigit(numb2)){
            int res = JOptionPane.showConfirmDialog(rootPane, "Place an other order ?");
            if (res==0){jTextField1.setText("");}
        }else{*/
            get_price();
            drink_num.setText("" + 3);
            double tot = Double.parseDouble(price_txt.getText()) * 3;
            jTextField1.setText(jButton13.getText() + " " + label_drink.getText());
            jTextField1.setText(jTextField1.getText() + " " + price_txt.getText() + " " + tot);
        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink first !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
           
            get_price();
            drink_num.setText("" + 4);
            double tot = Double.parseDouble(price_txt.getText()) * 4;
            jTextField1.setText(jButton8.getText() + " " + label_drink.getText());
            jTextField1.setText(jTextField1.getText() + " " + price_txt.getText() + " " + tot);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink first !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            
            price_txt.setText("");
            get_price();
            drink_num.setText("" + 5);
            double tot = Double.parseDouble(price_txt.getText()) * 5;
            jTextField1.setText(jButton16.getText() + " " + jTextField1.getText());
            jTextField1.setText(jTextField1.getText() + " " + price_txt.getText() + " " + tot);
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink first !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            
            price_txt.setText("");
            get_price();
            drink_num.setText("" + 6);
            double tot = Double.parseDouble(price_txt.getText()) * 6;
            jTextField1.setText(jButton10.getText() + " " + jTextField1.getText());
            jTextField1.setText(jTextField1.getText() + " " + price_txt.getText());
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink first !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            
            price_txt.setText("");
            get_price();
            drink_num.setText("" + 7);
            double tot = Double.parseDouble(price_txt.getText()) * 7;
            jTextField1.setText(jButton9.getText() + " " + jTextField1.getText());
            jTextField1.setText(jTextField1.getText() + " " + price_txt.getText() + " " + tot);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink first !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            
            price_txt.setText("");
            get_price();
            drink_num.setText("" + 8);
            double tot = Double.parseDouble(price_txt.getText()) * 8;
            jTextField1.setText(jButton6.getText() + " " + jTextField1.getText());
            jTextField1.setText(jTextField1.getText() + " " + price_txt.getText() + " " + tot);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink first !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
           
            price_txt.setText("");
            get_price();
            drink_num.setText("" + 9);
            double tot = Double.parseDouble(price_txt.getText()) * 9;
            jTextField1.setText(jButton7.getText() + " " + jTextField1.getText());
            jTextField1.setText(jTextField1.getText() + " " + price_txt.getText() + " " + tot);
        }

    }//GEN-LAST:event_jButton7ActionPerformed
    int clickedexpspec = 0;
    private void express_specialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_express_specialActionPerformed
        clicked_soda = 0;
        clickedexp = 0;
        clickedcapucin = 0;
        clickedcapspec = 0;
        clicked_creme_spec = 0;
        clicked_capucino = 0;
        clicked_chocolat_lait = 0;
        clicked_chocolat_chaud = 0;
        cliced_american = 0;
        clicked_creme = 0;
        reset_soda();
        reset_jwajem();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(express_special.getText());
        label_drink.setText("express special");
        clickedexpspec++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clickedexpspec);
        System.out.println(clickedexpspec);
        jTextField1.setText(clickedexpspec + " " + express_special.getText());

        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.print(tot);
        
    }//GEN-LAST:event_express_specialActionPerformed
    int clickedcapspec = 0;
    private void capucin_specialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capucin_specialActionPerformed
        clicked_soda = 0;
        clickedexp = 0;
        clickedcapucin = 0;
        clickedexpspec = 0;
        clicked_creme_spec = 0;
        clicked_capucino = 0;
        clicked_chocolat_lait = 0;
        clicked_chocolat_chaud = 0;
        cliced_american = 0;
        clicked_creme = 0;
        reset_soda();
        reset_jwajem();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(capucin_special.getText());
        label_drink.setText("capucin spécial");
        clickedcapspec++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clickedcapspec);
        System.out.println(clickedcapspec);
        jTextField1.setText(clickedcapspec + " " + capucin_special.getText());

        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.print(tot);
        
    }//GEN-LAST:event_capucin_specialActionPerformed
    int clicked_creme_spec = 0;
    private void creme_specialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creme_specialActionPerformed
        clicked_soda = 0;
        reset_soda();
        reset_jwajem();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        clicked = 0;
        clickedexp = 0;
        clickedcapucin = 0;
        clickedexpspec = 0;
        clickedcapspec = 0;
        clicked_capucino = 0;
        clicked_chocolat_lait = 0;
        clicked_chocolat_chaud = 0;
        cliced_american = 0;
        clicked_creme = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(creme_special.getText());
        label_drink.setText("café créme spécial");
        clicked_creme_spec++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_creme_spec);
        System.out.println(clicked_creme_spec);
        jTextField1.setText(clicked_creme_spec + " " + creme_special.getText());

        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.print(tot);
        
    }//GEN-LAST:event_creme_specialActionPerformed
    int clicked_chocolat_lait = 0;
    private void chocolat_laitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolat_laitActionPerformed
        clicked_soda = 0;
        clickedexp = 0;
        clickedcapucin = 0;
        clickedexpspec = 0;
        clickedcapspec = 0;
        clicked_creme_spec = 0;
        clicked_capucino = 0;
        clicked_chocolat_chaud = 0;
        cliced_american = 0;
        clicked_creme = 0;
        reset_jwajem();
        reset_soda();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(chocolat_lait.getText());
        label_drink.setText("chocolat au lait");
        clicked_chocolat_lait++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_chocolat_lait);
        System.out.println(clicked_chocolat_lait);
        jTextField1.setText(clicked_chocolat_lait + " " + chocolat_lait.getText());

        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.print(tot);
        /*insert_order();
        update_last();
        select_last();*/
    }//GEN-LAST:event_chocolat_laitActionPerformed
    int clicked_chocolat_chaud = 0;
    private void chocolat_chaudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolat_chaudActionPerformed
        clicked_soda = 0;
        clickedexp = 0;
        clickedcapucin = 0;
        clickedexpspec = 0;
        clickedcapspec = 0;
        clicked_creme_spec = 0;
        clicked_capucino = 0;
        clicked_chocolat_lait = 0;
        cliced_american = 0;
        clicked_creme = 0;
        reset_soda();
        reset_jwajem();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(chocolat_chaud.getText());
        label_drink.setText("chocolat chaud");
        clicked_chocolat_chaud++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_chocolat_chaud);
        System.out.println(clicked_chocolat_chaud);
        jTextField1.setText(clicked_chocolat_chaud + " " + chocolat_chaud.getText());

        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.print(tot);
        
    }//GEN-LAST:event_chocolat_chaudActionPerformed
    int cliced_american = 0;
    private void americanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanActionPerformed
        clicked_soda = 0;
        clickedexp = 0;
        clickedcapucin = 0;
        clickedexpspec = 0;
        clickedcapspec = 0;
        clicked_creme_spec = 0;
        clicked_capucino = 0;
        clicked_chocolat_lait = 0;
        clicked_chocolat_chaud = 0;
        clicked_creme = 0;
        reset_soda();
        reset_jwajem();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(american.getText());
        label_drink.setText("américan");
        cliced_american++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + cliced_american);
        System.out.println(cliced_american);
        jTextField1.setText(cliced_american + " " + american.getText());

        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.print(tot);
        
    }//GEN-LAST:event_americanActionPerformed
    int clicked_creme = 0;
    private void cafe_cremeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafe_cremeActionPerformed
        clicked_soda = 0;
        clickedexp = 0;
        clickedcapucin = 0;
        clickedexpspec = 0;
        clickedcapspec = 0;
        clicked_creme_spec = 0;
        clicked_capucino = 0;
        clicked_chocolat_lait = 0;
        clicked_chocolat_chaud = 0;
        cliced_american = 0;
        reset_soda();
        reset_jwajem();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(cafe_creme.getText());
        label_drink.setText("café créme");
        clicked_creme++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_creme);
        System.out.println(clicked_creme);
        jTextField1.setText(clicked_creme + " " + cafe_creme.getText());

        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.print(tot);
        
    }//GEN-LAST:event_cafe_cremeActionPerformed
    int clicked_citronade = 0;
    private void citronadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citronadeActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        clicked_cookies = 0;
        clicked_orio = 0;
        clicked_chocolat = 0;
        clicked_milkshake = 0;
        clicked_cocktail = 0;
        clicked_orange = 0;
        clicked_banane = 0;
        clicked_fraise = 0;
        clicked_citronade_amande = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(citronade.getText());
        label_drink.setText("citronade");
        clicked_citronade++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_citronade);
        System.out.println(clicked_citronade);
        jTextField1.setText(clicked_citronade + " " + citronade.getText());

        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.print(tot);
        
    }//GEN-LAST:event_citronadeActionPerformed
    int clicked_orange = 0;
    private void orangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeActionPerformed
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_jwajem();
        reset_soda();
        clicked_cookies = 0;
        clicked_orio = 0;
        clicked_chocolat = 0;
        clicked_milkshake = 0;
        clicked_cocktail = 0;
        clicked_citronade = 0;
        clicked_banane = 0;
        clicked_fraise = 0;
        clicked_citronade_amande = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(orange.getText());
        label_drink.setText("orange");
        clicked_orange++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_orange);
        System.out.println(clicked_orange);
        jTextField1.setText(clicked_orange + " " + orange.getText());
        
    }//GEN-LAST:event_orangeActionPerformed
    int clicked_banane = 0;
    private void bananeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bananeActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        clicked_cookies = 0;
        clicked_orio = 0;
        clicked_chocolat = 0;
        clicked_milkshake = 0;
        clicked_cocktail = 0;
        clicked_citronade = 0;
        clicked_orange = 0;
        clicked_fraise = 0;
        clicked_citronade_amande = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(banane.getText());
        label_drink.setText("banane");
        clicked_banane++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_banane);
        System.out.println(clicked_banane);
        jTextField1.setText(clicked_banane + " " + banane.getText());
        
    }//GEN-LAST:event_bananeActionPerformed
    int clicked_fraise = 0;
    private void fraiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fraiseActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        clicked_cookies = 0;
        clicked_orio = 0;
        clicked_chocolat = 0;
        clicked_milkshake = 0;
        clicked_cocktail = 0;
        clicked_citronade = 0;
        clicked_orange = 0;
        clicked_banane = 0;
        clicked_citronade_amande = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(fraise.getText());
        label_drink.setText("fraise");
        clicked_fraise++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_fraise);
        System.out.println(clicked_fraise);
        jTextField1.setText(clicked_fraise + " " + fraise.getText());
        
    }//GEN-LAST:event_fraiseActionPerformed
    int clicked_citronade_amande = 0;
    private void citronade_amandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citronade_amandesActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        clicked_cookies = 0;
        clicked_orio = 0;
        clicked_chocolat = 0;
        clicked_milkshake = 0;
        clicked_cocktail = 0;
        clicked_citronade = 0;
        clicked_orange = 0;
        clicked_banane = 0;
        clicked_fraise = 0;

        drink_num.setText(String.valueOf(1));
        jTextField1.setText(citronade_amandes.getText());
        label_drink.setText("citronade amandes");
        clicked_citronade_amande++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_citronade_amande);
        System.out.println(clicked_citronade_amande);
        jTextField1.setText(clicked_citronade_amande + " " + citronade_amandes.getText());
        
    }//GEN-LAST:event_citronade_amandesActionPerformed
    int clicked_milkshake = 0;
    private void milkshakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milkshakeActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        clicked_cookies = 0;
        clicked_orio = 0;
        clicked_chocolat = 0;
        clicked_cocktail = 0;
        clicked_citronade = 0;
        clicked_orange = 0;
        clicked_banane = 0;
        clicked_fraise = 0;
        clicked_citronade_amande = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(milkshake.getText());
        label_drink.setText("milkshake");
        clicked_milkshake++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_milkshake);
        System.out.println(clicked_milkshake);
        jTextField1.setText(clicked_milkshake + " " + milkshake.getText());
        
    }//GEN-LAST:event_milkshakeActionPerformed
    int clicked_chocolat = 0;
    private void chocolatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolatActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        clicked_cookies = 0;
        clicked_orio = 0;
        clicked_milkshake = 0;
        clicked_cocktail = 0;
        clicked_citronade = 0;
        clicked_orange = 0;
        clicked_banane = 0;
        clicked_fraise = 0;
        clicked_citronade_amande = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(chocolat.getText());
        label_drink.setText("chocolat");
        clicked_chocolat++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_chocolat);
        System.out.println(clicked_chocolat);
        jTextField1.setText(clicked_chocolat + " " + chocolat.getText());
        
    }//GEN-LAST:event_chocolatActionPerformed
    int clicked_orio = 0;
    private void orioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orioActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        clicked_cookies = 0;
        clicked_chocolat = 0;
        clicked_milkshake = 0;
        clicked_cocktail = 0;
        clicked_citronade = 0;
        clicked_orange = 0;
        clicked_banane = 0;
        clicked_fraise = 0;
        clicked_citronade_amande = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(orio.getText());
        label_drink.setText("orio");
        clicked_orio++;
        drink_num.setText("" + clicked_orio);
        System.out.println(clicked_orio);
        jTextField1.setText(clicked_orio + " " + orio.getText());
        
    }//GEN-LAST:event_orioActionPerformed
    int clicked_cookies = 0;
    private void cookieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        clicked_orio = 0;
        clicked_chocolat = 0;
        clicked_milkshake = 0;
        clicked_cocktail = 0;
        clicked_citronade = 0;
        clicked_orange = 0;
        clicked_banane = 0;
        clicked_fraise = 0;
        clicked_citronade_amande = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(cookie.getText());
        label_drink.setText("cookies");
        clicked_cookies++;
        drink_num.setText("" + clicked_cookies);
        System.out.println(clicked_cookies);
        jTextField1.setText(clicked_cookies + " " + cookie.getText());
        
    }//GEN-LAST:event_cookieActionPerformed
    int clicked_the_menthe = 0;
    private void the_mentheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_the_mentheActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_juce();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        cliked_the_amande = 0;
        clicked_infusion = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(the_menthe.getText());
        label_drink.setText("thé menthe");
        clicked_the_menthe++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_the_menthe);
        System.out.println(clicked_the_menthe);
        jTextField1.setText(clicked_the_menthe + " " + the_menthe.getText());
        
    }//GEN-LAST:event_the_mentheActionPerformed
    int cliked_the_amande = 0;
    private void the_amandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_the_amandeActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_juce();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        clicked_the_menthe = 0;
        clicked_infusion = 0;

        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(the_amande.getText());
        label_drink.setText("thé au amandes");
        cliked_the_amande++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + cliked_the_amande);
        System.out.println(cliked_the_amande);
        jTextField1.setText(cliked_the_amande + " " + the_amande.getText());
        
    }//GEN-LAST:event_the_amandeActionPerformed
    int clicked_infusion = 0;
    private void infusionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infusionActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_juce();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_soda();
        clicked_the_menthe = 0;
        cliked_the_amande = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(infusion.getText());
        label_drink.setText("infusion");
        clicked_infusion++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_infusion);
        System.out.println(clicked_infusion);
        jTextField1.setText(clicked_infusion + " " + infusion.getText());
        
    }//GEN-LAST:event_infusionActionPerformed
    int clicked_crepe_suree = 0;
    private void crepe_sureeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crepe_sureeActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_juce();
        reset_water();
        reset_tea();
        reset_coffee();
        reset_soda();
        clicked_crepe_salee = 0;
        clicked_guaffre_sucree = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(crepe_suree.getText());
        label_drink.setText("crépe sucrée");
        clicked_crepe_suree++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_crepe_suree);
        System.out.println(clicked_crepe_suree);
        jTextField1.setText(clicked_crepe_suree + " " + crepe_suree.getText());
        
    }//GEN-LAST:event_crepe_sureeActionPerformed
    int clicked_crepe_salee = 0;
    private void crepe_saleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crepe_saleeActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_juce();
        reset_water();
        reset_tea();
        reset_coffee();
        reset_soda();
        clicked_crepe_suree = 0;
        clicked_guaffre_sucree = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(crepe_salee.getText());
        label_drink.setText("crépe salée");
        clicked_crepe_salee++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_crepe_salee);
        System.out.println(clicked_crepe_salee);
        jTextField1.setText(clicked_crepe_salee + " " + crepe_salee.getText());
        
    }//GEN-LAST:event_crepe_saleeActionPerformed
    int clicked_guaffre_sucree = 0;
    private void guaffre_sucreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guaffre_sucreeActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_juce();
        reset_water();
        reset_tea();
        reset_coffee();
        reset_soda();
        clicked_crepe_suree = 0;
        clicked_crepe_salee = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(guaffre_sucree.getText());
        label_drink.setText("gaufre sucée");
        clicked_guaffre_sucree++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_guaffre_sucree);
        System.out.println(clicked_guaffre_sucree);
        jTextField1.setText(clicked_guaffre_sucree + " " + guaffre_sucree.getText());
        
    }//GEN-LAST:event_guaffre_sucreeActionPerformed
    int clicked_gateau = 0;
    private void GateauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GateauActionPerformed
        reset_hookah();
        reset_crepe();
        reset_juce();
        reset_water();
        reset_tea();
        reset_coffee();
        reset_jwajem();
        reset_soda();
        clicked_gateau_spetial = 0;
        clicked_croissant = 0;
        clicked_cake = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(Gateau.getText());
        label_drink.setText("gateau");
        clicked_gateau++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_gateau);
        System.out.println(clicked_gateau);
        jTextField1.setText(clicked_gateau + " " + Gateau.getText());
        
    }//GEN-LAST:event_GateauActionPerformed
    int clicked_gateau_spetial = 0;
    private void gateau_spetialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gateau_spetialActionPerformed
        reset_hookah();
        reset_jwajem();
        reset_crepe();
        reset_juce();
        reset_water();
        reset_tea();
        reset_coffee();
        reset_soda();
        clicked_gateau = 0;
        clicked_croissant = 0;
        clicked_cake = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(gateau_spetial.getText());
        label_drink.setText("gateau spécial");
        clicked_gateau_spetial++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_gateau_spetial);
        System.out.println(clicked_gateau_spetial);
        jTextField1.setText(clicked_gateau_spetial + " " + gateau_spetial.getText());
       
    }//GEN-LAST:event_gateau_spetialActionPerformed
    int clicked_croissant = 0;
    private void croissantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_croissantActionPerformed
        reset_hookah();
        reset_crepe();
        reset_juce();
        reset_water();
        reset_tea();
        reset_coffee();
        reset_jwajem();
        reset_soda();
        clicked_gateau = 0;
        clicked_gateau_spetial = 0;
        clicked_cake = 0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(croissant.getText());
        label_drink.setText("croissant");
        clicked_croissant++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_croissant);
        System.out.println(clicked_croissant);
        jTextField1.setText(clicked_croissant + " " + croissant.getText());
        
    }//GEN-LAST:event_croissantActionPerformed
    int clicked_cake = 0;
    private void cakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cakeActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_crepe();
        reset_juce();
        reset_water();
        reset_tea();
        reset_coffee();
        reset_soda();
        clicked_gateau = 0;
        clicked_gateau_spetial = 0;
        clicked_croissant = 0;

        drink_num.setText(String.valueOf(1));
        jTextField1.setText(cake.getText());
        label_drink.setText("cake");
        clicked_cake++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_cake);
        System.out.println(clicked_cake);
        jTextField1.setText(clicked_cake + " " + cake.getText());
        /*
        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());System.out.print(price);
        double tot = price * Integer.parseInt(drink_num.getText());System.out.print(tot);
        insert_order();
        update_last();
        select_last();*/
    }//GEN-LAST:event_cakeActionPerformed
    int clicked_hookah_love = 0;
    private void hookah_loveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hookah_loveActionPerformed
        reset_jwajem();
        reset_delice();
        reset_crepe();
        reset_juce();
        reset_water();
        reset_tea();
        reset_coffee();
        reset_soda();
        clicked_hookah_apple = 0;
        clicked_hookah_menthos = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(hookah_love.getText());
        label_drink.setText("chicha gout");
        clicked_hookah_love++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_hookah_love);
        System.out.println(clicked_hookah_love);
        jTextField1.setText(clicked_hookah_love + " " + hookah_love.getText());
        
    }//GEN-LAST:event_hookah_loveActionPerformed
    int clicked_hookah_apple = 0;
    private void hookah_appleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hookah_appleActionPerformed
        reset_delice();
        reset_crepe();
        reset_juce();
        reset_water();
        reset_tea();
        reset_coffee();
        reset_jwajem();
        reset_soda();
        clicked_hookah_love = 0;
        clicked_hookah_menthos = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(hookah_apple.getText());
        label_drink.setText("chicha normal");
        clicked_hookah_apple++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_hookah_apple);
        System.out.println(clicked_hookah_apple);
        jTextField1.setText(clicked_hookah_apple + " " + hookah_apple.getText());
        
    }//GEN-LAST:event_hookah_appleActionPerformed
    int clicked_hookah_menthos = 0;
    private void hookah_menthosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hookah_menthosActionPerformed
        reset_delice();
        reset_jwajem();
        reset_crepe();
        reset_juce();
        reset_water();
        reset_tea();
        reset_coffee();
        reset_soda();
        clicked_hookah_love = 0;
        clicked_hookah_apple = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(hookah_menthos.getText());
        label_drink.setText("chicha jirak");
        clicked_hookah_menthos++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_hookah_menthos);
        System.out.println(clicked_hookah_menthos);
        jTextField1.setText(clicked_hookah_menthos + " " + hookah_menthos.getText());
        
    }//GEN-LAST:event_hookah_menthosActionPerformed
    int clicked_water1l = 0;
    private void water1lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_water1lActionPerformed
        reset_jwajem();
        reset_delice();
        reset_crepe();
        reset_juce();
        reset_hookah();
        reset_tea();
        reset_coffee();
        reset_soda();
        clicked_watermini = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(water1l.getText());
        label_drink.setText("eau 1L");
        clicked_water1l++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_water1l);
        System.out.println(clicked_water1l);
        jTextField1.setText(clicked_water1l + " " + water1l.getText());
        
    }//GEN-LAST:event_water1lActionPerformed
    int clicked_watermini = 0;
    private void waterminiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterminiActionPerformed
        reset_delice();
        reset_jwajem();
        reset_crepe();
        reset_juce();
        reset_hookah();
        reset_tea();
        reset_coffee();
        reset_soda();
        clicked_water1l = 0;
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(watermini.getText());
        label_drink.setText("eau 1/2l");
        clicked_watermini++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_watermini);
        System.out.println(clicked_watermini);
        jTextField1.setText(clicked_watermini + " " + watermini.getText());
        
    }//GEN-LAST:event_waterminiActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (bill_id.getText().isEmpty()){
        
        int clicked = Integer.parseInt(drink_num.getText());
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Select a drink !");
        } else {
            String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            clicked--;
            
            if (clicked <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Select at least one drink !");
            } else {
                numb = String.valueOf(clicked);
                drink_num.setText(numb);
                System.out.println(clicked);
                get_price();
                double tot = clicked * Double.parseDouble(price_txt.getText());
                String text_details = jTextField1.getText().substring(1, jTextField1.getText().length());
                String tot_string = String.valueOf(tot);
                int lenght_tot = tot_string.length();
                System.out.println("totl lenght" + lenght_tot);
                int lenght = jTextField1.getText().length();
                String total_sub = jTextField1.getText().substring(1, jTextField1.getText().length() - lenght_tot);
                System.out.println("Total sub" + total_sub);
                jTextField1.setText(numb + " " + total_sub + " " + tot);
                /////
              
            }

        }
        }else{
            int clicked = qte_drink_bill;
          System.out.println("Quantity "+clicked);
          System.out.println("price bill"+price_bill);
          String numb = jTextField1.getText().substring(0, 1);
            System.out.print("number " + numb);
            char numb2 = numb.charAt(0);
            System.out.print("Char " + numb2);
            qte_drink_bill--;
            if (qte_drink_bill<=0){
            JOptionPane.showMessageDialog(rootPane, "Select at least one drink !");
            }else{
            numb = String.valueOf(qte_drink_bill);
            drink_num.setText(numb);
            System.out.println(qte_drink_bill);
            get_price();
            double tot = qte_drink_bill * price_bill;
            String text_details = jTextField1.getText().substring(1, jTextField1.getText().length());
            String tot_string = String.valueOf(tot);
            int lenght_tot = tot_string.length();
            System.out.println("totl lenght" + lenght_tot);
            int lenght = jTextField1.getText().length();
            String total_sub = jTextField1.getText().substring(1, jTextField1.getText().length() - lenght_tot);
            System.out.println("Total sub" + total_sub);
            jTextField1.setText(numb + " " + total_sub + " " + tot);}
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        DefaultTableModel table =(DefaultTableModel) tab_ticket.getModel();
        if ((bill_id.getText().isEmpty())){
        
        if (drink_num.getText() == "") {
            JOptionPane.showMessageDialog(rootPane, "Please select a drink to insert");
        } else {
            double total_ticket = Double.parseDouble(tot_ticket.getText());
            String numb = jTextField1.getText().substring(0, 1);
            int number = Integer.parseInt(String.valueOf(numb));
            System.out.println(number);
            if (number == Integer.parseInt(drink_num.getText())) {
                get_price();
                double price = Double.parseDouble(price_txt.getText());
                double tot = price * Integer.parseInt(drink_num.getText());
                //ticket.append(jTextField1.getText()+" "+tot+"\n");
                total_lab.setText("" + tot);
                total_ticket = tot + total_ticket;
                tot_ticket.setText("" + total_ticket);

            }
            insert_order();
            drink_num.setText(String.valueOf(0));
            clicked = 0;
            select_last();
            drink_num.setText("");
            price_txt.setText("");
            jTextField1.setText("");
        }
        ticket.setText("");
        setheader();
        }else{
            insert_bill_update();
            table.setRowCount(0);
            get_bill();
            getSumTotalsticket();
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    int id_order = 0;

    void remove_drink() {
        if (bill_id.getText().isEmpty()){
        System.out.println("total " + total_drink_selected);
        double new_tot = Double.parseDouble(tot_ticket.getText()) - total_drink_selected;
        System.out.println("new tot" + new_tot);
        System.out.println("new total " + new_tot);
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        if (id_order == 0) {
            JOptionPane.showMessageDialog(rootPane, "Plese select a drink to remove ! ");
        } else {
            int res = JOptionPane.showConfirmDialog(rootPane, "Remove this item ?");
            if (res == 0) {
                try {
                    st = (Statement) cnx.obtenircon().createStatement();
                    st.executeUpdate("delete from orders2 where idorders='" + id_order + "'");
                    JOptionPane.showMessageDialog(rootPane, "Deleted");
                    drink_num.setText("");
                    price_txt.setText("");
                    jTextField1.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

            }
        }

        table.removeRow(tab_ticket.getSelectedRow());
        tot_ticket.setText("" + new_tot);
        }else{
            System.out.println("total " + total_drink_selected);
        double new_tot = Double.parseDouble(tot_ticket.getText()) - total_drink_selected;
        System.out.println("new tot" + new_tot);
        System.out.println("new total " + new_tot);
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        int row =  tab_ticket.getSelectedRow();System.out.println("Rowst" + row);
         String tab = (tab_ticket.getValueAt(row,0).toString());System.out.println("id bill" + tab);

            int res = JOptionPane.showConfirmDialog(rootPane, "Remove this item ?");
            if (res == 0) {
                try {
                    st = (Statement) cnx.obtenircon().createStatement();
                    st.executeUpdate("delete from stats where idstats='"+tab+"'");
                    JOptionPane.showMessageDialog(rootPane, "Deleted");
                    table.setRowCount(0);
                    get_bill();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

            }
       
        tot_ticket.setText("" + new_tot);
    }
    }
    void remove_drink_bill() {
        System.out.println("total " + total_drink_selected);
        double new_tot = Double.parseDouble(tot_ticket.getText()) - total_drink_selected;
        System.out.println("new tot" + new_tot);
        System.out.println("new total " + new_tot);
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        if (id_order == 0) {
            JOptionPane.showMessageDialog(rootPane, "Plese select a drink to remove ! ");
        } else {
            int res = JOptionPane.showConfirmDialog(rootPane, "Remove this item ?");
            if (res == 0) {
                try {
                    st = (Statement) cnx.obtenircon().createStatement();
                    st.executeUpdate("delete from orders where idorders='" + id_order + "'");
                    JOptionPane.showMessageDialog(rootPane, "Deleted");
                    drink_num.setText("");
                    price_txt.setText("");
                    jTextField1.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

            }
        }

        table.removeRow(tab_ticket.getSelectedRow());
        tot_ticket.setText("" + new_tot);
    }
    void remove_bill() {
                try {
                    st = (Statement) cnx.obtenircon().createStatement();
                    st.executeUpdate("delete from stats where bill_no='" + Integer.parseInt(bill_id.getText()) + "'");
                    JOptionPane.showMessageDialog(rootPane, "Deleted");
                    drink_num.setText("");
                    price_txt.setText("");
                    jTextField1.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

            
        }
    double total_drink_selected;
    private void tab_ticketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_ticketMouseClicked
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        if (bill_id.getText().isEmpty()){
            
        try {
            st = (Statement) cnx.obtenircon().createStatement();
            int row = tab_ticket.getSelectedRow();
            String tab = (tab_ticket.getValueAt(row, 0).toString());
            ResultSet rs = st.executeQuery("select idorders, drink, qte, total from orders2 where idorders='" + tab + "'");
            if (rs.next()) {
                int add = rs.getInt("idorders");
                id_order = add;System.out.println("ID drink "+id_order);
                iddrink.setText(String.valueOf(add));
                double add2 = rs.getDouble("total");System.out.println("total "+add2);
                total_drink_selected = add2;
                int add3 = rs.getInt("qte");System.out.println("qte  "+add3);
                drink_num.setText(String.valueOf(add3));
                String add4 = rs.getString("drink");System.out.println(" drink "+add4);
                label_drink.setText(add4);
                jTextField1.setText(add3 + " " + add4 + " " + add2);
            }
            System.out.println(id_order);
            System.out.println(total_drink_selected);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }else{
            select_bill();
        }
        

    }//GEN-LAST:event_tab_ticketMouseClicked
    int bill;String drink_bill;double price_bill;double total_bill;int qte_drink_bill;
    void select_bill(){
    DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        try {
            st = (Statement) cnx.obtenircon().createStatement();
            int row = tab_ticket.getSelectedRow();
            String tab = (tab_ticket.getValueAt(row, 2).toString());System.out.println("drink bill "+tab);
            String tab2 = (tab_ticket.getValueAt(row, 0).toString());System.out.println("ID drink bill "+tab2);
            ResultSet rs = st.executeQuery("select idstats, qte, drink, price,bill_no, total from stats where drink='" + tab + "' and idstats='"+tab2+"'");
            if (rs.next()) {
                int add = rs.getInt("bill_no");
                bill = add;System.out.println("BIll id "+bill);
                double add2 = rs.getDouble("total");
                total_bill = add2;System.out.println("total  "+total_bill);
                int add3 = rs.getInt("qte");
                qte_drink_bill=add3;System.out.println("qte drink "+qte_drink_bill);
                String add4 = rs.getString("drink");
                drink_bill = add4;System.out.println("drink bill "+drink_bill);
                double add5 = rs.getDouble("price");
                price_bill = add5;System.out.println("price bill "+price_bill);
                label_drink.setText(add4);
                jTextField1.setText(add3 + " " + add4 + " " + add2);
            }
            System.out.println(id_order);
            System.out.println(total_drink_selected);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    private void remove_order_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_order_btnActionPerformed
        if (bill_id.getText().isEmpty()){
            if (drink_num.getText() == "") {
            JOptionPane.showMessageDialog(rootPane, "Select an item to remove");
        } else {
            remove_drink();
            getSumTotalsticket();
        }
        }
        else{
            DefaultTableModel table = (DefaultTableModel)tab_ticket.getModel();
            remove_bill();
            table.setRowCount(0);
            getSumTotalsticket();
        }

    }//GEN-LAST:event_remove_order_btnActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        remove_drink();
        getSumTotalsticket();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void update_order_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_order_btnActionPerformed
        if (bill_id.getText().isEmpty()){
            if (drink_num.getText() == "") {
            JOptionPane.showMessageDialog(rootPane, "Select a drink to update !");
        } else {
            DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
            update_drink();
            table.removeRow(tab_ticket.getSelectedRow());
            select_updated();
            getSumTotalsticket();
        }
        }else{
            DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
            update_drink_bill();
            table.removeRow(tab_ticket.getSelectedRow());
            select_updated_bill();
            getSumTotalsticket();
        }
    }//GEN-LAST:event_update_order_btnActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        logged_in.setText("");
        waiter_logged_in.setText("");
        jButton19.setBackground(Color.LIGHT_GRAY);
        jButton19.setText("Connect");
        user_name.setText("");
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton4.setEnabled(false);
        jButton21.setEnabled(false);
        jButton5.setEnabled(false);
        jButton23.setEnabled(false);
        jButton24.setEnabled(false);
        jButton3.setEnabled(false);
        jButton27.setEnabled(false);
        update_order_btn.setEnabled(false);
        remove_order_btn.setEnabled(false);
        disable_menue();
        table.setRowCount(0);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField6.setText("");
        jPasswordField2.setText("");
        jButton17.setBackground(Color.LIGHT_GRAY);
        jButton17.setText("Connect");
        jLabel24.setVisible(false);
        if (jButton17.getText() == "Connected") {
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton4.setEnabled(true);
            jButton21.setEnabled(true);
            jButton5.setEnabled(true);
            jButton23.setEnabled(true);
            jButton24.setEnabled(true);
            jButton3.setEnabled(true);
            jButton27.setEnabled(true);
            update_order_btn.setEnabled(true);
            remove_order_btn.setEnabled(true);

        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton4.setEnabled(false);
            jButton21.setEnabled(false);
            jButton5.setEnabled(false);
            jButton23.setEnabled(false);
            jButton24.setEnabled(false);
            jButton3.setEnabled(false);
            jButton27.setEnabled(false);
            update_order_btn.setEnabled(false);
            remove_order_btn.setEnabled(false);
            jDateChooser1.setVisible(false);
            ticketNoLabel.setVisible(false);
            bill_id.setVisible(false);
            bill_id.setText("");
            jButton26.setVisible(false);
            jButton26.setEnabled(false);
            remove_ticket_btn.setVisible(false);
            remove_ticket_btn.setEnabled(false);
            update_ticket_btn.setVisible(false);
            update_ticket_btn.setEnabled(false);
            waiters.setVisible(false);
            waiters.setEnabled(false);
            //waiters.removeAllItems();
            table.setRowCount(0);
            ticket.setText("");
            setheader();
            disable_menue();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        ///////////cafes ////////////
        clicked_soda = 0;
        cafe_creme.setVisible(false);
        chocolat_lait.setVisible(false);
        capucin_special.setVisible(false);
        cafe_creme.setEnabled(false);
        chocolat_lait.setEnabled(false);
        capucin_special.setEnabled(false);
        american.setVisible(false);
        chocolat_chaud.setVisible(false);
        creme_special.setVisible(false);
        american.setEnabled(false);
        chocolat_chaud.setEnabled(false);
        creme_special.setEnabled(false);
        capucino.setVisible(false);
        express_special.setVisible(false);
        express.setVisible(false);
        capucino.setEnabled(false);
        express_special.setEnabled(false);
        express.setEnabled(false);
        cafe_turc.setVisible(false);
        capucin.setVisible(false);
        cafe_turc.setEnabled(false);
        capucin.setEnabled(false);
        ////////////juces //////////
        orange.setVisible(false);
        citronade.setVisible(false);
        banane.setVisible(false);
        fraise.setVisible(false);
        orange.setEnabled(false);
        citronade.setEnabled(false);
        banane.setEnabled(false);
        fraise.setEnabled(false);
        citronade_amandes.setVisible(false);
        cocktail_fruits.setVisible(false);
        citronade_amandes.setEnabled(false);
        cocktail_fruits.setEnabled(false);
        milkshake.setVisible(false);
        chocolat.setVisible(false);
        milkshake.setEnabled(false);
        chocolat.setEnabled(false);
        orio.setVisible(false);
        cookie.setVisible(false);
        orio.setEnabled(false);
        cookie.setEnabled(false);
        /////////tea/////////////
        the_menthe.setVisible(false);
        the_menthe.setEnabled(false);
        the_amande.setVisible(false);
        the_amande.setEnabled(false);
        infusion.setVisible(false);
        infusion.setEnabled(false);
        //////////grépes////////
        crepe_suree.setVisible(false);
        crepe_suree.setEnabled(false);
        crepe_salee.setVisible(false);
        crepe_salee.setEnabled(false);
        guaffre_sucree.setVisible(false);
        guaffre_sucree.setEnabled(false);
        ///////////
        Gateau.setVisible(false);
        Gateau.setEnabled(false);
        gateau_spetial.setVisible(false);
        gateau_spetial.setEnabled(false);
        croissant.setVisible(false);
        croissant.setEnabled(false);
        cake.setVisible(false);
        cake.setEnabled(false);
        ////////////
        water1l.setVisible(false);
        water1l.setEnabled(false);
        watermini.setVisible(false);
        watermini.setEnabled(false);
        //soda
        coke.setVisible(false);
        coke.setEnabled(false);
        fanta.setVisible(false);
        fanta.setEnabled(false);
        orangina.setVisible(false);
        orangina.setEnabled(false);
        kamthari.setVisible(false);
        kamthari.setEnabled(false);
        //////
        jwajem.setVisible(true);
        jwajem.setEnabled(true);
        jwajem_calm.setVisible(true);
        jwajem_calm.setEnabled(true);
        menue.setText("Jwajem");
    }//GEN-LAST:event_jButton31ActionPerformed
    int clicked_jwajem = 0;
    private void jwajemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jwajemActionPerformed
        clikced_jwajem_calm = 0;
        //
        reset_coffee();
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_soda();
        drink_num.setText(String.valueOf(1));
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(cafe_turc.getText());
        label_drink.setText("jwajem");
        drink_num.setText("" + clicked_jwajem);
        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.println(tot);

        clicked_jwajem++;
        ///numb = String.valueOf(clicked);
        drink_num.setText(String.valueOf(clicked_jwajem));
        jTextField1.setText(clicked_jwajem + " " + jwajem.getText());
        System.out.println(clicked_jwajem);
    }//GEN-LAST:event_jwajemActionPerformed
    int clikced_jwajem_calm = 0;
    private void jwajem_calmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jwajem_calmActionPerformed
        clicked_jwajem = 0;
        //
        reset_juce();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_soda();
        drink_num.setText(String.valueOf(1));
        drink_num.setText(String.valueOf(1));
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        jTextField1.setText(jwajem_calm.getText());
        label_drink.setText("jwajem calm");
        drink_num.setText("" + clikced_jwajem_calm);
        get_price();
        get_total();
        double price = Double.parseDouble(price_txt.getText());
        double tot = price * Integer.parseInt(drink_num.getText());
        System.out.println(tot);

        clikced_jwajem_calm++;
        ///numb = String.valueOf(clicked);
        drink_num.setText(String.valueOf(clikced_jwajem_calm));
        jTextField1.setText(clikced_jwajem_calm + " " + jwajem_calm.getText());
        System.out.println(clikced_jwajem_calm);
    }//GEN-LAST:event_jwajem_calmActionPerformed
    int clicked_coke =0;
    private void cokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_juce();
        
        clicked_fanta = 0;
        clicked_orangina =0;
        clicked_kamthari =0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(coke.getText());
        label_drink.setText("coke");
        clicked_coke++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_coke);
        System.out.println(clicked_coke);
        jTextField1.setText(clicked_coke + " " + coke.getText());
    }//GEN-LAST:event_cokeActionPerformed
    int clicked_fanta = 0;
    private void fantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantaActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_juce();
        
        clicked_coke = 0;
        clicked_orangina = 0;
        clicked_kamthari =0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(fanta.getText());
        label_drink.setText("fanta");
        clicked_fanta++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_fanta);
        System.out.println(clicked_fanta);
        jTextField1.setText(clicked_fanta + " " + fanta.getText());
    }//GEN-LAST:event_fantaActionPerformed
    int clicked_orangina = 0;
    private void oranginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oranginaActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_juce();
        
        clicked_coke = 0;
        clicked_fanta = 0;
        clicked_kamthari =0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(orangina.getText());
        label_drink.setText("orangina");
        clicked_orangina++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_orangina);
        System.out.println(clicked_orangina);
        jTextField1.setText(clicked_orangina + " " + orangina.getText());
    }//GEN-LAST:event_oranginaActionPerformed
    int clicked_kamthari =0;
    private void kamthariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kamthariActionPerformed
        reset_jwajem();
        reset_hookah();
        reset_delice();
        reset_tea();
        reset_water();
        reset_crepe();
        reset_coffee();
        reset_juce();
        clicked_coke = 0;
        clicked_fanta = 0;
        clicked_orangina =0;
        drink_num.setText(String.valueOf(1));
        jTextField1.setText(kamthari.getText());
        label_drink.setText("kamthari");
        clicked_kamthari++;
        //numb = String.valueOf(clicked);
        drink_num.setText("" + clicked_kamthari);
        System.out.println(clicked_kamthari);
        jTextField1.setText(clicked_kamthari + " " + kamthari.getText());
    }//GEN-LAST:event_kamthariActionPerformed
    String logged_waiter="";
    private void waiterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_waiterFocusLost
       try {
                String log = waiter.getText();
                String query = "select idserveur, nom, user_name, password from serveur where user_name='"+log+"'";
                st = cnx.obtenircon().createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    String id2 = rs.getString("user_name");
                    String pass2 = rs.getString("password");
                    logged_waiter=id2;
                    String name=rs.getString("nom");
                    String id_waiter = rs.getString("idserveur");
                    System.out.println(id2);
                    System.out.println(pass2);
                    System.out.println(log);
                }
                if (logged_waiter.isBlank()){
                        JOptionPane.showMessageDialog(rootPane, "No such user !");
                     
                }else{
                    System.out.println("Verified");
                   }
       }catch(Exception e){
              JOptionPane.showMessageDialog(rootPane, e); 
        }
    }//GEN-LAST:event_waiterFocusLost

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        
    }//GEN-LAST:event_jTextField6FocusLost

    private void bill_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bill_idKeyTyped
            
    }//GEN-LAST:event_bill_idKeyTyped

    private void bill_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bill_idKeyPressed
        
    }//GEN-LAST:event_bill_idKeyPressed

    private void bill_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bill_idKeyReleased
        
    }//GEN-LAST:event_bill_idKeyReleased

    private void update_ticket_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ticket_btnActionPerformed
        if (drink_num.getText() == "") {
            JOptionPane.showMessageDialog(rootPane, "Select a drink to update !");
        } else {
            DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
            update_drink_bill();
            table.removeRow(tab_ticket.getSelectedRow());
            select_updated_bill();
            getSumTotalsticket();
        }
    }//GEN-LAST:event_update_ticket_btnActionPerformed
    void get_bill(){
    DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        //table.setRowCount(0);
        
        try{
          String waiter = (String) waiters.getSelectedItem();System.out.println("Waiter "+waiter);
          Date DateChooser = jDateChooser1.getDate();
          SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date;
        //date = sdf1.parse(DateChooser);
        java.sql.Date sqldate = new java.sql.Date(DateChooser.getTime());System.out.println("sql date "+sqldate);
        String query = "select idstats, bill_no, qte, drink, price, total, date, time, name_waiter from stats where bill_no='"+Integer.parseInt(bill_id.getText())+"' and date ='"+sqldate+"' and name_waiter='"+waiter+"'";
        String query2="select idstats, bill_no, qte, drink, price, total, date, time, name_waiter from stats where bill_no='"+Integer.parseInt(bill_id.getText())+"' and date ='"+sqldate+"' and name_waiter='"+waiter_logged_in.getText()+"'";        
        st = cnx.obtenircon().createStatement();
                if (waiter.equals("Waiters")){
                    ResultSet rs = st.executeQuery(query2);
                 while (rs.next()) {
                table.addRow(new Object[]{rs.getInt("idstats"),rs.getInt("qte"), rs.getString("drink"), rs.getDouble("price"), rs.getDouble("total"),rs.getDate("date"),rs.getString("time"),rs.getString("name_waiter"),rs.getInt("bill_no") });
            }
                }else{
                    ResultSet rs = st.executeQuery(query);
                 while (rs.next()) {
                table.addRow(new Object[]{rs.getInt("idstats"),rs.getInt("qte"), rs.getString("drink"), rs.getDouble("price"), rs.getDouble("total"),rs.getDate("date"),rs.getString("time"),rs.getString("name_waiter"),rs.getInt("bill_no") });
            }
                }
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    private void remove_ticket_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_ticket_btnActionPerformed
            DefaultTableModel table = (DefaultTableModel)tab_ticket.getModel();
            remove_bill();
            table.setRowCount(0);
            getSumTotalsticket();
        
    }//GEN-LAST:event_remove_ticket_btnActionPerformed

    private void bill_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_idActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        table.setRowCount(0);
        get_bill();
    }//GEN-LAST:event_jButton26ActionPerformed
    void update_drink() {
        try {

            double tot = Integer.parseInt(drink_num.getText()) * Double.parseDouble(price_txt.getText());
            System.out.println("total " + tot);
            System.out.println("Total " + tot);
            total_drink_selected = tot;
            System.out.println("total_drink_selected " + total_drink_selected);
            String query = "update orders2 set qte ='" + Integer.parseInt(drink_num.getText()) + "', total='" + tot + "' where drink ='" + label_drink.getText().toLowerCase() + "'";
            st = cnx.obtenircon().createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Updated");
            drink_num.setText("");
            price_txt.setText("");
            jTextField1.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    void update_drink_bill() {
        //int bill;String drink_bill;double price_bill;double total_bill;int qte_drink_bill;
        try {
            System.out.println("price " + price_bill);
            System.out.println("drink num " + drink_num.getText());
            double tot = Integer.parseInt(drink_num.getText()) * price_bill;
            System.out.println("total " + tot);
            total_drink_selected = tot;
            System.out.println("total_drink_selected " + total_drink_selected);
            String query = "update stats set qte ='" + Integer.parseInt(drink_num.getText()) + "', total='" + tot + "' where drink ='" + drink_bill.toLowerCase() + "'";
            st = cnx.obtenircon().createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Updated");
            drink_num.setText("");
            price_txt.setText("");
            jTextField1.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    void update_bill () throws ParseException{
        try {
               
            int bill_num = Integer.parseInt(ticket_num.getText());System.out.println("Bill num to update"+bill_num);
            
            String name_waiter = waiter_logged_in.getText();
            String time = time_label.getText();
            String date_txt = date_label.getText();
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date date;
            date = sdf1.parse(date_txt);
            java.sql.Date sqldate = new java.sql.Date(date.getTime());
            System.out.println("SQL date " + sqldate);
            System.out.println("time " + time);
            //sdouble tot = Integer.parseInt(drink_num.getText()) * price_bill;
            //System.out.println("total " + tot);
            //total_drink_selected = tot;
            System.out.println("total_drink_selected " + total_drink_selected);
            String query = "update stats set date ='" + sqldate + "', time='" + time + "' , waiter ='"+name_waiter+"' where bill_no ='" + bill_num + "'";
            st = cnx.obtenircon().createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Updated");
            drink_num.setText("");
            price_txt.setText("");
            jTextField1.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    double taking;

    public double get_taking_waiter() {
        try {
            String query = "select recette from serveur where user_name='" + user_name.getText() + "'";
            st = cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                taking = rs.getDouble("recette");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        return taking;
    }

    public void update_taking() {
        double taking_waiter = get_taking_waiter();
        double new_taking = taking_waiter + Double.parseDouble(tot_ticket.getText());
        String query = "update serveur set recette ='" + new_taking + "' where user_name='" + user_name.getText() + "'";
        try {
            st = cnx.obtenircon().createStatement();
            st.executeUpdate(query);
            System.out.print("updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    void insert_order() {
        try {
            int billno = Integer.parseInt(ticket_num.getText());
            double price = Double.parseDouble(price_txt.getText());
            double tot = price * Integer.parseInt(drink_num.getText());
            int qte_drink = Integer.parseInt(drink_num.getText());
            //double total = Double.parseDouble(total_lab.getText());
            String drink = label_drink.getText();
            String name_waiter = waiter_logged_in.getText();
            String time = time_label.getText();
            
            String date_txt = date_label.getText();
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date date;
            date = sdf1.parse(date_txt);
            java.sql.Date sqldate = new java.sql.Date(date.getTime());
            System.out.println("sql date " + sqldate);
            st = (Statement) cnx.obtenircon().createStatement();
            st.execute("insert into orders2 (drink, qte, total,time, date, name_waiter, price, bill_no) value ('" + drink + "','" + qte_drink + "','" + tot + "','" + time + "','" + sqldate + "','" + name_waiter + "','" + price + "','"+billno+"')");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    void insert_bill(){
        try {
            int billno = Integer.parseInt(bill_id.getText());System.out.println("bill no"+billno);
            double price = Double.parseDouble(price_txt.getText());System.out.println("price"+price);
            double tot = price * Integer.parseInt(drink_num.getText());System.out.println("total"+tot);
            int qte_drink = Integer.parseInt(drink_num.getText());System.out.println("qte drink"+qte_drink);
            //double total = Double.parseDouble(total_lab.getText());
            String drink = label_drink.getText();System.out.println("drink "+drink);
            String name_waiter = waiter_logged_in.getText();System.out.println("waiter"+name_waiter);
            String time = time_label.getText();System.out.println("time"+time);
            
            String date_txt = date_label.getText();
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date date;
            date = sdf1.parse(date_txt);
            java.sql.Date sqldate = new java.sql.Date(date.getTime());
            System.out.println("sql date " + sqldate);
            st = (Statement) cnx.obtenircon().createStatement();
            st.execute("insert into stats (drink, qte, total,time, date, name_waiter, price, bill_no) value ('" + drink + "','" + qte_drink + "','" + tot + "','" + time + "','" + sqldate + "','" + name_waiter + "','" + price + "','"+billno+"')");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);
        }
         }
    void insert_bill_update(){
        try {
            int billno = Integer.parseInt(bill_id.getText());System.out.println("bill no"+billno);
            double price = Double.parseDouble(price_txt.getText());System.out.println("price"+price);
            double tot = price * Integer.parseInt(drink_num.getText());System.out.println("total"+tot);
            int qte_drink = Integer.parseInt(drink_num.getText());System.out.println("qte drink"+qte_drink);
            //double total = Double.parseDouble(total_lab.getText());
            String drink = label_drink.getText();System.out.println("drink "+drink);
            String name_waiter = waiters.getSelectedItem().toString();System.out.println("waiter"+name_waiter);
            String time = time_label.getText();System.out.println("time"+time);
            
            String date_txt = date_label.getText();
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date date;
            date = sdf1.parse(date_txt);
            java.sql.Date sqldate = new java.sql.Date(date.getTime());
            System.out.println("sql date " + sqldate);
            st = (Statement) cnx.obtenircon().createStatement();
            st.execute("insert into stats (drink, qte, total,time, date, name_waiter, price, bill_no) value ('" + drink + "','" + qte_drink + "','" + tot + "','" + time + "','" + sqldate + "','" + name_waiter + "','" + price + "','"+billno+"')");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);
        }
         }
    void select_updated() {
        try {
            DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
            String query = "select idorders, drink, qte, price, total from orders2 where idorders='" + Integer.parseInt(iddrink.getText()) + "'";
            st = (Statement) cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                table.addRow(new Object[]{rs.getInt("idorders"), rs.getInt("qte"), rs.getString("drink"), rs.getDouble("price"), rs.getDouble("total")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    void select_updated_bill() {
        try {
            DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
            table.setRowCount(0);
            String query = "select idstats, drink, qte, price, total from stats where bill_no='" + Integer.parseInt(bill_id.getText()) + "'";
            st = (Statement) cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                table.addRow(new Object[]{rs.getInt("idstats"), rs.getInt("qte"), rs.getString("drink"), rs.getDouble("price"), rs.getDouble("total")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    void insert_stats() {
        try {
            int nbr = Integer.parseInt(ticket_num.getText());
        
            ticket_num.setText(String.valueOf(nbr));
            int rows = tab_ticket.getRowCount();
            //double price = Double.parseDouble(price_txt.getText());
            //double tot = price * Integer.parseInt(drink_num.getText());
            int bill_num = Integer.parseInt(ticket_num.getText());
            String name_waiter = waiter_logged_in.getText();
            String time = time_label.getText();
            String date_txt = date_label.getText();
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date date;
            date = sdf1.parse(date_txt);
            java.sql.Date sqldate = new java.sql.Date(date.getTime());
            System.out.println("sql date " + sqldate);
            for (int row = 0; row < rows; row++) {
                int id = (Integer) tab_ticket.getValueAt(row, 0);
                System.out.println(id);
                String drink = (String) tab_ticket.getValueAt(row, 2);
                System.out.println(drink);
                int qte = (Integer) tab_ticket.getValueAt(row, 1);
                System.out.println(qte);
                double price = (Double) tab_ticket.getValueAt(row, 3);
                System.out.println(price);
                Double total = (Double) tab_ticket.getValueAt(row, 4);
                System.out.println(total);
                String query = "insert into stats (drink, qte, total,time, date, name_waiter, price, bill_no) value ('" + drink + "','" + qte + "','" + total + "','" + time + "','" + sqldate + "','" + name_waiter + "','" + price + "','"+bill_num+"')";
                st = (Statement) cnx.obtenircon().createStatement();
                st.execute(query);
                nbr++;
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }

    void reset_jwajem() {
        clicked_jwajem = 0;
        clikced_jwajem_calm = 0;
    }
    void reset_soda(){
        clicked_coke=0;
        clicked_fanta=0;
        clicked_orangina=0;
        clicked_kamthari=0;
    }
    void reset_juce() {
        clicked_cookies = 0;
        clicked_orio = 0;
        clicked_chocolat = 0;
        clicked_milkshake = 0;
        clicked_cocktail = 0;
        clicked_citronade = 0;
        clicked_orange = 0;
        clicked_banane = 0;
        clicked_fraise = 0;
        clicked_citronade_amande = 0;
    }

    void reset_coffee() {
        clicked = 0;
        clickedexp = 0;
        clickedcapucin = 0;
        clickedexpspec = 0;
        clickedcapspec = 0;
        clicked_creme_spec = 0;
        clicked_capucino = 0;
        clicked_chocolat_lait = 0;
        clicked_chocolat_chaud = 0;
        cliced_american = 0;
        clicked_creme = 0;
    }

    void reset_tea() {
        clicked_the_menthe = 0;
        cliked_the_amande = 0;
        clicked_infusion = 0;
    }

    void reset_delice() {
        clicked_gateau = 0;
        clicked_gateau_spetial = 0;
        clicked_croissant = 0;
        clicked_cake = 0;
    }

    void reset_water() {
        clicked_water1l = 0;
        clicked_watermini = 0;
    }

    void reset_hookah() {
        clicked_hookah_love = 0;
        clicked_hookah_apple = 0;
        clicked_hookah_menthos = 0;
    }

    void reset_crepe() {
        clicked_crepe_suree = 0;
        clicked_crepe_salee = 0;
        clicked_guaffre_sucree = 0;
    }

    void getValuesFromTable() {
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        int rows = table.getRowCount();
        int cols = table.getColumnCount();
        Object[][] tableData = new Object[rows][cols];
        ticket.append("----------------------------------------------------------------------------------------------\n");
        ticket.append("Ticket No: "+ticket_num.getText()+"\n");
        /*
    for (int i=0;i<rows;i++){
        ticket.append("\n");
        for (int j=1; j<cols; j++){
            tableData[i][j]=table.getValueAt(i,j);
            System.out.println(tableData[i][j]);
            ticket.append(tableData[i][j]+"\t  ");
        }
    }*/
        for (int i = 0; i < rows; i++) {
            String qte = table.getValueAt(i, 1).toString();
            String drink = table.getValueAt(i, 2).toString();
            String price = table.getValueAt(i, 3).toString();
            String total = table.getValueAt(i, 4).toString();
            if (drink.length() <13) {
                ticket.setText(ticket.getText() + qte + "\t" + drink + "\t \t" + price + "\t" + total + "\n");
            } else {
                ticket.setText(ticket.getText() + qte + "\t" + drink + "\t" + price + "\t" + total + "\n");
            }

        }
        ticket.append("\n");
        ticket.append("\t \t \t      TOTAL = " + tot_ticket.getText() + "\n");
        if (waiter_logged_in.getText().isEmpty()){
            ticket.append("Waiter :Admin \n");
        }else{
            ticket.append("Waiter :"+waiter_logged_in.getText()+"\n");
        }
        ticket.append("---------------------------------------------------------------------------------------------\n");
        ticket.setText(ticket.getText() + "\n" + "Visit us again" + "\n" + date_label.getText() + "\n" + time_label.getText() + "\n");
        ticket.setColumns(3);
        ticket.append("---------------------------------------------------------------------------------------------\n");
        ticket.append("Application developed by Bouzidi Imed \n Whatsapp: 54058988 \n" + "Mail: bouzidy.imed@gmail.com");
        //print 
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        PageFormat pageFormat = printerJob.defaultPage();
        Paper paper = new Paper();
        /*double lines = 1;
        paper.setSize(180.0, (double) (paper.getHeight() + lines * 30.0));*/
        //paper.setSize(31, 230);
        paper.setSize(110, 25);
        /*int margin = 1;
        paper.setImageableArea(margin, margin, paper.getWidth() - margin * 2, paper.getHeight() - margin * 2);*/

        pageFormat.setPaper(paper);
        pageFormat.setOrientation(PageFormat.PORTRAIT);
        printerJob.setPrintable(ticket.getPrintable(null, null), pageFormat);
        try {
            printerJob.print();
        } catch (PrinterException ex) {
            java.util.logging.Logger.getLogger(TabelsAndOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    void insertbill() throws SQLException{
        /*Statement stmt = cnx.obtenircon().createStatement();
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        int rows= table.getRowCount();System.out.println("Rows "+rows);
        try{
            String name_waiter = waiter_logged_in.getText();
            //String time = time_label.getText();
            String date_txt = date_label.getText();
            
      int number_bill = Integer.parseInt(ticket_num.getText());
      String waiter = waiter_logged_in.getText();
      cnx.obtenircon().setAutoCommit(false);
      for(int i=0; i< rows;i++){
          int qte = Integer.valueOf(table.getValueAt(i, 1).toString());System.out.println("Qte "+qte);
          String drink = table.getValueAt(i, 2).toString();System.out.println("Drink "+drink);
          double price = Double.valueOf(table.getValueAt(i, 3).toString());System.out.println("Price "+price);
          double total = Double.valueOf(table.getValueAt(i, 4).toString());System.out.println("Total "+total);
          //String time = String.valueOf(table.getValueAt(i, 6).toString());System.out.println("Price "+price);
          /*String datetable = String.valueOf(table.getValueAt(i, 5).toString());System.out.println("Total "+total);
          SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date date;
            date = sdf1.parse(datetable);
            java.sql.Date sqldate = new java.sql.Date(date.getTime());
          stmt.addBatch("insert into bill (quantity, drink, price, total, bill_no) values ('"+qte+"','"+drink+"','"+price+"','"+total+"','"+number_bill+"')");
      }
      int[] result = stmt.executeBatch();
      System.out.println("The number of rows inserted: "+ result.length);
      cnx.obtenircon().commit();
}catch(Exception e){
      e.printStackTrace();
      cnx.obtenircon().rollback();
} finally{
               
}
    */
        try {
            int rows = tab_ticket.getRowCount();
            //double price = Double.parseDouble(price_txt.getText());
            //double tot = price * Integer.parseInt(drink_num.getText());
            int bill_num = Integer.parseInt(bill_id.getText());
            String name_waiter = waiter_logged_in.getText();
            String time = time_label.getText();
            String date_txt = date_label.getText();
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date date;
            date = sdf1.parse(date_txt);
            java.sql.Date sqldate = new java.sql.Date(date.getTime());
            System.out.println("sql date " + sqldate);
            for (int row = 0; row < rows; row++) {
                int id = (Integer) tab_ticket.getValueAt(row, 0);
                System.out.println(id);
                String drink = (String) tab_ticket.getValueAt(row, 2);
                System.out.println(drink);
                int qte = (Integer) tab_ticket.getValueAt(row, 1);
                System.out.println(qte);
                double price = (Double) tab_ticket.getValueAt(row, 3);
                System.out.println(price);
                Double total = (Double) tab_ticket.getValueAt(row, 4);
                System.out.println(total);
                String query = "insert into stats (drink, qte, total,time, date, name_waiter, price, bill_no) value ('" + drink + "','" + qte + "','" + total + "','" + time + "','" + sqldate + "','" + name_waiter + "','" + price + "','"+bill_num+"')";
                st = (Statement) cnx.obtenircon().createStatement();
                st.execute(query);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    void getSumTotalsticket() {
        DefaultTableModel table = (DefaultTableModel) tab_ticket.getModel();
        double sum = 0;
        Object[] columnData = new Object[tab_ticket.getRowCount()];  // One entry for each row
        Object[] rowData = new Object[tab_ticket.getRowCount()];
        for (int i = 0; i < tab_ticket.getRowCount(); i++) {
            /*columnData[i]*/
            sum = sum + Double.parseDouble(tab_ticket.getValueAt(i, 4).toString());
        }
        System.out.println("Total sum " + sum);
        tot_ticket.setText("" + sum);
    }
    void get_ticket_number (){
    try{
    Statement stmt = cnx.obtenircon().createStatement();
    String query = "select bill_no from stats order by bill_no desc limit 1";
    ResultSet rs = stmt.executeQuery(query) ;
    while (rs.next()){
        ticket_num.setText(String.valueOf(rs.getInt("bill_no")+1));
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
    } 
    void disable_menue() {
        //menu
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton4.setEnabled(false);
        jButton21.setEnabled(false);
        jButton5.setEnabled(false);
        jButton23.setEnabled(false);
        jButton24.setEnabled(false);
        jButton3.setEnabled(false);
        //jButton26.setEnabled(false);
        jButton31.setEnabled(false);
        /////
        jButton27.setEnabled(false);
        update_order_btn.setEnabled(false);
        remove_order_btn.setEnabled(false);
        label_qte.setVisible(false);
        label_drink.setVisible(false);
        total_lab.setVisible(false);
        user_name.setVisible(false);
        iddrink.setVisible(false);

        jLabel24.setVisible(false);
        price_txt.setVisible(false);
        ///////////cafes ////////////
        cafe_creme.setVisible(false);
        chocolat_lait.setVisible(false);
        capucin_special.setVisible(false);
        cafe_creme.setEnabled(false);
        chocolat_lait.setEnabled(false);
        capucin_special.setEnabled(false);
        american.setVisible(false);
        chocolat_chaud.setVisible(false);
        creme_special.setVisible(false);
        american.setEnabled(false);
        chocolat_chaud.setEnabled(false);
        creme_special.setEnabled(false);
        capucino.setVisible(false);
        express_special.setVisible(false);
        express.setVisible(false);
        capucino.setEnabled(false);
        express_special.setEnabled(false);
        express.setEnabled(false);
        cafe_turc.setVisible(false);
        capucin.setVisible(false);
        cafe_turc.setEnabled(false);
        capucin.setEnabled(false);
        ////////////juces //////////
        orange.setVisible(false);
        citronade.setVisible(false);
        banane.setVisible(false);
        fraise.setVisible(false);
        orange.setEnabled(false);
        citronade.setEnabled(false);
        banane.setEnabled(false);
        fraise.setEnabled(false);
        citronade_amandes.setVisible(false);
        cocktail_fruits.setVisible(false);
        citronade_amandes.setEnabled(false);
        cocktail_fruits.setEnabled(false);
        milkshake.setVisible(false);
        chocolat.setVisible(false);
        milkshake.setEnabled(false);
        chocolat.setEnabled(false);
        orio.setVisible(false);
        cookie.setVisible(false);
        orio.setEnabled(false);
        cookie.setEnabled(false);
        /////////tea/////////////
        the_menthe.setVisible(false);
        the_menthe.setEnabled(false);
        the_amande.setVisible(false);
        the_amande.setEnabled(false);
        infusion.setVisible(false);
        infusion.setEnabled(false);
        //////////grépes////////
        crepe_suree.setVisible(false);
        crepe_suree.setEnabled(false);
        crepe_salee.setVisible(false);
        crepe_salee.setEnabled(false);
        guaffre_sucree.setVisible(false);
        guaffre_sucree.setEnabled(false);
        /////////jwajem/////////////
        /////////hookah ////////////
        hookah_love.setVisible(false);
        hookah_menthos.setVisible(false);
        hookah_love.setEnabled(false);
        hookah_menthos.setEnabled(false);
        hookah_apple.setVisible(false);
        hookah_apple.setEnabled(false);
        ///////////Delices///////////////
        Gateau.setVisible(false);
        Gateau.setEnabled(false);
        gateau_spetial.setVisible(false);
        gateau_spetial.setEnabled(false);
        croissant.setVisible(false);
        croissant.setEnabled(false);
        cake.setVisible(false);
        cake.setEnabled(false);
        ////////////////water//////////
        water1l.setVisible(false);
        water1l.setEnabled(false);
        watermini.setVisible(false);
        watermini.setEnabled(false);
        ///////jwajem//////////
        jwajem.setVisible(false);
        jwajem.setEnabled(false);
        jwajem_calm.setVisible(false);
        jwajem.setEnabled(false);
        //soda
        coke.setVisible(false);
        coke.setEnabled(false);
        fanta.setVisible(false);
        fanta.setEnabled(false);
        orangina.setVisible(false);
        orangina.setEnabled(false);
        kamthari.setVisible(false);
        kamthari.setEnabled(false);
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
            java.util.logging.Logger.getLogger(TabelsAndOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelsAndOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelsAndOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelsAndOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelsAndOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gateau;
    private javax.swing.JButton american;
    private javax.swing.JButton banane;
    private javax.swing.JTextField bill_id;
    private javax.swing.JButton cafe_creme;
    private javax.swing.JButton cafe_turc;
    private javax.swing.JButton cake;
    private javax.swing.JButton capucin;
    private javax.swing.JButton capucin_special;
    private javax.swing.JButton capucino;
    private javax.swing.JButton chocolat;
    private javax.swing.JButton chocolat_chaud;
    private javax.swing.JButton chocolat_lait;
    private javax.swing.JButton citronade;
    private javax.swing.JButton citronade_amandes;
    private javax.swing.JButton cocktail_fruits;
    private javax.swing.JButton coke;
    private javax.swing.JButton cookie;
    private javax.swing.JButton creme_special;
    private javax.swing.JButton crepe_salee;
    private javax.swing.JButton crepe_suree;
    private javax.swing.JButton croissant;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel drink_num;
    private javax.swing.JButton express;
    private javax.swing.JButton express_special;
    private javax.swing.JButton fanta;
    private javax.swing.JButton fraise;
    private javax.swing.JButton gateau_spetial;
    private javax.swing.JButton guaffre_sucree;
    private javax.swing.JButton hookah_apple;
    private javax.swing.JButton hookah_love;
    private javax.swing.JButton hookah_menthos;
    private javax.swing.JLabel iddrink;
    private javax.swing.JButton infusion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jwajem;
    private javax.swing.JButton jwajem_calm;
    private javax.swing.JButton kamthari;
    private javax.swing.JLabel label_drink;
    private javax.swing.JLabel label_qte;
    private javax.swing.JLabel logged_in;
    private javax.swing.JLabel menue;
    private javax.swing.JButton milkshake;
    private javax.swing.JButton orange;
    private javax.swing.JButton orangina;
    private javax.swing.JButton orio;
    private javax.swing.JPasswordField pass_waiter;
    private javax.swing.JTextField price_txt;
    private javax.swing.JButton remove_order_btn;
    private javax.swing.JButton remove_ticket_btn;
    private javax.swing.JTable tab_ticket;
    private javax.swing.JButton the_amande;
    private javax.swing.JButton the_menthe;
    private javax.swing.JTextArea ticket;
    private javax.swing.JLabel ticketNoLabel;
    private javax.swing.JLabel ticket_num;
    private javax.swing.JLabel time_label;
    private javax.swing.JLabel tot_ticket;
    private javax.swing.JLabel total_lab;
    private javax.swing.JLabel total_ticket_label;
    private javax.swing.JButton update_order_btn;
    private javax.swing.JButton update_ticket_btn;
    private javax.swing.JLabel user_name;
    private javax.swing.JTextField waiter;
    private javax.swing.JLabel waiter_logged_in;
    private javax.swing.JComboBox<String> waiters;
    private javax.swing.JButton water1l;
    private javax.swing.JButton watermini;
    // End of variables declaration//GEN-END:variables

}
