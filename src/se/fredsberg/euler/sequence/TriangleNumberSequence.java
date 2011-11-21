package se.fredsberg.euler.sequence;


public class TriangleNumberSequence implements Sequence<Long> {

    /*
     * The n:th Triangle number is the sum of 1..n.
     */
    
    long sum = 0;
    int i = 1;

    @Override
    public Long next() {
        sum += i++;
        return sum;
    }

}
