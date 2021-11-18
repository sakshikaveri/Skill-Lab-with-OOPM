/* /*Write a java program to implement Multiple Inheritance using Interfaces.
Create an interface called Management with selectCandidate() method. 
Another interface called Department with allotSubject() method. 
Class called HOD will implements these two interfaces and define the methods and 
access them with valid objects. */

package interface_program;

import java.util.Scanner;

interface Management{
	public void selectCandidate();
}
interface Department{
	public void allotSubject();
}

public class HOD implements Management,Department {
	
	Scanner sc=new Scanner(System.in);
	String name;
	String qualification;
	
	public void selectCandidate(){
		System.out.println("Enter the name of the candidate ");
		name=sc.next();
		/*System.out.println("Enter the qualification of the candidate");
		qualification=sc.next();	*/
	}
	
	@Override
	public void allotSubject() {
		String subject;
		System.out.println("Enter the subject ");
		subject=sc.next();
		System.out.println("Candidate "+name+" is alloted for the subject "+subject);
	}
	
	public static void main(String[] args) {
		HOD obj=new HOD();
		obj.selectCandidate();
		obj.allotSubject();
		// TODO Auto-generated method stub

	}

}
