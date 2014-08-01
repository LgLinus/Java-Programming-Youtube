package videosixteen;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import videofourteen.FrameExample;




public class UsingCardLayouts {

	public UsingCardLayouts(){
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
		new UsingCardLayouts();
	}
	
}
