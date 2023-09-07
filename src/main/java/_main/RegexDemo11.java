package _main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo11 {
    public static void main(String[] args) {
        String input = "One two three раз два три one1 two2 123";
        String pattern = "\\b[a-zA-Z]+\\b"; //для русского а-яА-ЯёЁ, но почему расские не считает

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        int wordCount = 0;

        while (matcher.find()) {
            String word = matcher.group();
            if (word.matches("[a-zA-Z]+")) {
                wordCount++;
            }
        }

        System.out.println("Количество слов, содержащих только символы латинского алфавита: " + wordCount);
    }

}
