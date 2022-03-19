package lab8;
import java.util.*;
import java.io.*;

class Employee {
    int ID, salary;
    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID: ");
        ID = sc.nextInt();
        System.out.print("Enter the salary: ");
        salary = sc.nextInt();
    }

    int getID(ArrayList < Employee > arr) {
        return ID;
    }
    ArrayList < Employee > add(ArrayList < Employee > arr, int n) {
        ArrayList < Employee > arr2 = arr;
        Employee temp = new Employee();
        temp.get();
        arr2.add(temp);
        return arr2;
    }
    ArrayList < Employee > add_pos(ArrayList < Employee > arr, int n) {
        Scanner sc = new Scanner(System.in);
        ArrayList < Employee > arr2 = new ArrayList < Employee > (n);
        System.out.print("Enter the position at which data have to be inserted: ");
        int pos = sc.nextInt();
        Employee temp = new Employee();
        temp.get();
        for (int i = 0; i < n + 1; i++) {
            if (i < pos) arr2.add(arr.get(i));
            else if (i == pos) arr2.add(temp);
            else arr2.add(arr.get(i - 1));
        }
        return arr2;
    }

    ArrayList < Employee > delete(ArrayList < Employee > arr, int n) {
        arr.remove(n - 1);
        return arr;
    }

    void index_search(ArrayList < Employee > arr, int n) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        int search = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr.get(i).ID == search) {
                System.out.print("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (found == false)
            System.out.print("Element is not present. Please Check again!!");
    }

    void display(ArrayList < Employee > arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("ID " + (i + 1) + ": " + arr.get(i).ID);
            System.out.println("Salary " + (i + 1) + ": " + arr.get(i).salary);
        }
    }
}
public class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Employees: ");
        int n = sc.nextInt();
        ArrayList < Employee > arr = new ArrayList < Employee > (n);
        Employee e1[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            e1[i] = new Employee();
            e1[i].get();
            arr.add(e1[i]);
        }
        boolean conti = true;
        while (conti) {
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    {
                        arr = e1[0].add(arr, n);
                        n += 1;
                        break;
                    }
                case 2:
                    {
                        arr = e1[0].add_pos(arr, n);
                        n += 1;
                        break;
                    }
                case 3:
                    {
                        arr = e1[0].delete(arr, n);
                        n -= 1;
                        break;
                    }
                case 4:
                    {
                        e1[0].index_search(arr, n);
                        break;
                    }
                case 5:
                    {
                        e1[0].display(arr, n);
                        break;
                    }
                
            }
            System.out.print("Do you wish to continue: (0/1): ");
            int temp = sc.nextInt();
            conti = (temp==1)?true:false;
        }
    }
}