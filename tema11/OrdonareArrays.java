package tema11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdonareArrays {


    public <T> void ordonare(T[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public <T> void ordonare2(T[] array){
        List<T> lista = new ArrayList<>();
        for(T element : array){
            lista.add(element);
        }
        lista.sort(null);
        System.out.println(lista);
    }

    public static void main(String[] args) {
        OrdonareArrays obj = new OrdonareArrays();

        String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
        Integer[] intArray = {100, 500, 300, 400, 200};
        Character[] charArray = {'a', 'b', 'd', 'c'};

        obj.ordonare(textArray);
        obj.ordonare(intArray);
        obj.ordonare(charArray);


        obj.ordonare2(textArray);
        obj.ordonare2(intArray);
        obj.ordonare2(charArray);


    }
}
