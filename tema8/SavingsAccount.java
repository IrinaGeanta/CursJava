package tema8;

public class SavingsAccount extends Account{

    public SavingsAccount(int accountNumber, double balance, Customer accountOwner){
        setAccountNumber(accountNumber);
        super.balance = balance;
        super.accountOwner = accountOwner;
    }
    @Override
    public void withdraw(double amount) throws InsufficientFondException{
        // (amount <= balance) ? (balance = balance - amount): throw new InsufficientFondException("Insufficient funds for transaction");
        // nu merge cu ternary .. no ideea why.. am incercat in toate felurile le-am invartit si pus paranteze si nebunii

        if (amount > balance){
            throw new InsufficientFondException("Insufficient funds for transaction");
        } else {
            balance = balance - amount;
        }
    }
}
