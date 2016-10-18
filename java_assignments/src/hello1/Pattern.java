// @author Prafull
// Patter display using for loop
//This program displays pattern using for loop.

package hello1;

public class Pattern {

	// This method draw patterns of numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1 ; i<=5;i++){
			
			for(int j=0;j<i;j++){
				System.out.print(i); //  is used to print value of i
			}
			System.out.println(); // println() is user to print result on next line
		}

	}

}

