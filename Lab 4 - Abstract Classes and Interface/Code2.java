package lab4;
abstract class Parent {
    void message() {}
}

class Subclass_1 extends Parent {
    void message() {
        System.out.println("This is First subclass.");
    }
}

class Subclass_2 extends Parent {
    void message() {
        System.out.println("This is Second subclass.");
    }
}

public class Lab4 {
    public static void main(String args[]) {
        Subclass_1 s1 = new Subclass_1();
        Subclass_2 s2 = new Subclass_2();
        s1.message();
        s2.message();
    }
}