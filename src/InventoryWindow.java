import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

    public class InventoryWindow {

        public InventoryWindow()
        {
            // Create the frame
            JFrame frame = new JFrame();
            frame.setTitle("Inventory Management System");
            frame.setSize(600, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null); // Center on screen

            // Title label
            JLabel titleLabel = new JLabel("Welcome to Inventory System");
            titleLabel.setBounds(150, 20, 300, 30);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
            titleLabel.setForeground(Color.BLUE);

            // Graphics Panel
//        JPanel graphicsPanel = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                g.setColor(new Color(100, 200, 255));
//                g.fillOval(10, 10, 50, 50);
//                g.setColor(Color.BLACK);
//                g.drawString("Inventory Icon", 10, 75);
//            }
//        };
//        graphicsPanel.setBounds(400, 20, 100, 100);
//        graphicsPanel.setBackground(Color.WHITE);

            // Item Name label and text field
            JLabel nameLabel = new JLabel("Item Name:");
            nameLabel.setBounds(50, 100, 100, 25);
            JTextField nameField = new JTextField();
            nameField.setBounds(150, 100, 200, 25);

            // Category label and combo box
            JLabel categoryLabel = new JLabel("Category:");
            categoryLabel.setBounds(50, 140, 100, 25);
            String[] categories = {"Electronics", "Clothing", "Food", "Stationery", "Mussa"};
            JComboBox<String> categoryBox = new JComboBox<>(categories);
            categoryBox.setBounds(150, 140, 200, 25);

            // Availability checkbox
            JCheckBox availableCheck = new JCheckBox("Available");
            availableCheck.setBounds(150, 180, 100, 25);

            // Add Item button
            JButton addButton = new JButton("Add Item");
            addButton.setBounds(150, 220, 100, 30);

            // Output TextArea
            JTextArea outputArea = new JTextArea();
            outputArea.setBounds(50, 270, 480, 160);
            outputArea.setEditable(false);
            outputArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            // Add components to frame
            frame.add(titleLabel);
//        frame.add(graphicsPanel);
            frame.add(nameLabel);
            frame.add(nameField);
            frame.add(categoryLabel);
            frame.add(categoryBox);
            frame.add(availableCheck);
            frame.add(addButton);
            frame.add(outputArea);

            // Add Item Button Action
            addButton.addActionListener(e -> {
                String name = nameField.getText().trim();
                String category = (String) categoryBox.getSelectedItem();
                boolean isAvailable = availableCheck.isSelected();

                if (!name.isEmpty()) {
                    outputArea.append("Added: " + name + " (" + category + ") - "
                            + (isAvailable ? "In Stock" : "Out of Stock") + "\n");
                    nameField.setText("");
                    availableCheck.setSelected(false);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter item name.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            });

            // Show the frame
            frame.setVisible(true);
        }

    }

