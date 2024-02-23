package com.amanjh;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {

            a[i]=scan.nextInt();

        }

    //    for (int j : a) {
    //        System.out.println(j);
    //    }


        System.out.println(Arrays.toString(a));
    }
}

