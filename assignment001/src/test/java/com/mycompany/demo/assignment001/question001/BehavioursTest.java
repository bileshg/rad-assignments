/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question001;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author bilesh
 */
public class BehavioursTest {

    /**
     * Test of isEvenNumber method, of class Behaviours.
     */
    @Test
    public void testIsEvenNumber() {
        assertTrue(Behaviours.isEvenNumber(0));
        assertTrue(Behaviours.isEvenNumber(4));
        assertFalse(Behaviours.isEvenNumber(9));
    }

    /**
     * Test of isOddNumber method, of class Behaviours.
     */
    @Test
    public void testIsOddNumber() {
        assertTrue(Behaviours.isOddNumber(7));
        assertFalse(Behaviours.isOddNumber(12));
    }

    /**
     * Test of isPrimeNumber method, of class Behaviours.
     */
    @Test
    public void testIsPrimeNumber() {
        assertFalse(Behaviours.isPrimeNumber(0));
        assertFalse(Behaviours.isPrimeNumber(1));
        assertTrue(Behaviours.isPrimeNumber(2));
        assertTrue(Behaviours.isPrimeNumber(31));
    }

    /**
     * Test of isPalindrome method, of class Behaviours.
     */
    @Test
    public void testIsPalindrome() {
        assertTrue(Behaviours.isPalindrome("madam"));
        assertFalse(Behaviours.isPalindrome("palindrome"));
    }

}
