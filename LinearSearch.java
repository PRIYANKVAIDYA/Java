package com.priyank;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int[] arr, int n, int k) {
        while (k < arr.length) {
            if (arr[k] == n) {
                return k;
            } else {
                return search(arr, n, k + 1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int ele = sc.nextInt();
        System.out.println("Element found at index " +  search(arr, ele,0));

    }
}

