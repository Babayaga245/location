/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author bahaa
 */
public class UI {




    public static void Start(Color dashcol,Color Main_col) {

        //Panels Methods
        JPanel dashboard = Panel.panel_start(dashcol);
        Panel_main.Panel_Main_Start(Main_col,Main_col);

        //Main Frame
        JFrame frame = new JFrame();
        frame.setTitle("Gestion de location");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(1065, 576);
        frame.setVisible(true);



        //Panels
        frame.add(dashboard);
        frame.add(Panel_main.Vehicule_panel.main_panel);
        frame.add(Panel_main.loca_panel.main_panel);
        frame.add(Panel_main.fac_panel.main_panel);
        frame.add(Panel_main.Client_panel.main_panel);
        frame.add(Panel_main.info_panel.main_panel);

    }
}
