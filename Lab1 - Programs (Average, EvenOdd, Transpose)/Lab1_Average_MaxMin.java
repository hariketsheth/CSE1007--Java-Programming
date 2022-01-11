package lab1;

import java.util.Scanner;

public class Lab1_Average_MaxMin
{
    public static void main(String[] args) 
    {
        int n, sum=0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n ; i++){
            a[i] = s.nextInt();
            sum += a[i];
        }
        System.out.println("Sum of the Numbers (Before): "+sum);
        for(int i=0; i < n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        sum -= (a[0] + a[n-1]);
        System.out.println("Sum of the Numbers (After): "+sum);
        average = (float)sum / (n-2);
        System.out.println("Average of the Numbers entered: "+average);
    }
}
