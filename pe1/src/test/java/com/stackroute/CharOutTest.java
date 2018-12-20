package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharOutTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void charCheck() {
        assertEquals("Capital",CharOut.charCheck('C'));
        assertEquals("LowerCase",CharOut.charCheck('c'));
        assertEquals("Digit",CharOut.charCheck('6'));
        assertEquals("Special Symbol",CharOut.charCheck('.'));
    }
}