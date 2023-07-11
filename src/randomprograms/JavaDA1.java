// Program to count number of characters in given names by user

package randomprograms;
import java.util.*;
public class JavaDA1 {

	public static void main(String[] args) {
		
		short num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly enter the number of names you will enter : ");
		num = sc.nextShort();
		System.out.println("");
		String[] names = new String[num];
		
		for (short i = 0; i <= (num-1); i++) {
			
			System.out.print("Name of friend " + (i+1) + " : ");
			names[i] = sc.next();
		}
		
		System.out.println("");
		
		for (short j = 0; j <= (num-1); j++) {
			
			System.out.println("Number of characters in name " + (j+1) + " are : " + 
			names[j].length());
		}
	}
}
