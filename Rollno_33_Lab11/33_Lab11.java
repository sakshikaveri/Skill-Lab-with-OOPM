/*Write a program in java if a number is less than 0 and greater than 10 
 * it generates the user-defined exception "out of range". Else it displays the 
 * square of the number.
 */
package exception_handling;

import java.util.Scanner;
class InvalidNumber extends Exception{
	String message;
	public InvalidNumber(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

public class Lab11_33{
	public static void main(String args[]) throws InvalidNumber {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the number ");
		n=s.nextInt();
		try {
			if(n<0) {
				throw new InvalidNumber("The number is less than zero so it's not valid");
			}
			else if(n>10) {
				throw new InvalidNumber("The number is greater than 10 so it's not valid");
			}
			else {
				int calc=n*n;
				System.out.println("The square of the number is "+calc);
			}
		}
		catch (InvalidNumber ob) {
			ob.printStackTrace();
		}
	}
}