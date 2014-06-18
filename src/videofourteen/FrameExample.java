package videofourteen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class FrameExample {

	public FrameExample(){
	FlowLayout layout = new FlowLayout();
	JFrame frame = new JFrame();
	frame.setSize(new Dimension(640,480));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(layout);
	
	JLabel text = new JLabel("My Label");
	JButton button = new JButton("Btn1");
	button.setPreferredSize(new Dimension(200,100));
	frame.add(button);
	frame.add(text);
	
	frame.setVisible(true);
	}
	
	public static void main(String[] args){
		new FrameExample();
	}
	
}
