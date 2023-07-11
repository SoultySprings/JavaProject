//Program to read and write data from one file to another and give an exception if file is not present

import java.io.*;

class File {

	public static void main(String[] args)
	{
		try {

			FileReader fr = new FileReader("fileInput.txt");
			FileWriter fw = new FileWriter("file.txt");
			String str = "";
			int i;
			while ((i = fr.read()) != -1) {
				str += (char)i;
			}
			System.out.println(str);
			fw.write(str);
			fr.close();
			fw.close();
			System.out.println(
				"File reading and writing both done");
		}
		catch (IOException e) {
			System.out.println(
				"There are some IOException");
		}
	}
}
