package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void numReverseOne() {
        p=new Palindrome();
        assertEquals(121L,p.numReverse(121));

    }


    @Test
    public void numReverseTwo() {
        p=new Palindrome();
        assertEquals(1002L,p.numReverse(2001L));

    }
}