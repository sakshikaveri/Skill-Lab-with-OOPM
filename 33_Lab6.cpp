/*  To perform Multiple Inheritance in C++. 
Create a student class representing student roll number, name and branch and an exam class (derived class of student)
 representing the scores of the student in various subjects (maths, physics and chemistry) and sports class representing the score in  sports. 
The sports and exam class isinherited by a result class which adds the exam marks and sports score to generate the final result. */

#include<iostream>
using namespace std;
class student{
	
	public:
	string name;
	int roll_no;
	string branch;
	
		student()
		{
			cout<<"Enter the name of the student: ";
			cin>>name;
			cout<<"Enter the roll-number of the student: ";
			cin>>roll_no;
			cout<<"Enter the branch of the student: ";
			cin>>branch;
		}
};
class exam: public student{
	
	public:
	int maths_marks;
	int phy_marks;
	int chem_marks;
	
		exam()
		{
			cout<<"Enter the marks obtained by the student in Mathematics out of 100: ";
			cin>>maths_marks;
			cout<<"Enter the marks obtained by the student in Physics out of 100: ";
			cin>>phy_marks;
			cout<<"Enter the marks obtained by the student in Chemistry out of 100: ";
			cin>>chem_marks;
		}
};
class sports{
	
	public:
	int sports_marks;
	
		sports()
		{
			cout<<"Enter the marks obtained by the student in sports: ";
			cin>>sports_marks;
		}
};
class result: public exam, public sports{
	
	public:
	int total;
	
		void display()
		{
			total = maths_marks + phy_marks + chem_marks + sports_marks;
			cout<<"\n\nThe name of the student is "<<name;
			cout<<"\n\nThe roll-no:. of the student is "<<roll_no;
			cout<<"\n\nThe branch of the student is "<<branch;
			cout<<"\n\nThe marks obtained by the student in Mathematics are: "<<maths_marks;
			cout<<"\n\nThe marks obtained by the student in Physics are: "<<phy_marks;
			cout<<"\n\nThe marks obtained by the student in Chemistry are: "<<chem_marks;
			cout<<"\n\nThe marks obtained by the student in Sports are: "<<sports_marks;
			cout<<"\n\nThe total marks obtained by the student are: "<<total;
			
		}
};

int main()
{
	result ob1;
	ob1.display();
	return 0;
}

