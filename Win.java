/**
 * Win.Java
 * Assignment: Final Project
 * Purpose: To show what I have learned this year.
 *
 * @version 06/13/18
 */

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class Win {
   //checks to see if a user has won the game
   public static boolean win(String[][] grid) {
      //red
      //vertical check
      for (int i = 0; i < 7; i++) {
         for (int j = 0; j < 3; j++) {
            if (grid[0 + j][i].equals("red") && grid[1 + j][i].equals("red") && grid[2 + j][i].equals("red") && grid[3 + j][i].equals("red")) {
               JOptionPane.showMessageDialog(null, "Red wins!");
               return true;
            }
         }
      }
      //horizontal check
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < 4; j++) {      
            if (grid[i][0 + j].equals("red") && grid[i][1 + j].equals("red") && grid[i][2 + j].equals("red") && grid[i][3 + j].equals("red")) {
               JOptionPane.showMessageDialog(null, "Red wins!");
               return true;
            }
         }
      }
      //diagonal check                  
      if (grid[2][0].equals("red") && grid[3][1].equals("red") && grid[4][2].equals("red") && grid[5][3].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[1][0].equals("red") && grid[2][1].equals("red") && grid[3][2].equals("red") && grid[4][3].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[2][1].equals("red") && grid[3][2].equals("red") && grid[4][3].equals("red") && grid[5][4].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[0][0].equals("red") && grid[1][1].equals("red") && grid[2][2].equals("red") && grid[3][3].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[1][1].equals("red") && grid[2][2].equals("red") && grid[3][3].equals("red") && grid[4][4].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[2][2].equals("red") && grid[3][3].equals("red") && grid[4][4].equals("red") && grid[5][5].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[0][1].equals("red") && grid[1][2].equals("red") && grid[2][3].equals("red") && grid[3][4].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[1][2].equals("red") && grid[2][3].equals("red") && grid[3][4].equals("red") && grid[4][5].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[2][3].equals("red") && grid[3][4].equals("red") && grid[4][5].equals("red") && grid[5][6].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[0][2].equals("red") && grid[1][3].equals("red") && grid[2][4].equals("red") && grid[3][5].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[1][3].equals("red") && grid[2][4].equals("red") && grid[3][5].equals("red") && grid[4][6].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[0][3].equals("red") && grid[1][4].equals("red") && grid[2][5].equals("red") && grid[3][6].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      ///
      
      if (grid[3][0].equals("red") && grid[2][1].equals("red") && grid[1][2].equals("red") && grid[0][3].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[4][0].equals("red") && grid[3][1].equals("red") && grid[2][2].equals("red") && grid[1][3].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[3][1].equals("red") && grid[2][2].equals("red") && grid[1][3].equals("red") && grid[0][4].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[5][0].equals("red") && grid[4][1].equals("red") && grid[3][2].equals("red") && grid[2][3].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[4][1].equals("red") && grid[3][2].equals("red") && grid[2][3].equals("red") && grid[1][4].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[3][2].equals("red") && grid[2][3].equals("red") && grid[1][4].equals("red") && grid[0][5].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[5][1].equals("red") && grid[4][2].equals("red") && grid[3][3].equals("red") && grid[2][4].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[4][2].equals("red") && grid[3][3].equals("red") && grid[2][4].equals("red") && grid[1][5].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[3][3].equals("red") && grid[2][4].equals("red") && grid[1][5].equals("red") && grid[0][6].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[5][2].equals("red") && grid[4][3].equals("red") && grid[3][4].equals("red") && grid[2][5].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[4][3].equals("red") && grid[3][4].equals("red") && grid[2][5].equals("red") && grid[1][6].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      if (grid[5][3].equals("red") && grid[4][4].equals("red") && grid[3][5].equals("red") && grid[2][6].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins!");
         return true;
      }
      
      //yellow
      //vertical check
      for (int i = 0; i < 7; i++) {
         for (int j = 0; j < 3; j++) {
            if (grid[0 + j][i].equals("yellow") && grid[1 + j][i].equals("yellow") && grid[2 + j][i].equals("yellow") && grid[3 + j][i].equals("yellow")) {
               JOptionPane.showMessageDialog(null, "Yellow wins!");
               return true;
            }
         }
      }
      //horizontal check
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < 4; j++) {      
            if (grid[i][0 + j].equals("yellow") && grid[i][1 + j].equals("yellow") && grid[i][2 + j].equals("yellow") && grid[i][3 + j].equals("yellow")) {
               JOptionPane.showMessageDialog(null, "Yellow wins!");
               return true;
            }
         }
      }
      //diagonal check                  
      if (grid[2][0].equals("yellow") && grid[3][1].equals("yellow") && grid[4][2].equals("yellow") && grid[5][3].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[1][0].equals("yellow") && grid[2][1].equals("yellow") && grid[3][2].equals("yellow") && grid[4][3].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[2][1].equals("yellow") && grid[3][2].equals("yellow") && grid[4][3].equals("yellow") && grid[5][4].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[0][0].equals("yellow") && grid[1][1].equals("yellow") && grid[2][2].equals("yellow") && grid[3][3].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[1][1].equals("yellow") && grid[2][2].equals("yellow") && grid[3][3].equals("yellow") && grid[4][4].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[2][2].equals("yellow") && grid[3][3].equals("yellow") && grid[4][4].equals("yellow") && grid[5][5].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[0][1].equals("yellow") && grid[1][2].equals("yellow") && grid[2][3].equals("yellow") && grid[3][4].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[1][2].equals("yellow") && grid[2][3].equals("yellow") && grid[3][4].equals("yellow") && grid[4][5].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[2][3].equals("yellow") && grid[3][4].equals("yellow") && grid[4][5].equals("yellow") && grid[5][6].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[0][2].equals("yellow") && grid[1][3].equals("yellow") && grid[2][4].equals("yellow") && grid[3][5].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[1][3].equals("yellow") && grid[2][4].equals("yellow") && grid[3][5].equals("yellow") && grid[4][6].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[0][3].equals("yellow") && grid[1][4].equals("yellow") && grid[2][5].equals("yellow") && grid[3][6].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      ///
      
      if (grid[3][0].equals("yellow") && grid[2][1].equals("yellow") && grid[1][2].equals("yellow") && grid[0][3].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[4][0].equals("yellow") && grid[3][1].equals("yellow") && grid[2][2].equals("yellow") && grid[1][3].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[3][1].equals("yellow") && grid[2][2].equals("yellow") && grid[1][3].equals("yellow") && grid[0][4].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[5][0].equals("yellow") && grid[4][1].equals("yellow") && grid[3][2].equals("yellow") && grid[2][3].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[4][1].equals("yellow") && grid[3][2].equals("yellow") && grid[2][3].equals("yellow") && grid[1][4].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[3][2].equals("yellow") && grid[2][3].equals("yellow") && grid[1][4].equals("yellow") && grid[0][5].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[5][1].equals("yellow") && grid[4][2].equals("yellow") && grid[3][3].equals("yellow") && grid[2][4].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[4][2].equals("yellow") && grid[3][3].equals("yellow") && grid[2][4].equals("yellow") && grid[1][5].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[3][3].equals("yellow") && grid[2][4].equals("yellow") && grid[1][5].equals("yellow") && grid[0][6].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[5][2].equals("yellow") && grid[4][3].equals("yellow") && grid[3][4].equals("yellow") && grid[2][5].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[4][3].equals("yellow") && grid[3][4].equals("yellow") && grid[2][5].equals("yellow") && grid[1][6].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      if (grid[5][3].equals("yellow") && grid[4][4].equals("yellow") && grid[3][5].equals("yellow") && grid[2][6].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins!");
         return true;
      }
      return false;   
   }
}