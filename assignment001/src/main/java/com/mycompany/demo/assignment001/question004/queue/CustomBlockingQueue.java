package com.mycompany.demo.assignment001.question004.queue;

/**
 *
 * @author bilesh
 * @param <E>
 */
public interface CustomBlockingQueue<E> {

    void put(E item) throws InterruptedException;

    E take() throws InterruptedException;
}
