package curs5;

public class DoWhileExample {
    public static void main(String[] args) {
        String [] array = {"Rosu", "Galben", "Verde", "Negru"};

        int i = 0;
        do{
            System.out.println(array[i]);
            i++;
        } while (i < array.length);

        int j = 0;
        while (j< array.length){
            System.out.println(array[j]);
            j++;
        }


    }
}
