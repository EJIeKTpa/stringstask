package _main;

public class StringBuilderDemo {

    static StringBuilder createSomeString(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return result;
    }

    static StringBuilder deleteSomeElement(StringBuilder stringBuilder) {
        int element;
        while ((element = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(element).insert(element, " равно "); //выделить 2 строки или сколько нужно и нажать ctrl+alt+T
        }

        return stringBuilder;
    }

    static StringBuilder replaceSomeElement(StringBuilder stringBuilder) {
        stringBuilder.replace(1, 4, "замена");
        return stringBuilder;

    }
}
