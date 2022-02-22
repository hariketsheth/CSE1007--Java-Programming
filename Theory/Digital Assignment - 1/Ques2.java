package da1;
import java.util.*;
class Employee{
    String name, date;
    void accept_details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the date(YYYY-MM-DD): ");
        date = sc.nextLine();
    }
    void sort (Employee e1[], int n){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(e1[i].date.compareTo(e1[j].date)>0){
                    Employee temp = e1[i];
                    e1[i] = e1[j];
                    e1[j] = temp;
                }
            }
        }
    }
    void print_details(Employee e1[], int n){
        for(int i=0; i<n ; i++)
            System.out.println(e1[i].name+" : "+e1[i].date);
    }
}
public class DA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee e1[] = new Employee[n];
        for(int i=0; i<n; i++){
            e1[i] = new Employee();
            e1[i].accept_details();
        }
        e1[0].sort(e1, n);
        e1[0].print_details(e1,n);        
    }
    
}
