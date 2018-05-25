import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class ConnectFour {
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
      
      while (!win) {
          if (turn%2 != 0) {
              System.out.println("Red's Move:");
          } else {
              System.out.println("Yellow's Move:");
          }
          
          System.out.print("x: ");
          int x = console.nextInt();
          System.out.println();
          System.out.print("y: ");
          int y = console.nextInt();
          
          turn++;
          GUI.drawTile(x,y,turn);
      }
   }
  

  
}