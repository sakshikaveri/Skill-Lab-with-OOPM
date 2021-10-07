// Write a C++ program to overload '+' operator to add two matrices
#include<iostream>
using namespace std;
class matrices
{
	int a[2][2];
	int b[2][2];
	int c[2][2];
	public:
		void get_element(void)
		{
			cout<<"Enter elements "<<endl;
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					cin>>a[i][j];
				}
			}
		}
		matrices operator+(matrices m2);
		void display(void)
		{
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					cout<<a[i][j]<<" ";
					
				}
				cout<<endl;
			}
		}
	
};
matrices matrices::operator+(matrices m2)
{
	matrices m3;
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			m3.a[i][j]=a[i][j]+m2.a[i][j];
			
		}
	}
	return m3;
}
int main()
{
	matrices ob1;
	matrices ob2;
	ob1.get_element();
	cout<<"Matrix 1 "<<endl;
	ob1.display();
	ob2.get_element();
	cout<<"Matrix 2 "<<endl;
	ob2.display();
	ob1=ob1+ob2;
	cout<<"The final matrix obtained is "<<endl;
	ob1.display();
	return 0;
}

