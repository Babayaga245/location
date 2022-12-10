import javax.swing.*;
import java.awt.*;

public class Panel {

    public static JButton jButton1;
    public static JButton jButton2;
    public static JButton jButton3;
    public static JButton jButton4;
    public static JButton jButton5;

    public static JPanel panel_start(Color dashcol)
    {

        //icon declaration
        ImageIcon dash_icon = new ImageIcon("src\\Images\\dashboard (1).png");
        ImageIcon Vech_icon = new ImageIcon("src\\Images\\car (2).png");
        ImageIcon client_icon = new ImageIcon("src\\Images\\client.png");
        ImageIcon loc_icon = new ImageIcon("src\\Images\\money (1).png");
        ImageIcon fac_icon = new ImageIcon("src\\Images\\bill.png");
        ImageIcon info_icon = new ImageIcon("src\\Images\\info (1).png");



        //dashboard title
        JLabel headline = new JLabel();
        headline.setText("DASHBOARD");
        headline.setIcon(dash_icon);
        headline.setHorizontalAlignment(JLabel.CENTER);
        headline.setIconTextGap(10);
        headline.setForeground(Color.WHITE);
        headline.setFont(new Font("Segoe UI Black", 1, 28));

        //vehicule button
        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(Vech_icon);
        jButton1.setText("Vehicule");
        jButton1.setFocusable(false);
        jButton1.addActionListener(e -> PanelSwitcher.Pan_switch(1));

        //button declaration
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        //Client button
        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Client");
        jButton2.setFocusable(false);
        jButton2.setIcon(client_icon);
        jButton2.addActionListener(e -> PanelSwitcher.Pan_switch(2));


        //Location button
        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Location");
        jButton3.setFocusable(false);
        jButton3.setIcon(loc_icon);
        jButton3.addActionListener(e -> PanelSwitcher.Pan_switch(3));

        //Facture button
        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Facture");
        jButton4.setFocusable(false);
        jButton4.setIcon(fac_icon);
        jButton4.addActionListener(e -> PanelSwitcher.Pan_switch(4));


        //Infos button
        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Qui sommes-nous");
        jButton5.setFocusable(false);
        jButton5.setIcon(info_icon);
        jButton5.addActionListener(e -> PanelSwitcher.Pan_switch(5));





        //Panel settings
        JPanel dashboard = new JPanel();
        dashboard.setBackground(dashcol);
        dashboard.setBounds(0,0,350,576);


        //Panel layout

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
                dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dashboardLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(headline)
                                .addGap(75, 75, 75)));





        dashboardLayout.setVerticalGroup(
                dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dashboardLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(headline, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(109, Short.MAX_VALUE))
        );

        dashboard.add(headline);



        return dashboard;


    }
}
