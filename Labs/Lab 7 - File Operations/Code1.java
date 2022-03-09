package lab7;
import java.io.*;
import java.util.*;

public class Lab7 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Hariket Sheth\\Desktop\\Lab7.txt");
        boolean result;
        try {
            result = file.createNewFile();
            if (result)
                System.out.println("file created " + file.getCanonicalPath());
            else
                System.out.println("File already exist at location: " + file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fos = new FileOutputStream(file.getCanonicalPath(), true); 
            System.out.print("Enter file content: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine() + "\n";
            byte[] b = str.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("file saved.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}