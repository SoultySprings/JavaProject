//Program to take an array from the user and fine the cummulative sum of characters

import java.util.*;
public class HW1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short b, sum = 0, x;
		System.out.print("Kindly enter the number of names you will enter : ");
		x = sc.nextShort();
		String name[] = new String[x], word;
		System.out.println("Kindly enter one by one : ");
		for(int i = 0; i <= x-1; i++) {
			name[i] = sc.next();
			word  = name[i];
			b = (short)word.length();
			sum = (short)(sum + b);
		}
		System.out.println("\nTotal number of chararcters are : " + sum);
	}
}
