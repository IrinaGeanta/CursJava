package curs4;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("----POST");
        System.out.println("val lui num inainte de increment: "+ num);
        System.out.println("val lui num in post increment" + num++);
        System.out.println("val lui num dupa increment" + num);

        System.out.println("----PRE");
        System.out.println("val lui num inainte de increment: "+ num);
        System.out.println("val lui num in post increment" + ++num);
        System.out.println("val lui num dupa increment" + num);





    }
}
