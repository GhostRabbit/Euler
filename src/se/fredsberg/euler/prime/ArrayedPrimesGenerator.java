package se.fredsberg.euler.prime;

import java.util.LinkedList;
import java.util.List;

import se.fredsberg.euler.generator.Generator;

public class ArrayedPrimesGenerator implements Generator<Integer> {

    private int x = 1;
    private List<Integer> primes = new LinkedList<Integer>();

    @Override
    public Integer next() {
        while (true) {
            x++;
            if (matches(x)) {
                primes.add(x);
                return x;
            }
        }
    }

    private boolean matches(Integer x) {
        for (int p : primes) {
            if (x % p == 0) {
                return false;
            }
        }
        return true;
    }

}
