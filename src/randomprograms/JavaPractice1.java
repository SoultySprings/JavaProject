// Program to take names from input as user, store in an array and print

package randomprograms;
import java.util.*;
public class JavaPractice1 {

	public static void main(String[] args) {
		

		String[] name = new String[5];
		System.out.println("Kindly enter the names one by one.\n");
		Scanner sc = new Scanner(System.in);
		for(byte i = 0; i < name.length; i++) {
			
			
			System.out.print("Enter name " + (i+1) + " : ");
			name[i] = sc.next();	
		}
		
		System.out.println("\nNames of your friends are as follows : ");
		for(byte j = 0; j < name.length; j++) {
			
			System.out.print(name[j]);
			if(j < (name.length-1)) {
				System.out.print(", ");
			} else {
				System.out.print(".");
				break;
			}
		}
	}
}
