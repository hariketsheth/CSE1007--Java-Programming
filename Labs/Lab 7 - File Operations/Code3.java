package lab7;
import java.io.*;
import java.util.*;

public class Lab7 {
    public static void main(String[] args) {
        int count = 0, count_vowel=0, count_con=0;
        int count_words = 0;
        try {
            File file = new File("C:\\Users\\Hariket Sheth\\Desktop\\Lab7.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            StringBuffer converted = new StringBuffer();
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
                String[] words=line.split(" ");
                for(int i=0; i<line.toString().length();i++){
                    char temp = line.toString().charAt(i);
                    if(Character.isLowerCase(temp))
                        converted.append(Character.toUpperCase(temp));
                    else if(Character.isUpperCase(temp))
                        converted.append(Character.toLowerCase(temp));
                    else
                        converted.append(temp);
                }
                converted.append('\n');
                count_words += words.length;
                 for(int i=0;i<words.length;i++){
                    for(int j=0;j<words[i].length();j++){
                       char ch= Character.toLowerCase(words[i].charAt(j));
                       if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u') 
                           count_vowel += 1;
                       else if(ch != ' ')
                           count_con +=1;
                    }
                 }
            }
            fr.close();
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            System.out.println("Contents of File: ");
            System.out.print(sb.toString());
            System.out.println("Number of Lines: "+count);
            System.out.println("Number of Vowels: "+count_vowel);
            System.out.println("Number of Consonants: "+count_con);
            System.out.println("Number of Words: "+count_words);
            System.out.println("\nContents of Converted File: ");
            System.out.print(converted.toString());
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}