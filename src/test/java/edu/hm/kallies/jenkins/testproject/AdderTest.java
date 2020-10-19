package edu.hm.kallies.jenkins.testproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AdderTest {
    @Test
    public void testCarryOut() {
        assertEquals(3, new Adder().carryOUt(2, 1));
    }

    @Test
    public void testFail() {
        fail();
    }
}
