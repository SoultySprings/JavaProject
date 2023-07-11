//Program to calculate Transpose of a matrix

package randomprograms;
import java.util.*;
public class Program9 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Column Length: ");
		int m = sc.nextInt();
		System.out.print("Enter Row Length: ");
		int n = sc.nextInt();
		int[][] Original = new int[m][n];
		int[][] Transmat = new int[n][m];
         
      for (int i=0 ; i<m ; i++){
    	  for (int j=0; j<n; j++){
    		  System.out.print("Enter value at "+(i+1) + ", "+(j+1) +": ");
    		  Original[i][j] = sc.nextInt();
    	  }
      }
      
      for(int i=0;i<n;i++){    
    	  for(int j=0;j<m;j++){    
    	  Transmat[i][j]=Original[j][i];
    	  }
      }
      
      System.out.println("\nOriginal Matrix:");  
      for(int i=0;i<m;i++){    
    	  for(int j=0;j<n;j++){    
    		  System.out.print(Original[i][j]+" ");
    	  }
    	  System.out.println();
      }
      
      System.out.println("\nTransposed Matrix:");  
      for(int i=0;i<n;i++){    
    	  for(int j=0;j<m;j++){    
    		  System.out.print(Transmat[i][j]+" ");
    	  }
    	  System.out.println();
      }
	}
}