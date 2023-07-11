package randomprograms;
import java.util.*;
public class MakingFunctions {

	public static void main(String[] args) {
		MakingFunctions obj = new MakingFunctions();
		int a1 = 3, b1 = 7;
		//add();
		/*int sum2 = obj.sum(a1, b1);
		System.out.println("The total sum is : " + sum2);
		*/
		Swap();
	}
	
	public static void add() {
		int num1; int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter an integer : ");
		num1 = sc.nextInt();
		System.out.println("Kindly enter another integer : ");
		num2 = sc.nextInt();
		System.out.println("Their sum is : " + (num1+num2));
		
	}
	
	public int sum(int a, int b) {
		int sum1 = a + b;
		return sum1;
	}
	
	public static void Swap() {
		int a = 10;
		int b = 18;
		System.out.println("Before swapping a is : " + a + " and  b is : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("\nAfter swapping a is : " + a + " and  b is : " + b);
	}

}
