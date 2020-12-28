package com.byshu.sort;


public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {11, 34, 5, 454, 90, 23, 14, 78, 8, 19, 26};

        int i, j, k, min, tmp;
        for (i = 0; i < arr.length - 1; i++) {
            min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }

        for (k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "\t");
        }
    }

}
