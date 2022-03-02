package lab6;

class Ascending extends Thread{
        public void run(){  
        System.out.println("Thread is Running.");
            for(int i=1; i<=10; i++)
                System.out.println("Thread Running:- "+"Thread "+i);
    }
}

class Descending extends Thread{
        public void run(){  
        System.out.println("Thread is Running.");
            for(int i=10; i>=1; i--)
                System.out.println("Thread Running:- "+"Thread "+i);
    }
}
public class Lab6 extends Thread{  
    public static void main(String args[]){  
        Ascending a1=new Ascending();  
        Descending d1=new Descending();
        a1.start();
        d1.start();
     }  
} 