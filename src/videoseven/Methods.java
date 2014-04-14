package videoseven;

import videothree.VidThree;

public class Methods {
	public void program(){
		int nbr1 = 50, nbr2 = 92;
//		String message = "Hello";
//		print("World");
		System.out.println(add(50.2,32.75));
		String str = stringify(20.3,12.5);
		System.out.println(str);
	}
	
	public void add(int a, int b){
		int result = a + b;
		System.out.println("" + a +" + " + b + " = " + result);
	}
	
	public void print(String msg){
		System.out.println(msg);
	}
	
	public double add(double nbr1, double nbr2){
		double result = nbr1 + nbr2;
		return result;
	}
	
	public String stringify(double nbr1, double nbr2){
		String res = "";
		res = nbr1 + " + " + nbr2 + " = " + add(nbr1,nbr2);
		return res;
	}
	
	public static void main(String[] args){
		Methods prog = new Methods();
		prog.program();
	}
}
