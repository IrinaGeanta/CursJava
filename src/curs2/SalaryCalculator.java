package curs2;

public class SalaryCalculator {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Ioana",25);
        System.out.println(tester1.nume);
       // tester1.nume = "Ioana";
        System.out.println(tester1.ratePerHour);

        Tester tester2 = new Tester("Maria",35);
        System.out.println(tester2.nume);
       // tester2.nume = "Maria";
        System.out.println(tester2.ratePerHour);
    }
}
