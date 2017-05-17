/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question004;

import com.mycompany.demo.assignment001.question004.executor.CustomSingleThread;

/**
 *
 * @author bilesh
 */
public class TestSingleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        CustomSingleThread<Runnable> singleThread = new CustomSingleThread<>(3);
        
        singleThread.submit(() -> System.out.println("Bilesh says hi!"));
        singleThread.submit(() -> System.out.println("Soumil says hi!"));
        singleThread.submit(() -> System.out.println("2 + 2 = " + (2 + 2)));
    }
}
