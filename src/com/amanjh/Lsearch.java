package com.amanjh;

import java.util.Scanner;
public class Lsearch {
    public static void main(String[] args) {

        int[] Arr=new int[10];

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < Arr.length; i++) {
            Arr[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        System.out.println(Linear(Arr,n));
    }

     static int Linear(int[] arr,int target){


        //for (int i : arr) {
          //  if (i == target) {
            //    return i;
            //}
        //}
        //return -1;

         for (int index = 0; index < arr.length; index++) {
             int element=arr[index];
             if(element==target){
                 return index;
             }

         }

        return -1;

    }


}
