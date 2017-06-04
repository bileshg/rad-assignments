package com.mycompany.demo.assignment001.question001;

import java.util.Collection;
import java.util.function.Predicate;

/**
 *
 * @author bilesh
 */
public class Counter {

    public static <T> long countIf(Collection<T> collection, Predicate<T> predicate) {
        return collection.stream()
                .filter(predicate)
                .count();
    }
}
