package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    public void when10ThenYes() {
        Max a = new Max(10);
        String result = a.labelYesNo();
        String expected = "Yes";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMinus1ThenNo() {
        Max a = new Max(-1);
        String result = a.labelYesNo();
        String expected = "No";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maxBetween4And5() {
        int first = 4;
        int second = 5;
        int result = Max.max(first, second);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maxBetween4And5And8() {
        int first = 4;
        int second = 5;
        int third = 8;
        int result = Max.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maxBetween4And5And8And1() {
        int first = 4;
        int second = 5;
        int third = 8;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}