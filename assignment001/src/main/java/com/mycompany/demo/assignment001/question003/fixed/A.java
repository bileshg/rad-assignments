package com.mycompany.demo.assignment001.question003.fixed;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author bilesh
 */
public class A {

    private final ReentrantLock lock = new ReentrantLock();
    private B b;

    public void setB(B b) {
        this.b = b;
    }

    public ReentrantLock lock() {
        return lock;
    }

    public boolean impendingExecute() {
        Boolean thisLock = false;
        Boolean otherLock = false;
        try {
            thisLock = lock.tryLock();
            otherLock = b.lock().tryLock();
        } finally {
            if (!(thisLock && otherLock)) {
                if (thisLock) {
                    lock.unlock();
                }
                if (otherLock) {
                    b.lock().unlock();
                }
            }
        }
        return thisLock && otherLock;
    }

    public void foo(boolean callBar) {
        System.out.println("foo");
        if (callBar && impendingExecute()) {
            try {
                b.bar(false);
            } finally {
                lock.unlock();
                b.lock().unlock();
            }

        }

    }
}
