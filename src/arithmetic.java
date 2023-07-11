//Program to show inheritance of interface through multiple classes

import java.util.*;
interface test{
	public void square();
	
}
public class arithmetic implements test {
	
	public void square() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly enter an integer : ");
		int x = sc.nextInt();
		System.out.println("The square is : " + (x*x));
	}
}
