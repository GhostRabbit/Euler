package se.fredsberg.euler.util;

import java.util.LinkedList;
import java.util.List;

public class Strings {
    
    public List<Integer> string2int(String string) {
        List<Integer> data = new LinkedList<Integer>();
        for (byte b : string.getBytes()) {
            data.add(b - '0');
        }
        return data;
    }
}
