package lab3;

class Member {
    String name;
    int age;
    String number;
    String address;
    int salary;

    public void printSalary() {
        System.out.println(salary);
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
    public void print() {
        super.print();
        System.out.println("Specialisation: " + specialization);
    }
}

class Manager extends Member {
    String department;
    public void print() {
        super.print();
        System.out.println("Department: " + department);
    }
}

class Lab3 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Java_Programming_1";
        e1.age = 19;
        e1.number = "9992319045";
        e1.address = "ABCD EFDGDH xyz#";
        e1.salary = 122100;
        e1.specialization = "Business Studies and Marketing";
        e1.print();
        System.out.println();
        Manager m1 = new Manager();
        m1.name = "Java_Programming_2";
        m1.age = 20;
        m1.number = "7711009935";
        m1.address = "DEFGH ABCDER xyz#";
        m1.salary = 823100;
        m1.department = "Data Science";
        m1.print();
    }

}