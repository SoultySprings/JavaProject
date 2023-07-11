//Program to generate a circle in a rectangle and print the college name in it

import java.awt.*;
import javax.swing.*;
public class DAPro1 extends JApplet {

	public void paint(Graphics g) {

        g.setColor(Color.red);
        g.drawOval(100, 100, 100, 100);
        g.fillOval(100, 100, 100, 100);
		g.drawRect(300,150,200,100);
		g.setColor(Color.yellow);
		g.fillRect( 300,150, 200, 100 );
		g.setColor(Color.black);
		g.drawString("Vellore Institue Of Technology",200,150);

	}
}
