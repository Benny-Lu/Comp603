/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp603.part2;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author GGPC
 */
public class FindARoom extends JFrame {

    private JPanel cardPanel;
    private CardLayout cardLayout;

    public FindARoom() {
        setTitle("Hotel Booking Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);

        // Create panel for card layout
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Create initial panel
        JPanel initialPanel = new JPanel();
        initialPanel.setLayout(new BorderLayout());
        JLabel titleLabel = new JLabel("Welcome to the Hotel Booking Application");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        initialPanel.add(titleLabel, BorderLayout.CENTER);

        // Add initial panel to card panel
        cardPanel.add(initialPanel, "initial");

        // Set card panel as the main content pane
        setContentPane(cardPanel);

        setVisible(true);
    }

public void showFindAndBookRoomPanel() {
    // Clear the card panel
    cardPanel.removeAll();

    // Create panel for "Find and Book a Room" section
    JPanel findAndBookRoomPanel = new JPanel();
    findAndBookRoomPanel.setLayout(new BorderLayout());

    // Create a panel for button and title
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    // Create a back button
    JButton backButton = new JButton("Back");
    backButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Go back to the previous panel
            cardLayout.show(cardPanel, "initial");
            Comp603Part2 newframe = new Comp603Part2();
            newframe.setVisible(true);
            newframe.toFront();
            dispose(); // Close the current JFrame
        }
    });
    buttonPanel.add(backButton); // Add the button to the panel

    // Create a label for the title and align it at the top
    JLabel titleLabel = new JLabel("Find a Room");
    titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
    titleLabel.setVerticalAlignment(SwingConstants.TOP); // Align the text at the top
    titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

    // Add the button panel and title label to the findAndBookRoomPanel
    findAndBookRoomPanel.add(buttonPanel, BorderLayout.NORTH);
    findAndBookRoomPanel.add(titleLabel, BorderLayout.CENTER);

    // Add the panel to the card panel
    cardPanel.add(findAndBookRoomPanel, "findAndBookRoom");

    // Show the "Find and Book a Room" panel
    cardLayout.show(cardPanel, "findAndBookRoom");

    // Refresh the GUI
    revalidate();
    repaint();
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FindARoom findARoom = new FindARoom();
                findARoom.showFindAndBookRoomPanel();
            }
        });
    }
}
