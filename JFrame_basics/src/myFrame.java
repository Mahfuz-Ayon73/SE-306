import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener{
	
	JButton button;
	
	JLabel label;
	
    public myFrame()
    {
    	ImageIcon image = new ImageIcon("C:\\Users\\User\\Downloads\\Facebook-logo.png");
    	
    	ImageIcon icon = new ImageIcon("D:\\HTML\\background.jfif");
    	
    	label = new JLabel();
    	label.setIcon(icon);
    	label.setBounds(100,300,250,250);
    	label.setVisible(false);
    	
        button = new JButton();
    	
        button.setBounds(100,200,200,100);
        //button.setBackground(Color.red);
		button.setText("Click this Button");
		button.setFocusable(false);
		button.addActionListener(this);
		button.setIcon(image);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.white);
		
		
    	this.setLayout(null);
    	this.setSize(600,600);
    	this.getContentPane().setBackground(new Color(123,50,250));
    	this.setVisible(true);
    	this.add(button);
    	this.add(label);
    	
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button)
		{
			//System.out.println("The button is working!");
			label.setVisible(true);
		}
		
	}

}
