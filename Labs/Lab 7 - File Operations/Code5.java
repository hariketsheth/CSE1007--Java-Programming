package lab7;
import java.io.*;
public class Lab7 {
    public static void main(String args[]) throws Exception {
        FileInputStream fin1 = new FileInputStream("C:\\Users\\Hariket Sheth\\Desktop\\Lab7-1.txt");
        FileInputStream fin2 = new FileInputStream("C:\\Users\\Hariket Sheth\\Desktop\\Lab7-2.txt");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\Hariket Sheth\\Desktop\\Lab7-out.txt");
        SequenceInputStream output = new SequenceInputStream(fin1, fin2);
        int i;
        while ((i = output.read()) != -1) {
            fout.write(i);
        }
        output.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("The Contents of File1 and File2 are read and put in Lab7-out.txt");
        System.out.println("Operation Successful !!");
    }
}