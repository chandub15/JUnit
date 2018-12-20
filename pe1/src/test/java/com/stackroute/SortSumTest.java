package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSumTest {
    SortSum ss;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortSumOne() {
        int arr[]={5,4,4,3,3,2};
        int[] arr_sum=new int[6];
        arr_sum=ss.sortSum(234534);

        for(int i=0;i<6;i++)
        assertEquals(arr[i],arr_sum[i]);
    }


    @Test
    public void sortSumTwo() {
        int arr[]={5,4,4,3,2,3};
        int[] arr_sum=new int[6];
        arr_sum=ss.sortSum(234534);

        for(int i=0;i<6;i++)
            assertEquals(arr[i],arr_sum[i]);
    }

    @Test
    public void sumCheck() {
    }
}