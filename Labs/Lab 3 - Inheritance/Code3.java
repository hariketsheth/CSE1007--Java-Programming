package lab3;

import java.util.*;
import java.lang.Math;

class Account {
    String cust_name, type;
    char temp;
    long acc_no, balance;
    Scanner sc = new Scanner(System.in);
    void get() {
        System.out.println("Enter Customer Name: ");
        cust_name = sc.nextLine();
        System.out.println("Enter Account Number:");
        acc_no = sc.nextLong();
        System.out.println("1. Type s for saving \n2. Type c for current: ");
        temp = sc.next().charAt(0);
        type = ((temp=='s')?"Savings":"Current");
        System.out.println("Enter Balance:");
        balance = sc.nextLong();
    }
    void display() {
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
    }
    void deposit() {
        int amt;
        System.out.println("Enter deposit amount: ");
        amt = sc.nextInt();
        balance += amt;
    }
};

class sav_acct extends Account {
    Scanner sc = new Scanner(System.in);
    int intr;
    void comp_intrest() {
        int t1, r1 = 10;
        System.out.println("Enter the number of years: ");
        t1 = sc.nextInt();
        intr = (int)(balance * (Math.pow(1 + r1 / 12, t1)));
        System.out.println(intr);
        balance += intr;
    }
    void withdraw() {
        int amt;
        System.out.println("Enter withdraw amount: ");
        amt = sc.nextInt();
        if (balance > amt)
            balance -= amt;
        else
            System.out.println("Amount can't be withdrawn due to insufficient balance");
    }
}
class curr_acct extends Account {
    void min_bal() {
        if (balance < 500)
            System.out.println("Service Charge imposed: New Balance is: " + (balance - 50));
        else
            System.out.println("No Service charge imposed");
    }
    void withdraw() {
        int amt;
        System.out.println("Enter withdraw amount: ");
        amt = sc.nextInt();
        if (amt > balance)
            System.out.println("Amount can't be withdrawn due to insufficient balance");
        else
            balance -= amt;
    }
}

class Lab3 {
    public static void main(String[] args) {
        sav_acct s1 = new sav_acct();
        curr_acct c1 = new curr_acct();
        s1.get();
        s1.display();
        s1.deposit();
        s1.comp_intrest();
        s1.display();
        s1.withdraw();
        s1.display();
        c1.get();
        c1.display();
        c1.deposit();
        c1.display();
        c1.withdraw();
        c1.display();
        c1.min_bal();

    }
}