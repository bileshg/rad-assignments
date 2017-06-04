package com.mycompany.demo.assignment001.question001;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;

/**
 *
 * @author bilesh
 */
public class CounterTest {

    private static List<Integer> numbers;
    private static List<String> words;

    @BeforeClass
    public static void setUpClass() throws Exception {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        words = Arrays.asList("tacocat", "hotdog");
    }

    @Test
    public void testCountIf() {
        assertEquals(9l, Counter.countIf(numbers, (x) -> true));
    }

    @Test
    public void countingOddNumbers() {
        assertEquals(5l, Counter.countIf(numbers, Behaviours::isOddNumber));
    }

    @Test
    public void countingPrimeNumbers() {
        assertEquals(4l, Counter.countIf(numbers, Behaviours::isPrimeNumber));
    }

    @Test
    public void testCountingPalindromes() {
        assertEquals(1l, Counter.countIf(words, Behaviours::isPalindrome));
    }

}
