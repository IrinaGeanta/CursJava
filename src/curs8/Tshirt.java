package curs8;

public class Tshirt extends Product{
    private int price;
    private int vat;
    private int adaos;

    public Tshirt(int price, int vat, int adaos){
        this.price = price;
        this.vat = vat;
        this.adaos = adaos;

    }
    @Override
    public int calculatePrice(){
        return price + vat + adaos;
    }
}
