import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String path="\\w?java.*";
        if(word.matches(path)) System.out.println(true);
        else System.out.println(false);
    }
}