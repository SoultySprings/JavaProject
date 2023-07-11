package chaitanya;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ProB1 {

	public static void main(String[] args){

		try {

			FileReader fr = new FileReader("C:\\Users\\Tanishq\\Documents\\3_College_py\\FAT\\fileInput.txt");

			FileWriter fw = new FileWriter("C:\\Users\\Tanishq\\Documents\\3_College_py\\FAT\\file.txt");

			String str = "";
			int i;

			while ((i = fr.read()) != -1) {
				str += (char)i;
			}

			System.out.println(str.toUpperCase());
			fw.write(str.toUpperCase());
			fr.close();
			fw.close();

			System.out.println("File reading and writing both done");
		}

		catch (IOException e) {

			System.out.println(
				"There are some IOException");
		}
	}
}
