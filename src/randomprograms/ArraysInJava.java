package randomprograms;
import java.util.*;
public class ArraysInJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Single-dimensional Arrays
		String[] x = {"*","**","***","****","*****"};
		// The above can be also written as String[] x = {"*","**","***","****","*****"};
		
		int[] y = new int[5];
		System.out.print("Please enter 5 integers as you wish : ");
		for (int i=0; i<=4; i++) {
			y[i] = sc.nextInt();
		}
		int[] z = new int[5];
		System.out.print("Please enter another 5 integers as you wish : ");
		for (int k=0; k<=4; k++) {
			z[k] = sc.nextInt();
		}
		int[] a = new int[5];
		for (int l=0; l<=4; l++) {
			a[l] = y[l] + z[l];
		}
		for (int j=0; j<=4; j++){
			System.out.print(a[j] + ", ");
		}	
		
		
		// Multi-dimensional Arrays
		int[][] b = new int[2][2];
		for(int x1=0; x1<=1; x1++) {
			for(int x2=0; x2<=1; x2++) {
				b[x1][x2] = sc.nextInt();
			}
		}
		System.out.println("The integers with row and coloumn pos are : ");
		for(int y1=0; y1<=1; y1++) {
			for(int y2=0; y2<=1; y2++) {
				System.out.print(b[y1][y2] + " ");
			}
			System.out.println("");
		}
	}

}
