package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalAndSumTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palAndSumCheckOne() {

        assertEquals("24342 is palindrome and sum of numbers is less than 25",PalAndSum.palAndSumCheck(24342L));
    }

    @Test
    public void palAndSumCheckTwo() {

        assertEquals("2883882 is palindrome and sum of numbers is greater than 25",PalAndSum.palAndSumCheck(2883882L));
    }
    @Test
    public void palAndSumCheckThree() {

        assertEquals("243222 is not a palindrome",PalAndSum.palAndSumCheck(243222L));
    }
}