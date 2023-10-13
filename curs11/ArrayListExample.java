package curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // lista e o colectie ordonata, mentine ordinea de inserare,
        // exista pozitie index
        // permite obiecte duplicate

        //verifica marimea listei
        System.out.println(list.size());
        //verifica dc lista e goala sau nu -> intoarce boolean
        System.out.println(list.isEmpty());
        //adauga elemente in lista
        list.add("Oana");
        list.add("Ion");
        System.out.println(list.size());
        list.add("Maria");
        list.add("Gabriel");
        System.out.println(list.size());

        for(String element : list){
            System.out.println(element);
        }
        System.out.println("------------------------------------");
        // citesc element pe baza de pozitie
        System.out.println(list.get(3));

        System.out.println("------------------------------------");
        System.out.println(list.indexOf("Maria"));

        System.out.println("------------------------------------");
        for (String nume : list){
            System.out.println(list.indexOf(nume) + " : " + nume);
        }
        //adaug un element cu index
        list.add(0, "Ioana");


        System.out.println(list);
        list.add("Oana");
        System.out.println(list);

        //remove obiect din lista
        list.remove(5);
        System.out.println("------------------------------------");
        for (String nume : list){
            System.out.println(list.indexOf(nume) + " : " + nume);
        }
        //sterge toata lista
        list.clear();
        System.out.println(list.size());
    }
}
