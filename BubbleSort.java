package com.priyank;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static void sort(int[] arr, int c,int k){
        if(c<arr.length-k-1){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
                c++;
                sort(arr, c,k);
            }
            else{
                c++;
                sort(arr, c,k);}
        }
        else {
            c=0;
            k+=1;
            if(k<arr.length-1){
                sort(arr, c,k);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Getting input from the User for the array
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        sort(arr,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
