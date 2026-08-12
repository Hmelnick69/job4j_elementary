package ru.job4j.condition;

public class Max {
    private int num;

    public Max(int num) {
        this.num = num;
    }

    boolean isPositive() {
        return (this.num > 0);
    }

    String labelYesNo() {
        return (isPositive() ? "Yes" : "No");
    }

    static int max(int first, int second) {
        return (first > second) ? first : second;
    }

    static int max(int first, int second, int third) {
        return (first > max(third, second)) ? first : max(third, second);
    }

    static int max(int first, int second, int third, int fourth) {
        return (first > max(second, third, fourth) ? first : max(second, third, fourth));
    }
}
