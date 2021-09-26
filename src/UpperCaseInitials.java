import java.util.Locale;
import java.util.Scanner;

public class UpperCaseInitials {
    public static void main(String[] args) {
        /* propher the names
            -remove all spaces in front of the names
            -Capitilize the initials
            -remove extra spaces if a name has multiple words
            -capitilize each initial if name has multiple words(not done)
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first name");
        String fname=scan.nextLine().trim().replaceAll(" + "," ");
        System.out.println("Enter last name");
        String lname=scan.nextLine().trim().replaceAll(" + "," ");
        fname=fname.replaceAll("\\B","");
        fname=fname.toUpperCase().charAt(0)+fname.toLowerCase().substring(1);
        lname=lname.toUpperCase().charAt(0)+lname.toLowerCase().substring(1);
        System.out.println(fname+" "+lname);
    }
}
