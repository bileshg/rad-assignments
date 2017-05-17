/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
