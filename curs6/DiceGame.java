package curs6;
/*
Facem un joc de zaruri care va avea urmatoarele reguli:
-> daca userul da in total: 2, 6, 12 -> Pierde jocul
-> daca userul da in total: 7, 11 -> Castiga jocul
-> daca usserul in total: 3 si 10 -> repeta automat aruncarea
dc da oricare alta varianta decat cele de mai sus, il intrebam dc mai vrea sa joace.
raspunsul este boolean true sau false
pt fiecare regula de mai sus, printam corespunzator
 */
public class DiceGame {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random()*6+1);
        int dice2 = (int) (Math.random()*6+1);

        int result = dice1 + dice2;

        if(result == 2 || result == 6 || result == 12){
            System.out.println("Imi pare rau ai pierdut jocul..");
        }

    }
}
