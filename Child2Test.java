package com.demo2;

import static org.junit.Assert.*;
import org.junit.Test;

public class Child2Test {
    @Test
    public void testSum(){
        assertEquals(4,Child2.sum(2,2));
        assertEquals(10,Child2.sum(5,5));
        //assertEquals(1,Child2.sum(5,5));
    }
}
