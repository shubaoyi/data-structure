package com.byshu.sort;


public class DirectInsertSort {

    public static void main(String[] args) {
        int[] arr = {11, 34, 5, 454, 90, 23, 14, 78, 8, 19, 26};

        int i, j, k, pivot;
        for (i = 1; i < arr.length; i++) {
            pivot = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > pivot) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            arr[j] = pivot;
        }

        for (k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "\t");
        }
    }

}
