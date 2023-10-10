package tema3.exercitiu3;

import java.util.Scanner;

public class Punctaj {
    private int value;
    private void askTheUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value: ");
        value = scan.nextInt();
        scan.close();
    }

    public void calculCalificativ(){
        String result;
        askTheUser();
        result = (value > 90)? "FB":(value > 80)? "B": "S";
        System.out.println("Ai primit calificativul: " + (result.equals("FB")?"Foarte Bine.":(result.equals("B"))?"Bine.":"Suficient."));
    }
}
