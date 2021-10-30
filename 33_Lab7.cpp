// To demonstrate friend function
#include<iostream>
using namespace std;
class X{
	int a;
	int b;
	public:
		void setData(){
			a=10;
			b=20;
		}
		friend int calc(X &o1);
};
int calc(X &o1){
	return int(o1.a+o1.b)/2.0;
}
int main()
{
	X obj;
	obj.setData();
	calc(obj);
	cout<<"Mean value is "<<calc(obj);
	return 0;
}
