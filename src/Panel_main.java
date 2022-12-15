import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Panel_main {

    static Panel2 Vehicule_panel;
    static Panel2 Client_panel;
    static Panel2 loca_panel;
    static Panel2 fac_panel;
    static Panel2 info_panel;

    
    public static voiture Voiture;
    static JTable jTable1_voiture;
    static JTextField jTextField1_voiture;
    static JTextField jTextField2_voiture;
    static JTextField jTextField3_voiture;
    static JButton jButton10_Voiture;
    

    
    
    
    public static client Client;
    static JTextField jTextField3_client ;
    static JTextField jTextField4_client;
    static JTextField jTextField5_client;
    static JTable jTable1_client;



    private static void Vehicule_panel_init()
    {





        jTable1_voiture = new javax.swing.JTable();

        jTable1_voiture.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Modele de voiture", "Matricule", "prix", "Location"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });


        DefaultTableModel model = (DefaultTableModel) jTable1_voiture.getModel();
        ArrayList<voiture> voiture_arr=voiture.GetCarArray();
        Object rowData[] = new Object[4];
        for(int i = 0; i < voiture_arr.size(); i++)
        {
            rowData[0] = voiture_arr.get(i).GetMod();
            rowData[1] = voiture_arr.get(i).GetMat();
            rowData[2] = voiture_arr.get(i).GetPrix();
            rowData[3] = voiture_arr.get(i).GetState();

            model.addRow(rowData);

        }



         JScrollPane sp = new JScrollPane(jTable1_voiture);

        if (jTable1_voiture.getColumnModel().getColumnCount() > 0) {
            jTable1_voiture.getColumnModel().getColumn(0).setResizable(false);
            jTable1_voiture.getColumnModel().getColumn(1).setResizable(false);
            jTable1_voiture.getColumnModel().getColumn(2).setResizable(false);
            jTable1_voiture.getColumnModel().getColumn(3).setResizable(false);
        }
        Vehicule_panel.main_panel.add(sp);
        jTable1_voiture.setBounds(500,10,500,500);






        JButton jButton8 = new JButton();
        jButton8.setText("Supprimer");
        jButton8.addActionListener(e -> del_v());

        JButton jButton9 = new JButton();
        jButton9.setText("Filtrer");

        jButton10_Voiture = new JButton();
        jButton10_Voiture.setText("Mise a jour");
        jButton10_Voiture.addActionListener(e -> new_ui());


        jTextField1_voiture = new JTextField();




        JLabel jLabel2 = new JLabel();
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Modele");

        jTextField2_voiture = new JTextField();


        JLabel jLabel3 = new JLabel();
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Matricule");


        jTextField3_voiture = new JTextField();



        JLabel jLabel4 = new JLabel();
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Prix");

        JButton jButton11 = new JButton();
        jButton11.setText("Ajouter");
        jButton11.addActionListener(e -> vehicule_ui_add());


        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(Vehicule_panel.main_panel);
        Vehicule_panel.main_panel.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1_voiture, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2_voiture, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3_voiture, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(jButton10_Voiture, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField1_voiture, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField2_voiture, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField3_voiture, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton10_Voiture, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        /*javax.swing.GroupLayout layout = new javax.swing.GroupLayout(Vehicule_panel.main_panel);
        Vehicule_panel.main_panel.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(343, Short.MAX_VALUE)
                                .addComponent(Vehicule_panel.main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Vehicule_panel.main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
        );*/













    }


    public static void new_ui() {


        if(jTable1_voiture.getSelectedRowCount() == 1) {
            System.out.println("test");
            Update_Window new_1 = new Update_Window();
        }
        else
        {
           JOptionPane.showMessageDialog(null,"Select just one row !","ERREUR",JOptionPane.ERROR_MESSAGE);
        }

        
    }


    public static void del_v()
    {



        DefaultTableModel model = (DefaultTableModel) jTable1_voiture.getModel();

        int mat = Integer.parseInt(model.getValueAt(jTable1_voiture.getSelectedRow(),2).toString());

        voiture V = new voiture(mat,"",0,true);

        voiture.deleteCar(V);

        if(jTable1_voiture.getSelectedRowCount() == 1) {
            System.out.println("test");
            model.removeRow(jTable1_voiture.getSelectedRow());

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select just one row !","ERREUR",JOptionPane.ERROR_MESSAGE);
        }


    }




    public static void vehicule_ui_add()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1_voiture.getModel();
        if (client.clientCheck(jTextField1_voiture.getText(),jTextField2_voiture.getText(),jTextField3_voiture.getText())) {
            JOptionPane.showMessageDialog(null,"Saisie des donnes valid !","ERREUR",JOptionPane.ERROR_MESSAGE);
        }
        else {
            Voiture = new voiture(Integer.parseInt(jTextField2_voiture.getText()), jTextField1_voiture.getText(), Integer.parseInt(jTextField3_voiture.getText()),false);
            voiture.addCar(Voiture);
            Object obj[] = {jTextField1_voiture.getText(), jTextField2_voiture.getText(), jTextField3_voiture.getText(),0};
            model.addRow(obj);
        }

    }



    public static void Client_panel_init()
    {




        JLabel jLabel5 = new JLabel();
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nom et Prenom de client");


        jTextField3_client = new JTextField();
       /* jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });*/

        jTable1_client  = new JTable();
        jTable1_client.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Nom Client", "Num permis ", "Num Telephone"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
        };






            DefaultTableModel model = (DefaultTableModel) jTable1_client.getModel();
            ArrayList<client> Client_arr=client.GetclientArray();
            Object rowData[] = new Object[3];
            for(int i = 0; i < Client_arr.size(); i++)
            {
                rowData[0] = Client_arr.get(i).GetNomprenom();
                rowData[1] = Client_arr.get(i).GetNumpermis();
                rowData[2] = Client_arr.get(i).GetTel();
                model.addRow(rowData);

            }







        JScrollPane jScrollPane1 = new JScrollPane();
        jScrollPane1.setViewportView(jTable1_client);
        if (jTable1_client.getColumnModel().getColumnCount() > 0) {
            jTable1_client.getColumnModel().getColumn(0).setResizable(false);
            jTable1_client.getColumnModel().getColumn(1).setResizable(false);
            jTable1_client.getColumnModel().getColumn(2).setResizable(false);
        }

        jTextField4_client = new JTextField();
        /*jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });*/

        JLabel jLabel6 = new JLabel();
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Num Permis");

        jTextField5_client = new JTextField();
        /*jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });*/

        JLabel jLabel7 = new JLabel();
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Num Telephone");

        JButton jButton1 = new JButton();
        jButton1.setText("Ajouter");
        jButton1.addActionListener(e -> client_ui_add());
       /* jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });*/

        JButton jButton2 = new JButton();
        jButton2.setText("Supprimer");
        /*jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });*/

        JButton jButton3 = new JButton();
        jButton3.setText("Mise a jour");
        jButton3.addActionListener(e -> c_upd());
        /*jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });*/

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(Client_panel.main_panel);
        Client_panel.main_panel.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jTextField3_client, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                .addGap(0, 14, Short.MAX_VALUE)
                                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(8, 8, 8)))
                                                                .addGap(36, 36, 36))
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jTextField5_client, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                                        .addComponent(jTextField4_client, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(92, 92, 92))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3_client, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField4_client, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField5_client, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(80, 80, 80)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(68, Short.MAX_VALUE))
        );




    }


    public static void c_upd()
    {
        if(jTable1_client.getSelectedRowCount() == 1) {
            System.out.println("test");
            Update_Window new_1 = new Update_Window();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select just one row !","ERREUR",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void client_ui_add()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1_client.getModel();
        if (client.clientCheck(jTextField3_client.getText(),jTextField4_client.getText(),jTextField5_client.getText())) {
            JOptionPane.showMessageDialog(null,"Saisie des donnes valid test !","ERREUR",JOptionPane.ERROR_MESSAGE);
        }
        else {
            Client = new client(Integer.parseInt(jTextField4_client.getText()), jTextField3_client.getText(), Integer.parseInt(jTextField5_client.getText()));
            client.addClient(Client);
            Object obj[] = {Integer.parseInt(jTextField4_client.getText()), jTextField3_client.getText(), Integer.parseInt(jTextField5_client.getText())};
            model.addRow(obj);
        }

    }
    
    


    private static void Loc_panel_init()
    {




        JComboBox jComboBox1 = new JComboBox<>();
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        /*jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });*/

        JComboBox jComboBox2 = new JComboBox<>();
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        /*jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });*/

        JLabel jLabel1 = new JLabel();
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel1.setText("Client");

        JLabel jLabel2 = new JLabel();
        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel2.setText("Voitures disponibles");

        JLabel jLabel3 = new JLabel();
        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de jours :");

        JButton jButton1 = new JButton();
        jButton1.setText("Passer Commande");
        /*jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });*/

        JTextField jTextField1 = new JTextField();
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setText("0");
        /*jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });*/

        JTextField jTextField2 = new JTextField();
        jTextField2.setText("DD/MM/YYYY");

        /*jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });*/

        JLabel jLabel4 = new JLabel();
        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel4.setText("Date de debut : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(loca_panel.main_panel);
        loca_panel.main_panel.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(276, 276, 276)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(227, Short.MAX_VALUE))
        );











    }

    private static void fac_panel_init()
    {


        JTable jTable1 = new JTable();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Nom Client", "Model de voiture", "Matricule", "Date debut", "Date Fin", "Prix"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollPane jScrollPane1 = new JScrollPane();
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        JButton jButton2 = new JButton();
        jButton2.setText("Supprimer");
        /*jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });*/

        JButton jButton3 = new JButton();
        jButton3.setText("Telecharger pdf");
       /* jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });*/

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(fac_panel.main_panel);
        fac_panel.main_panel.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(73, Short.MAX_VALUE))
        );

    }

    private static void info_panel_init()
    {

        ImageIcon rayen_icon = new ImageIcon("src\\Images\\Rayen.jpg");
        ImageIcon baha_icon = new ImageIcon("src\\Images\\baha.jpg");
        ImageIcon isi_icon = new ImageIcon("src\\Images\\Institut_Supérieur_d'Informatique_(logo).svg.jpg");


        JLabel jLabel5 = new JLabel();
        jLabel5.setFont(new java.awt.Font("OptimusPrinceps", 1, 24)); // NOI18N
        jLabel5.setText("Projet Par ");
        jLabel5.setBounds(300,-10,200,200);

        JLabel jLabel1 = new JLabel();
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(rayen_icon); // NOI18N
        jLabel1.setText("Rayen Zaalouni");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel1.setBounds(120,100,200,200);

        JLabel jLabel2 = new JLabel();
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setIcon(baha_icon); // NOI18N
        jLabel2.setText("Baha Eddine Farhati");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel2.setBounds(400,100,200,200);

        JLabel jLabel3 = new JLabel();
        jLabel3.setIcon(isi_icon);
        jLabel3.setBounds(250,270,300,300);

        info_panel.main_panel.setLayout(null);

        //info_panel.main_panel.setLayout(new BoxLayout(info_panel.main_panel, BoxLayout.PAGE_AXIS));

        info_panel.main_panel.add(jLabel5);
        info_panel.main_panel.add(jLabel1);
        info_panel.main_panel.add(jLabel2);
        info_panel.main_panel.add(jLabel3);







    }
    public static void Panel_Main_Start(Color p1_Col,Color p2_Col)
    {

        Vehicule_panel = new Panel2(p1_Col);
        Vehicule_panel_init();
        Vehicule_panel.main_panel.setVisible(true);
        Client_panel = new Panel2(p2_Col);
        Client_panel_init();
        loca_panel = new Panel2(p2_Col);
        Loc_panel_init();
        fac_panel = new Panel2(p2_Col);
        fac_panel_init();
        info_panel = new Panel2(p2_Col);
        info_panel_init();






    }



}
