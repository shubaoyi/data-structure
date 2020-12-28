package com.byshu.sort;


public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {11, 34, 5, 454, 90, 23, 14, 78, 8, 19, 26};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = partition(arr, start, end);
            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    /**
     * 挖坑法
     */
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start, right = end;

        while (left < right) {
            while (left < right) {
                if (arr[right] < pivot) {
                    arr[left] = arr[right]; // 比pivot小的移到左边 right作为坑位
                    left++;
                    break; // 切换到从左往往右逼近
                }
                right--; // 继续从右往左逼近
            }

            while (left < right) {
                if (arr[left] > pivot) {
                    arr[right] = arr[left]; // 比pivot大的移到右边
                    right--;
                    break;
                }
                left++;
            }
        }

        arr[left] = pivot; // 此时left == right
        return left;
    }

}
