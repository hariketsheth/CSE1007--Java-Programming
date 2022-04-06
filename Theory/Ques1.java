package da2;
import java.io.*;
import java.util.*;

public class DA2 {
    public static void main(String[] args) throws Exception {

        String inputFile = "C:\\Users\\Hariket Sheth\\Desktop\\DA2.txt";
        String outputFile = "C:\\Users\\Hariket Sheth\\Desktop\\output.txt";

        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input;
        List < String > file = new ArrayList < String > ();
        System.out.println("The original File Contents: \n");
        while ((input = bufferedReader.readLine()) != null) {
            System.out.println(input);
            file.add(input);
        }
        System.out.println("\n");
        fileReader.close();

        Collections.sort(file);

        FileWriter fileWriter = new FileWriter(outputFile);
        PrintWriter out = new PrintWriter(fileWriter);
        System.out.println("The sorted File Contents: \n");
        for (String outputLine: file) {
            out.println(outputLine);
            System.out.println(outputLine);
        }
        out.flush();
        out.close();
        fileWriter.close();

    }
}