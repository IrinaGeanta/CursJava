package tema3.exercitiu2;

public class Comision {

    public static void main(String[] args) {
        /*int comision;
        int vanzari = 3500;
        comision = (vanzari>2500) ? vanzari*5/100 : 0;
        System.out.println("Comisionul tau este: " + comision);
        */

        int comision = 0;
        int vanzari = 3500;
        if (vanzari > 2500){
            comision = vanzari*5/100;
        }
        System.out.println("Comisionul tau este: " + comision);
    }



}
