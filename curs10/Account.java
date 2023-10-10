package curs10;

import tema8.InsufficientFondException;

public interface Account {

    public void deposit(double amount) throws InvalidAmountException;
    public void withdraw(double amount) throws InssuficientFundsException;
    public void checkBalance();

}
