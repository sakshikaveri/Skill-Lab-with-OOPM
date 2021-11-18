/*Write a java program to create an abstract class named Shape that 
 * contains two integers and an abstract method named printArea(). 
 * Provide three classes named Rectangle, Triangle and Circle such that 
 * each one of the classes extends the class Shape. Each one of the classes 
 * contain only the method printArea() that prints the area of the given shape.
 */
package inheritance;

import java.util.Scanner;

abstract class Shape{
	
	Scanner in=new Scanner(System.in);
	public int dim1,dim2;
	abstract int printArea();
}
class Rectangle extends Shape{
	//Scanner in=new Scanner(System.in);
	int printArea() {
	System.out.println("Enter the length and breadth of the rectangle ");
	dim1=in.nextInt();
	dim2=in.nextInt();
	float area;
		area=dim1*dim2;
		System.out.println("The formula for area of rectangle is (length)*(breadth)="+dim1+"*"+dim2);;
		System.out.println("The area of the rectangle is "+area);
		return 0;
	}
	
}
class Triangle extends Shape{
	//Scanner in=new Scanner(System.in);
	int printArea() {
	System.out.println("\nEnter the base and height of the triangle ");
	dim1=in.nextInt();
	dim2=in.nextInt();
	float area;
		area=(float) 0.5*(dim1*dim2);
		System.out.println("The formula for area of triangle is 0.5*(base)*(height)= 0.5*"+dim1+"*"+dim2);;
		System.out.println("The area of the traingle is "+area);
		return 0;
	}
	
}
class Circle extends Shape{
	//Scanner in=new Scanner(System.in);
	int printArea() {
	System.out.println("\nEnter the radius of the circle ");
	dim1=in.nextInt();
	//dim2=in.nextInt();
	float area;
		area= (float) 3.14*dim1*dim1;
		System.out.println("The formula for area of circle is 3.14*(radius)*(radius)=3.14*"+dim1+"*"+dim1);;
		System.out.println("The area of the circle is "+area);
		return 0;
	}
	
}



public class Lab9_33 {

	public static void main(String[] args) {
		Shape r=new Rectangle();
		r.printArea();
		Shape t=new Triangle();
		t.printArea();
		Shape c=new Circle();
		c.printArea();
		// TODO Auto-generated method stub

	}

}
