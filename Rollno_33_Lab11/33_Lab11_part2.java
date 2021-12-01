/*Write a program in java to enter the number. If the first and second number is not 
 * entered it will generate the exception. Also, divide the first number with the 
 * second number and generate the arithmetic exception.
 */
package exception_handling;

import java.util.Scanner;
class Error extends Exception{
	String message;
	public Error(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}


public class Lab11_33_part2 {

	public static void main(String[] args) throws Error {
		try {
			
		Scanner sc=new Scanner(System.in);
		int i,j;
		float k;
		System.out.println("Enter a first and second number");
		i=sc.nextInt();
		j=sc.nextInt();
		k=(float) (i/j);
		System.out.println("The value of output is " +k);
		//throw new Error("The numbers are not entered");
			

	}
		catch(ArithmeticException e) {	
			System.out.println("Can not divide by 0 "+e);
		}

}
}
