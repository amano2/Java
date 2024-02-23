package com.amanjh;

import java.util.Scanner;

public class Arms {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        if(isArmstrong(n)){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not");
        }
    }

    static boolean isArmstrong(int num){
        int ognum=num;
        int armNum=0;
        while(num!=0){
            int digit =num%10;
            armNum+=digit*digit*digit;
            num/=10;
        }
        return ognum==armNum;
    }
}
