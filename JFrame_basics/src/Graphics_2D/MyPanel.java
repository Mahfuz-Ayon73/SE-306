package Graphics_2D;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class MyPanel extends JPanel{

	
	MyPanel()
	{
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setPaint(Color.blue);
		g2D.setStroke(new BasicStroke(5));
		//g2D.drawLine(0, 0, 500, 500);
		
		//g2D.drawRect(100, 100, 50, 80);
		
		//g2D.fillRect(100, 100, 50, 80);
		//g2D.drawOval(0,0,100,100);
		
		//g2D.fillOval(0, 0, 100, 100);
//		g2D.setPaint(Color.red);
//		g2D.fillArc(0, 0, 100, 100, 0, 180);
//		g2D.setPaint(Color.blue);
//		g2D.fillArc(0, 0, 100, 100, 180, 180);
		
//		int x[] = {150,250,350};
//		int y[] = {300,150,300};
//		
//		g2D.setColor(Color.yellow);
//		g2D.fillPolygon(x,y,3);
		
		g2D.setColor(Color.magenta);
		g2D.setFont(new Font("Ink Free",Font.BOLD,50));
		g2D.drawString("u R a winner", 50, 50);
		
	}
}
