package TextBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame implements ActionListener{

	JRadioButton rButton1;
	JRadioButton rButton2;
	JRadioButton rButton3;
	
	public RadioButton()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		 rButton1 = new JRadioButton("Kaffee");
		 rButton2 = new JRadioButton("Tee");
		 rButton3 = new JRadioButton("Wesser");
		 
		 rButton1.addActionListener(this);
		 rButton2.addActionListener(this);
		 rButton3.addActionListener(this);
		
		ButtonGroup group  = new ButtonGroup();
		
		group.add(rButton1);
		group.add(rButton2);
		group.add(rButton3);
		
		this.add(rButton1);
		this.add(rButton2);
		this.add(rButton3);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == rButton1)
		{
			System.out.println("Coffee");
		}
		else if(e.getSource() == rButton2)
		{
			System.out.println("Tea");
		}
		else if(e.getSource() == rButton3)
		{
			System.out.println("Water");
		}
		
	}

}
