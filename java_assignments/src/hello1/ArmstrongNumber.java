//@author prafull
// ArmstrongNumber.
//Program to check weather the number is ArmstrongNumber or not.

package hello1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int c=0,a,temp;  
		 
		 Scanner s=new Scanner(System.in);
		   
		 System.out.println("Enter number to check ArmstrongNumber ");
		 int num=s.nextInt();
		  
		 temp=num;  
		 
		    while(num>0)  
		    {  
		    a=num%10;  
		    num=num/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   

	}

}
