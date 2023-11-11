package SliderDemo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class ProgressBarDemo {

	JProgressBar pb = new JProgressBar();
	JFrame frame = new JFrame();
	
	public ProgressBarDemo()
	{
		pb.setValue(0);
		pb.setBounds(0,0,420,50);
		pb.setStringPainted(true);
		pb.setFont(new Font("MV Boli",Font.BOLD,20));
		pb.setForeground(Color.red);
		pb.setBackground(Color.black);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.add(pb);
		
		
		fill();
	}
	public void fill()
	{
		int counter = 0;
		
		while(counter <= 100)
		{
			pb.setValue(counter);
			
			try {
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			counter += 1;
		}
		
		pb.setString("Loading Completed");
	}
}
