package exercise1;
import java.util.*;  

class Sample{
        Scanner s= new Scanner(System.in); 
        int data;
        void multiply(){
            System.out.println("Enter the number: ");
            data=s.nextInt();
            data = data*2;
        }
}
public class Exercise1 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.multiply();
        System.out.println("The result after multiplication: "+s1.data);
    }
    
}
