package com.mycompany.demo.assignment001.dump.account.fixed;

/**
 *
 * @author bilesh
 */
public class Demo {

    public static void main(String[] args) {
        Account fooAccount = new Account(1);
        Account barAccount = new Account(2);

        fooAccount.setCredit(100);
        barAccount.setCredit(100);

        System.out.println("Before Transaction:");
        System.out.println(fooAccount);
        System.out.println(barAccount);

        new Thread(() -> {
            try {
                if(Account.transfer(fooAccount, barAccount, 20)) {
                    System.out.println("Transaction #1: Success");
                } else {
                    System.out.println("Transaction #1: Failure");
                }

                System.out.println("\nAfter Transaction #1:");
                System.out.println(fooAccount);
                System.out.println(barAccount);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted: " + ex.getMessage());
            }
        }).start();

        new Thread(() -> {
            try {
                if(Account.transfer(barAccount, fooAccount, 10)) {
                    System.out.println("Transaction #2: Success");
                } else {
                    System.out.println("Transaction #2: Failure");
                }

                System.out.println("\nAfter Transaction #2:");
                System.out.println(fooAccount);
                System.out.println(barAccount);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted: " + ex.getMessage());
            }
        }).start();
    }
}
