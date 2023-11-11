package TextBox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	
	JTextField textField;
	
	JCheckBox cb;
	
	public MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
//		button = new JButton("Submit");	
//		
//		button.addActionListener(this);
//		
//	    textField = new JTextField();
//		
//		textField.setPreferredSize(new Dimension(250,40));
//		textField.setFont(new Font("Consolas",Font.PLAIN,35));
//		textField.setForeground(Color.cyan);
//		textField.setBackground(Color.black);
//		textField.setCaretColor(Color.white);
//		textField.setText("Username");
//		
//		this.add(button);
//		this.add(textField);
		button = new JButton("Select");
	
		button.setFocusable(false);
		button.addActionListener(this);
		
		cb = new JCheckBox("I'm not a Robot");
		
		cb.setFocusable(false);
		cb.setFont(new Font("Consolas",Font.PLAIN,20));
		
		this.add(button);
		this.add(cb);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button)
		{
			System.out.println(cb.isSelected());
			
		}
//		if(e.getSource() == button)
//		{
//			System.out.println("Welcome " + textField.getText());
//			
//		}
	}

}
