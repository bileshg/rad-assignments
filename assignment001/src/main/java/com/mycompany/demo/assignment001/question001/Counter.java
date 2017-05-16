/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question001;

import java.util.Collection;
import java.util.function.Predicate;

/**
 *
 * @author bilesh
 */
public class Counter {

    public static <T> long countIf(Collection<T> c, Predicate<T> p) {
        return c.stream().filter(p).count();
    }
}
