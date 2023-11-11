import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;

import java.awt.Font;

public class Label2 {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("D:\\HTML\\icon.png");
		
		Border border = BorderFactory.createLineBorder(Color.RED,3);
		
        JLabel label = new JLabel();
		
        label.setText("Music is Life");
        
        label.setIcon(image);
        
        label.setBackground(Color.black);
        
        label.setOpaque(true);
		
		label.setHorizontalTextPosition(JLabel.CENTER);
		
		label.setVerticalTextPosition(JLabel.TOP);
		
		label.setForeground(Color.RED);
		
		label.setFont(new Font("MV Boli",Font.PLAIN,50));
		
		label.setBorder(border);
		
		label.setVerticalAlignment(JLabel.CENTER);
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//label.setBounds(100,80,300,300);
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//frame.setSize(500,500);
		
		//frame.setLayout(null);
		
		
		
		frame.setVisible(true);
		
		frame.add(label);
		
		frame.pack();
		
	}

}
