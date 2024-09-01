//Program to take choice as input from user and take marks as input till the user wants

import java.util.*;
public class Conditional1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice : ");
		byte a = sc.nextByte(), marks = 0;
		boolean bool = true;
		while(bool == true) {
			if(a == 1) {
				System.out.print("\nKindly enter your marks : ");
				marks = sc.nextByte();
				if(marks <= 100 && marks >= 0) {
					if (marks >= 90) {
						System.out.println("This is Good");
					} else if (marks <= 89 && marks >= 60) {
						System.out.println("This is also Good");	
					} else if (marks <= 59 && marks >= 0) {
						System.out.println("This is Good as well");	
					}
					System.out.print("\nDo you wish to continue? Type 1 to continue and 0 to stop : ");
					a = sc.nextByte();
			} else if (a == 0) {
				bool = false;
			}
			}
		}
	}
}

