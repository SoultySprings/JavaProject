//Program to create a 5x6 matrix and find value

package randomprograms;
import java.util.*;
public class ArrayQn3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mention number of rows for matrix : ");
		short a = sc.nextShort();
		System.out.print("Mention number of colomns for matrix : ");
		short b = sc.nextShort();
		String[][] val = new String[a][b];
		System.out.println("Enter values one by one : ");
		for (short i = 0; i<a; i++) {
			for (short j = 0; j<b; j++) {
				System.out.print("Value of "+ i + ", "+ j +" : ");
				val[i][j] = sc.next();
			}
		}
		
		System.out.println("Kindly enter the value of row and colomn, to get value of it : ");
		short x = sc.nextShort();
		short y = sc.nextShort();
		if (x<a && x>=0 && y<b && y>=0) {
			System.out.println("The location and value of given indices are : ");
			System.out.println("Location : " + (x-1) + ", " + (y-1));
			System.out.println("Value : " + val[x-1][y-1]);
		} else {
			System.out.println("Invalid Input!");
			
		}
		
	}

}
