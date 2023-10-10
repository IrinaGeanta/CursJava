package curs5;

import java.util.Scanner;

public class SalaryCalculator {

    /*
    Facem un prg care calculeaza salariul pe o sapt
    intrebam utilizatorul cate ora a lucrat
    nu permitem overtime (max ore = 40)
    nu permitem nici ore negative sau 0 (min ore = 1)
    dc introduce nr invalid de ore, printam si il rugam sa introduca din nou
    facem asta pana nr valid de ore
    daca nr e valid calculam nrde ore *25
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the working hours: ");
        int oreLucrate = scan.nextInt();

        while (oreLucrate > 40  || oreLucrate < 1){

            System.out.println("Nr Invalid de ore");
            System.out.println("Introdu un nr intre 1 si 40: ");
            oreLucrate = scan.nextInt();

        }
        System.out.println("Salariul tau este: " + oreLucrate*25);

    }
}
