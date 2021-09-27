//Write a C++ program for Basic bank Management System 
#include<iostream>
using namespace std;
    class BankLab2 {
    	public:
    		
     string name;

	char account_type;

	int account_number,amount;

	float balance;

	

    BankLab2(string n,int a, char t, float b) {

		// TODO Auto-generated constructor stub

		name = n;

		account_number=a;

		account_type=t;

		balance=b;

	}

	int deposit()

	{

		cout<<"Enter the amount to	deposit: "<<endl;

		cin>>amount;

		if(amount<0)

		{
			cout<<"Invalid amount,Enter a valid amount"<<endl; 

			return 0;

		}

		balance=balance+amount;

		return 1;

	}
	
	int withdraw()

	{
		cout<<"Your Balance= "<<balance<<endl; 

		cout<<"Enter amount to withdraw: "<<endl; 

		cin>>amount;

		if (balance<amount)

		{
			cout<<"Insufficient Balance:	"<<endl; 

			return 0;

		}

		if(amount<0)

		{
			cout<<"Invalid	amount" <<endl; 

			return 0;

		}

		balance=balance-amount; 

		return 1;

	}

	void display()

	{
		cout<<"Name :"<<name<<endl;

	    cout<<"Account Number:"<<account_number<<endl;

		cout<<"Account Type: "<<account_type<<endl;

        cout<<"Balance: "<<balance<<endl;

	}
};

	int main()
	{
		char ans;
		int account_number;

		BankLab2 b1("salman",1,'s',2000);

		BankLab2 b2("makarand",2,'s',2000);

		BankLab2 b3("siddharth",3,'s',2000);

		
		cout<<"Menu"<<endl;

		cout<<"1.Deposit"<<endl;

		cout<<"2.Withdraw"<<endl;

		cout<<"3.Display"<<endl;

		cout<<"Enter option"<<endl; 

		int op;
		cin>>op;

		do

		{

			cout<<"Please enter your account number: "<<endl; 

			
			cin>>account_number;		

				switch(account_number)

				{

					case 1:	if(op==1)

								b1.deposit();

							if(op==2)

								b1.withdraw();

							if(op==3)

								b1.display();

							

							break;

					case 2:	if(op==1)

								b2.deposit();

							if(op==2)

								b2.withdraw();

							if(op==3)

								b2.display();

							

							break;

					case 3:	if(op==1)

								b3.deposit();

							if(op==2)

								b3.withdraw();

							if(op==3)

								b3.display();

							

							break;

					default: cout<<"Enter value between 1 to 3"<<endl;

							break;

				}

				cout<<"Do you want to continue?[Y/N]"<<endl;

				cin>>ans;

				if(ans=='Y' || ans == 'y') 

				{

					cout<<"Menu"<<endl;

					cout<<"1.Deposit"<<endl;

					cout<<"2.Withdraw"<<endl;

					cout<<"3.Display"<<endl;

					cout<<"Enter option"; 

					cin>>op;

				}

					

			}

			while(ans!='N');

	}
/*Write a C++ program to Create a class Student with two method getData() and printData().
 getData() to get the value from the user and display the data in printData(). 
 Create the two objects s1 ,s2 to declare and access the values from class StudentTest.
 #include<iostream>
using namespace std;
class Student
{
	public:
	string name;
	int roll_no;
	char div;
	float cgpa;
	void getdata()
	{
		cout<<"Enter the name of the student:  "<<endl;
		cin>>name;
		cout<<"Enter the roll-no of the student: "<<endl;
		cin>>roll_no;
		cout<<"Enter the Division of the student: "<<endl;
		cin>>div;
		cout<<"Enter the cgpa of the student: "<<endl;
		cin>>cgpa;
	
	}
	int getdata(string n,int r,char d,float c)
	{
		name=n;
		roll_no=r;
		div=d;
		cgpa=c;
		return 0;
	}
	void printdata()
	{
		
		cout<<"Name of the student: "<<name<<endl;
		cout<<"Roll-no of the student: "<<roll_no<<endl;
		cout<<"Division of the student: "<<div<<endl;
		cout<<"The cgpa obtained by the student: "<<cgpa<<endl;
		
		
		
	}
};
	int main()
		{
	
		Student s1;
		Student s2;
		s1.getdata();
		s1.printdata();
		s2.getdata("Siddharth",3,'D',8.8);
		s2.printdata();
		return 0;
}*/
		

 



