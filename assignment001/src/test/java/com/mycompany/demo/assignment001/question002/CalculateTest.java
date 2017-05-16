/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question002;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author bilesh
 */
public class CalculateTest {

    /**
     * Test of sum method, of class Calculate.
     */
    @Test
    public void testSumOfIntegers() {
        System.out.println("testSumOfIntegers");
        List<Integer> numbers = Arrays.asList(10,12,20,24,100);
        double expResult = 166.0;
        double result = Calculate.sum(numbers);
        Assert.assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of sum method, of class Calculate.
     */
    @Test
    public void testSumOfLongs() {
        System.out.println("testSumOfLongs");
        List<Long> numbers = Arrays.asList(10l,12l,20l,24l,100l);
        double expResult = 166.0;
        double result = Calculate.sum(numbers);
        Assert.assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of sum method, of class Calculate.
     */
    @Test
    public void testSumOfFloats() {
        System.out.println("testSumOfFloats");
        List<Float> numbers = Arrays.asList(10.0f,12.0f,20.0f,24.0f,100.0f);
        double expResult = 166.0;
        double result = Calculate.sum(numbers);
        Assert.assertEquals(expResult, result, 0.0);
    }
    
}
