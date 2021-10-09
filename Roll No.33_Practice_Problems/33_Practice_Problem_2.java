import java.util.Scanner;

public class Employee {
	Scanner sc=new Scanner(System.in);
	String name;
	int emp_num;
	float Basic;
	float DA;
	float IT;
	float Net_Salary;
	void get_data()
	{
		System.out.println("Enter Employee name ");
	    name=sc.next();
		System.out.println("Enter Employee ID Number ");
		emp_num=sc.nextInt();
		System.out.println("Enter Employee Basic Salary ");
		Basic=sc.nextFloat();
	}
	void calc()
	{
		DA=(float) (1.32)*(Basic);
		IT=(float) (0.30)*(Basic+DA);
		Net_Salary=(float) (Basic+DA)-(IT);
	}
	void display() {
		System.out.println("The Employee name is "+name);
		System.out.println("The Employee ID Number is "+emp_num);
		System.out.println("The Employee Basic Salary is "+Basic);
		System.out.println("The Employee Net Salary is "+Net_Salary);
};
	public static void main(String[] args) {
	Employee obj=new Employee();
	for(int i=0;i<3;i++) {
		obj.get_data();
		obj.calc();
		obj.display();
	}
	

	}

}
