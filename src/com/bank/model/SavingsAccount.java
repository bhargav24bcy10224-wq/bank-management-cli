package com.bank.model;

import com.bank.exception.InsufficientFundsException;

public class SavingsAccount extends Account {
    private static final double MIN_BAL = 500.0;

    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    @Override
    public void withdraw(double amt) throws InsufficientFundsException {
        if (balance - amt < MIN_BAL) {
            throw new InsufficientFundsException("Min balance of Rs. 500 required.");
        }
        balance -= amt;
    }
}
