package se.fredberg.euler;

public class E005 {
    /*
     * 2520 is the smallest number that can be divided by each of the numbers
     * from 1 to 10 without any remainder.
     * 
     * What is the smallest positive number that is evenly divisible by all of
     * the numbers from 1 to 20?
     */

    public static void main(String[] args) {
        int i = 1;
        while (true) {
            if (divisable(i, 20)) {
                System.out.println(i);
                return;
            }
            i++;
        }
    }

    private static boolean divisable(int i, int j) {
        for (int k = 1; k <= j; k++) {
            if (i % k != 0) {
                return false;
            }
        }
        return true;
    }
}
