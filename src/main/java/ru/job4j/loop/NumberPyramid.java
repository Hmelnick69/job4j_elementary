package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            // Печатаем пробелы
            for (int i1 = 0; i1 < (n - i); i1++) {
                System.out.print(" ");
            }
            // Печатаем числа в прямом порядке
            for (int i2 = 1; i2 <= i; i2++) {
                System.out.print(i2);
            }
            // Печатаем числа в обратном порядке
            for (int i3 = i - 1; i3 >= 1; i3--) {
                System.out.print(i3);
            }
            // Переход на новую строку
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}
