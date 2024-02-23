package com.amanjh;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }

    static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        else{
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
}
