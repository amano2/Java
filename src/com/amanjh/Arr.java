package com.amanjh;

import java.util.Scanner;

public class Arr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] Arr = new int[5];
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < 5; i++) {

            int n=sc.nextInt();
            Arr[i]=n;

        }

        System.out.println("The Array is:");
        for (int i = 0; i < 5; i++) {

            System.out.print(Arr[i]+" ");

        }
    }
}
