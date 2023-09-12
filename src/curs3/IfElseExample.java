package curs3;

import java.util.Scanner;

public class IfElseExample {

    /* Simulam un login
    daca credentialele sunt corecte printam login successful
    daca nu sunt printam username sau parola sunt gresite
     */
    public static void main(String[] args) {

        String username = "Test";
        int password = 1234;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert username: ");
        String user = scan.next();
        System.out.println("Please insert password: ");
        int pass = scan.nextInt();

        if ((username.equals(user)) && (password == pass)){
            System.out.println("Login successful");
        }else {
            System.out.println("Username or password is wrong");
        }
        scan.close();
    }
}
