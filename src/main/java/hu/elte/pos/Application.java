package hu.elte.pos;

import javax.swing.*;

public class Application {

    private static void create() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("POS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Application::create);
    }
}
