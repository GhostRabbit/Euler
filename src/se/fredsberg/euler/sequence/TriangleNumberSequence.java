package se.fredsberg.euler.sequence;


public class TriangleNumberSequence implements Sequence<Integer> {

    /*
     * The n:th Triangle number is the sum of 1..n.
     */
    
    int sum = 0;
    int i = 1;

    @Override
    public Integer next() {
        sum += i++;
        return sum;
    }

}
