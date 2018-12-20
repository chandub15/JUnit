package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStrTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseStrOne() {
        assertEquals("malayalam",ReverseStr.reverseStr("malayalam"));
    }

    @Test
    public void reverseStrTwo() {
        assertEquals("nodnol",ReverseStr.reverseStr("london"));
    }

    @Test
    public void reverseStrThree() {
        assertNotEquals("odnol",ReverseStr.reverseStr("london"));
    }
}