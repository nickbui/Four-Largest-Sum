package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int arr[] = new int[8];
        arr[0] = 20;
        arr[1] = 3;
        arr[2] = 500;
        arr[3] = -60;
        arr[4] = 1;
        arr[5] = 10;
        arr[6] = -40;
        arr[7] = 50;

        System.out.println(sum(arr));
    }

    public static int sum(int arr[]) {
        int sumOfArr = 0;
        if (arr.length == 4) {
            for (int i = 0; i < arr.length; i++) {
                sumOfArr = sumOfArr + arr[i];
            }
        } else if (arr.length > 4) {
            Arrays.sort(arr);
            for (int i = arr.length - 1; i > arr.length - 5; i--) {
                sumOfArr = sumOfArr + arr[i];
                System.out.println(arr[i]);
            }
        } else {
            return -1;
        }
        return sumOfArr;
    }
}
