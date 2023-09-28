package tema5.exercitiu1;

import java.util.Scanner;

/*
u Scriem un program care simuleaza un program de acordat bonusuri.
u Programul primeste input de la utilizator :
u Anul de vechime in firma
u Valoarea vanzarilor efectuate
u Luna in care a efectuat vanzarile
u Daca are un an vechime atunci primeste un bonus de 100
u Daca are 2 ani vechime atunci primeste un bonus de 200
u Daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala cu
5000 atunci primeste bonus 600
u Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
vanzarile au fost efectuate in oricare din lunile 1-6 primeste bonus 800
u Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
vanzarile au fost efectuate in oricare din lunile 7-11 primeste bonus 1000
u Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
vanzarile au fost efectuate in luna 12 primeste bonus 900 si mesajul : “In
decembrie se vand singure!”
u Daca are 3 ani si valoarea vanzarilor este mai mare decat 10000 primeste
bonus 1200
 */
public class Bonusuri {

    private Scanner scan = new Scanner(System.in);
    private int vechime;
    private int valoareVanzari;
    private int lunaVanzarilorEfectuate;

    private void askTheUser(){
        System.out.println("Vechime in firma: ");
        vechime = scan.nextInt();
        System.out.println("Valoarea vanzarilor: ");
        valoareVanzari = scan.nextInt();
        System.out.println("Luna vanzarilor efectuate (1-12): ");
        lunaVanzarilorEfectuate = scan.nextInt();
    }

    public void calculateBonus(){
        askTheUser();
        switch (vechime){
            case 1:
                System.out.println("Bonusul este 100");
                break;
            case 2:
                System.out.println("Bonusul este 200");
                break;
            case 3:
                /* cu if-uri :)
                if (valoareVanzari <= 5000){
                    System.out.println("Bonusul este 600");
                } else if(valoareVanzari <= 10000){
                    if (lunaVanzarilorEfectuate > 1 && lunaVanzarilorEfectuate < 7) {
                        System.out.println("Bonusul este 800");
                    }else if (lunaVanzarilorEfectuate <= 11){
                        System.out.println("Bonusul este 1000");
                    } else { // asta in cazul in care userul pune un numar valid pana la 12 :)
                        System.out.println("Bonusul este 900. In decembrie se vand singure!");
                    }
                } else {
                    System.out.println("Bonusul este 1200.");
                }

                */
                if (valoareVanzari <= 5000){
                    System.out.println("Bonusul este 600");
                } else if(valoareVanzari <= 10000){

                    // nu prea am folosit switch in switch.. vad ca merge :)
                    switch (lunaVanzarilorEfectuate){
                        case 1, 2, 3, 4, 5, 6, 7:
                            System.out.println("Bonusul este 800");
                            break;
                        case 8, 9, 10, 11:
                            System.out.println("Bonusul este 1000");
                            break;
                        default:
                            System.out.println("Bonusul este 900. In decembrie se vand singure!");
                            break;
                    }
                } else {
                    System.out.println("Bonusul este 1200.");
                }
                break;
            default:
                System.out.println("Vechime invalida :)");
        }
    }

}
