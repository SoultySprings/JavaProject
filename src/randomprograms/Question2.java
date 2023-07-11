//Program that takes a String as an input from user and displays permutation of it

package randomprograms;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text1 = sc.nextLine();
		Permute(text1, "");
		
		}
	public static void Permute(String text1, String text3) {
		if (text1.length() == 0) {
			System.out.print(text3 + " ");
			return;
		}

		for(short i1 = 0; i1 < text1.length(); i1++) {
			char ch1 = text1.charAt(i1);
			String text2 = text1.substring(0, i1) + text1.substring(i1 + 1);
			Permute(text2, text3 + ch1);
			
		}			
	}
}
