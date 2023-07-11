//Program to show Abstraction

import java.util.*;
abstract class Planets{
	abstract void planetnum();
}

public class A2_Qn2 extends Planets{

	public void planetnum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly enter number to get planet name : ");
		byte a = sc.nextByte();
		switch(a) {
		case 1 :
			System.out.println("\nThe planet is : Mercury");
			break;
		case 2 :
			System.out.println("\nThe planet is : Venus");
			break;
		case 3 :
			System.out.println("\nThe planet is : Earth");
			break;
		case 4 :
			System.out.println("\nThe planet is : Mars");
			break;
		case 5 :
			System.out.println("\nThe planet is : Jupiter");
			break;
		case 6 :
			System.out.println("\nThe planet is : Saturn");
			break;
		case 7 :
			System.out.println("\nThe planet is : Uranus");
			break;
		case 8 :
			System.out.println("\nThe planet is : Neptune");
			break;
		default :
			System.out.println("\nSorry, there is no planet of this number!");
			break;
		}
	}
	public static void main(String[] args) {
		Planets obj = new A2_Qn2();
		obj.planetnum();
	}

}
