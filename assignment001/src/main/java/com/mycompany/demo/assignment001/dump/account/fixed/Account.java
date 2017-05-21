/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.assignment001.dump.account.fixed;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author bilesh
 */
public class Account {

    private final ReentrantLock lock = new ReentrantLock();

    private int id;
    private int credit;

    public Account(int id) {
        this.id = id;
        this.credit = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ReentrantLock getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", credit=" + credit + '}';
    }

    public boolean withdraw(int amount)
            throws InterruptedException {
        Thread.sleep(10); // Simulate processing
        if (amount > credit) {
            return false;
        } else {
            this.credit = this.credit - amount;
            return true;
        }
    }

    public void deposit(int amount)
            throws InterruptedException {
        Thread.sleep(10); // Simulate processing
        this.credit = this.credit + amount;
    }

    private static boolean impendingTransfer(Account from, Account to) {
        Boolean fromLock = false;
        Boolean toLock = false;
        try {
            fromLock = from.getLock().tryLock();
            toLock = to.getLock().tryLock();
        } finally {
            if (!(fromLock && toLock)) {
                if (fromLock) {
                    from.getLock().unlock();
                }
                if (toLock) {
                    to.getLock().unlock();
                }
            }
        }
        return fromLock && toLock;
    }

    public static boolean transfer(Account from, Account to, int amount)
            throws InterruptedException {
        boolean check;
        if (check = impendingTransfer(from, to)) {
            try {
                if (check = from.withdraw(amount)) {
                    to.deposit(amount);
                } 
            } finally {
                from.getLock().unlock();
                to.getLock().unlock();
            }
        }
        return check;
    }
}
