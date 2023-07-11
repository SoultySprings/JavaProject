package sri;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.FileOutputStream;

class FileProgram{
	static void RecursivePrint(File[] arr, int index, int level)
	{
		
		if (index == arr.length)
			return;

		for (int i = 0; i < level; i++)
			System.out.print("\t");

		if (arr[index].isFile())
			System.out.println(arr[index].getName());

		else if (arr[index].isDirectory()) {
			System.out.println("[" + arr[index].getName() + "]");

			RecursivePrint(arr[index].listFiles(), 0, level + 1);
		}

		RecursivePrint(arr, ++index, level);
	}

	static void FileOverwrite(String InputFile, String OutputFile) {
		try {
			FileReader fr = new FileReader(InputFile);
			FileWriter fw = new FileWriter(OutputFile);

			String str = "";
			int i;

			while ((i = fr.read()) != -1) {
				str += (char)i;
			}

			System.out.println("\n"+str.toUpperCase());
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
	public static void main(String[] args){
		String maindirpath = "C:\\Users\\Tanishq\\Documents\\3_College_py";
		String inFilePath = "C:\\Users\\Tanishq\\Documents\\3_College_py\\FAT\\fileInput.txt";
		String outFilePath = "C:\\Users\\Tanishq\\Documents\\3_College_py\\FAT\\file.txt";

		File maindir = new File(maindirpath);

		if (maindir.exists() && maindir.isDirectory()) {

			File arr[] = maindir.listFiles();

			System.out.println("**********************************************************************");
			System.out.println("Files from main directory : ");
			System.out.println("**********************************************************************");

			RecursivePrint(arr, 0, 0);
			System.out.print("\nKindly enter the file which will act as input file : ");
			Scanner sc = new Scanner(System.in);
			String InputFile = sc.nextLine();
			File InFile = new File(InputFile);
			String InFilePath = InFile.getAbsolutePath();
			System.out.print("Kindly enter the file which will act as output file : ");
			String OutputFile = sc.nextLine();
			File OutFile = new File(OutputFile);
			String OutFilePath = OutFile.getAbsolutePath();
			FileOverwrite(inFilePath, outFilePath);
		
	}
	}
	
}
