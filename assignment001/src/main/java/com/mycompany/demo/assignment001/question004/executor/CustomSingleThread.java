/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question004.executor;

import com.mycompany.demo.assignment001.question004.queue.CustomBlockingQueue;
import com.mycompany.demo.assignment001.question004.queue.CustomLinkedBlockingQueue;

/**
 *
 * @author bilesh
 * @param <T>
 */
public class CustomSingleThread<T extends Runnable> {

    private final CustomBlockingQueue<T> queue;

    public CustomSingleThread(int queueSize) {
        queue = new CustomLinkedBlockingQueue<>(queueSize);
        createThread();
    }

    private void createThread() {
        String threadName = "Main Thread";
        CustomTaskExecutor<T> task = new CustomTaskExecutor<>(queue);
        Thread thread = new Thread(task, threadName);
        thread.start();
    }

    public void submit(T task) throws InterruptedException {
        queue.put(task);
    }

}
