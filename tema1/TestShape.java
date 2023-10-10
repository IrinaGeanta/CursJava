package tema1;
/*
In clasa TestShape doar vom instantia in metoda main 3 obiecte
care se vor chema :
u patrat , cerc si dreptunghi
Nota:
1. In TestShape nu avem metoda de System.out.print....
2. nu avem variabile la nivel de clasa in nici una dintre clase
3. Numarul metodelor trebuie sa fie 2
4. Numarul contructorilor trebuie sa fie 3
5. Math.PI il folosim direct pentru ca face parte din clasa Math din
Java
 */
public class TestShape {
    public static void main(String[] args) {
        Shape patrat = new Shape(8);
        Shape dreptunghi = new Shape(4,2);
        Shape cerc = new Shape(3.0);
    }
}
