import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternandMatcher {
    public static void main(String[] args) {
        System.out.println("Harry".replaceAll("[Hh]arry","Mr. Potter"));
        String newAlphanumeric="abcDeeeABCF012Ghhiiiijkl99zabcDeeeeeeee/?@";
        System.out.println(newAlphanumeric.replaceAll("[^ej]","X"));//replace all except ej
        System.out.println(newAlphanumeric.replaceAll("[abci12345]","X"));//replace every matching character in the list to X
        System.out.println(newAlphanumeric.replaceAll("^abc","XYZ"));//if only the beginning matches then change
        System.out.println(newAlphanumeric.replaceAll("abc","XYZ"));//replace every matching
        System.out.println(newAlphanumeric.replaceAll("[a-z]","X"));//replace every lower case letter to X
        System.out.println(newAlphanumeric.replaceAll("[a-z0-9]","X"));//replace every lower case letter and number to X
        System.out.println(newAlphanumeric.replaceAll("[a-zA-Z]","X"));//replace every letter to X
        System.out.println(newAlphanumeric.replaceAll("[^0-9]","X"));//replace every thing to X except numbers
        System.out.println(newAlphanumeric.replaceAll("\\D","X"));//replace every thing to X except numbers

        System.out.println(newAlphanumeric.replaceAll("[0-9]","X"));//replace every number to X
        System.out.println(newAlphanumeric.replaceAll("\\d","X"));//replace every number to X
        System.out.println(newAlphanumeric.replaceAll("[a-zA-Z0-9]","X"));//replace every number and letter to X
        System.out.println(newAlphanumeric.replaceAll("\\w","X"));//replace every number and letter to X
        System.out.println(newAlphanumeric.replaceAll("[^a-zA-Z0-9]","X"));//replace only signs to X
        System.out.println(newAlphanumeric.replaceAll("\\W","X"));//replace only signs to X

        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","X"));//replace every a no matter case to X
        String space="   I have   a  l o t of space s     .\t and I have tab\n and a new line";
        System.out.println(space);
        System.out.println(space.length());

        System.out.println(space.replaceAll("\\s",""));//remove all spaces and tab too
        System.out.println(space.replaceAll("\\s","").length());//remove all spaces and tab too

        System.out.println(space.replaceAll("\\S",""));//remove all except spaces
        System.out.println(space.replaceAll("\\S","").length());//replace all to space

        System.out.println(space.replaceAll("\t","\n"));//replace tab with new line
        System.out.println(space.replaceAll("\n","\t\t\t"));//replace new line with tab
        System.out.println(space.replaceAll("\\b","X"));//puts X beginning and end of every word
        System.out.println(newAlphanumeric .replaceAll("\\B","X"));//puts X between characters
        System.out.println(newAlphanumeric.replaceAll("^abcDe{3}","YYY"));//replace if starts with space and repeats 3 times
        System.out.println(newAlphanumeric.replaceAll("abcDe+","YYY"));//replace if matching and till all e repeats
        System.out.println(newAlphanumeric.replaceAll("abcDe*","YYY"));//replace if matching and till all e repeats
        System.out.println(newAlphanumeric.replaceAll("abcDe{1,3}","YYY"));//replace if matched and e repeat 1, 2 , or 3 times
        System.out.println(newAlphanumeric.replaceAll("h+i*j","YYY"));//replace if at least 1 h, at least 1 or more i s, followed by j hhiiiij will ve YYY

        StringBuilder htmlText=new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub Heading</h2>");
        htmlText.append("<p>This is a paragraph</p>");
        htmlText.append("<p>This is another paragraph</p>");
        htmlText.append("<h2>This is summary</h2>");
        htmlText.append("<p>Here is a summary paragraph</p>");
        System.out.println(htmlText);
        String h2Pattern="<h2>";
        Pattern pattern=Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        int count=0;
        matcher.reset();
        while(matcher.find()){
            count++;
            System.out.println("Occurances="+count+" : "+matcher.start()+" to "+matcher.end());

        }
        String h2GroupMatcher="(<h2>)(.*?)(</h2>)";
        Pattern groupPattern=Pattern.compile(h2GroupMatcher);
        Matcher groupMatcher=groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();
        while(groupMatcher.find()){
            System.out.println("Occurance: "+groupMatcher.group(2));
        }



    }
}
