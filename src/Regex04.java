import java.util.Scanner;
public class Regex04 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        for(int i=0;i<6;i++) {
            String accountNumber = scan.nextLine();
            if (accountNumber.matches("^[2][0-9]{6}$"))
                System.out.println("Valid 7-digit account number");//start with 2 and have 6 digit after
            else if (accountNumber.matches("^([5][0-9]{9})$"))
                System.out.println("Valid 10-digit account number");//start with 5 and have 9 digit after
            else if (accountNumber.matches("^[0-9&&[^5|2]]\\d+?"))
                System.out.println("Invalid account number");//start with digit except 5 or 2
            else if (accountNumber.matches("^[5]\\d+?"))
                System.out.println("Invalid 10-digit account number");//start with 5 have digits after
            else if (accountNumber.matches("^[2]\\d+?"))
                System.out.println("Invalid 7-digit account number");//start with to have digits after
            else System.out.println("Invalid input");//incase space or other characters entered
        }
        }
    }

