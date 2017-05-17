/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
