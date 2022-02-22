package da1_2;
import java.util.*;

public class University{
    String name;
    int num;
    public void accept_details(){
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        num=sc.nextInt();
    }
    public void print_details(){
        System.out.println(name+" : "+num);
    }
}
