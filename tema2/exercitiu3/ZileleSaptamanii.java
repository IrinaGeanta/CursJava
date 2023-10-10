package tema2.exercitiu3;

import java.util.Scanner;

/*
Scriem un program care intreaba utilizatorul ce zi este astazi.
u Utilizatorul trebuie sa introduca un numar de la 1 -7
u Daca introduce zero – printam “Te rog sa introduci un numar mai
mare ca 0”
u Daca introduce 1 – printam “Astazi este luni”
u Daca introuce 2 – Printam ”Astazi este marti”
u Si tot asa pana duminica
u Daca introduce un numar mai mare ca 7 printam : ”Saptamana are
doar 7 zile te rog sa introduci un numar valid”
 */
public class ZileleSaptamanii {
    public int askTheUser(){
        System.out.println("Te rog sa introduci un numar intre 1 si 7: ");
        try(Scanner scan = new Scanner(System.in);){
            return scan.nextInt();
        }
    }

    public void zileDinSaptamana(){
        switch (askTheUser()){
            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            case 6:
                System.out.println("Astazi este sambata");
                break;
            case 7:
                System.out.println("Astazi este duminica");
                break;
            default:
                System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid");
                break;
        }


    }
}
