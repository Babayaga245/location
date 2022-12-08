public class PanelSwitcher {

    public static void Pan_switch(int a)
    {
        switch (a) {

            case 1 :
                Panel_main.Vehicule_panel.main_panel.setVisible(true);
                Panel_main.Client_panel.main_panel.setVisible((false));
                break;
            case 2 :
                Panel_main.Client_panel.main_panel.setVisible((true));
                Panel_main.Vehicule_panel.main_panel.setVisible(false);
                break;


        }
    }
}
