package _main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo12 {
    public static void main(String[] args) {
        String sentence = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";

        Pattern pattern = Pattern.compile("\\b(\\d{2,})\\b");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            String word = matcher.group(1);
            if (isPalindrome(word)) {
                System.out.println("Слово-палиндром: " + word);
            }
        }
    }

    private static boolean isPalindrome(String word) {
        StringBuilder reverse = new StringBuilder(word).reverse();
        return word.equals(reverse.toString());
    }

}
