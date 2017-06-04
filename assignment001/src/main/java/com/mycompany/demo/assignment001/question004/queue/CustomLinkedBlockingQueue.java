package com.mycompany.demo.assignment001.question004.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author bilesh
 * @param <E>
 */
public class CustomLinkedBlockingQueue<E> implements CustomBlockingQueue<E> {

    private final Queue<E> queue;
    private final int maxSize;

    public CustomLinkedBlockingQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new LinkedList<>();
    }

    @Override
    public synchronized void put(E item) throws InterruptedException {

        if (queue.size() == maxSize) {
            this.wait();
        }

        queue.offer(item);
        this.notifyAll();
    }

    @Override
    public synchronized E take() throws InterruptedException {

        if (queue.isEmpty()) {
            this.wait();
        }

        this.notifyAll();
        return queue.poll();
    }

}
