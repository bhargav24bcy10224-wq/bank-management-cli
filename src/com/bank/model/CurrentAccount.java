package com.bank.model;

import com.bank.exception.InsufficientFundsException;

public class CurrentAccount extends Account {
    private static final double LIMIT = 2000.0;

    public CurrentAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    @Override
    public void withdraw(double amt) throws InsufficientFundsException {
        if (balance + LIMIT < amt) {
            throw new InsufficientFundsException("Overdraft limit of Rs. 2000 exceeded.");
        }
        balance -= amt;
    }
}
