package chaitanya;

import java.io.File;

public class ProA {
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
	
	static void ReadWrite() {
        File MyFilDir = new File("C:\\Users\\Tanishq\\Documents\\3_College_py\\hw1.py");
         if (MyFilDir.canWrite()) 
           {
            System.out.println(MyFilDir.getAbsolutePath() + " can write.");
           } 
         else
          {
            System.out.println(MyFilDir.getAbsolutePath() + " cannot write.");
          }
         if (MyFilDir.canRead()) 
           {
            System.out.println(MyFilDir.getAbsolutePath() + " can read.");
           } 
         else
          {
            System.out.println(MyFilDir.getAbsolutePath() + " cannot read.");
          }  
      }

	public static void main(String[] args)
	{

		String maindirpath = "C:\\Users\\Tanishq\\Documents\\3_College_py";	

		File maindir = new File(maindirpath);

		if (maindir.exists() && maindir.isDirectory()) {

			File arr[] = maindir.listFiles();

			System.out.println("**********************************************************************");
			System.out.println("Files from main directory : " + maindir);
			System.out.println("**********************************************************************");

			RecursivePrint(arr, 0, 0);
			System.out.println("");
			ReadWrite();
		}
	}
}
