import java.util.Scanner;

public class Cylinder extends Shape{
	
	public float area(float r, float h) {
		Scanner sc = new Scanner(System.in);
		float area = (float)(Math.PI*(r*r)*h);
		System.out.println("Area of the cylinder with radius "+r+"m "+"and height "+h+"m "+"is "+area +"\n");
		return area;
	}
	
	public String toString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the shape for which you want to find the area of : ");
		shapeName = sc.next();
		return shapeName;
	}
}