package hu.elte.pos.view;

import javax.swing.*;
import java.awt.*;

class AdminWaiterLoginView extends JFrame {
    AdminWaiterLoginView() {

        JFrame frame = new JFrame("LoginView");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.BLACK);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3, 1, 10, 10));
        loginPanel.setMaximumSize(new Dimension(100, 100));
        loginPanel.setBackground(Color.BLACK);

        JLabel loginLabel = new JLabel("LOGIN");
        loginLabel.setFont(new Font("Verdana",Font.PLAIN, 15));
        loginLabel.setForeground(Color.white);
        loginLabel.setHorizontalAlignment(JLabel.CENTER);

        loginPanel.add(loginLabel);

        JPanel fieldsPanel = new JPanel();
        fieldsPanel.setBackground(Color.black);

        JLabel usernameLabel = new JLabel("Username:");
        TextField usernameField = new TextField("username");
        JLabel passwordLabel = new JLabel("Password:");
        TextField passwordField = new TextField("password");

        fieldsPanel.add(usernameLabel);
        fieldsPanel.add(usernameField);
        fieldsPanel.add(passwordLabel);
        fieldsPanel.add(passwordField);

        mainPanel.add(loginPanel);
        mainPanel.add(fieldsPanel);

        frame.setContentPane(mainPanel);

        frame.setSize(350,250);
        frame.setMinimumSize(new Dimension(250,200));
        frame.setVisible(true);
    }
}