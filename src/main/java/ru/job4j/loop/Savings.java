package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            double annualYearsPercent =  total * (percent / 100);
            total =  total + annualDeposit + annualYearsPercent;
            years++;
        } while (total < goal);
        return years;
    }
}
