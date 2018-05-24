import javax.swing.*;
import java.awt.*;

public class RectPanel extends JPanel {
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.RED);
      g.fillOval(20, 40, 50, 50);
      //g.setColor(Color.BLUE);
      //g.fillOval(60, 10, 20, 80);
   }
}
