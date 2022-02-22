package exercise1;
import java.util.*;  

class College{
        Scanner s= new Scanner(System.in); 
        private int data;
        void multiply(){
            System.out.println("Enter the number: ");
            data=s.nextInt();
            data = data*2;
            System.out.println("The result after multiplication: "+data);
        }
}

public class Exercise1 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.multiply();
    }
    
}
