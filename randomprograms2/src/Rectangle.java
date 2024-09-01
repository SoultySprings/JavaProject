import java.util.Scanner;

public class Rectangle extends Shape{
	
	public float area(float l, float b) {
		Scanner sc = new Scanner(System.in);
		float area = (float)(l*b);
		System.out.println("Area of the rectangle with length "+l+"m "+" and breadth "+b+"m "+" is "+area+"\n");
		return area;
	}
	
	public String toString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the shape for which you want to find the area of : ");
		shapeName = sc.next();
		return shapeName;
	}
}