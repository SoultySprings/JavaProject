//Program to generate a circle in a rectangle and print the college name in it

import java.applet.*;
import java.awt.*;
public class DAPro1 extends Applet {

	public void paint(Graphics g) {
		g.drawRect(300,150,200,100);
		g.setColor(Color.yellow);
		g.fillRect( 300,150, 200, 100 );
		g.setColor(Color.magenta);
		g.drawString("Rectangle",500,150);

	}
	public static void main(String[] args) {
		DAPro1 obj = new DAPro1();
	}

}
