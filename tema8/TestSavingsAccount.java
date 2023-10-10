package tema8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSavingsAccount {

    public static void main(String[] args) {
        Customer customer = new Customer("Irina","Bucuresti","irina@irina.ro");
        SavingsAccount savingsAccount = new SavingsAccount(1234,1800.77,customer);
        double amount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi "+ customer.getName());
        System.out.println("Enter the amount to withdraw: ");

        try {
                amount = scanner.nextDouble();
        } catch (InputMismatchException e){
                System.out.println("Please enter a valid decimal number!");
                //amount = scanner.nextDouble();
                //aici am incercat in fel si chip sa retry .. nu nene nu vrea :))

        }

        scanner.close();
        try{
            savingsAccount.withdraw(amount);
            System.out.println("Your new balance is: " + savingsAccount.balance);

        } catch (InsufficientFondException e){
            System.out.println("The amount you try to withdraw is greater than your available balance: " + savingsAccount.balance);

            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

        finally{
            System.out.println("Thank you for using our ATM!");
        }


    }





}


