package curs6;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Te rog introdu un calificativ");
        String calificativ = scan.next().toUpperCase();

        switch (calificativ){
            case "A":
                System.out.println("Felicitari!");
                break;
            case "B":
                System.out.println("Este destul de bine!");
                break;
            case "C":
                System.out.println("Suficient!");
                break;
            case "D":
                System.out.println("Insuficient!");
                break;
            default:
                System.out.println("Calificativ invalid!");
        }
        scan.close();
    }


}
