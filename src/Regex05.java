import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter username");
        String username= scan.nextLine();
        while(true) {
        System.out.println("Enter Password");
        String password= scan.nextLine();

            if (password.length() > 5 && !password.contains(username))
                System.out.println("Valid Password");
            else {
                System.out.println("Invalid Password:");
                if (password.length() < 5) System.out.println("Password cannot be less than 5 characters");
                if (password.contains(username)) System.out.println("Invalid password, username should not be in it");
            }
        }

    }
}
