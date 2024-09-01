//Program to change the email username

import java.util.*;
public class HW3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly enter your email : ");
		String email = sc.next(), text1 = "";
		if(email.contains("@") && email.contains(".com") || email.contains(".ac.in")){
			int b = email.indexOf("@");
			text1 = email.substring(b, email.length());
			email = email.replace(text1, "");
			System.out.print("Replaced email : " + email);
		} else {
			System.out.println("Invaild email!");
		}
	}
}
