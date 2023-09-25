package tema4.exercitiu2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonacci {

    public int[] fibonacciWithFor(int value){
        int[] fibonacciArray = new int[value];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i =2; i<fibonacciArray.length; i++){
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
        }
        return fibonacciArray;
    }

    public int[] fibonacciWithWhile(int value){
        int[] fibonacciArray = new int[value];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        int i = 2;
        while (i<fibonacciArray.length){
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
            i++;
        }
        return fibonacciArray;
    }

    public void printFibonacciArray (int[] array){
        System.out.println("Fibonacci: " + Arrays.toString(array));
    }
}
