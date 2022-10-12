package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount = sum + amount;
    }
    public void withDraw(int sum)throws LimitException{
if (amount<sum){
    throw new LimitException("����� �� ����� ��������: " , getAmount());
}
else {
    amount = amount - sum;
}
    }

}
