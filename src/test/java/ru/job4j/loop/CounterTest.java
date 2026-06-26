package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void when0And10ThenSum55() {
        int expected = 55;
        int output =  Counter.sum(0, 10);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when3And8ThenSum33() {
        int expected = 33;
        int output =  Counter.sum(3, 8);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when1And1ThenSum1() {
        int expected = 1;
        int output = Counter.sum(1, 1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMinus3AndMinus1ThenSumMinus6() {
        int expected = -6;
        int output = Counter.sum(-3, -1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart7BiggerFinish5() {
        int expected = 0;
        int output = Counter.sum(7, 5);
        assertThat(output).isEqualTo(expected);
    }
}