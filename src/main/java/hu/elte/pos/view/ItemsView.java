package hu.elte.pos.view;

import javax.swing.*;
import java.awt.*;

class ItemsView extends JFrame {
    ItemsView() {
        JFrame frame = new JFrame("LoginView");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.BLACK);

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.BLACK);
        JLabel tileLabel = new JLabel("Table");
        titlePanel.add(tileLabel);
        
        mainPanel.add(titlePanel);

        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.BLACK);
        
        JPanel listPanel = new JPanel();
        listPanel.setBackground(Color.BLACK);
        String[] list = {"cghjk", "tftzu", "kjhgfg", "lkjhgfd", "jhgfg"};
        JList<String> itemsList = new JList<>(list);
        listPanel.add(itemsList);

        secondPanel.add(listPanel);

        JPanel addedListPanel = new JPanel();
        addedListPanel.setBackground(Color.BLACK);
        String[] list2 = {"cghjk", "tftzu", "kjhgfg", "lkjhgfd", "jhgfg"};
        JList<String> addedItemsList = new JList<>(list2);
        listPanel.add(addedItemsList);

        secondPanel.add(addedListPanel);

        mainPanel.add(secondPanel);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBackground(Color.BLACK);

        JButton orderButton = new JButton("Order");
        JButton receiptButton = new JButton("Print receipt");

        buttonsPanel.add(orderButton);
        buttonsPanel.add(receiptButton);

        mainPanel.add(buttonsPanel);

        frame.setContentPane(mainPanel);
        frame.setSize(520,600);
        frame.setMinimumSize(new Dimension(520,600));
        frame.setVisible(true);
    }
}
