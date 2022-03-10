package lab7;

import java.io.*;
public class Lab7 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout1 = new FileOutputStream("C:\\Users\\Hariket Sheth\\Desktop\\Lab7-1.txt");
        FileOutputStream fout2 = new FileOutputStream("C:\\Users\\Hariket Sheth\\Desktop\\Lab7-2.txt");
        byte[] buf = {72, 97, 114, 105, 107, 101, 116, 32, 83, 104, 101, 116, 104};
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1) {
            char ch = (char) k;
            System.out.println(ch + " (ASCII: " + k + ")");
        }
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(buf);
        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();
    }
}