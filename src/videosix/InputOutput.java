package videosix;

import javax.swing.JOptionPane;

import videofive.Loops;

public class InputOutput {

	public static void main(String[] args) {

		InputOutput prog = new InputOutput();
		prog.program();
	}

	private void program() {
		JOptionPane.showMessageDialog(null,"Hello!\nWorld");
		int nbr1;
		nbr1 = Integer.valueOf(JOptionPane.showInputDialog("Enter a whole number!"));
		JOptionPane.showMessageDialog(null, nbr1);
//		 
//		double nbr1;
//		nbr1 = Double.valueOf(JOptionPane.showInputDialog("Enter a whole number!"));
//		
//		JOptionPane.showMessageDialog(null, nbr1);
		
	}
}
