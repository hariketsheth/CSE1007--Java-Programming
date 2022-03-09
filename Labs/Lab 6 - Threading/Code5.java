package lab6;
import java.util.*;

class R1 implements Runnable {
    public void run() {
       for(int i=2; i<=50; i++){
            if(i%2==0)
                System.out.println("Thread Running: Thread 1 - Even("+i+")");
            else
                continue;
       }    
    }
}

class R2 implements Runnable {
    public void run() {
       for(int i=1; i<=49; i++){
            if(i%2!=0)
                System.out.println("Thread Running: Thread 2 - Odd("+i+")");
            else
                continue;
       }    
    }
}

class R3 implements Runnable {
    public boolean prime(int num){
        if(num<2)
            return false;
        else{
            if(num==2) return true;
            else{
                for(int i=2; i<(int)((num/2)+1); i++){
                    if(num%i==0)
                        return false;
                }
                return true;
            }
        }
    }
    public void run() {
       for(int i=2; i<=47; i++){
            if(prime(i))
                System.out.println("Thread Running: Thread 3 - Prime("+i+")");
            else
                continue;
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
        t1.start();
        t2.start();
        t3.start();
    }
}