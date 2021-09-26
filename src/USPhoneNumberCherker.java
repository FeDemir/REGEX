import java.util.regex.Pattern;

public class USPhoneNumberCherker {
    public static void main(String[] args) {
        String a="aaa";
        System.out.println(a.indexOf('a'));
        System.out.println(a.indexOf('a',a.indexOf('a')+1));
        String format="^([\\+]{1}[1]{1}[\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
        String phone1="1234567890";
        String phone2="+1(123) 456-7890";
        String phone3="123 456-7890";
        String phone4="(123)456-7890";
        System.out.println("phone1="+phone1.matches(format));
        System.out.println("phone2="+phone2.matches(format));
        System.out.println("phone3="+phone3.matches(format));
        System.out.println("phone4="+phone4.matches(format));

        //visa card number check
        String cardFormat="^4[0-9]{12}([0-9]{3})?$";
        String visa1="4444444444441234";
        String visa2="544444444444";
        String visa3="4444444444444444";
        String visa4="44444444444";
        System.out.println("visa1"+visa1.matches(cardFormat));
        System.out.println("visa2"+visa2.matches(cardFormat));
        System.out.println("visa3"+visa3.matches(cardFormat));
        System.out.println("visa4"+visa4.matches(cardFormat));
    }
}
