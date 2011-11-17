package se.fredsberg.euler.util;

import se.fredsberg.euler.generator.Generator;
import se.fredsberg.euler.matcher.Matcher;

public class FindLooper {

    private final Generator<Integer> generator;
    private final Matcher<Integer> matcher;

    public FindLooper(Matcher<Integer> matcher, Generator<Integer> generator) {
        this.matcher = matcher;
        this.generator = generator;
    }

    public Integer finds() {
        while (true) {
            Integer x = generator.next();
            if (matcher.matches(x)) {
                return x;
            }
        }
    }

}
