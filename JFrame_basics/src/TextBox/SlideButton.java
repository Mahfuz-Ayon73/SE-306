package TextBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class SlideButton extends JFrame implements ActionListener{

	JComboBox cb;
	
	public SlideButton()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"Hund","Katze","Maus"};
		
		cb = new JComboBox(animals);
		
		cb.addActionListener(this);
		cb.addItem("Elefant");
		
		this.add(cb);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == cb)
		{
		   System.out.println("You have Choosen " + cb.getSelectedItem() + " which is in "+cb.getSelectedIndex());
		}
		
	}

}
