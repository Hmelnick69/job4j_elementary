package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            double everyYearsPercent =  total * (percent / 100);
            total =  total + annualDeposit + everyYearsPercent;
            years++;
        } while (total < goal);
        return years;
    }
}
