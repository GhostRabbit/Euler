package se.fredberg.euler;

public class E010 {

    /*
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     * 
     * Find the sum of all the primes below two million.
     */

    public static void main(String[] args) {
        byte[] numbers = new byte[2000001];
        long sum = 0;
        for (int x = 2; x < numbers.length; x++) {
            if (numbers[x] == 0) {
                sum += x;
                int y = x;
                while (y < numbers.length) {
                    numbers[y] = 1;
                    y += x;
                }
            }
        }
        System.out.println(sum);
    }
}
