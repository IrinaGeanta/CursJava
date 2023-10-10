package curs7;

public class TestShape {
    public static void main(String[] args) {
        Square obj = new Square("patrat","galben");
        obj.printDetails();
        System.out.println(obj.nume);
        System.out.println(obj.culoare);
    }
}
