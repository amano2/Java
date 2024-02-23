package com.amanjh;

import java.util.Arrays;


public class Rev {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        reverse(arr);

    }

    static void reverse(int[] A){

        int start=0;
        int end=A.length-1;
        while(start<end){
            swap(A,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(A));
    }

    static void swap(int[] Arr, int ind1, int ind2){
        int temp;
        temp=Arr[ind1];
        Arr[ind1]=Arr[ind2];
        Arr[ind2]=temp;

    }

}

