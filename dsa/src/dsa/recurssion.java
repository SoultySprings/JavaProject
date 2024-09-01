package dsa;

public class recurssion {
	public static int f(int x) {
		if (x==0) 
			return 0;
		else 
			return 2*f(x-1)+x*x;
	}
	public static void main(String[] args) {
		recurssion obj = new recurssion();
		int res = obj.f(3);
		System.out.println("The result is  : " + res);
	}
}
