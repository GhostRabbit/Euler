package se.fredberg.euler.util;

public class TriangleNumberIterator {

    //TODO definitly a generator
    
    /*
     * The n:th Triangle number is the sum of 1..n.
     */
    
    int sum = 0;
    int i = 1;

    public int next() {
        sum += i++;
        return sum;
    }

}
