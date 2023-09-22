package curs5;

import java.util.Scanner;

public class PasswordValidator {

    String username, password;
    Scanner scan = new Scanner(System.in);

    public void getUsername(){
        System.out.println("Introdu user: ");
        username = scan.next();
    }

    public void getPassword(){
        System.out.println("Introdu parola: ");
        password = scan.next();
    }

    public void validatePasswordRules(){
        if (password.length() < 8){

            password.

        }
    }
}
