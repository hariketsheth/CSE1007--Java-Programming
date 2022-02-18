package da1;
import java.util.*;
class Student{
    int enrollment_number, mark1, mark2, mark3, total;
    String name="";
    Student(){ }
    Student(Student temp){
        this.name = temp.name;
        this.mark1=temp.mark1;
        this.mark2=temp.mark2;
        this.mark3=temp.mark3;
        if(temp.mark1<50 || temp.mark2<50 || temp.mark3<50)
            this.total=0;
        else
            this.total = temp.mark1+temp.mark2+temp.mark3;
        this.enrollment_number=temp.enrollment_number;
    }
    void accept_details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Enrollment Number: ");
        enrollment_number = sc.nextInt();
        System.out.print("Enter the name of Student: ");
        String temp = sc.next();
        name = sc.nextLine();
        System.out.println("Enter the marks in 3 subjects: ");
        mark1=sc.nextInt();
        mark2=sc.nextInt();
        mark3=sc.nextInt();
    }
    void print_details(){
        System.out.println("Marks in Subject 1: "+mark1);
        System.out.println("Marks in Subject 2: "+mark2);
        System.out.println("Marks in Subject 3: "+mark3);
        System.out.println("Total Marks: "+total);
    }
}
public class DA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student temp = new Student();
        Student s1[] = new Student[n];
        for(int i=0; i<n; i++){
            temp.accept_details();
            s1[i] = new Student(temp);
            s1[i].print_details();
        }
    }
    
}
