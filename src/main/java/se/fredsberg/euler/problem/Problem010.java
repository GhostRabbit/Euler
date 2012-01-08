package se.fredsberg.euler.problem;


public class Problem010 implements Problem {

    private static final byte IS_PRIME = 0;
    private static final byte NOT_PRIME = 1;

    /**
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     * 
     * Find the sum of all the primes below two million.
     */

    /*
     * Breakpoint and x*x are tricks taken from the paper linked from problem.
     * 
     * 2 is handled special by starting sum at 2, and skipping forward with steps of 3
     * 
     * It is possible to fold the array around 2 by calculating indexes, but I did not gain any performance by doing so.
     */
    
    @Override
    public long solve() {
        byte[] numbers = new byte[2000001];
        long sum = 2;
        int breakpoint = (int) Math.sqrt(20000000);
        for (int x = 3; x < numbers.length; x += 2) {
            if (numbers[x] == IS_PRIME) {
                sum += x;
                if (x < breakpoint) {
                    strikeOutMultiplesOf(numbers, x);
                }
            }
        }
        return sum;
    }

    private void strikeOutMultiplesOf(byte[] numbers, int x) {
        int y = x * x;
        while (y < numbers.length) {
            numbers[y] = NOT_PRIME;
            y += x;
        }
    }
 }
