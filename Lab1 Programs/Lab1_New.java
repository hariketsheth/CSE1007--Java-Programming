package lab1;

import java.util.Scanner;

public class Lab1_New
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        n = s.nextInt();
        int old[] = new int[n];
        int copy[] = new int[n];
        System.out.println("Enter the elements: \n");
        for(int i = 0; i < n ; i++)
            old[i] = s.nextInt();
        System.out.println("Elements in the New Array are: \n");
        for(int i = 0; i < n ; i++){
            copy[i] = old[i];
            System.out.println(copy[i]);
        }
    }
}
