package videoseventeen;

import javax.swing.JOptionPane;

public class TryAndCatchExample {

	public void Ex1(){
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		System.out.println(number);
	}
	
	public void Ex2(){
		try{
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		System.out.println(number);}
		catch(NumberFormatException e)
		{
			System.out.println("User did not put in a number!");
		}
	}

	public void Ex3(){
		boolean success = false;
		while(!success){
		try{
			int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			System.out.println(number);
			success = true;}
			catch(NumberFormatException e)
			{
				System.out.println("User did not put in a number!");
				JOptionPane.showMessageDialog(null, "Erorr, you did not type out a correct value");
			} 
		}
	}
	
	public static void main(String[] args){
		TryAndCatchExample ex = new TryAndCatchExample();
		
//		ex.Ex1();
//		ex.Ex2();
		ex.Ex3();
	}
}
