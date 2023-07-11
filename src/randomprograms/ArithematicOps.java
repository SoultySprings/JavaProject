package randomprograms;

import java.util.*;

public class ArithematicOps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Arithmetic Operators are +,-,*,/
		System.out.print("Kinldy enter a number : ");		
		int x = sc.nextInt();
		System.out.print("Kindly enter another number : ");
		int y = sc.nextInt();
		System.out.println("Their sum is : " + (x+y));
		System.out.println("Their difference is : " + (x-y));
		System.out.println("Their product is : " + (x*y));
		System.out.println("Their quotient is : " + (x/y));
	}

}
