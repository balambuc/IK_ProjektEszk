package hu.elte.pos.view;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    public LoginView() {

        final JFrame frame = new JFrame("LoginView");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.BLACK);

        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(3, 1, 10, 10));
        firstPanel.setMaximumSize(new Dimension(200, 200));
        firstPanel.setBackground(Color.BLACK);

        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(1, 1));
        secondPanel.setMaximumSize(new Dimension(200, 200));
        secondPanel.setBackground(Color.BLACK);

        JButton admin = new JButton("ADMIN");
        admin.setPreferredSize(new Dimension(50, 100));
        admin.setBounds(50, 100, 95, 30);
        admin.setFont(new Font("Verdana", Font.PLAIN, 20));
        firstPanel.add(admin);

        admin.addActionListener(ev -> new AdminWaiterLoginView());

        JLabel hello = new JLabel("Welcome!");
        hello.setForeground(Color.gray);
        hello.setFont(new Font("Verdana", Font.PLAIN, 20));
        hello.setHorizontalAlignment(JLabel.CENTER);
        secondPanel.add(hello);

        JButton waiter;
        for (int i = 1; i < 3; i++) {
            waiter = new JButton("Waiter " + i);
            waiter.setPreferredSize(new Dimension(50, 100));
            waiter.setFont(new Font("Verdana", Font.PLAIN, 20));
            firstPanel.add(waiter);

            waiter.addActionListener(ev -> new TablesView());
        }

        mainPanel.add(secondPanel);
        mainPanel.add(firstPanel);

        frame.setContentPane(mainPanel);

        frame.setSize(520, 600);
        frame.setMinimumSize(new Dimension(520, 600));
        frame.setVisible(true);
    }
}
