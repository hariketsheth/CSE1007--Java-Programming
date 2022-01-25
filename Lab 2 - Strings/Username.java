package lab2;
import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        String conditions = "^[a-zA-Z][a-zA-Z_0-9]{7,29}$";
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- != 0) {
            String username = sc.nextLine();
            if (username.matches(conditions))
                System.out.println("Valid");
            else
                System.out.println("Invalid");      
        }

    }
}
