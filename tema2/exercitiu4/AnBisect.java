package tema2.exercitiu4;

import java.util.Scanner;

/*
u Scriem un program care verifica daca un an este bisect
u Intrebam userul un an
u Daca anul este bisect printam : “Anul introdus este un an bisect”
u Daca nu este printam: “Anul introdus nu este un an bisect”

u Algoritmul anului bisect.
u Fiecare an care este divizibil cu 4 este an bisect, mai puțin cei care sunt
divizibili cu 100, dar și aceștia dacă sunt divizibili cu 400 atunci sunt ani
bisecți:
u 1) Un an bisect e divizibil cu 4 (se împarte fără rest la 4)
u 2) Însă dacă e divizibil cu 100 (se împarte fără rest la 100) atunci nu e an
bisect
u 3) Dar chiar și în cazul pasului de mai sus, dacă anul e divizibil și cu 400
(se împarte fără rest la 400), atunci e an bisect
 */
public class AnBisect {
    public int askTheUser(){
        System.out.println("Te rog sa introduci un an: ");
        try(Scanner scan = new Scanner(System.in);){
            return scan.nextInt();
        }
    }

    public void anBisect(int an){
        if ((an % 4 == 0) && (!(an % 100 == 0)) || (an % 100 == 0 && an % 400 == 0)){
            System.out.println("Anul este bisect.");
        } else System.out.println("Anul nu este bisect.");
    }
}
