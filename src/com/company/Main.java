package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println("Денег на счету осталось: " + bankAccount.getAmount());
        while (true) {

            try {
                bankAccount.withDraw(6000);
                System.out.println( "Денег на счету осталось: " + bankAccount.getAmount());
            } catch (LimitException e) {
                e.setRemainingAmount(0);
                throw new ArithmeticException(e.getMessage() + e.getRemainingAmount());
            }
        }
    }
}
