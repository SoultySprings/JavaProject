//Program to prints messages according to given exception

import java.util.*;
public class Except {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
			int data = 100/0;
		} catch (ArithmeticException a) {
			System.out.println("Good Morning");
		}
		try {
			System.out.print("Kindly enter an integer : ");
			int val = sc.nextInt();
			if (val < 0 ) {
				throw new IllegalArgumentException();
			}
		}
		catch (IllegalArgumentException e) {
			System.out.println("Good Night");
		}
	}
}


