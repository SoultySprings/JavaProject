package bsts;
import java.util.*;
public class nqueens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		char board[][]=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='-';
				if(solvenqueens(board,0,n))
					solution(board,n);
				else
					System.out.println("No soln exists");
			}
		}
	}
	public void solution(char board[][], int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; J++) {
				System.out.print(" "+board[i][j]);
			}
		}
	}
	public static boolean isSafe(char board[][], int row, int coloumn, int n){
		int i, j;
		for(i=0; i<coloumn; i++) 
		{
			if(board[row][j]=='Q')
				return false;
		}
		for(i=row; j=coloumn; i>0 && j>=0; i--, j--) {
			if(boardi[][j]='Q')
				return false;
		}
	}

}
