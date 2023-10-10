package curs10;

import tema8.InsufficientFondException;

public class CurrentAccount implements Account{

    public double sold;

    public CurrentAccount(double sold){
        this.sold = sold;
    }
    @Override
    public void deposit(double amount) throws InvalidAmountException {

        if (amount <=0){
            throw new InvalidAmountException(amount + " is not valid!");
        }
        sold = sold + amount;
    }

    @Override
    public void withdraw(double amount) throws InssuficientFundsException {
        if (sold < amount){
            throw new InssuficientFundsException("You don't have sufficient fonds");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Your balance is: "+ sold);
    }
}
