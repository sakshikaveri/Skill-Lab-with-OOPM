/* To perform Hierarchical Inheritance in C++.
 Create an Employee class with attributes EmpID and EmpSalary.Also create necessary methods/constructors to accept these values from the user.
Create classes permenantEmployee and TemporaryEmployee which will be derived classes of Employee.
Mention hike attribute in these derived classes and calculate the total salary using generate_salary() method for respective types of employees.
Objects of the derived classes should be created and salaries for the permanent and temporary employees should be calculated and
displayed on the screen. */

#include<iostream>
using namespace std;
class Employee{
	public:
	int EmpID;
	int EmpSalary;
	Employee()
	{
		cout<<"Enter the ID of the Employee- ";
		cin>>EmpID;
		cout<<"Enter the current salary of the Employee- ";
		cin>>EmpSalary;
	}
};
class PermanentEmployee: public Employee{
	float hike = (0.1*EmpSalary);
	public:
		PermanentEmployee(){
			cout<<"\n\nHi this is section of Permanent Employee "<<endl;
	}
			void generate_salary()
			{
				int total_sal= EmpSalary + hike;
				cout<<"The total Salary of the Employee is "<<total_sal<<endl<<endl;
			}
			};
class TemporaryEmployee: public Employee{
	float hike=(0.05*EmpSalary);
	public:
		TemporaryEmployee(){
			cout<<"\n\nHi this is section of Temporary Employee "<<endl;}
			void generate_salary()
			{
				int total_sal= EmpSalary + hike;
				cout<<"The total Salary of the Employee is "<<total_sal<<endl;
			}
			};

int main()
{
	PermanentEmployee ob1;
	ob1.generate_salary();
	TemporaryEmployee ob2;
	ob2.generate_salary();
	return 0;
}
