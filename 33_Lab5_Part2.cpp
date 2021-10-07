// Write a C++ program to multiply two complex numbers by overloading operator '*'
#include<iostream>
using namespace std;
class complex
{
	public:
		int real;
		int img;
		complex()
		{
			real=0;
			img=0;
		}
		complex(int r,int im)
		{
			real=r;
			img=im;
		}
		complex operator*(complex c)
		{
		complex ans;
		ans.real=((real*c.real)-(img*c.img));
		ans.img=((real*c.img)+(c.real*img));
		return (ans);
			
		}
	void display(void)
	{
		cout<<real<<"+"<<img<<"i"<<endl;
	}
		
};
int main()
{
	//complex c1,c2;
	complex c1(3,4);
	cout<<"Complex Number 1: ";
	c1.display();
	complex c2(6,7);
	cout<<"Complex Number 2: ";
	c2.display();
	c1=c1*c2;
	cout<<"The final answer is: ";
	c1.display();
	return 0;
}
