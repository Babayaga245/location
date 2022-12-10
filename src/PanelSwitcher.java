import javax.swing.*;
import java.awt.*;

public class PanelSwitcher {

    static Panel2 current_panel = Panel_main.Vehicule_panel;
    static JButton current_button = Panel.jButton1;


    public static void Pan_switch(int a)
    {

        Color click_color = new Color(50,50,50);
        switch (a) {

            case 1 :
                Panel_main.Vehicule_panel.main_panel.setVisible(true);
                Panel.jButton1.setBackground(click_color);
                if(current_panel != Panel_main.Vehicule_panel) {
                    current_panel.main_panel.setVisible(false);
                    current_button.setBackground(new java.awt.Color(0, 0, 0));
                    current_button = Panel.jButton1;
                    current_panel = Panel_main.Vehicule_panel;

                }

                break;
            case 2 :
                Panel_main.Client_panel.main_panel.setVisible((true));
                Panel.jButton2.setBackground(click_color);
                if(current_panel != Panel_main.Client_panel){
                current_panel.main_panel.setVisible(false);
                current_button.setBackground(new java.awt.Color(0, 0, 0));
                current_button = Panel.jButton2;
                current_panel = Panel_main.Client_panel;
                }
                break;
            case 3 :
                Panel_main.loca_panel.main_panel.setVisible((true));
                Panel.jButton3.setBackground(click_color);
                if(current_panel != Panel_main.loca_panel){
                current_panel.main_panel.setVisible(false);
                current_button.setBackground(new java.awt.Color(0, 0, 0));
                current_button = Panel.jButton3;
                current_panel = Panel_main.loca_panel;}
                break;
            case 4 :
                Panel_main.fac_panel.main_panel.setVisible((true));
                Panel.jButton4.setBackground(click_color);
                if(current_panel != Panel_main.Vehicule_panel){
                current_panel.main_panel.setVisible(false);
                current_button.setBackground(new java.awt.Color(0, 0, 0));
                current_button = Panel.jButton4;
                current_panel = Panel_main.fac_panel;}
                break;
            case 5 :
                Panel_main.info_panel.main_panel.setVisible((true));
                Panel.jButton5.setBackground(click_color);
                if(current_panel != Panel_main.Vehicule_panel){
                current_panel.main_panel.setVisible(false);
                current_button.setBackground(new java.awt.Color(0, 0, 0));
                current_button = Panel.jButton5;
                current_panel = Panel_main.info_panel;}
                break;



        }
    }
}
