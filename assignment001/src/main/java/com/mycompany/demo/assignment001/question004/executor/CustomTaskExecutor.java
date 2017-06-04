package com.mycompany.demo.assignment001.question004.executor;

import com.mycompany.demo.assignment001.question004.queue.CustomBlockingQueue;

/**
 *
 * @author bilesh
 * @param <T>
 */
public class CustomTaskExecutor<T extends Runnable> implements Runnable {

    private final CustomBlockingQueue<T> queue;

    public CustomTaskExecutor(CustomBlockingQueue<T> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String name = Thread.currentThread().getName();
                Runnable task = queue.take();
                if (task != null) {
                    System.out.println(name + ": Performing task");
                    task.run();
                    System.out.println(name + ": Finished task");
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e);
        }
    }
}
