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
public class Comp603Part2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]){
       JFrame frame = new JFrame("Hotel Booking System");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,500);
       JButton button = new JButton("Press");
       frame.getContentPane().add(button); // 
       frame.setVisible(true);
    }
     //Confiming Git is working
    
     public void Message()
     {
         System.out.println("Hello!");
     }
}
