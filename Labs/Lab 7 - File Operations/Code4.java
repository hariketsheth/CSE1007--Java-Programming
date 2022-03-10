package lab7;
import java.io.*;
import java.util.*;

import java.io.*;
public class Lab7 {
    public static void main(String args[]) throws Exception {
        FileInputStream fin=new FileInputStream("C:\\\\Users\\\\Hariket Sheth\\\\Desktop\\\\Lab7-1.txt");    
        BufferedInputStream bin=new BufferedInputStream(fin);    
        int i;
        while((i =bin.read())!=-1){    
            System.out.print((char)i);    
        }    
        FileOutputStream fout = new FileOutputStream("C:\\\\Users\\\\Hariket Sheth\\\\Desktop\\\\Lab7-2.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "This data would be inserted in the second file";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Done and Tested");
    }
}