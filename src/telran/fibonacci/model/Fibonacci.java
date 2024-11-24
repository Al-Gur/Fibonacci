package telran.fibonacci.model;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {
    private int quantity;
    int[] arr;

    public Fibonacci(int quantity) {
        this.quantity = quantity;
        arr = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            arr[i] = i < 2 ? 1 : arr[i - 1] + arr[i - 2];
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Iterator<Integer> iterator() {
        // TODO implements Iterator
        return new FibonacciIterator(quantity, arr);
    }
}
