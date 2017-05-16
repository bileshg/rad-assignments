/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question001;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author bilesh
 */
public class BehavioursTest {

    /**
     * Test of checkEvenNumber method, of class Behaviours.
     */
    @Test
    public void testCheckEvenNumber() {
        System.out.println("checkEvenNumber");
        int num = 4;
        boolean expResult = true;
        boolean result = Behaviours.checkEvenNumber(num);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Test of checkOddNumber method, of class Behaviours.
     */
    @Test
    public void testCheckOddNumber() {
        System.out.println("checkOddNumber");
        int num = 5;
        boolean expResult = true;
        boolean result = Behaviours.checkOddNumber(num);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Test of checkPrimeNumber method, of class Behaviours.
     */
    @Test
    public void testCheckPrimeNumber() {
        System.out.println("checkPrimeNumber");
        int num = 11;
        boolean expResult = true;
        boolean result = Behaviours.checkPrimeNumber(num);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Test of checkPalindrome method, of class Behaviours.
     */
    @Test
    public void testCheckPalindrome() {
        System.out.println("checkPalindrome");
        String word = "madam";
        boolean expResult = true;
        boolean result = Behaviours.checkPalindrome(word);
        Assert.assertEquals(expResult, result);
    }
    
}
