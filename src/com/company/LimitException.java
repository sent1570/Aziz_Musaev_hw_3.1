package com.company;

public class LimitException extends Exception {
    double remainingAmount;
    public LimitException(String message,double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
}
