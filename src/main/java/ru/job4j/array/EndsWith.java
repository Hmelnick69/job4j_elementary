package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        /* проверить. что массив word имеет последние элементы одинаковые с postfix */
        for (int i = 0; i < postfix.length; i++) {
            if (word[word.length - i - 1] != postfix[postfix.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
