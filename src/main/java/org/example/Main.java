package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public int toy() {
        ArrayList<String> test = new ArrayList<>();
        test.add("foo");
        test.add("bar");
        if (test.size() > 0) {
            Iterator<String> i = test.iterator();
            i.next();
        }
        return test.size();
    }
}