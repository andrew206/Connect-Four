import javax.swing.*;
import java.awt.*;

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
   }
}
