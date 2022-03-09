package lab7;
import java.io.*;
import java.util.*;

public static long count_line(String fileName) {
    Path path = Paths.get(fileName);
    long lines = 0;
    try {
        lines = Files.lines(path).count();
    } catch (IOException e) {
        e.printStackTrace();
    }

    return lines;
}

public class Lab7 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Hariket Sheth\\Desktop\\Lab7.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            fr.close();
            System.out.println("Contents of File: ");
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}