package randomprograms;

public class Qn4 {
	
	public static void method(String str1, String str2) {
		System.out.println("Arguments given are : " + str1 + " and " + str2);
		
	}
	public static void method(String str1) {
		System.out.println("Arguments given are : " + str1);
		
	}

	public static void main(String[] args) {
		method("ABC");
		method("ABC", "DEF");

	}

}
