import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Update_Window  {

    JFrame frame = new JFrame();
    JLabel txt1 = new JLabel();
    JLabel txt2 = new JLabel();
    JLabel txt3 = new JLabel();

    static JTextField model_field = new JTextField();
    static JTextField prix_field = new JTextField();
    static JTextField stat_field = new JTextField();

    JButton Butt = new JButton();


    Update_Window() {



        txt1.setText("Modele");
        txt1.setBounds(20,0,200,25);
        txt2.setText("Prix");
        txt2.setBounds(20,75,200,25);
        txt3.setText("Statue");
        txt3.setBounds(20,160,200,25);

        Butt.setText("Mise a jour");


       model_field.setBounds(20,25,200,25);
       prix_field.setBounds(20,125,200,25);
       stat_field.setBounds(20,200,200,25);

       Butt.setBounds(20,300,100,30);

        Butt.addActionListener(e -> upd());



        frame.setTitle("Mise a Jour");
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.add(txt1);
        frame.add(txt2);
        frame.add(txt3);
        frame.add(model_field);
        frame.add(prix_field);
        frame.add(stat_field);
        frame.add(Butt);

    }

    public static void upd()
    {

        DefaultTableModel model = (DefaultTableModel)Panel_main.jTable1_voiture.getModel();
        int mat = Integer.parseInt(model.getValueAt(Panel_main.jTable1_voiture.getSelectedRow(),2).toString());
        int prix = Integer.parseInt(prix_field.getText());
        boolean a;
        if(Integer.parseInt(stat_field.getText()) == 0)
        {
            a = false;
        }
        else
        {
            a = true;
        }
        voiture V = new voiture(mat,model_field.getText(),prix,a);
        voiture.modifyCar(V);

        Panel_main.jTable1_voiture.setValueAt(model_field,Panel_main.jTable1_voiture.getSelectedRow(),0);
        Panel_main.jTable1_voiture.setValueAt(prix_field,Panel_main.jTable1_voiture.getSelectedRow(),2);
        Panel_main.jTable1_voiture.setValueAt(stat_field,Panel_main.jTable1_voiture.getSelectedRow(),3);
    }
}
