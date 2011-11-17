package se.fredsberg.euler;

public class E006 {
    
    /**
     * The sum of the squares of the first ten natural numbers is,
     * 
     * 1***2 + 2**2 + ... + 10**2 = 385 The square of the sum of the first ten
     * natural numbers is,
     * 
     * (1 + 2 + ... + 10)**2 = 552 = 3025 Hence the difference between the sum
     * of the squares of the first ten natural numbers and the square of the sum
     * is 3025-385 = 2640.
     * 
     * Find the difference between the sum of the squares of the first one
     * hundred natural numbers and the square of the sum.
     */

    public static void main(String[] args) {
        int x = 100;
        long a = sumOfSquares(1, x);
        long b = squareOfSum(1, x);
        System.out.println(b - a);
    }

    private static long squareOfSum(int from, int x) {
        long sum = 0;
        for (int i = from; i <= x; i++) {
            sum += i;
        }
        return sum * sum;
    }

    private static long sumOfSquares(int from, int to) {
        long sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i * i;
        }
        return sum;
    }
}
