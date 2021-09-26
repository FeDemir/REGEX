import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex02 {
    public static void main(String[] args) {
        String tvTest="tstvtktvt";
        //String tNotVRegExp="t[^v]"; //find starts with t, not follows by v
        String tNotVRegExp="t(?!v)";//find all t s with not following v (includes last t)

        Pattern tNotVPattern=Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher=tNotVPattern.matcher(tvTest);
        int count=0;
        while(tNotVMatcher.find()){
            count++;
            System.out.println("Occurance"+count+" : "+tNotVMatcher.start()+" to "+tNotVMatcher.end());
        }
    }
}
