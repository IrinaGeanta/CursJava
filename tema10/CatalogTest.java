package tema10;

import java.util.Scanner;

public class CatalogTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Catalog catalog = new Catalog();

        catalog.map.put("Irina", 7);
        catalog.map.put("Elena", 8);
        catalog.map.put("Maria", 9);
        catalog.map.put("Ionela", 10);

        System.out.println("Introduceti nume: ");
        String nume = scan.next();

        System.out.println("Nota: ");
        int nota = scan.nextInt();
        if (nota <= 0 || nota > 10){
            System.out.println("Introduceti o nota intre 1 si 10");
            nota = scan.nextInt();
        }
        scan.close();

        if (catalog.map.containsKey(nume)){
            catalog.updateNota(nume, nota);
        } else {
            catalog.addNota(nume, nota);
        }

        catalog.printCatalog();
    }
}
