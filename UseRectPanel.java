import javax.swing.*;
import java.awt.*;

public class UseRectPanel {
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(750, 750);
      frame.setTitle("Connect Four");
      
      RectPanel panel = new RectPanel();
      panel.setBackground(Color.WHITE);
      frame.add(panel);
      
      frame.setVisible(true);
   }
}
