package videotwelve;

/**
 * Examples of how to use arrays
 * 
 * @author Linus
 * 
 */
public class ArrayExample {

	private void run() {
		
		int[] intArray = {2,5,10,502,243,1};
		
		for(int i = 0; i < intArray.length;i+=2){
			System.out.println(intArray[i]);
		}
		
		String[] names = {"Linus","David","Paul","Victoria","Rebecca" };
		
		for(int i = names.length-1; i >= 0;i--){
			System.out.println(names[i]);
		}
	}

	public static void main(String[] args) {
		ArrayExample run = new ArrayExample();
		run.run();
	}
}
