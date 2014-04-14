package videofour;

public class Variables {

	
	public static void main(String[] args){
		Variables prog = new Variables();
		prog.program();
	}

	public void program() {
	
		int numberOne = 256, numberTwo = -200, result;
		double decimalOne = 1231.42;
		char letter = 'a';
		
		String message = "Hello World\nthis is the fourth video in java programming";

		result = numberOne + numberTwo; // 56
		
		System.out.println(numberOne+" + " + numberTwo + " = " + result);
		
		System.out.println(decimalOne);
		
		System.out.println(letter);
		
		System.out.println(message);
		
		
	}
	
}
