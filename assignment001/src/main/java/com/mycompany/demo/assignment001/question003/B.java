package com.mycompany.demo.assignment001.question003;

/**
 *
 * @author bilesh
 */
public class B {

    private A a;

    public void setA(A a) {
        this.a = a;
    }

    public synchronized void bar(boolean callFoo) {
        System.out.println("bar");
        if (callFoo) {
            a.foo(false);
        }
    }
}
