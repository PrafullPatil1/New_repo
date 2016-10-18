//@author prafull
// fibonacci series.
//Program to print fibonacci series.

package hello1;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		int num2=1;
		int result=0;
		
		// Logic to print fibonacci series
		for(int i=0;i<=5;i++){
			
			result=num1+num2;
			num1=num2;
			num2=result;
			System.out.println(result);
		}

	}

}
