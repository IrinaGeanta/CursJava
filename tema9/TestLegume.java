package tema9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class TestLegume {
    public static void main(String[] args) {

        Legume legume = new Legume();
        legume.writePropertiesFile();

        boolean flag = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ce leguma doriti sa cumparati?");


        do{
            flag = false;

            String leguma = scan.next().toLowerCase();

            switch (leguma){
                case "broccoli":
                    legume.readPropertiesFile("broccoli");
                    break;
                case "conopida":
                    legume.readPropertiesFile("conopida");
                    break;
                case "pastarnac":
                    legume.readPropertiesFile("pastarnac");
                    break;
                case "spanac":
                    legume.readPropertiesFile("spanac");
                    break;
                case "varza":
                    legume.readPropertiesFile("varza");
                    break;

                default:
                    System.out.println("Nu vindem aceasta leguma.");
                    System.out.println("Alegeti alta leguma!");
                    flag = true;
            }

        }while(flag);

    }


}
