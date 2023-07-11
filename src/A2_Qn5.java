//Program to print the square of number only when it is in between 10 and 50

import java.util.*;
public class A2_Qn5 {
	
	public void Square() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly enter a number : ");
		short x = sc.nextShort();
		if (x>=10 && x<=50) {
			System.out.println("\nThe required result is : " + (x*x));
		} else {
			System.out.println("\nOut of range!");
		}
	}

	public static void main(String[] args) {
		A2_Qn5 obj = new A2_Qn5();
		obj.Square();
	}
}
