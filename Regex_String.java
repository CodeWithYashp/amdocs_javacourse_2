import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_String {
    public static void main(String[] args){
        Pattern myPattern = Pattern.compile("myName", Pattern.CASE_INSENSITIVE);
        Matcher matcher = myPattern.matcher("Hello myName is Yash Pandey");
        if (matcher.find()){
            System.out.println("Match found!");
        }else {
            System.out.println("Match not found!");
        }
    }
}
