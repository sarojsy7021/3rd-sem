package com.arrayDemo;

import java.util.Arrays;

public class ArrayExample {
    int[] arr = new int[2];
    void printExample(){
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[2];
        arr1[0] = 3;
        arr1[1] = 4;
        System.out.println(Arrays.toString(arr1));
        int fal = arr.length;        //determines length of firstArray
        int sal = arr1.length;
        int[] mergedArray = new int[fal+sal];
        System.arraycopy(arr, 0, mergedArray, 0, fal);
        System.arraycopy(arr1, 0, mergedArray, fal, sal);
        System.out.println(Arrays.toString(mergedArray));
    }

    void testIterator(){
        int j = arr.length;
        for (int i = 0; i < j; i++) {
            System.out.println("Elements are " + arr[i]);
        }
    }
}
