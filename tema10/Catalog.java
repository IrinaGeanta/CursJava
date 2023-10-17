package tema10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {
    Map<String, Integer> map = new HashMap<>();

    public void updateNota(String nume, Integer nota){
        if (nota <= map.get(nume)){
            System.out.println("Nu ai nevoie de alta nota!");
        } else {
            map.replace(nume, nota);
        }
    }

    public void addNota(String nume, Integer nota){
        map.put(nume, nota);
        System.out.println("Nu aveai nota, ti-am trecut acum!");
    }

    public void printCatalog(){
        System.out.println(map);
    }

}
