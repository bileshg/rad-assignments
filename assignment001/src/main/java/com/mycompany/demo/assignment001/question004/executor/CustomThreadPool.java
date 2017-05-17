/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question004.executor;

import com.mycompany.demo.assignment001.question004.queue.CustomLinkedBlockingQueue;
import com.mycompany.demo.assignment001.question004.queue.CustomBlockingQueue;

/**
 *
 * @author bilesh
 * @param <T>
 */
public class CustomThreadPool<T extends Runnable> {

    private final CustomBlockingQueue<T> queue;

    public CustomThreadPool(int queueSize, int nThreads) {
        queue = new CustomLinkedBlockingQueue<>(queueSize);
        createThreads(nThreads);
    }

    private void createThreads(int nThreads) {
        for (int idx = 0; idx < nThreads; idx++) {
            String threadName = "Thread-" + idx;
            CustomTaskExecutor<T> task = new CustomTaskExecutor<>(queue);
            Thread thread = new Thread(task, threadName);
            thread.start();
        }
    }

    public void submit(T task) throws InterruptedException {
        queue.put(task);
    }

}
