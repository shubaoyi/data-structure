package com.byshu.sort;


public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {11, 34, 5, 454, 90, 23, 14, 78, 8, 19, 26};
        sort(0, arr.length - 1, arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void sort(int low, int high, int[] arr) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(low, mid, arr);
            sort(mid + 1, high, arr);
            merge(low, mid, high, arr);
        }
    }

    public static void merge(int low, int mid, int high, int[] arr) {
        int[] tmp = new int[high - low + 1];
        int i = 0, left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tmp[i++] = arr[left++];
            } else {
                tmp[i++] = arr[right++];
            }
        }

        while (left <= mid) {
            tmp[i++] = arr[left++];
        }

        while (right <= high) {
            tmp[i++] = arr[right++];
        }

        for (int j = 0; j < tmp.length; j++) {
            arr[j + low] = tmp[j];
        }
    }

}
