// Program to take number of friends and their names in an array

package randomprograms;
import java.util.*;
public class ArrayQn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly enter the number of friends you have : ");
		short x = sc.nextShort();
		String names[] = new String[x];
		sc.nextLine();
		System.out.println("\nEnter the names of the your friends one by one. ");
		
		for(short i = 0; i <= (x-1); i++) {
			
			System.out.print("Name of friend " + (i+1) + " : ");
			names[i] = sc.nextLine();
		}
	
		System.out.println("\nThe name of your friends are : ");
		
		for(short j = 0; j <= (x-1); j++) {
			
			System.out.print(names[j]);
			if(j < (names.length-1)) {
				System.out.print(", ");
			} else {
				System.out.print(".");
				break;
			}
		}
	}
}
