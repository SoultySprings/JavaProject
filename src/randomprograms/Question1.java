//Program to take input from user a String and remove duplicate letters

package randomprograms;
import java.util.*;
public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly enter the String : ");
		String str1 = sc.nextLine();
		char[] arr1 = str1.toCharArray();
		String str2 = "";
		for (char value: arr1) {
			if (str2.indexOf(value) == -1) {
				str2 += value;
				}
			}
		System.out.println("\nThe given string is: " + str1);
		System.out.println("The required string is : " + str2);
		}
}