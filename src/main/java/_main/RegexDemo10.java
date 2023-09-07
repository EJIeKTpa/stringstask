package _main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//10
public class RegexDemo10 {
    public static void main(String[] args) {
        String input = "fffff ab f 1234 jkjk";
        String pattern = "\\b\\w+\\b";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        String minUniqueWord = null;
        int minUniqueCount = Integer.MAX_VALUE;

        while (matcher.find()) {
            String word = matcher.group();
            int uniqueCount = getUniqueCharacterCount(word);

            if (uniqueCount < minUniqueCount) {
                minUniqueCount = uniqueCount;
                minUniqueWord = word;
            }
        }

        System.out.println("Наиболее часто встречающееся слово с минимальным числом различных символов: " + minUniqueWord);
    }

    private static int getUniqueCharacterCount(String word) {
        return (int) word.chars().distinct().count();
    }
}
