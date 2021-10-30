// To demonstrate friend class
#include<iostream>
#include<string>
using namespace std;
class Area{
	int length,area,breadth;
	public:
		Area(int l,int b){
			length=l;
			breadth=b;
		}
		void calc(){
			area=length*breadth;
		}
		friend class printclass;
		
};
class printclass{
	public:
		void calc_area(Area obj){
			cout<<"Area is= "<<obj.area;
		}
};
	
int main()
{
	Area obj(10,20);
	obj.calc();
	printclass p;
	p.calc_area(obj);
	
	return 0;
}
