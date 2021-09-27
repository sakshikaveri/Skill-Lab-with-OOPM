/*Write a program to create a class Student along with two method getData(),printData()
to get the value through argument and display the data in printData().Create the
two objects s1,s2 to declare and access the values from class StudentTest */
import java.util.Scanner;
class Student {
	
	Scanner in=new Scanner(System.in);
	String name;
	int roll_no;
	float cgpa;
	char div;
	
	/*public Student(String n,int r,float c,char d )
	{
		name=n;
		roll_no=r;
		cgpa=c;
		div=d;
	}*/
	
	//method overloading
	void getdata()
	{
		System.out.println("Enter your name:");
		name=in.next(); //string input
		System.out.println("Enter your roll number:");
		roll_no=in.nextInt();
		System.out.println("Enter your CGPA:");
		cgpa=in.nextFloat();
		System.out.println("Enter your Division:");
		div=in.next().charAt(0);
		
	}
	
	void getdata(String n,int r,float c,char d) //with four parameters
	{
		name=n;
		roll_no=r;
		cgpa=c;
		div=d;
		
	}
	
	/*void getdata(String n,int r,float c) //with three parameters
	{
		name=n;
		roll_no=r;
		cgpa=c;
		div='C';
		
	}*/
	
	void printdata()
	{
		System.out.println("Name of the student: "+name);
		System.out.println("Roll-no of the student: "+roll_no);
		System.out.println("Cgpa of the student: "+cgpa);
		System.out.println("Division of the student: "+div);
	}

};
 public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s1.getdata(); //non parameter
		s1.printdata();
		s2.getdata("Siddharth",03,(float)8.8,'D'); // with parameters
		//s2.getdata(); 
		s2.printdata();
		
		

	}
	

}
