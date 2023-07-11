
import java.util.*;
public class PrintElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Red or Blue : ");
		String text = sc.nextLine();
		switch(text) {
		case "Red" : System.out.println("Red"); break;
		case "Blue" : System.out.println("Blue"); break;
		default : System.out.println("Invalid"); break;
		
		}

	}

}
