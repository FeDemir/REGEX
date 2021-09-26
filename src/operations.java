import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        long l=100;
        short s=(short)l;
        System.out.println(s+10);
        int a=10;
        a=--a+a+++a--+a++;
        //  9+9+10+9
        System.out.println(a);
        byte b=104;
        boolean c=b<100;
        if(c)b-=100;else b=50;
        System.out.println(b);
        int cookies=10;
        String day="tuesday";
        switch (day){
            case "sunday":cookies++;
            case "monday":cookies+=5;break;
            case "tuesday":
            case "wednesday":cookies+=10;
            case "thursday":cookies+=5;break;
            case "friday":break;
            case "saturday":cookies--;break;
            default:cookies=0;
        }
        System.out.println(cookies);
        double decimal=13.142;
        int whole=decimal <20?20:10;
        System.out.println(whole);
        String name="Jimmy";
        boolean check;
        if(name=="James") check=false;
        else check=true;
        String str=check ? "5":"10";
        System.out.println(str);
        name+=whole;
        System.out.println(name);
        Scanner scan=new Scanner(System.in);
        //str=scan.nextInt();

    }
}
