//@author prafull
//Factorial number-5*4*3*2*1
//This program shows factorial of number which you enter
package hello1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int	fact =1;

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num=s.nextInt();
	// Logic of factorial number	
		for(int i=1;i<=num;i++){
			
			fact=fact*i;
			System.out.println(fact);
		}
		
	}

}
