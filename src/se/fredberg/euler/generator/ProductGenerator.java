package se.fredberg.euler.generator;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductGenerator implements LimitedGenerator<Integer> {

    private int lower;
    private int upper;
    private boolean done = false;
    private int a;
    private int b;

    public ProductGenerator(int lower, int upper) {
        if (upper < lower) {
            throw new IllegalArgumentException();
        }
        this.lower = lower;
        this.upper = upper;
        this.a = lower;
        this.b = lower;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int result = a * b;
        if (b++ == upper) {
            if (a++ == upper) {
                done = true;
            } else {
                b = a;
            }
        }
        return result;
    }

    public List<Integer> products() {
        List<Integer> results = new LinkedList<Integer>();
        for (int a = lower; a <= upper; a++) {
            for (int b = lower; b <= upper; b++) {
                System.out.println(a + "#" + b);
                results.add(a * b);
            }
        }
        done = true;
        return results;
    }

    public boolean hasNext() {
        return !done;
    }

}
