package _main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//9
public class RegexDemo9 {

    public static void main(String[] args) {
        String input = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
        String pattern = "Java \\d+";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
