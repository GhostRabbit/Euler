package se.fredberg.euler;


public class E010 {

    /*
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     * 
     * Find the sum of all the primes below two million.
     */

    public static void main(String[] args) {
        int[] numbers = new int[2000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        long sum = 0;
        for (int x = 2; x < numbers.length; x++) {
            if (numbers[x] != 0) {
                sum += x;
                int y = x;
                while (y < numbers.length) {
                    numbers[y] = 0;
                    y += x;
                }
            }
        }
        System.out.println(sum);
    }
}
