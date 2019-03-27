package hu.elte.pos;

import hu.elte.pos.view.ApplicationView;

public class Application {

    public static void main(String[] args) {
        //javax.swing.SwingUtilities.invokeLater(ApplicationView::new Login);
        new Login();
    }
}
