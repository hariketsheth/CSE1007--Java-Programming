package da2;
import java.io.*;
import java.util.*;

class Exception1 extends Exception {
    Exception1(String str) {
        System.out.println(str);
    }
}

class Exception2 extends Exception {
    String regex = "^[A-Z]{2}-[0-9]{2}(19|20)[0-9][0-9][0-9]{7}$";
    Exception2(String str) {
        if (!str.matches(regex))
            System.out.println("Driving License is invalid");
        else
            System.out.println("Driving License is valid");
    }
}

public class DA2 {
    public static void main(String[] args) throws Exception {
        String regex = "^[A-Z]{2}-[0-9]{2}(19|20)[0-9][0-9][0-9]{7}$";
        String driving_license;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the driving license: ");
        driving_license = sc.nextLine();
        System.out.println("Check 1 (Using Conditions):");
        try {
            if (driving_license.length() != 16)
                throw new Exception1("Driving License Number is not 16 digits");
            else {
                for (int i = 0; i < driving_license.length(); i++) {
                    if (i < 2) {
                        if (!Character.isAlphabetic(driving_license.charAt(i)))
                            throw new Exception1("The State code entered is wrong");
                    } else if (i == 2) {
                        if (driving_license.charAt(i) != '-')
                            throw new Exception1("Hyphen is missing !!");
                    } else if (i < 5) {
                        if (!Character.isDigit(driving_license.charAt(i)))
                            throw new Exception1("The RTO Code is not proper");
                    } else if (i < 7) {
                        char temp = driving_license.charAt(i);
                        if (i == 5 && !(temp == '1' || temp == '2'))
                            throw new Exception1("The Issue Year is invalid");
                        else if (i == 6 && !(temp == '9' || temp == '0'))
                            throw new Exception1("The Issue Year is invalid");
                    } else if (i < 17)
                        if (!Character.isDigit(driving_license.charAt(i)))
                            throw new Exception1("The Driving License Number is not proper");
                }
            }
            System.out.println("Driving License is valid");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\nCheck 2 (Using RegEx):");
        try{
            throw new Exception2(driving_license);
        }
        catch(Exception2 ex){
            System.out.println("End of the Program");
        }
    }
}