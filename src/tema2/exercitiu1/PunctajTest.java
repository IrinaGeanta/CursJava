package tema2.exercitiu1;
/*
Scriem un program care intreaba utilizatorul punctajul unui test.
u Daca utilizatorul introduce o valoare intre 0 si 65 atunci printeaza ”Ai
picat. Mai incearca”
u Daca utilizatorul introduce o valoare mai mare sau egala cu 66
atunci printeaza ”Felicitari, Ai trecut”
 */
import java.util.Scanner;

public class PunctajTest {
    public int askTheUser(Scanner scan){
        System.out.println("Introduceti punctajul testului: ");
        return scan.nextInt();
    }
    public void punctajulTestului(int punctaj){
        if ((punctaj < 66) && (punctaj > 0)) {
            System.out.println("Ai picat. Mai incearca!");
        } else if (punctaj >= 66){
            System.out.println("Felicitari, Ai trecut");
        } else {
            System.out.println("Introduce o valoare pozitiva!");
        }
    }
}
