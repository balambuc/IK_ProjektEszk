package hu.elte.pos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class Login extends JFrame{
     Login() {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.BLACK);

        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(3, 1, 10, 10));
        firstPanel.setMaximumSize(new Dimension(200, 200));
        firstPanel.setBackground(Color.BLACK);

        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(1,1));
        secondPanel.setMaximumSize(new Dimension(200,200));
        secondPanel.setBackground(Color.BLACK);

        JButton admin = new JButton("ADMIN");
        admin.setPreferredSize(new Dimension(50, 100));
        //admin.setBackground(Color.cyan);
        admin.setBounds(50,100,95,30);
        admin.setFont(new Font("Verdana", 1, 20));
        firstPanel.add(admin);

        admin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                new AdminWaiterLogin();
            }
        });

        JLabel hello = new JLabel("Welcome!");
        hello.setForeground(Color.gray);
        hello.setFont(new Font("Verdana",1,30));
        hello.setHorizontalAlignment(JLabel.CENTER);
        secondPanel.add(hello);

        JButton waiter;
        for (int i=1; i<3; i++) {
            waiter = new JButton("Waiter " + i);
            waiter.setPreferredSize(new Dimension(50, 100));
            //waiter.setBackground(Color.ORANGE);
            waiter.setFont(new Font("Verdana", 1, 20));
            firstPanel.add(waiter);

            waiter.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ev) {
                    new AdminWaiterLogin();
                }
            });
        }

        mainPanel.add(secondPanel);
        mainPanel.add(firstPanel);

        frame.setContentPane(mainPanel);

        frame.setSize(520,600);
        frame.setMinimumSize(new Dimension(520,600));
        frame.setVisible(true);
    }

}
