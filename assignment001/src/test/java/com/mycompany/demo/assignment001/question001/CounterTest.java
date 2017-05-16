/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question001;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author bilesh
 */
public class CounterTest {
    
    /**
     * Counting odd numbers.
     */
    @Test
    public void testCountingOddNumbers() {
        System.out.println("testCountingOddNumbers");
        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6);
        long expected = 3l;
        long actual = Counter.countIf(ci, Behaviours::checkOddNumber);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Counting odd numbers.
     */
    @Test
    public void testCountingPrimeNumbers() {
        System.out.println("testCountingPrimeNumbers");
        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6);
        long expected = 3l;
        long actual = Counter.countIf(ci, Behaviours::checkOddNumber);
        Assert.assertEquals(expected, actual);
    }    
    
    /**
     * Counting palindromes
     */
    @Test
    public void testCountingPalindromes() {
        System.out.println("testCountingPalindromes");
        List<String> cs = Arrays.asList("madam", "test", "tacocat", "hello");
        long expected = 2l;
        long actual = Counter.countIf(cs, Behaviours::checkPalindrome);
        Assert.assertEquals(expected, actual);
    }
    
}
