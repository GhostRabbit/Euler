package se.fredberg.euler.prime;

import java.util.ArrayList;
import java.util.List;


public class Primes {

    public static List<Integer> getAllPrimesLessThen(int limit) {
        Generator primes = new ArrayedPrimesGenerator();
        int c = 0;
        try {
            List<Integer> primesList = new ArrayList<Integer>(limit / 5);
            while (true) {
                c++;
                int prime = primes.next();
                if (prime > limit) {
                    return primesList;
                }
                primesList.add(prime);
            }
        } catch (StackOverflowError e) {
            System.out.println("Error after " + c + " iterations.");
        }
        return null;
    }
    

    public static int getPrimeNumber(int number) {
        Generator primes = new ArrayedPrimesGenerator();
        int c = 0;
        try {
            while (true) {
                c++;
                int prime = primes.next();
                if (c == number) {
                    return prime;
                }
            }
        } catch (StackOverflowError e) {
            System.out.println("Error after " + c + " iterations.");
        }
        return -1;
    }
    
}
