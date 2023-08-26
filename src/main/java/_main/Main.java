package _main;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        StringBuilder stringbuilder1 = StringBuilderDemo.createSomeString(7, 44);
        System.out.println(stringbuilder1);
        System.out.println(StringBuilderDemo.deleteSomeElement(stringbuilder1));
        System.out.println(StringBuilderDemo.replaceSomeElement(stringbuilder1));

        String stroka = "I like Java!!!"; //1
//        char ch = stroka.charAt((stroka.length() - 1));
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
//2


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


// Чтобы проверить, является ли объект строкой или нет, используйте instanceof.

        String text1 = "Hello there";
        if (text1 instanceof String) {
            System.out.println("It's a string!");
        }
    }
}