package tema4.exercitiu2;

public class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        fibo.printFibonacciArray(fibo.fibonacciWithFor(9));
        System.out.println("----------------------------");
        fibo.printFibonacciArray(fibo.fibonacciWithWhile(9));
    }
}
