package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCalculatorTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenExponentialFunction() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(2, 6, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(4D, 8D, 16D, 32D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunction() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(1, 7, x -> 3 * x * x + 2 * x - 1);
        List<Double> expected = Arrays.asList(4D, 15D, 32D, 55D, 84D, 119D);
        assertThat(result).containsAll(expected);
    }
}