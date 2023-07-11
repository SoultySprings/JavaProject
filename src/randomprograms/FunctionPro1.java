//Program to use functions to multiply and subtract 4 integers

package randomprograms;
import java.util.*;
public class FunctionPro1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter the integers, for multiplication, one by one : ");
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int d = sc.nextInt(); 
		
		System.out.println("\nThe product of given integers is : " + Multiply(a, b, c, d));

	}
	
	public static int Multiply(int a, int b, int c, int d) {
		int product = a*b*c*d;
		return product;
		
		
	}

}
