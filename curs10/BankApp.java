package curs10;

import java.util.Scanner;

/*
vreau sa simulam un atm cu urmatoarele functii:
deposit
withdraw
check balance
trebuie sa intrebam userul ce operatiune vrea si la finalul
operatiuni daca vrea sa continue
luam in considerare sca pe viitor putem avea si alte tipuri de conturi a
asociate acestui program
implementarea se va face cu un cont curent
avem exceptii pt fonduri insuficiente si pt sume invalide

 */
public class BankApp {

    public static void main(String[] args) {

    }

    public void bankApp(CurrentAccount account) throws InvalidAmountException, InssuficientFundsException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, Available operations are: ");
        System.out.println("1 Deposit");
        System.out.println("2 Withdraw");
        System.out.println("3 Check Balance");
        String option = scan.next();

        switch(option){
            case "1":
                System.out.println("Please enter the amount to deposit");
                double amount = scan.nextDouble();
                account.deposit(amount);
                account.checkBalance();
                break;
            case "2":
                System.out.println("Please enter the amount to withdraw");
                amount = scan.nextDouble();
                account.withdraw(amount);
                account.checkBalance();
                break;
            case "3":
                account.checkBalance();
                break;
            default:
                System.out.println("Invalid option");
        }

    }
}
