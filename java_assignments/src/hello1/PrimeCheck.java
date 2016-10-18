//@author prafull
//Prime and not prime
//This program accepts a  number from command prompt and check if it is prime or not.

package hello1;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the number :");
		int num=s.nextInt();
		
		//  logic to check no. is prime or not
		for(int i=2;i<num/2;i++)
		{
			int rem=num%i;
			if(rem==0)
			{
				flag=1;
				break;
			}	
			
		}
		
		// If flag is 1 then number is not prime else prime
		if(flag==1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
	
	}

}
