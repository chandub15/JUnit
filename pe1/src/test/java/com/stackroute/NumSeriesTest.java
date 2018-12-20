package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class NumSeriesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void numSeriesTypeOne() {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        int[] arr_test;
        arr_test= NumSeries.numSeries(5);
        for (int i = 0; i <15; i++) {
            assertEquals(arr[i], arr_test[i]);
        }

    }

    @Test
    public void numSeriesTypeTwo() {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int[] arr_test;
        arr_test= NumSeries.numSeries(4);
        for (int i = 0; i <10; i++) {
            assertEquals(arr[i], arr_test[i]);
        }

    }

    @Test
    public void numSeriesTypeThree() {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4,5};
        int[] arr_test;
        arr_test= NumSeries.numSeries(4);
        for (int i = 0; i <10; i++) {
            assertNotEquals(arr[i], arr_test[i]);
        }

    }

}
