package curs5;

import java.util.Scanner;

public class ForVersusWhile {
    /*
    Facem un prg care cere numere de la tastatura, si le inmulteste cu 10
    face asta, pana cand userul introduce 0.
    Cand userul a introdus 0, atunci oprim programul.
     */

    public void rezolvareCuFor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        for(int nr = scan.nextByte(); nr != 0; nr = scan.nextInt()){
            System.out.println(nr*10);
            System.out.println("Please enter a number: ");

        }
        scan.close();

    }

    public void rezolvareCuFor2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        for (;;){
            int nr = scan.nextInt();
            if (nr == 0){
                break;
            }
            System.out.println(nr*10);
            System.out.println("Please enter a number: ");

        }
        scan.close();

    }

    public void rezolvareCuWhile(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int nr = scan.nextInt();

        while (nr != 0){
            System.out.println(nr*10);
            System.out.println("Please enter a number: ");
            nr = scan.nextInt();
        }
    }
}
