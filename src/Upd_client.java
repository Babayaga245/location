import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Upd_client {

    JFrame frame2 = new JFrame();
    JLabel txt1 = new JLabel();
    JLabel txt2 = new JLabel();
    JLabel txt3 = new JLabel();

    static JTextField nom_field = new JTextField();
    static JTextField tel_field = new JTextField();


    JButton Butt = new JButton();


    Upd_client() {



        txt1.setText("Nom client");
        txt1.setBounds(20,0,200,25);
        txt2.setText("Num telephone");
        txt2.setBounds(20,75,200,25);


        Butt.setText("Mise a jour");


        nom_field.setBounds(20,25,200,25);
        tel_field.setBounds(20,125,200,25);

        Butt.setBounds(20,300,100,30);

        Butt.addActionListener(e -> upd());



        frame2.setTitle("Mise a Jour");
        frame2.setResizable(false);
        frame2.setLayout(null);
        frame2.setSize(300, 400);
        frame2.setVisible(true);
        frame2.add(txt1);
        frame2.add(txt2);
        frame2.add(nom_field);
        frame2.add(tel_field);
        frame2.add(Butt);

    }

    public static void upd()
    {

        DefaultTableModel model = (DefaultTableModel)Panel_main.jTable1_client.getModel();
        int per = Integer.parseInt(model.getValueAt(Panel_main.jTable1_client.getSelectedRow(),1).toString());
        int tel = Integer.parseInt(tel_field.getText());

        client c = new client(per,nom_field.getText(),tel);


        Panel_main.jTable1_client.setValueAt(nom_field.getText(),Panel_main.jTable1_client.getSelectedRow(),0);
        Panel_main.jTable1_client.setValueAt(tel_field.getText(),Panel_main.jTable1_client.getSelectedRow(),2);

    }
}
