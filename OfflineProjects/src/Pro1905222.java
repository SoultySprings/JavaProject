import java.util.Scanner;
public class Pro1905222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = sc.nextInt();
		String b = Integer.toString(a);
		int c = b.length();
		int d = 0;
		int e = 0;
		d = a<<c;
		e = a>>c;
		System.out.println("Total Left Shift: "+d);
		System.out.println("Total Right Shift: "+e);
		sc.close();

	}

}