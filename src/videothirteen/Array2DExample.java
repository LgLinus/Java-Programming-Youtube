package videothirteen;

/**
 * Examples of how to use arrays
 * 
 * 1D - array
 * 
 * int[3]
 * [1]
 * [2]
 * [3]
 * 
 * 2D - Array
 * int[4][3]
 * [1][2][3]
 * [4][5][6]
 * [7][8][9]
 * [10][11][12]
 * @author Linus
 * 
 */
public class Array2DExample {

	private void run() {

		int [][] intArray = 
			{
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12,13}};
		printAray(intArray);
	}

	private void printAray(int[][] intArray) {
		for(int i = 0;i<intArray.length;i++){
			for(int j = 0; j < intArray[i].length;j++){
				System.out.print(" , " + intArray[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Array2DExample run = new Array2DExample();
		run.run();
	}
}
