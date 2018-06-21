/**
 * GUI.Java
 * Assignment: Final Project
 * Purpose: To show what I have learned this year.
 *
 * @version 06/13/18
 */

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class GUI extends JPanel {
   //draws the empty white circles
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.WHITE);
      for (int i = 0; i < 7; i++) {
         for (int j = 0; j < 6; j++) {         
            g.fillOval(i * 90 + 20, 90 + 70, 70, 70);  
            g.fillOval(i * 90 + 20, j * 90 + 70, 70, 70); 
         }      
      }      
   }
   
   //draws the disk a certain color based on whose turn it is
   public String drawTile(int x, int[] y, int turn, Graphics g) {
      String color = "";
      if (turn%2 != 0) {
         g.setColor(Color.YELLOW);
         color = "yellow";
      } else {
         g.setColor(Color.RED);
         color = "red";
      }  
      g.fillOval(x * 90 + 20, 520 - (y[x] - 1) * 90, 70, 70); 
      return color;    
   }
}
