package TemperatureControl;

import java.awt.*;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.event.*;


public class SliderDemo implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	public SliderDemo()
	{
		frame = new JFrame("Slider Demo");
	    panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(32,212,122);
		
	    slider.setPreferredSize(new Dimension(400,200));
	    
	    slider.setPaintTicks(true);
	    slider.setMinorTickSpacing(10);
	    
	    slider.setPaintTrack(true);
	    slider.setMajorTickSpacing(20);
	    
	    slider.setPaintLabels(true);
	    slider.setFont(new Font("MV Boli",Font.PLAIN,10));
	    
	    slider.setOrientation(SwingConstants.VERTICAL);
	    slider.setBackground(Color.orange);
	    
	    slider.addChangeListener(this);
	    
	    label.setText("Farenheit :"+slider.getValue());
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(600,400);
		frame.setVisible(true);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		
		label.setText("Farenheit :"+slider.getValue());
	}

	
}
