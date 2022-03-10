package lab7;

import java.io.*;
public class Lab7 {
    public static void main(String[] args) throws IOException {
                      
        File data = new File("C:\\Users\\Hariket Sheth\\Desktop\\Lab7-1.txt"); 
        File output = new File("C:\\Users\\Hariket Sheth\\Desktop\\Lab7-2.txt"); 
        FileInputStream  file = new FileInputStream(data);  
        FilterInputStream filter = new BufferedInputStream(file);  
        FileOutputStream file1 = new FileOutputStream(output);  
        FilterOutputStream filter1 = new FilterOutputStream(file1);  
        
        int k =0;  
        while((k=filter.read())!=-1){  
            System.out.print((char)k);
            filter1.write((char)k);
            filter1.flush();
        }
        System.out.print("\n");  
        file.close(); 
        filter.close();
        filter1.close();  
        file1.close();  
        
        System.out.println("Operation Successful !!");  
    }
}