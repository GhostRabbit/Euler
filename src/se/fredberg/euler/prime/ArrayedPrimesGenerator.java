package se.fredberg.euler.prime;

import java.util.LinkedList;
import java.util.List;

public class ArrayedPrimesGenerator implements Generator {

    private int x = 1;
    private List<Integer> primes = new LinkedList<Integer>();

    @Override
    public int next() {
        while (true) {
            x++;
            if (isPrime(x)) {
                primes.add(x);
                return x;
            }
        }
    }

    private boolean isPrime(int x) {
        for (int p : primes) {
            if (x % p == 0) {
                return false;
            }
        }
        return true;
    }

}
