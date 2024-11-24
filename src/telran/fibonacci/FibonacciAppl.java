package telran.fibonacci;

import telran.fibonacci.model.Fibonacci;
import telran.fibonacci.model.FibonacciIterator;

import java.util.Iterator;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);
        // print all numbers, and reduce sum
        // 1,1,2,3,5,8,13,21
        // sum = 54
        Iterator<Integer> iterator = fibonacci.iterator();
        long sum = 0;
        while (iterator.hasNext()) {
            int f = iterator.next();
            sum += f;
            System.out.println(f);
        }
        System.out.println("Summa=" + sum);
    }
}
