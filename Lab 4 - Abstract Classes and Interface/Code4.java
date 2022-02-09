package lab4;
import java.util.*;

interface Interest { 
    void getInterest(int rate, int balance, String bank); 
}
class Account implements Interest{
    Scanner sc = new Scanner(System.in);
    int balance, interest;
    void get(){
        System.out.print("Enter Balance Amount: ");
        balance = sc.nextInt();
    }
    public void getInterest(int rate, int balance, String bank) {
        int amt = (int)((balance * 2 * rate)/ 100);
        System.out.println("Name of Bank: " + bank);
        System.out.println("Interest by Bank: " + amt);
        System.out.println("Amount: " + (balance + amt));
    }
};

class HDFC extends Account {
    void display() {
        super.get();
        interest = 12;
        super.getInterest(interest, balance, "HDFC");
    }
}

class ICICI extends Account {
    void display() {
        super.get();
        interest = 9;
        super.getInterest(interest, balance, "ICICI");
    }
}
class SBI extends Account {
    void display() {
        super.get();
        interest = 11;
        super.getInterest(interest, balance, "SBI");
    }
}


public class Lab4 {
    public static void main(String[] args) {
        HDFC acc1 = new HDFC();
        ICICI acc2 = new ICICI();
        SBI acc3 = new SBI();
        acc1.display();
        acc2.display();
        acc3.display();
    }
}