public class Regex_Intro {
    public static void main(String[] args) {
        String string="I am a string. Yes, I am.";
        System.out.println(string);
        String yourString=string.replaceAll("I","You");
        System.out.println(yourString);

        String alphanumeric="helloabcDeeeF12GhhiiIIjklm99z.?/`!@#$%^&*()abcDeee";
        System.out.println(alphanumeric.replaceAll(" ","Y"));
        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));//YYYF12GhhiiIIjklm99z.?/`!@#$%^&*()abcDeee
        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));//YYYF12GhhiiIIjklm99z.?/`!@#$%^&*()YYY

        System.out.println(alphanumeric.matches("^hello"));//needs to completely match
        System.out.println(alphanumeric.matches("hello"));
        System.out.println(alphanumeric.replaceAll("abcDeee$","THE END"));
        System.out.println(alphanumeric.replaceAll("[abc]","X"));
        System.out.println(alphanumeric.replaceAll("[abc][abcD]","|"));
    }
}
