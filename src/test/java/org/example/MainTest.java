package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMain() {
        Main m = new Main();
        assertEquals(m.toy(), 2);
    }

}
