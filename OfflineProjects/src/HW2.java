//Program to take string as input from user, and change letter from 'e' to 'i'

import java.util.*;
public class HW2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text1 = sc.next();
		String result = text1.replaceAll("e", "i");
		System.out.println(result);
	}
}
