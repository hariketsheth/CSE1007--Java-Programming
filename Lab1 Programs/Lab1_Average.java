package lab1;

import java.util.Scanner;

public class Lab1_Average
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum += a[i];
        }
        System.out.println("Sum of the Numbers entered:"+sum);
        average = (float)sum / n;
        System.out.println("Average of the Numbers entered:"+average);
    }
}
