package randomprograms;

import java.util.*;
public class RelationalOps {

	public static void main(String[] args) {
		//Relational Operators are >,<,==,!=
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int x = sc.nextInt();
		System.out.print("Please enter a number : ");
		int y = sc.nextInt();
		System.out.println("Num 1 Greater Num 2? " + (x>y));
		System.out.println("Num 1 Smaller Num 2? " + (x<y));
		System.out.println("Num 1 Equal Num 2? " + (x==y));
		System.out.println("Num 1 Not Equal Num 2? " + (x!=y));
		
	}
}
