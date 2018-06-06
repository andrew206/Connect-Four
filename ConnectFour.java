import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class ConnectFour extends GUI {
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(670, 635);
      frame.setTitle("Connect Four");
      GUI panel = new GUI();
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
  
      panel.add(b1);
      panel.add(b2);
      panel.add(b3);
      panel.add(b4);
      panel.add(b5);
      panel.add(b6);
      panel.add(b7);

      Scanner console = new Scanner(System.in);
      boolean win = false;
      int turn = 1;
           
      Graphics g = panel.getGraphics();
      int[] y = new int[7]; 
      String[][] grid = new String[6][7];
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < 7; j++) { 
            grid[i][j] = "empty";
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
          grid[y[x] - 1][x] = GUI.drawTile(x, y, turn, g);   
          //System.out.println(Arrays.deepToString(grid));   
          win = Win.win(grid);            
      }
   }
 }
