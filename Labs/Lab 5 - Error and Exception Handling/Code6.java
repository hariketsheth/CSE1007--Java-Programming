package lab5;
import java.util.*;

class ExperienceException extends RuntimeException {
    ExperienceException(String str) {
        super(str);
    }
}

class Votes {
    public static int c_arun = 0, c_raj = 0, c_kishore = 0, c_kumar = 0;
    Votes(int vote) {
        switch (vote) {
            case 1:
                c_arun += 1;
                break;
            case 2:
                c_raj += 1;
                break;
            case 3:
                c_kumar += 1;
                break;
            case 4:
                c_kishore += 1;
                break;
        }
    }
    static String[] getResult() {
        String[] result = new String[2];
        if (c_arun > c_raj && c_arun > c_kishore && c_arun > c_kumar) {
            result[0] = "ARUN";
            result[1] = String.valueOf(c_arun);
        }
        if (c_kishore > c_raj && c_kishore > c_arun && c_kishore > c_kumar) {
            result[0] = "KISHORE";
            result[1] = String.valueOf(c_kishore);
        }
        if (c_kumar > c_raj && c_kumar > c_kishore && c_kumar > c_arun) {
            result[0] = "KUMAR";
            result[1] = String.valueOf(c_kumar);
        }
        if (c_raj > c_arun && c_raj > c_kishore && c_raj > c_kumar) {
            result[0] = "RAJ";
            result[1] = String.valueOf(c_raj);
        }
        return result;
    }
}
class Employee {
    int emp_id, experience;
    public Employee(int emp_id, int experience, int vote) throws ExperienceException {
        if (experience <= 5 || (vote < 1 || vote > 4)) {
            throw new ExperienceException("All conditions weren't satisfied.\n1. Ensure the Employee has more than 5 years of Experience.\n" +
                "2. Vote Choice is Wrong\n");
        }
        this.emp_id = emp_id;
        this.experience = experience;
        Votes temp = new Votes(vote);
        System.out.println("Employee Added & Vote Taken");
    }
}

public class Lab5 {
    public static void main(String[] args) throws ExperienceException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Employees: ");
        int n = sc.nextInt();
        Employee e[] = new Employee[n];
        int emp_id, experience, vote, temp = 0;
        while (temp < n) {
            emp_id = sc.nextInt();
            experience = sc.nextInt();
            vote = sc.nextInt();
            try {
                e[temp] = new Employee(emp_id, experience, vote);
                temp += 1;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        String[] result = Votes.getResult();
        System.out.println("Best Performer of the Company: " + result[0]);
        System.out.println("Votes given to " + result[0] + " : " + result[1]);
    }
}