package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        for (int index = 0; index < left.length; index++) {
    if (left[index] - 1 == right[index] - 1) {
        return true;
    }
        }
        return false;

    }
}
