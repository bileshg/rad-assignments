/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question001;

/**
 *
 * @author bilesh
 */
public class Behaviours {
    
    public static boolean checkEvenNumber(final int num) {
        return num % 2 == 0;
    }
    
    public static boolean checkOddNumber(final int num) {
        return num % 2 != 0;
    }
    
    public static boolean checkPrimeNumber(final int num) {
        if(num == 1) return false;
        
        boolean check = true;
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static boolean checkPalindrome(final String word) {
        boolean result = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
