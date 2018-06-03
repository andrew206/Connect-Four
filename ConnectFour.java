import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class ConnectFour extends GUI {
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(670, 600);
      frame.setTitle("Connect Four");
      GUI panel = new GUI();
      panel.setBackground(Color.BLUE);
      frame.add(panel);
      frame.setVisible(true);
      
      GUI GUI = new GUI();
      
      Scanner console = new Scanner(System.in);
      boolean win = false;
      int turn = 1;
      
      Graphics g = panel.getGraphics();
      int[] y = new int[7]; 
      String[][] test = new String[6][7];
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < 7; j++) { 
            test[i][j] = "empty";
         }
      }
      
      while (!win) {       
          if (turn%2 != 0) {
              System.out.println("Red's Move");
          } else {
              System.out.println("Yellow's Move");
          }
          
          System.out.print("Column (1-7) : ");
          int x = console.nextInt() - 1;
          
          System.out.println();
          y[x]++;
          turn++;
          test[y[x] - 1][x] = GUI.drawTile(x, y, turn, g);   
          //System.out.println(Arrays.deepToString(test));   
          win = Win.win(test);            
      }
   }
 }
