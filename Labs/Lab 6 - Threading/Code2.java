package lab6;
import java.util.*;
public class Lab6 implements Runnable{  
    private String s;
    Lab6(String s){
        this.s = s;
    }
    public void run(){  
        System.out.println("Thread is Running.");
        if(s.equals("Thread1"))
            for(int i=1; i<=10; i++)
                System.out.println("Thread Running:- "+s+" - Thread "+i);
        if(s.equals("Thread2"))
            for(int i=10; i>=1; i--)
                System.out.println("Thread Running:- "+s+" - Thread "+i);
    }  
    public static void main(String args[]){  
        Lab6 l1=new Lab6("Thread1");  
        Lab6 l2=new Lab6("Thread2");
        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l2);
        t1.start();  
        t2.start();
     }  
} 