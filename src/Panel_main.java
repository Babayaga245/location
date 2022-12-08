import java.awt.*;

public class Panel_main {

    static Panel2 Vehicule_panel;
    static Panel2 Client_panel;
    public static void Panel_Main_Start(Color p1_Col,Color p2_Col)
    {
        Vehicule_panel = new Panel2(p1_Col,"Vehicule");
        Client_panel = new Panel2(p2_Col,"Client");

    }


}
