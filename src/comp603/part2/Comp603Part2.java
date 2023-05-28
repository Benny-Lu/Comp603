/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comp603.part2;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author GGPC
 */
public class Comp603Part2 extends JFrame {

    private JLabel outputLabel;

    public Comp603Part2() {
        setTitle("Hotel Booking Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);

        // Create GUI components
        JButton bookButton = new JButton("Find and Book a Room");
        JButton viewButton = new JButton("See My Bookings");

        outputLabel = new JLabel("Welcome to the Hotel Booking Application");
        outputLabel.setHorizontalAlignment(SwingConstants.CENTER); // Align label text in the center

        // Create panels for layout
        JPanel topPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        // Set layout for the main content pane
        setLayout(new BorderLayout());

        // Set layout for panels
        topPanel.setLayout(new FlowLayout());
        centerPanel.setLayout(new GridBagLayout()); // Use GridBagLayout for precise component placement
        bottomPanel.setLayout(new FlowLayout());

        // Add components to panels
        topPanel.add(outputLabel);
        
        // Add buttons to the center panel using GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0); // Add vertical spacing
        centerPanel.add(bookButton, gbc);

        gbc.gridy = 1;
        centerPanel.add(viewButton, gbc);

        bottomPanel.add(Box.createVerticalStrut(50)); // Add spacing between the panels

        // Add panels to the main content pane
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void findAndBookRoom() {
        // Implement the logic to find and book a room
        // Update the outputLabel or other GUI components accordingly
        outputLabel.setText("Find and Book a Room");
    }

    private void seeMyBookings() {
        // Implement the logic to see my bookings
        // Update the outputLabel or other GUI components accordingly
        outputLabel.setText("See My Bookings");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Comp603Part2();
            }
        });
    }
}
