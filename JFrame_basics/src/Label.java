
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Label extends JLabel{

	public Label()
	{
		JLabel label = new JLabel();
		
		myFrame frame = new myFrame();
		
		ImageIcon image = new ImageIcon("twitter-logo.png");
		
		label.setText("testing");
		
		label.setHorizontalTextPosition(JLabel.CENTER);
		
		label.setIcon(image);
		
		frame.add(label);
	}
}
