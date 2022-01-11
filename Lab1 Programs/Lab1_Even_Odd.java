package lab1;
import java.util.Scanner;

public class Lab1_Even_Odd
{
    public static void main(String[] args) 
    {
        int n, even=0, odd=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: \n");
        for(int i = 0; i < n ; i++){
            a[i] = s.nextInt();
            if(a[i]%2==0)
                even+=1;
            else
                odd+=1;
        }
        System.out.println("Even Elements in the Array are: "+even);
        System.out.println("Odd Elements in the Array are: "+odd);
    }
}
