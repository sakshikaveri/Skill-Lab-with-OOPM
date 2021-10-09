#include<iostream>
#include<string>
using namespace std;
class Employee
{
	int emp[100];
	int emp_num;
	string name;
	float Basic;
	float DA;
	float IT;
	float Net_Salary;
	public:
		void get_data(){
		cout<<"Enter Employee name "<<endl;
		cin>>name;
		cout<<"Enter Employee ID Number "<<endl;
		cin>>emp_num;
		cout<<"Enter Employee Basic salary "<<endl;
		cin>>Basic;
		}
		void calc();
		void print_data();
};
void Employee::calc()
{
	DA=(1.32)*(Basic);
	IT=(0.30)*(Basic+DA);
	Net_Salary= (Basic+DA)-(IT);
}
void Employee::print_data()
{
		cout<<"\nThe name of Employee is "<<name<<endl;
		cout<<"The ID Number of Employee is "<<emp_num<<endl;
		cout<<"The Basic Salary of Employee is "<<Basic<<endl;
		cout<<"The net salary of the Employee is "<<Net_Salary<<endl<<endl;
}
int main()
{
	Employee obj;
	for(int i=0;i<3;i++)
	{
		obj.get_data();
		obj.calc();
		obj.print_data();
	}
	return 0;
}

