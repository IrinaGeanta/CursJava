package curs12;


public class Tester <T>{
    T age;
    public Tester(T age){
        this.age = age;
    }

    public static void main(String[] args) {
        Tester tester = new Tester(123);
    }
}
