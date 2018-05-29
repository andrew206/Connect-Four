import javax.swing.*;
import java.awt.*;

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
   
   public void drawTile(int x, int[] y, int turn, Graphics g) {
       if (turn%2 != 0) {
           g.setColor(Color.YELLOW);
       } else {
           g.setColor(Color.RED);
       }
       
       g.fillOval(x * 90 + 20, (y[x]-1) * 90 + 20, 70, 70);
      
   }
}
