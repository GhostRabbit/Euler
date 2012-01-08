package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class P011Test {

    int[][] DATA = new int[3][3];

    @Test
    public void getMaxDiagonal1Product() {
        String expected = "[1, 0][0, 1] [1, 1][0, 2] [2, 0][1, 1] [2, 1][1, 2] ";
        int numbers = 2;
        String actual = "";
        for (int x = numbers - 1; x < DATA.length; x++) {
            for (int y = 0; y + numbers <= DATA.length; y++) {
                for (int offset = 0; offset < numbers; offset++) {
                    actual += ("[" + (x - offset) + ", " + (y + offset) + "]");
                }
                actual += " ";
            }
        }
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getMaxDiagonal2Product() {
        String expected = "[0, 0][1, 1] [0, 1][1, 2] [1, 0][2, 1] [1, 1][2, 2] ";
        int numbers = 2;
        String actual = "";
        for (int x = 0; x + numbers <= DATA.length; x++) {
            for (int y = 0; y + numbers <= DATA.length; y++) {
                for (int offset = 0; offset < numbers; offset++) {
                    actual += ("[" + (x + offset) + ", " + (y + offset) + "]");
                }
                actual += " ";
            }
        }
        assertThat(actual).isEqualTo(expected);
    }

}
