package hu.elte.pos.view;

import javax.swing.*;
import java.awt.*;

class TablesView {
    TablesView() {
        JFrame frame = new JFrame("LoginView");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.BLACK);

        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(3, 3, 10, 10));
        firstPanel.setMaximumSize(new Dimension(200, 200));
        firstPanel.setBackground(Color.BLACK);

        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(1,1));
        secondPanel.setMaximumSize(new Dimension(200,200));
        secondPanel.setBackground(Color.BLACK);

        JLabel hello = new JLabel("TablesView:");
        hello.setForeground(Color.gray);
        hello.setFont(new Font("Verdana",Font.PLAIN,20));
        hello.setHorizontalAlignment(JLabel.CENTER);
        secondPanel.add(hello);

        JButton tables;
        for (int i=1; i<10; i++) {
            tables = new JButton("T " + i);
            tables.setPreferredSize(new Dimension(50, 100));
            //waiter.setBackground(Color.ORANGE);
            tables.setFont(new Font("Verdana",Font.PLAIN, 10));
            firstPanel.add(tables);

            tables.addActionListener(ev -> new ItemsView());
        }

        mainPanel.add(secondPanel);
        mainPanel.add(firstPanel);

        frame.setContentPane(mainPanel);

        frame.setSize(520,600);
        frame.setMinimumSize(new Dimension(520,600));
        frame.setVisible(true);
    }
}
