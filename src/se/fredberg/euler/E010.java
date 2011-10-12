package se.fredberg.euler;

public class E010 {

    /*
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     * 
     * Find the sum of all the primes below two million.
     */

    /*
     * Breakpoint and x*x are tricks taken from the paper linked form problem.
     */
    
    public static void main(String[] args) {
        byte[] numbers = new byte[2000001];
        long sum = 0;
        int breakpoint = (int) Math.sqrt(20000000);
        for (int x = 2; x < numbers.length; x++) {
            if (numbers[x] == 0) {
                sum += x;
                if (x < breakpoint) {
                    int y = x * x;
                    while (y < numbers.length) {
                        numbers[y] = 1;
                        y += x;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
