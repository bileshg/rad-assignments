package com.mycompany.demo.assignment001.dump.account;

/**
 *
 * @author bilesh
 */
public class Account {

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

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", credit=" + credit + '}';
    }
    
    public boolean withdraw(int amount)
            throws InterruptedException {
        Thread.sleep(10); // Simulate processing
        if(amount > credit) {
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

    public static void transfer(Account from, Account to, int amount)
            throws InterruptedException {
        synchronized (from) {
            if(from.withdraw(amount)) {
                synchronized (to) {
                    to.deposit(amount);
                }
            }
        }
    }
}
