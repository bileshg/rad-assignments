package com.mycompany.demo.assignment001.question004.behaviours;

/**
 *
 * @author bilesh
 */
public class SomeTask implements Runnable {

    private final int number;

    public SomeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Starting execution of task number: " + number);
        try {
            // Perform Task
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e);
        }
        System.out.println("Finished execution of task number: " + number);
    }
}
