import javax.swing.*;
import java.awt.*;

public class Panel2 extends JPanel {

    JPanel main_panel;

    public Panel2(Color Main_col,String s) {

        main_panel = new JPanel();
        main_panel.setBackground(Main_col);
        main_panel.setBounds(350, 0, 774, 576);
        JLabel test = new JLabel();
        test.setText(s);
        main_panel.add(test);
        main_panel.setVisible(false);




    }


}
