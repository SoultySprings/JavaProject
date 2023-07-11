package randomprograms;
import java.util.*;
public class MethodOverLoading {

	public static void main(String[] args) {
		System.out.println(area(12,31));
		System.out.println(area(12.12412f));
		
	}
	
	public static int area(int n1, int n2) {
		int area1 = n1*n2;
		return area1;
	}
	
	public static float area(float n3) {
		float area2 = 3.14f*n3*n3;
		return area2;
	}

}
