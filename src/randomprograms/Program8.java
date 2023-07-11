//Program to calculate power of a number

package randomprograms;
import java.util.*;
public class Program8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly enter the number : ");
		short x = sc.nextShort(); double pro = 1d;
		System.out.print("Kindly enter the number to which the power has to be raised : ");
		short n = sc.nextShort();
		
		while(n>0) {
			pro = pro*x;
			n--;
			
		}
		
		System.out.print("The result is : " + pro);

	}

}
