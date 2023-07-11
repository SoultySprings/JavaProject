package randomprograms;

import java.io.File;
public class getpath {

	public static void main(String[] args) {
		String text = "Assignment 6.docx";
		File file = new File(text);
		String path = file.getAbsolutePath();
		System.out.println("Path of the following is : " + path);

	}

}

