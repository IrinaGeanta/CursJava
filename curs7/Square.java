package curs7;

public class Square extends Shape{

    public Square(String nume, String culoare) {
        super(nume, culoare);
    }
    String nume = "Cerc";
    String culoare = "Negru";

    public void printDetails(){

        System.out.println("Numele formei este: " + super.nume + " si culoarea este " + super.culoare);
    }
}
