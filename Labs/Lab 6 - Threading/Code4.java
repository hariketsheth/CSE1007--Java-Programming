package lab6;
import java.util.*;

class R1 implements Runnable {
    public void run() {
        int[] randomNumbers = new int[25];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * 99);
            int a = randomNumbers[i];

            if (a % 2 == 0) {
                System.out.println("Even Numbers: " + i);
            }
        }
    }

}
class R2 implements Runnable {
    public void run() {
        int[] randomNumbers = new int[25];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * 99);
            int a = randomNumbers[i];

            if (a % 2 != 0) {
                System.out.println("Odd Numbers: " + i);
            }
        }

    }
}
class R3 implements Runnable {
    public void run() {
        int[] randomNumbers = new int[25];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * 99);
            int a = randomNumbers[i];

            if (a < 0) {
                System.out.println("Negative Number: " + i);
            }
        }
    }
}
class R4 implements Runnable {
    public void run() {
        int[] randomNumbers = new int[25];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * 99);
            int a = randomNumbers[i];
            if (a > 0) {
                System.out.println("Positive Number: " + i);
            }
        }
    }
}
public class Lab6 {
    public static void main(String[] args) {
        Runnable r1 = new R1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new R2();
        Thread t2 = new Thread(r2);
        Runnable r3 = new R3();
        Thread t3 = new Thread(r3);
        Runnable r4 = new R4();
        Thread t4 = new Thread(r4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}