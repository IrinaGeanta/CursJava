package curs3;

import java.util.Scanner;

public class ParSauImpar {
   /* int number;
    public void askTheUser(){
        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();
    }
*/

    public int askTheUser(){
        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public void checkNrIsOddOrEven(){
        if ((askTheUser()) % 2 == 0){
            System.out.println("Number is even");
        } else{
            System.out.println("Number is odd");
        }
    }

}
