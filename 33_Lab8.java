/* To perform Multilevel Inheritance in JAVA. 
  Create a Person class representing name, age and address. 
  Inherit person class to employee class with emp ID and salary factor. 
  Inherit the Employee class to programmer class with technical skills and 
  hike attributes. Implement valid methods to input the details from the 
  user in the main method and display for 3 programmers. */

package inheritance;
import java.util.Scanner;

class person{
	Scanner in= new Scanner(System.in);
	String name;
	int age;
	String address;
	void printData() {
		System.out.println("Enter the name,age and address of the person ");
		name=in.next();
		age=in.nextInt();
		address=in.next();
	}
}
class employee1 extends person{
	Scanner in= new Scanner(System.in);
	int EmpID;
	float salary;
	void display() {
		System.out.println("Enter the Employee ID and salary ");
		EmpID=in.nextInt();
		salary=in.nextFloat();
	}
}
class programmer extends employee1{
	double hike=0.1;
	String tech="Java, Python,C";
	void calc() {
		super.printData();
		super.display();
		System.out.println("The name of the person is "+name);
		System.out.println("The age of the person is "+age);
		System.out.println("The address of the person is "+address);
		System.out.println("The employee id of the person is "+EmpID);
		System.out.println("The salary of the person is "+salary);
		System.out.println("The technical skills are: "+tech);
		System.out.println("The total salary of the employee is "+(salary+(salary*hike)));
	}
}


public class Lab8_part2 {

	public static void main(String[] args) {
		programmer p1=new programmer();
		p1.calc();
		programmer p2=new programmer();
		p2.calc();
		programmer p3=new programmer();
		p3.calc();
		
		
		
		
		
	

			
		}

		

	}


