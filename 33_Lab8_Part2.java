/*	To perform Hierarchical Inheritance in JAVA. 
  Create an Employee class with attributes EmpID and EmpSalary. 
  Also create necessary methods/constructors to accept these values from the user. 
  Create classes permenantEmployee and TemporaryEmployee which will be derived classes 
  of Employee. Mention hike attribute in these derived classes and 
  calculate the total salary using generate_salary() method for 
  respective types of employees. Objects of the derived classes should be created and 
  salaries for the permanent and temporary employees should be calculated and 
  displayed on the screen.  */
 
package inheritance;
import java.util.Scanner;

class Employee{
	Scanner in=new Scanner(System.in);
	int empID;
	float Empsalary;
	void display() {
		System.out.println("Enter the ID and salary of the employee ");
		empID=in.nextInt();
		Empsalary=in.nextFloat();
	}
}
class PermanentEmployee extends Employee{
	double hike= 0.12;
	void generate_salary() {
		super.display();
		System.out.println("The total salary of the employee is "+(Empsalary+(Empsalary*hike)));
	}
}
class TemporaryEmployee extends Employee{
	double hike= 0.08;
	void generate_salary() {
		super.display();
		System.out.println("The total salary of the employee is "+(Empsalary+(Empsalary*hike)));
	}
}


public class Lab8 {

	public static void main(String[] args) {
		PermanentEmployee p= new PermanentEmployee();
		p.generate_salary();
		TemporaryEmployee temp= new TemporaryEmployee();
		temp.generate_salary();
		//System.out.println("Hello world");


	}

		

	}

