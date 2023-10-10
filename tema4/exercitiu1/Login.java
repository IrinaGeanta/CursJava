package tema4.exercitiu1;

import java.util.Scanner;

public class Login {

    private Scanner scan = new Scanner(System.in);

    private String getUsername (){
        System.out.println("Please enter username: ");
        String username = scan.next();
        return username;
    }

    private boolean validateUsername (String username){
        if (getUsername().equals(username)){
            return true;
        }
        return false;
    }

    private String getPassword(){
        System.out.println("Please enter password: ");
        String password = scan.next();
        return password;
    }

    private boolean validatePassword (String password){
        if (getPassword().equals(password)){
            return true;
        }
        return false;
    }

    public void validateUsernameAndPassword(String username, String password){
        boolean flag = false;
        int counter = 0;
        do{
            flag = validateUsername(username) & validatePassword(password);

            if (!flag){
                System.out.println("Login Error!");
            }
            else {
                System.out.println("Login Successful!");
                scan.close();
                return;
            }
            counter++;
        }
        while(!flag && counter < 3);
        System.out.println("Maximum attempts reached. User blocked.");
        scan.close();
    }

}
