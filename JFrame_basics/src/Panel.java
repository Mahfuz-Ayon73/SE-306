import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setLayout(null);
		frame.setSize(600,600);
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel1.setBounds(0, 0, 250, 250);
		
        JPanel panel2 = new JPanel();
		
		panel2.setBackground(Color.blue);
		panel2.setBounds(250, 0, 250, 250);
		
        JPanel panel3 = new JPanel();
		
		panel3.setBackground(Color.green);
		panel3.setBounds(0, 250, 250, 250);
		
		JLabel label = new JLabel();
		
		label.setText("Hi");
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		panel1.add(label);
		
		
	}

}
