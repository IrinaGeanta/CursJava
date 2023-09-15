package curs4;

import java.util.Scanner;

/*
program care citeste de la tastatura 2 nr si verifica urmatoarele:
-> dc fiecare nr este pozitiv sau negativ
-> dc ambele nr sunt pozitive sau negative
-> care dintre nr este mai mare sau dc sunt egale
-> printam corespunzator
 */
public class OperatorConditional {
    int num1, num2;
    public void askTheUser(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();
        scan.close();
    }

    public void verifyTheNumbers(){
        askTheUser();
        if (num1 > 0){
            System.out.println("num1 e pozitiv");
        } else {
            System.out.println("num1 e negativ");
        }

        String result = (num1 > 0) ? "num1 e pozitiv" : "num1 e negativ";
        System.out.println(result);
        result = (num2 > 0) ? "num2 e pozitiv" : "num2 e negativ";
        System.out.println(result);

        result = (num1 > 0 && num2 > 0) ? "ambele sunt pozitive" : "ambele sunt negative";
        System.out.println(result);
    }
}
