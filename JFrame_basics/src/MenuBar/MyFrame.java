package MenuBar;

import java.awt.event.*;
import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener{

	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		JMenuBar bar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu HelpMenu = new JMenu("Help");
		JMenu EditMenu = new JMenu("Edit");
		
		bar.add(fileMenu);
		bar.add(HelpMenu);
		bar.add(EditMenu);
		
		loadItem = new JMenuItem("load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		this.setJMenuBar(bar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == loadItem)
		{
			System.out.println("File Loaded");
		}
	}
}
