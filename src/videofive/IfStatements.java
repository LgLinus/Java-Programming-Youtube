package videofive;

import javax.swing.JButton;
import javax.swing.JPanel;

public class IfStatements {


	public void program() {
		
		int number1 = -35, number2 = -200;
		
		if((number1>number2) || (number1>0)){
			System.out.println(number1 + " Is higher than " + number2);
		}
		else if(number2>number1){
			System.out.println(number2 + " Is higher than " + number1);
		}
		else if(number1==35){
			System.out.println(number2 + "Is equal to 35" );
		}
		else{
			System.out.println(number1 + " Is equal too " + number2);
		}
		
	}
	
	public static void main(String[] args) {

		IfStatements prog = new IfStatements();
		prog.program();
	}

}
