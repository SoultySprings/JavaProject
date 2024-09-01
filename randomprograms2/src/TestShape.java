
import java.util.*;
public class TestShape  extends Shape{
	
	public static void main(String args[]) {
		Shape shape;
	     Sphere sp = new Sphere(0);
	     shape = sp;
	     shape.setValues2(5);

	     System.out.println("Area of Sphere : " + shape.getArea());
	     shape.toString();
	     
	     Rectangle rect = new Rectangle(0, 0);       
	     shape = rect;
	     shape.setValues(12,14);
	     System.out.println("Area of Rectangle : " + shape.getArea());
	     shape.toString();
	     
	     
	     Cylinder cy = new Cylinder(0, 0);
	     shape = cy;
	     shape.setValues(3,3);      
	     System.out.println("Area of Cylinder : " + shape.getArea());
	     shape.toString();
	}

	@Override
	protected void setValues2(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setValues(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
