import java.io.File;
import java.util.Scanner;

public class DAPro2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("File name:");
        String fileName = in.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Exist: true");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            boolean typeFound = false;
            for (int i = fileName.length() - 1; i >= 0; i--) {
                if (fileName.charAt(i) == '.') {
                    System.out.println("Type: " + fileName.substring(i + 1));
                    typeFound = true;
                    break;
                }
            }
            if (!typeFound) {
                System.out.println("Type: UNKNOWN");
            }

            System.out.println("Length: " + file.length());
        } else {
            System.out.println("Exist: false");
        }
    }
}