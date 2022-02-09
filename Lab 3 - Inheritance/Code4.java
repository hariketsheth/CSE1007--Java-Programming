package lab3;

import java.util.*;
import java.lang.Math;

class Account {
    String cust_name;
    long balance, interest;
    Scanner sc = new Scanner(System.in);
    void get() {
        System.out.println("Enter Customer Name: ");
        cust_name = sc.nextLine();
        System.out.println("Enter Balance:");
        balance = sc.nextLong();
    }
    void display() {
        int amt = (int)(balance * 2 * interest / 100);
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest by Bank: " + interest);
        System.out.println("Amount: " + (balance + amt));
    }

};

class HDFC extends Account {
    void display() {
        super.get();
        interest = 12;
        super.display();
    }
}

class ICICI extends Account {
    void display() {
        super.get();
        interest = 9;
        super.display();
    }
}
class SBI extends Account {
    void display() {
        super.get();
        interest = 11;
        super.display();
    }
}

class Lab4 {
    public static void main(String[] args) {
        HDFC h1 = new HDFC();
        ICICI i1 = new ICICI();
        SBI s1 = new SBI();
        h1.display();
        i1.display();
        s1.display();

    }
}