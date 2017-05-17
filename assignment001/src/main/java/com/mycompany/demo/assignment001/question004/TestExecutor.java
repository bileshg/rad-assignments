/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question004;

import com.mycompany.demo.assignment001.question004.behaviours.SomeTask;
import com.mycompany.demo.assignment001.question004.executor.CustomThreadPool;

/**
 *
 * @author bilesh
 */
public class TestExecutor {

    public static void main(String[] args) throws InterruptedException {
        CustomThreadPool<Runnable> threadPool = new CustomThreadPool<>(3, 4);
        
        for (int counter = 1; counter <= 10; counter++) {
            SomeTask task = new SomeTask(counter);
            threadPool.submit(task);
        }
        
        threadPool.submit(() -> System.out.println("Bilesh says hi!"));
        threadPool.submit(() -> System.out.println("Soumil says hi!"));
    }
}
