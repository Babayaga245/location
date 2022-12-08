public class PanelSwitcher {

    static Panel2 current_panel = Panel_main.Vehicule_panel;

    public static void Pan_switch(int a)
    {
        switch (a) {

            case 1 :
                Panel_main.Vehicule_panel.main_panel.setVisible(true);
                if(current_panel != Panel_main.Vehicule_panel) {
                    current_panel.main_panel.setVisible(false);
                    current_panel = Panel_main.Vehicule_panel;
                }

                break;
            case 2 :
                Panel_main.Client_panel.main_panel.setVisible((true));
                if(current_panel != Panel_main.Client_panel){
                current_panel.main_panel.setVisible(false);
                current_panel = Panel_main.Client_panel;}
                break;
            case 3 :
                Panel_main.loca_panel.main_panel.setVisible((true));
                if(current_panel != Panel_main.loca_panel){
                current_panel.main_panel.setVisible(false);
                current_panel = Panel_main.loca_panel;}
                break;
            case 4 :
                Panel_main.fac_panel.main_panel.setVisible((true));
                if(current_panel != Panel_main.Vehicule_panel){
                current_panel.main_panel.setVisible(false);
                current_panel = Panel_main.fac_panel;}
                break;
            case 5 :
                Panel_main.info_panel.main_panel.setVisible((true));
                if(current_panel != Panel_main.Vehicule_panel){
                current_panel.main_panel.setVisible(false);
                current_panel = Panel_main.info_panel;}
                break;



        }
    }
}
