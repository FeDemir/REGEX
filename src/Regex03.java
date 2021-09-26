import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex03 {
    public static void main(String[] args) {
        String regExp1="I want a \\w+.";
        //String reExp1="I want a (bike|ball).";
        String challenge1="I want a bike.";
        String challenge2="I want a ball.";
        System.out.println(challenge1.matches(regExp1));//true
        System.out.println(challenge2.matches(regExp1));//true
        Pattern path=Pattern.compile(regExp1);
        Matcher match=path.matcher(challenge1);
        System.out.println(match.matches());
        match.reset();
        match= path.matcher(challenge2);
        System.out.println(match.matches());
        String challenge4="Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s","_"));
        String challenge5="aaabccccccdddefffg";
        System.out.println(challenge5.matches("[a-g]+"));
        path=Pattern.compile(challenge5);
        match.reset();
        match= path.matcher("aaabccccccdddefffg");
        System.out.println(match.matches());
        System.out.println(challenge5.matches("^([a]{3}[b]{1}[c]{6}[d]{3}[e]{1}[f]{3}[g]{1}+$)"));
        String challenge7="f.";
        System.out.println(challenge7.matches("^[a-zA-Z]+\\.\\d+$"));
        String challenge8="abcd.135uvqz.7tzik.999";
        String challenge9="abcd.135\tuvqz.7\ttzik.999\n";

        System.out.println(challenge8.replaceAll("\\D",""));
        Pattern path8=Pattern.compile("(\\d+)");
        Matcher match8=path8.matcher(challenge8);
        while(match8.find()){
            System.out.println("Occurance:"+match8.group(1));
        }
        System.out.println();
        Pattern path9=Pattern.compile("(\\d+)");
        Matcher match9=path9.matcher(challenge9);
        while(match9.find()){
            System.out.println("Occurance:"+match9.group(1)+"\t\t\tstart:"+match9.start(1)+" End:"+match9.end(1));

        }
        String challenge11="{0,2},{0,5},{1,3},{2,4},{a,b},{100,101}";
        //System.out.println(challenge11.replaceAll("(\\d)+"," "));
        Pattern path11=Pattern.compile("(\\d+\\,\\d+)");//only numbers
        //Pattern path11=Pattern.compile("\\{(.+?)\\}");//everything between {}

        Matcher match11=path11.matcher(challenge11);
        while(match11.find()){
            System.out.println("Occurance: "+match11.group(1));
        }
        String zipcode="73105-1111";
        //zipcode=zipcode.replaceAll("^\\d{5}","^\\d{5}\\-0000");
        System.out.println(zipcode);
        Pattern path12=Pattern.compile("^\\d{5}\\-\\d{4}$");
        Matcher match12=path12.matcher(zipcode);
        System.out.println(match12.matches());

    }
}
