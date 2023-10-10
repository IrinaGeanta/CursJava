package curs3;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    /*
    Facem un program care verifica care dintre 3 numere date de utilizator este cel mai mare
    Printam numarul cel mai mare
    Daca doua numere sunt egale cu valorile cele mai mari printam some numbers are equal
     */

    int nr1, nr2, nr3;
    public void askTheUserForNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        nr1 = scan.nextInt();
        System.out.println("Enter number 2");
        nr2 = scan.nextInt();
        System.out.println("Enter number 3");
        nr3 = scan.nextInt();
        scan.close();
    }

    public void checkTheGreatestNumber(){
        if ((nr1 > nr2) && (nr1 > nr3)){
            System.out.println("Nr1 is the greatest");
        } else if  ((nr2 > nr1) && (nr2 > nr3)){
            System.out.println("Nr2 is the greatest");
        } else if ((nr3 > nr1) && (nr3 > nr2)){
            System.out.println("Nr3 is the greatest");
        } else {
            System.out.println("Somme numbers are equal");
        }
    }

}
