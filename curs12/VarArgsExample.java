package curs12;

public class VarArgsExample {

    /*
    JavaScriptExecutor
    executeStript("script JS");
    executeStript("script JS", element);
    executeStript("script JS", element, element2);
    executeStript("script JS", element, element2 ...n);
     */
    public static void main(String[] args) {
        printCeva();
        printCeva("Unu");
        printCeva("Unu","Doi");
        printCeva("Unu","Doi", "Trei");

    }

   /* public static void printCeva(String a, String b){
        System.out.println(a+b);
    }*/

    public static void printCeva(String... values){
        for(String element : values){
            System.out.println(element);
        }
    }

    public static void printAltceva(int nr, boolean ceva, int... numbers){

    }
}
