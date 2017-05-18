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
        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(final String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
