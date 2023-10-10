package tema2.exercitiu1;

import java.util.Scanner;

public class PunctajTestTestare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PunctajTest test = new PunctajTest();

        test.punctajulTestului(test.askTheUser(scan));
        scan.close(); // nu m-am lasat pana n-am scos scanneru in afara, acum .. nu stiu daca e mai bine sau nu?
    }
}
