package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Case 4 number array
        int arrFour[] = new int[4];
        arrFour[0] = 1;
        arrFour[1] = 1;
        arrFour[2] = 1;
        arrFour[3] = -5;
        System.out.println("Case 1- 4 number array : Sum = " + sum(arrFour));

        // Case more than 4 numbers in array
        int arrBig[] = new int[8];
        arrBig[0] = 20;
        arrBig[1] = 3;
        arrBig[2] = 500;
        arrBig[3] = -60;
        arrBig[4] = 1;
        arrBig[5] = 10;
        arrBig[6] = -40;
        arrBig[7] = 50;
        System.out.println("Case 2- More than 4 number array : Sum = " + sum(arrBig));

        // Case less than 4 numbers in array
        int arrSmall[] = new int[3];
        arrSmall[0] = 4;
        arrSmall[1] = 400;
        arrSmall[2] = 500;
        System.out.println("Case 3- Less than 4 number array : Sum = " + sum(arrSmall));
    }

    public static int sum(int arr[]) {
        int sumOfArr = 0;
        //If the array only has 4 numbers
        if (arr.length == 4) {
            for (int i = 0; i < arr.length; i++) {
                sumOfArr = sumOfArr + arr[i];
            }
        //If the array has more than 4 numbers
        } else if (arr.length > 4) {
            Arrays.sort(arr);
            for (int i = arr.length - 1; i > arr.length - 5; i--) {
                sumOfArr = sumOfArr + arr[i];
            }
        } else {
            return -1;
        }
        return sumOfArr;
    }
}
