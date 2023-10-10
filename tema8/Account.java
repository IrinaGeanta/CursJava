package tema8;

public abstract class Account {

    private int accountNumber;
    public double balance;
    public Customer accountOwner;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public abstract void withdraw(double amount) throws InsufficientFondException;
}
