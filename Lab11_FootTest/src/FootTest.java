import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FootTest extends JPanel
{
  private Image shoe;

  // Constructor
  public FootTest()
  {
    shoe = (new ImageIcon("leftshoe.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = getWidth()/2 - 150;
    int y = getHeight()/2;
    int stepLength = 100;
    
    Foot foot = new Foot(x,y,shoe);    
    for (int i = 0; i < 4; i++) {
    	foot.turn(270);
    	foot.draw(g);
    	x += stepLength;
    }
    foot.draw(g);
    foot.turn(90);
    x += 50;
    y += 50;
    foot.draw(g);
  }
//	Foot foot = new Foot(x, y, shoe);
//    for (int i = 0; i < 4; i++) {
//
//    	foot.draw(g);
//    	foot.moveForward(50);
//    	foot.turn(90);
//    	foot.moveForward(50);
//    }
//  for (int count = 1; count <= 8; count++)
//  {
//    foot.draw(g);
//    foot.turn(45);
//    foot.moveForward(stepLength);
//  }
//
//  //Draw a cursor at the expected center of the first "shoe":
//  g.drawLine(x - 50, y, x + 50, y);
//  g.drawLine(x, y - 50, x, y + 50);
//  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Feet");
    window.setBounds(100, 100, 500, 480);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FootTest panel = new FootTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}