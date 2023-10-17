package curs12;

public class GenericsExample {
    public static void main(String[] args) {
        printCeva("Masina");

        printGeneric("masina");
        printGeneric(123);
        printGeneric('c');
        printGeneric(120.00);
        printGeneric(3000L);
    }

//public static <T extends Number> void printGeneric(T object) <- un obiect de tip generic dar care mosteneste Number
    public static <T> void printGeneric(T object){
        System.out.println(object);
        System.out.println("Data Type pt obiect este: "+object.getClass().getName());

    }
    public static void printCeva(String text){
        System.out.println(text);
    }
}
