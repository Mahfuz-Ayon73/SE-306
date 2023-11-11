package Ping_Pong;

import java.awt.*;

import javax.swing.*;

public class GameFrame extends JFrame{
	
	GamePanel gamePanel ;

	public GameFrame()
	{
		gamePanel = new GamePanel();
		this.add(gamePanel);
		this.setTitle("Ping Pong Game");
		this.setResizable(false);
		this.setBackground(Color.blue);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
