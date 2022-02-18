package da1;
import java.util.*;
import da1_2.University;
class Student{
    String name;
    int num;
    void accept_details(){
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        num=sc.nextInt();
    }
    void print_details(){
        System.out.println(name+" : "+num);
    }
}
public class DA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        University u1[] = new University[n];
        Student s1[] = new Student[n];
        for(int i=0; i<n; i++){
            u1[i] = new University();
            u1[i].accept_details();
            s1[i] = new Student();
            s1[i].accept_details();
            System.out.print("University: ");
            u1[i].print_details();
            System.out.print("Student: ");
            s1[i].print_details();
        } 
    }
    
}
