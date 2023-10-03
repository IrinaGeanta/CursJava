package curs8;

public class TestProduct {
    public static void main(String[] args) {
        Shoes pantof = new Shoes(33,5);
        System.out.println(pantof.calculatePrice());
        pantof.ratingProduct();

        Tshirt tricou = new Tshirt(77,6,4);
        System.out.println(tricou.calculatePrice());
        tricou.ratingProduct();
    }
}
