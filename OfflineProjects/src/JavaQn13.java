import java.util.Scanner;
public class JavaQn13 {

	static void IntegerCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly enter the number of integers you will enter : ");
		short num1 = sc.nextShort();
		short x = 0; 
		System.out.println("");
		byte a = 0, b = 0, c = 0;
		
		for(short i = 0; i<num1; i++) {
			System.out.print("Enter integer " + (i+1) + " : ");
			x = sc.nextShort();
			if(x>0) {
				a++;
			} else if (x==0){
				b++;
			} else{
				c++;
			}
		}
		
		
		System.out.println("\nThe number of positive, zero and negative integers are : \n");
		System.out.println("Positive : " + a +"\nZero : " + b + "\nand Negative : " + c);
		
	}
	public static void main(String[] args) {
		IntegerCheck();

	}
}
