package com.priyank;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int temp;
        for (int i = 0; i < n; i++) {
            temp=0;
            for (int j = 0; j < arr.length-(i+1); j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
