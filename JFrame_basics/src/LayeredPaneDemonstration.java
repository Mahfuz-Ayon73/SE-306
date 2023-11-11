import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LayeredPaneDemonstration {

	public static void main(String[] args) {
		
	   JLabel label1 = new JLabel();
	   label1.setOpaque(true);
	   label1.setBackground(Color.red);
	   label1.setBounds(50,50,200,200);
	   
	   JLabel label2 = new JLabel();
	   label2.setOpaque(true);
	   label2.setBackground(Color.blue);
	   label2.setBounds(100,100,200,200);
	   
	   JLabel label3 = new JLabel();
	   label3.setOpaque(true);
	   label3.setBackground(Color.green);
	   label3.setBounds(150,150,200,200);
	   
	   
	   
	   JLayeredPane lP = new JLayeredPane();	
	   lP.setBounds(0,0,600,600);
	   
	   lP.add(label1,Integer.valueOf(1));
	   lP.add(label2,Integer.valueOf(3));
	   lP.add(label3,Integer.valueOf(2));
	   
	   
		
	   JFrame frame = new JFrame();
	   
	   frame.add(lP);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setSize(600,600);
	   frame.setVisible(true);

	}

}
