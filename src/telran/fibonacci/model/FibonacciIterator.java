package telran.fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int quantity;
    private int i;
    private int[] arr;

    public FibonacciIterator(int quantity, int[] arr) {
        this.quantity = quantity;
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return i < quantity;
    }

    @Override
    public Integer next() {
        return arr[i++];
    }

}
