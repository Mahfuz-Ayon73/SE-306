package Animation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{

	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	
	Image enemy;
	Image backgroundImage;
	
	Timer timer;
	
	int xVelocity = 3;
	int yVelocity = 1;
	
	int x = 0;
	int y = 0;
	
	public MyPanel()
	{
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		
		enemy =  new ImageIcon("C:\\Users\\User\\Downloads\\rocksteady (1).png").getImage();
		
		timer = new Timer(10,this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x >= PANEL_WIDTH - enemy.getWidth(null) || x<0)
		{
			xVelocity = xVelocity * -1;
		}
		
		x = x + xVelocity;
		
		if(y >= PANEL_WIDTH - enemy.getWidth(null) || y<0)
			{
				yVelocity = yVelocity * -1;
			}
			
			y = y + yVelocity;
		repaint();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(enemy, x,y,null);
	}
}
