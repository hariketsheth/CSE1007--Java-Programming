
package exercise9;
 
import java.io.*;
import java.util.*;
public class Exercise9 {
    public static void main(String[] args) {
        try{
        int count = 0;
        System.out.println("Exercise 8 : Printing the characters in a file");
        System.out.println("Name: Hariket Sukesh Kumar Sheth\nRegister No.: 20BCE1975\n\n");
        File file = new File("C:\\Users\\Hariket Sheth\\Desktop\\Lab9.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        String line;
        StringBuffer converted = new StringBuffer();
        while((line = br.readLine()) != null){
            sb.append(line);
            sb.append("\n");
            String[] words=line.split(" ");
            for(int i=0; i<line.toString().length(); i++)
                if(line.toString().charAt(i)!= ' ')
                    count += 1;
        }
        fr.close();
        System.out.println("The number of characters in the file are: "+count);
        }
        catch(Exception e){
            e.getStackTrace();
        }
        
    }
    
}
