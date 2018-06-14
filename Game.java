/**
 * Game.Java
 * Assignment: Final Project
 * Purpose: To show what I have learned this year.
 *
 * @version 06/13/18
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Game {
   GUI GUI = new GUI();
   GUI panel = new GUI();
   int turn = 1;
   boolean win = false;
   
   Graphics g = null;
   int[] y = new int[7]; 
   String[][] grid = new String[6][7];
 
   //trigger for buttons
   private void EventTriggered(int turn2, int column) {   
      if (g == null) {
         g = panel.getGraphics();
      }     
      y[column]++;
      grid[y[column] - 1][column] = GUI.drawTile(column, y, turn2, g);   
      win = Win.win(grid);
   }
   
   //draws the blue board and the buttons, starts the action listener
   public void start() {
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < 7; j++) { 
            grid[i][j] = "empty";
         }
      }
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(670, 635);
      frame.setTitle("Connect Four");
      
      panel.setLayout(null);
      panel.setBackground(Color.BLUE);
      frame.add(panel);
      frame.setVisible(true);
      frame.setResizable(false);
           
      GUI GUI = new GUI(); 

      JButton b1 = new JButton("1");
      JButton b2 = new JButton("2");
      JButton b3 = new JButton("3");
      JButton b4 = new JButton("4");
      JButton b5 = new JButton("5");
      JButton b6 = new JButton("6");
      JButton b7 = new JButton("7");
  
      b1.setBounds(20, 555, 70, 30);
      b2.setBounds(110, 555, 70, 30);
      b3.setBounds(200, 555, 70, 30);
      b4.setBounds(290, 555, 70, 30);
      b5.setBounds(380, 555, 70, 30);
      b6.setBounds(470, 555, 70, 30);
      b7.setBounds(560, 555, 70, 30);
      
      b1.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               EventTriggered(++turn, 0);
            }    
         });
           
      b2.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               EventTriggered(++turn, 1);
            }    
         }); 
        
      b3.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               EventTriggered(++turn, 2);
            }    
         });  
        
      b4.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               EventTriggered(++turn, 3); 
            }    
         }); 
         
      b5.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               EventTriggered(++turn, 4); 
            }    
         });      
        
      b6.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               EventTriggered(++turn, 5); 
            }    
         });   
        
      b7.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               EventTriggered(++turn, 6); 
            }    
         });   
           
      panel.add(b1);
      panel.add(b2);
      panel.add(b3);
      panel.add(b4);
      panel.add(b5);
      panel.add(b6);
      panel.add(b7);

   }
}
