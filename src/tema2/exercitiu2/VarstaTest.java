package tema2.exercitiu2;

import java.util.Scanner;

public class VarstaTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Varsta varsta = new Varsta();
        varsta.varstaCategorie(varsta.askTheUser(scan));
        scan.close();
    }
}
