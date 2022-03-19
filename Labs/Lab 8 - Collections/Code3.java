package lab8;
import java.util.*;

class Student{
    int pan_number;
    void get(){
        Scanner sc = new Scanner(System.in);
        pan_number = sc.nextInt();
    }
    Student[] reverse (Student s1[], int n){
        Student s2[] = new Student[n];
        for(int i=0; i<n; i++)
            s2[i] = s1[n-i-1];
        return s2;
    }
}
public class Lab8{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number of students: ");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        Student stud[] = new Student[n];
        for(int  i =0; i<n; i++){
            stud[i] = new Student();
            stud[i].get();
        }
        
    }
}