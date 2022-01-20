package exercise1;
import java.util.*;  

class College{
        Scanner s= new Scanner(System.in); 
        public int marks;
        void in(){
            System.out.println("Enter the marks: ");
            marks=s.nextInt();
        }
        void display(){
            System.out.println("The marks are: "+marks);
        }
}


public class Exercise1 {
    public static void main(String[] args) {
       College c1 = new College();
       c1.in();
       c1.display();
       c1.marks = 10;
       c1.display();
    }
    
}
