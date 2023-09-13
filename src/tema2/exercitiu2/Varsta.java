package tema2.exercitiu2;
 /*
 Scriem un program care intreaba utilizatorul ce varsta are.
u Daca utilizatorul introduce o valoare sub 18 , printeaza ”Esti minor”
u Daca utilizatorul introduce o valoare intre 18 si 65, printeaza ”Esti
adult”
u Daca utilizatorul introduce o valoare peste 65 , printeaza ”Esti
batran”
  */
import java.util.Scanner;

public class Varsta {
    public int askTheUser(Scanner scan){
        System.out.println("Introduceti varsta: ");
        return scan.nextInt();
    }

    public void varstaCategorie(int varsta){
        if ((varsta >= 0) && (varsta < 18)){
            System.out.println("Esti minor");
        } else if((varsta >= 18) && (varsta < 65)){
            System.out.println("Esti adult");
        } else if (varsta >= 65) {
            System.out.println("Esti batran");
        } else {
            System.out.println("Ai introdus o valoare negativa!");
        }
    }


}
