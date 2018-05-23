import javax.swing.*;
import java.awt.*;

public class test {
   private JPanel panel;
   private JFrame frame;
   private JButton button1;
   private JLabel label;
    
   public static void main(String[] args) {
      new test();
   }
   
   public test() {
      gui();
   }
   
   public void gui() {
      frame = new JFrame("Connect Four");
      frame.setVisible(true);
      frame.setSize(600, 400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      panel = new JPanel();
      panel.setBackground(Color.YELLOW);
      
      button1 = new JButton("Test");
      label = new JLabel("Test Button");
      
      panel.add(button1);
      panel.add(label);
      
      frame.add(panel);     
   }
}