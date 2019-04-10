package hu.elte.pos.view;

import java.awt.Dimension;
import javax.swing.JFrame;

public class ApplicationView extends JFrame {

    public ApplicationView() {
        create();
    }

    private void create() {
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("POS");

        setPreferredSize(new Dimension(600, 600));

        pack();
        setVisible(true);
    }
}
