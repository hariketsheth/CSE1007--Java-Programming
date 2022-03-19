package lab8;
import java.util.*;

class Employee{
    int ID, salary;
    Employee(int ID, int Salary){
        this.ID = ID;
        this.salary = Salary;
    }
    
    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee ID: ");
        ID = sc.nextInt();
        System.out.print("Enter the Salary: ");
        salary = sc.nextInt();
    }
    void set(){
        System.out.print("The Employee ID: "+ID);
        System.out.print("\nThe Salary of Employee: "+salary+"\n\n");
    }
    Employee[] add(Employee e1[], int n){
        Employee e2[] = new Employee [n+1];  
        for(int i=0; i<n; i++)
            e2[i] = e1[i];
        e2[n+1].get();
        return e2;
    }
    Employee[] add_pos(Employee e1[], int n){
        int pos; 
        System.out.print("Enter the position: ");
        Scanner sc = new Scanner(System.in);
        pos = sc.nextInt();
        Employee e2[] = new Employee[n+1];
        if(pos<n){
            for(int i=0; i<n+1; i++){
                if(i<pos)
                    e2[i] = e1[i];
                else if(i==pos)
                    e2[pos].get();
                else
                    e2[i] = e1[i-1];
             }
                    
               return e2; 
         }
        else{
            System.out.println("Invalid Position Entered");
            return e1;
        }
}
    
Employee[] delete(Employee e1[], int n){
    Employee e2[] = new Employee[n-1];
    for(int i=0; i<n-1; i++)
          e2[i] = e1[i];
    return e2;
}

void search(Employee e1[], int n){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Employee ID to be searched: ");
    int src = sc.nextInt();
    boolean found = false;
    for(int i=0; i<n; i++){
        if(e1[i].ID == src){
            System.out.println("Particular Employee is searched");
            System.out.println("The Employee record is found at index: "+i);
            found = true;
        }
     }
    if(found==false)
       System.out.println("The particular Employee is not present in the records.");
} 

public class Lab8{
    public static void main(String[] args){
        int ID=0, Salary=0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        Employee e1[ ] = new Employee[n];
        for(int i=0; i<n; i++){
                e1[i] =new Employee(ID, Salary);
                e1[i].get();               
        }
        int choice;
        System.out.print("Enter the choice: ");
        choice = sc.nextInt();
        boolean conti = true;
        while(conti){
        switch(choice){
            case 1:{
                e1 = e1[0].add(e1, n);
                n += 1;
                break;
            }
            case 2:{
                e1 = e1[0].add_pos(e1, n);
                n += 1;
                break;
            }
            case 3:{
                e1 = e1[0].delete(e1, n);
                n -= 1;
                break;
            }
            case 4:{
                e1[0].search(e1, n);
                break;
            }
        }
        System.out.println("Do you wish to continue? Y/N");
        char response = sc.next().charAt(i);
        conti = (response == 'Y')?true:false;
               
    }
    }
}