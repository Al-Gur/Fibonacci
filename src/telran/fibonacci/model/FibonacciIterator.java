package telran.fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int quantity;
    private int i;
    private int a;
    private int b;

    public FibonacciIterator(int quantity) {
        this.quantity = quantity;
        a=0;
        b=1;
    }

    @Override
    public boolean hasNext() {
        return i < quantity;
    }

    @Override
    public Integer next() {
        int c = a + b;
        a = b;
        b = c;
        i++;
        return a;
    }

}
