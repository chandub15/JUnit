package com.stackroute;

public class NumSeries {

    public static int[] numSeries(int n) {
        int[] arr=new int[15];
        int i, j,k=0;
        for (i = 1; i <=n; i++) {
            for (j = 1; j <= i; j++) {
                arr[k++]=i;
            }
        }

        return arr;

    }
}
