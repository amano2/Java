package com.amanjh;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int[][] arr= new int[3][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }

        }

        for (int[] i : arr) {

            System.out.println(Arrays.toString(i));
        }


    }
}
