package gussthenumber;

import java.util.Random;

import javax.swing.JOptionPane;

public class GuessNumber {

	public void program(){
		
		int guesses=0,number,guess;
		Random rand = new Random();
		number = rand.nextInt(101); // Choose a random number between 0-100
		while(true){
			guess = Integer.valueOf(JOptionPane.showInputDialog("Enter a number between 0-100"));
			if(guess<number){
				JOptionPane.showMessageDialog(null,"The guessed number is lower than the random number!");
				guesses++;
			}
			else if(guess>number){
				JOptionPane.showMessageDialog(null,"The guessed number is higher than the random number!");
				guesses++;
			}
			else{
				JOptionPane.showMessageDialog(null, "You guessed the correct number: " + number+ "\nAmmount of guesses: " + guesses);
				guesses++;
				break;
			}
		}
	}
	
	public static void main(String[] args){
		
		GuessNumber prog = new GuessNumber();
		prog.program();
				
	}
}
