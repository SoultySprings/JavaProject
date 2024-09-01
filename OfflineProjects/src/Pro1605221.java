//Program to make a modified version of pattern.

import java.util.*;
public class Pro1605221 {

	public static void main(String[] args) {  
		short row, i, j, space = 1;  
		System.out.print("Kindly enter the number of rows you want to print : ");
		System.out.println();
		Scanner sc = new Scanner(System.in);  
		row = sc.nextShort();  
		space = (short)(row - 1);  
		for (j = 1; j<= row; j++)  {  
		for (i = 1; i<= space; i++)  {  
			System.out.print(" ");  
		}  
		space--;  
			for (i = 1; i <= 2 * j - 1; i++)  {  
				System.out.print("*");  
			}  
				System.out.println("");  
		}  
		space = 0;  
		for (j = 0; j<= row; j++)  {  
		for (i = 1; i<= space; i++)  {  
		System.out.print(" ");  
		}  
			space++;  
			for (i = 1; i<= 2 * (row - j) - 1; i++)  {  
				System.out.print("*");  
			}  
				System.out.println("");  
			}  
		}
}
