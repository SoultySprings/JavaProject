package chaitanya;

import java.util.*;
public class ProB2 {

	public void SpellError(String str) {
		int x = str.length(); String str2 = str;
		for(int i = 0; i < x; i++) {
			if(i == x-1) {
				break;
				
			} else if (i == 0) {
				String firstLetter = str2.substring(0, 1);
			    String remainingLetters = str2.substring(1, str2.length());
			    firstLetter = firstLetter.toUpperCase();
			    str2 = firstLetter + remainingLetters;
			    
			} else if (str2.charAt(i) == '.') {
				char ch1 = str2.charAt(i+2);
				ch1 = Character.toUpperCase(ch1);
				str2 = str2.substring(0, i+2) + ch1 + str2.substring(i + 3);
				
			}
		}
		System.out.println(str2);
	}
	public static void main(String[] args) {
		ProB2 obj = new ProB2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter few sentences : ");
		String str = sc.;
		obj.SpellError(str);
		
	}
}
