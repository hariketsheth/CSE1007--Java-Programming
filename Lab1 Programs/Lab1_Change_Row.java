package lab1;
import java.util.Scanner;

public class Lab1_Change_Row{  
    public static void main(String args[]){  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int row = s.nextInt();
        System.out.println("Enter the number of Columns: ");
        int col = s.nextInt();
        int original[][]=new int[row][col];
        int change[][]=new int[row][col];

        System.out.println("Enter the array elements: ");
        for(int i=0;i<row;i++) 
            for(int j=0;j<col;j++) 
                original[i][j] = s.nextInt();

        System.out.println("Printing Original Array: ");  
        for(int i=0;i<row;i++){    
            for(int j=0;j<col;j++){    
                change[i][j]=original[j][i];  
                System.out.print(original[i][j]+" ");    
            }    
            System.out.println();
        }    

        System.out.println("Printing Matrix After Change:");  
        for(int i=0;i<row;i++){    
            for(int j=0;j<col;j++)   
                System.out.print(change[i][j]+" ");    
            System.out.println();
        }    
    }
}  