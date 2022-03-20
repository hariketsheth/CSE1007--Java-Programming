package lab8;
import java.io.*;
import java.util.*;

class Student {
    int roll_no, marks;
    String name;
    
    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, Roll No., Marks: ");
        name = sc.nextLine();
        roll_no = sc.nextInt();
        marks = sc.nextInt();
    }
    
    void display(Stack<Student> ll, int n){
        System.out.println("The Student Details are:");
        for(int i=0; i<n; i++)
            System.out.println("Name: "+ll.get(i).name+"\tRoll No.: "+ll.get(i).roll_no+"\tMarks: "+ll.get(i).marks);
    }
}
public class Lab8{
    public static void main(String[] args){
        int n;
        System.out.print("Enter the number of Students: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Stack<Student> arr = new Stack<Student>();
        Student s1[] = new Student[n];
        for(int i=0; i<n; i++){
            s1[i] = new Student();
            s1[i].get();
            arr.push(s1[i]);
        }
        
        System.out.println("\nThe contents of Stack are: ");
        s1[0].display(arr,n);
        arr.pop();
        n-=1;
         System.out.println("\nThe contents of Stack are: ");
        s1[0].display(arr,n);
        System.out.println("Enter a new element: ");
        Student add = new Student();
        add.get();
        arr.push(add);
        n += 1;
        System.out.println("\nThe contents of Stack are: ");
        s1[0].display(arr,n);
    }
}