package _main;

import entity.Employee;
import service.Report;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Илон Маск", 100000.20);
        Employee e2 = new Employee("Стив Джобс", 150000.11);
        Employee e3 = new Employee("Марк Цукенберг", 200000.90);
        Employee[] employees = {e1, e2, e3};
        Report.generateReport(employees);

        StringBuilder stringbuilder1 = StringBuilderDemo.createSomeString(7, 44);
        System.out.println(stringbuilder1);
        System.out.println(StringBuilderDemo.deleteSomeElement(stringbuilder1));
        System.out.println(StringBuilderDemo.replaceSomeElement(stringbuilder1));

        String stroka = "I like Java!!!"; //1
        System.out.println(stroka.charAt((stroka.length() - 1))); //2
        System.out.println("Строка оканчивается на '!!!' - " + stroka.endsWith("!!!"));//3
        System.out.println("Строка начинается с 'I like' - " + stroka.startsWith("I like"));//4
        System.out.println("Строка содержит 'Java' - " + stroka.contains("Java"));//5
        System.out.println("Строка содержит 'Java' - " + stroka.indexOf("Java"));//6
        System.out.println("Заменяем в строке 'a' на 'o' - " + stroka.replace("a", "o"));//7
        System.out.println("Заменяем в строке все символы начиная с 'a' на 'o' - " + stroka.replaceAll("a.", "o"));//7 extra
        System.out.println("Преобразуйте строку к верхнему регистру - " + stroka.toUpperCase());//8
        System.out.println("Преобразуйте строку к нижнему регистру - " + stroka.toLowerCase());//9
        System.out.println("Вырезать строку 'Java' - " + stroka.substring(6, 11));//10

//        Pattern pattern = Pattern.compile("J.+а");
//        Matcher matcher = pattern.matcher(stroka);
//        while (matcher.find()) {
//            System.out.println(stroka.substring(matcher.start(), matcher.end()));
//        }

        String a = String.valueOf(1);
        String b = String.valueOf(12.0D);
        String c = String.valueOf(123.4F);
        String d = String.valueOf(123456L);
        String s = String.valueOf(true);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);

        String text1 = "Hello there";
        if (text1 instanceof String) { // Чтобы проверить, является ли объект строкой или нет, используйте instanceof.
            System.out.println("It's a string!");
        }
        //3
        String sentence = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        String result = replaceEverySecondOccurrence(sentence, "object-oriented programming ", "OOP ");
        System.out.println(result);

        //4
        String word = "string";
        String middleChars = getMiddleCharacters(word);
        System.out.println("Средние символы: " + middleChars);

        //5
        printStudentInfo("Иванов", 5, "Математике");
        printStudentInfo("Петрова", 4, "Физике");
        printStudentInfo("Сидорова", 3, "Программированию");
    }

    //3
    public static String replaceEverySecondOccurrence(String input, String target, String replaceWith) {
        int index = input.toLowerCase().indexOf(target.toLowerCase());
        int counter = 0;
        int lastReplacedIndex = 0;
        String lowerCaseInput = input.toLowerCase();
        while (index != -1) {
            counter++;
            if (counter % 2 == 0) {
                input = input.substring(0, lastReplacedIndex + target.length()) + replaceWith + input.substring(lastReplacedIndex + target.length());
            }
            lastReplacedIndex = lowerCaseInput.indexOf(target.toLowerCase(), lastReplacedIndex + target.length());
            index = lowerCaseInput.indexOf(target.toLowerCase(), index + target.length());
        }
        return input;
        // или
        // public class Main {
        //    public static void main(String[] args) {
        //        String sentence = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        //        String result = replaceEverySecondOccurrence(sentence, "object-oriented programming", "OOP");
        //        System.out.println(result);
        //    }
        //
        //    public static String replaceEverySecondOccurrence(String input, String target, String replacement) {
        //        String regex = "(?i)" + target; // создаем регулярное выражение для игнорирования регистра
        //        Matcher matcher = Pattern.compile(regex).matcher(input);
        //        StringBuilder buffer = new StringBuilder();
        //        boolean found = false;
        //        while (matcher.find()) {
        //            if (found) {
        //                matcher.appendReplacement(buffer, Matcher.quoteReplacement(replacement));
        //                found = false;
        //            } else {
        //                matcher.appendReplacement(buffer, Matcher.quoteReplacement(matcher.group()));
        //                found = true;
        //            }
        //        }
        //        matcher.appendTail(buffer);
        //        return buffer.toString();
        //    }
        //}
    }

    //4
    public static String getMiddleCharacters(String word) {
        int length = word.length();
        int middle = length / 2;
        return word.substring(middle - 1, middle + 1);
    }

    //5
    public static void printStudentInfo(String lastName, int mark, String subject) {
        String result = String.format("Студент %-15s получил %-3d по %-10s", lastName, mark, subject);
        System.out.println(result);
    }

}