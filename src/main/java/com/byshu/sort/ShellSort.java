package com.byshu.sort;


public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {11, 34, 5, 454, 90, 23, 14, 78, 8, 19, 26};

        int i, j, k, pivot, gap;
        for (gap = arr.length / 2; gap > 0; gap /= 2) {
            for (i = gap; i < arr.length; i++) {
                pivot = arr[i];
                for (j = i; j >= gap; j -= gap) {
                    if (arr[j - gap] > pivot) {
                        arr[j] = arr[j - gap];
                    } else {
                        break;
                    }
                }
                arr[j] = pivot;
            }
        }

        for (k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "\t");
        }
    }

}
