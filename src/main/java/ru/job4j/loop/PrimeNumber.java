package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            boolean i2 = CheckPrimeNumber.check(i);
            if (i2) {
                count++;
            }
        }
        return count;
    }
}