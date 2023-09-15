package curs4;

public class OperatorTernar {

    public static void main(String[] args) {
        // ?:
        int a = 130;
        int b = 80;
        int x = (a>b) ? a: b;
        // var = conditie ? val dc conditie e true : val dc conditie e false;

        System.out.println("x = " + x);

        if (a > b){
            x = a;
        } else{
            x = b;
        }

        int num1 = 5;
        int num2 = 9;
        int num3 = 20;

        int y = (num1 > num2) ? num1 : (num2 > num3)? num2 : num3;
    }

}
