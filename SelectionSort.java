package com.priyank;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static int max(int[] arr, int c){
        int max = arr[0];
        int index=0;
        for(int i=0;i<=c;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
    static void sort(int[] arr, int c){
        int max = max(arr,c);
        int temp=arr[max];
        arr[max]=arr[c];
        arr[c]=temp;
        c--;
        if(c>=0){
            sort(arr,c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Getting input from the User
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        sort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
