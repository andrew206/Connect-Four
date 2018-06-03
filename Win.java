import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class Win {
   public static boolean win(String[][] test) {
      if (test[0][0].equals("red") && test[1][0].equals("red") && test[2][0].equals("red") && test[3][0].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins");
         return true;
      }
      if (test[0][0].equals("red") && test[0][1].equals("red") && test[0][2].equals("red") && test[0][3].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins");
         return true;
      }
      if (test[0][0].equals("red") && test[1][1].equals("red") && test[2][2].equals("red") && test[3][3].equals("red")) {
         JOptionPane.showMessageDialog(null, "Red wins");
         return true;
      }
      
      if (test[0][0].equals("yellow") && test[1][0].equals("yellow") && test[2][0].equals("yellow") && test[3][0].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins");
         return true;
      }
      if (test[0][0].equals("yellow") && test[0][1].equals("yellow") && test[0][2].equals("yellow") && test[0][3].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins");
         return true;
      }
      if (test[0][0].equals("yellow") && test[1][1].equals("yellow") && test[2][2].equals("yellow") && test[3][3].equals("yellow")) {
         JOptionPane.showMessageDialog(null, "Yellow wins");
         return true;
      }
      return false;
   }
}
