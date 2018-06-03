import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class GUI extends JPanel {
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.WHITE);
      for (int i = 0; i < 7; i++) {
         for (int j = 0; j < 6; j++) {         
            g.fillOval(i * 90 + 20, 90 + 20, 70, 70);  
            g.fillOval(i * 90 + 20, j * 90 + 20, 70, 70); 
         }      
      }      
   }
   
   public String drawTile(int x, int[] y, int turn, Graphics g) {
      String[][] grid = new String[6][7];   
      String color = "";
      if (turn%2 != 0) {
         g.setColor(Color.YELLOW);
         //grid[y[x] - 1][x] = "yellow";
         color = "yellow";
      } else {
         g.setColor(Color.RED);
         //grid[y[x] - 1][x] = "red";
         color = "red";
      }  
      g.fillOval(x * 90 + 20, 470 - (y[x] - 1) * 90, 70, 70); 
      return color;    
   }
}
