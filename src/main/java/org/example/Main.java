package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String text = "Hello Katherin";
        text = truncateString(text, 5);
        System.out.println(text);
    }

    public static String truncateString(String text, int limit) {
        if (text.length() <= limit) {
            return text;
        }

        return text.substring(0, limit);
    }
}
