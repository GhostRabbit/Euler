package se.fredberg.euler.util;

public class TriangleNumberIterator {

    int sum = 0;
    int i = 1;

    public int next() {
        sum += i++;
        return sum;
    }

}
