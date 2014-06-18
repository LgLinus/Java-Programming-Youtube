package videofifteen;

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



public class PanelLayoutExamples {

	public PanelLayoutExamples(){
	JPanel pnlLeft = new JPanel();
	JPanel pnlRight = new JPanel();
	
	JFrame frame = new JFrame();
	frame.setSize(new Dimension(640,480));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new GridLayout(1,2));

	JLabel text = new JLabel("My Label");
	JButton button = new JButton("Btn1");
	
	pnlLeft.setBackground(Color.BLUE);
	pnlRight.setBackground(Color.RED);
	
	pnlLeft.setLayout(new FlowLayout());
	pnlRight.setLayout(new BoxLayout(pnlRight,BoxLayout.Y_AXIS));
	
	
	pnlLeft.add(button);
	pnlLeft.add(text);
	
	addButtons(pnlRight,10);
	
	frame.add(pnlLeft);
	frame.add(pnlRight);
	frame.setVisible(true);
	}
	
	private void addButtons(JPanel pnl, int amount){
		for(int i = 0; i < amount;i++)
		pnl.add(new JButton("Btn " + i));
	}
	
	public static void main(String[] args){
		new PanelLayoutExamples();
	}
	
}
