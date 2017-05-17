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
public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        a.setB(b);
        b.setA(a);
        
        new Thread(() -> {
            a.foo(true);
        }).start();
        
        new Thread(() -> {
            b.bar(true);
        }).start();
    }
}
