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
public class A {

    private B b;

    public void setB(B b) {
        this.b = b;
    }

    public synchronized void foo(boolean callBar) {
        System.out.println("foo");
        if (callBar) {
            b.bar(false);
        }
    }
}
