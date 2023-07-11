
import java.util.*;
public class PE2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Red or Blue : ");
		String text = sc.nextLine();
		if(text=="Red") {System.out.println("Red");} 
		else if (text=="Blue") {System.out.println("Blue");}
		else{System.out.println("Invalid");}
		sc.close();
		}

	}


