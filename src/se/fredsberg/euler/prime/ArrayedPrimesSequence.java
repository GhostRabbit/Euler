package se.fredsberg.euler.prime;

import java.util.LinkedList;
import java.util.List;

import se.fredsberg.euler.sequence.Sequence;

public class ArrayedPrimesSequence implements Sequence<Integer> {

    private int x = 1;
    private List<Integer> primes = new LinkedList<Integer>();

    @Override
    public Integer next() {
        while (true) {
            x++;
            if (isPrime(x)) {
                primes.add(x);
                return x;
            }
        }
    }

    private boolean isPrime(Integer x) {
        for (int p : primes) {
            if (x % p == 0) {
                return false;
            }
        }
        return true;
    }

}
