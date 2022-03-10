package lab7;

import java.io.*;
public class Lab7 {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("C:\\Users\\Hariket Sheth\\Desktop\\Lab7-1.txt");  
        FileOutputStream fout2 = new FileOutputStream("C:\\Users\\Hariket Sheth\\Desktop\\Lab7-2.txt");
              
        DataInputStream inst = new DataInputStream(input);  
        int count = input.available();  
        byte[] ary = new byte[count];  
        inst.read(ary);  

        DataOutputStream data = new DataOutputStream(fout2);  
        data.write(ary);  
        data.flush();  
        data.close();  
        System.out.println("Operation Successful !!");  
    }
}