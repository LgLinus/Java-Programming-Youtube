package videofourteen;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FrameExample {

	private JPanel panel1 = new JPanel(new FlowLayout());
	private JPanel panel2 = new JPanel(new FlowLayout());
	private JPanel panel3 = new JPanel(new FlowLayout());
	private JPanel panel4 = new JPanel(new FlowLayout());
	private JButton btnNextPanel1;
	private JButton btnNextPanel2;
	private JButton btnNextPanel3;
	private JButton btnPrevPanel2;
	private JButton btnPrevPanel3;
	private JButton btnPrevPanel4;
	private CardLayout cardLayout = new CardLayout();
	private ButtonListener listener = new ButtonListener();
	JFrame frame;
	
	public FrameExample(){
	frame = new JFrame();
	frame.setLayout(cardLayout);
	frame.setSize(new Dimension(640,480));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	initPanels();
	
	
	frame.setVisible(true);
	
	}
	
	private void initPanels() {
		// panel 1
		JLabel textPanel1 = new JLabel("Panel 1");
		btnNextPanel1 = new JButton("Goto panel 2");
		btnNextPanel1.setPreferredSize(new Dimension(150,100));
		btnNextPanel1.addActionListener(listener);
		panel1.add(textPanel1);
		panel1.add(btnNextPanel1);
		
		// panel 2
		JLabel textPanel2 = new JLabel("Panel 2");
		btnNextPanel2 = new JButton("Goto panel 3");
		btnNextPanel2.setPreferredSize(new Dimension(150,100));
		btnPrevPanel2 = new JButton("Goto panel 1");
		btnPrevPanel2.setPreferredSize(new Dimension(150,100));
		btnNextPanel2.addActionListener(listener);
		btnPrevPanel2.addActionListener(listener);
		panel2.add(textPanel2);
		panel2.add(btnPrevPanel2);	
		panel2.add(btnNextPanel2);		
		// panel 3
		JLabel textPanel3 = new JLabel("Panel 3");
		btnNextPanel3 = new JButton("Goto panel 4");
		btnNextPanel3.setPreferredSize(new Dimension(150,100));
		btnPrevPanel3 = new JButton("Goto panel 2");
		btnPrevPanel3.setPreferredSize(new Dimension(150,100));
		btnNextPanel3.addActionListener(listener);
		btnPrevPanel3.addActionListener(listener);
		panel3.add(textPanel3);
		panel3.add(btnPrevPanel3);
		panel3.add(btnNextPanel3);
		
		// panel 4
		JLabel textPanel4 = new JLabel("Panel 4");
		btnPrevPanel4 = new JButton("Goto panel 2");
		btnPrevPanel4.setPreferredSize(new Dimension(150,100));
		panel4.add(textPanel4);
		panel4.add(btnPrevPanel4);

		btnPrevPanel4.addActionListener(listener);
		frame.add("Panel1",panel1);
		frame.add("Panel2",panel2);
		frame.add("Panel3",panel3);
		frame.add("Panel4",panel4);
		
		cardLayout.show(frame.getContentPane(), "Panel3");
	}

	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(btnNextPanel1)){
				cardLayout.show(frame.getContentPane(), "Panel2");
			}
			else if(e.getSource().equals(btnNextPanel2)){
				cardLayout.show(frame.getContentPane(), "Panel3");
			}else if(e.getSource().equals(btnNextPanel3)){
				cardLayout.show(frame.getContentPane(), "Panel4");
			}else if(e.getSource().equals(btnPrevPanel2)){
				cardLayout.show(frame.getContentPane(), "Panel1");
			}else if(e.getSource().equals(btnPrevPanel3)){
				cardLayout.show(frame.getContentPane(), "Panel2");
			}else if(e.getSource().equals(btnPrevPanel4)){
				cardLayout.show(frame.getContentPane(), "Panel3");
			}
		}
		
	}
	
	public static void main(String[] args){
		new FrameExample();
	}
	
}
