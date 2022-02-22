package da1;
import java.util.*;
class Box{
    public float length, breadth, height;
    void accept_details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        length = sc.nextFloat();
        System.out.print("Enter the Breadth: ");
        breadth = sc.nextFloat();
        System.out.print("Enter the Height: ");
        height = sc.nextFloat();
    }
    float volume(float l, float b, float h ){
        return (l*b*h); 
    }
}
public class DA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Box b1[] = new Box[n];
        for(int i=0; i<n; i++){
            b1[i] = new Box();
            b1[i].accept_details();
            System.out.println(b1[i].volume(b1[i].length, b1[i].breadth, b1[i].height));
        } 
    }
    
}
