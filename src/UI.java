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


        JPanel dashboard = Panel.panel_start(dashcol);
        JPanel Main_Panel = Panel2.Panel2_start(Main_col);

        //I.General Frame
        JFrame frame = new JFrame();
        frame.setTitle("Gestion de location");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(1024, 576);
        frame.setVisible(true);


        frame.add(dashboard);
        frame.add(Main_Panel);
    }
}
