package curs1;

/**
 * Primul program de java din training
 */
public class PrimaClasa {

    public static void main(String[] args) {
        System.out.println("test");

        PrimaClasa obiect = new PrimaClasa();
        obiect.sendMessage();
        System.out.println(obiect.afiseazaSuma());
    }

    public void sendMessage(){
        System.out.println("message");
    }

    public int afiseazaSuma(){
        int suma = 20+30;
        return suma;
    }
}
