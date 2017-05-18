/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.question003.fixed;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author bilesh
 */
public class B {

    private final ReentrantLock lock = new ReentrantLock();
    private A a;

    public void setA(A a) {
        this.a = a;
    }

    public ReentrantLock lock() {
        return lock;
    }

    public boolean impendingExecute() {
        Boolean thisLock = false;
        Boolean otherLock = false;
        try {
            thisLock = lock.tryLock();
            otherLock = a.lock().tryLock();
        } finally {
            if (!(thisLock && otherLock)) {
                if (thisLock) {
                    lock.unlock();
                }
                if (otherLock) {
                    a.lock().unlock();
                }
            }
        }
        return thisLock && otherLock;
    }

    public void bar(boolean callFoo) {
        System.out.println("bar");
        if (callFoo && impendingExecute()) {
            try {
                a.foo(false);
            } finally {
                lock.unlock();
                a.lock().unlock();
            }
        }
    }
}
