import java.util.*;

public class Sphere extends Shape{
	
	public float area(float r) {
		Scanner sc = new Scanner(System.in);
		float area = (float)(4*Math.PI*(r*r));
		System.out.println("Area of the sphere with radius "+r+"m "+" is "+area+"\n");
		return area;
	}
	
	public String toString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the shape for which you want to find the area of : ");
		shapeName = sc.next();
		return shapeName;
	}
}