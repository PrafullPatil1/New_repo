//@author prafull
// Palindrome program.
//Program to check weather the number is Palindrome or not.

package hello1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rem,sum=0,temp;    
		  Scanner s=new Scanner(System.in);//It is the number variable to be checked for palindrome
	    
		  System.out.println("Enter number to check palindrome");
		  int  num=s.nextInt();	  
		  
		  temp=num;    
		  while(num>0){ 
			  
		   rem=num%10;  //getting remainder  
		   sum=(sum*10)+rem;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");  

	}

}
