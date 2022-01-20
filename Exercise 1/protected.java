package exercise1;
import java.util.*;  

class College{
        Scanner s= new Scanner(System.in); 
        protected int marks;
        void multiply(){
            System.out.println("Enter the marks: ");
            marks=s.nextInt();
        }
}

class Result extends College{
    void out(){
        if(marks>50)
            System.out.println("The result: Pass");
        else
            System.out.println("The result: Fail");
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Result r1 =new Result();
        r1.multiply();
        r1.out();
    }
    
}
