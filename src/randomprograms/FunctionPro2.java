package randomprograms;

import java.util.Scanner;

public class FunctionPro2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter the integers, for subtraction, one by one : ");
		int x = sc.nextInt(); int y = sc.nextInt();
		
		System.out.println("\nThe difference of given integers is : " + Subtract(x, y));

	}
	
	public static int Subtract(int x, int y) {
		int difference = x-y;
		return difference;
		
		
	}

}

