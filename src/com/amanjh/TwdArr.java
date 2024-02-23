package com.amanjh;


import java.util.Scanner;

public class TwdArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] Arr = new int[3][3];
        System.out.println("Enter the elements:");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                Arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements to be found");
        int n = sc.nextInt();
        if (search(Arr, n)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element not found");
        }

        System.out.println("The max element is:" + maxi(Arr));
    }

    static boolean search(int[][] A, int target) {
        // for (int i = 0; i < A.length; i++) {
        //   for (int j = 0; j < A[i].length; j++) {
        //     if(target==A[i][j]){
        //       return new int[]{i,j};
        // }
        // }
        // }

        for (int[] ints : A) {
            for (int anInt : ints) {
                if (target == anInt) {
                    return true;
                }
            }
        }

        return false;
    }


    static int maxi(int[][] A) {
        int max = A[0][0];
        for (int[] ints : A) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }

}


