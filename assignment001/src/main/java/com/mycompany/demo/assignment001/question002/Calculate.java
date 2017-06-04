package com.mycompany.demo.assignment001.question002;

import java.util.List;

/**
 *
 * @author bilesh
 */
public class Calculate {
    public static double sum(List<? extends Number> numbers) {
        return numbers.stream()
                .mapToDouble(Number::doubleValue)
                .reduce(0, Double::sum);
    }
}
