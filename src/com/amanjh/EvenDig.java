package com.amanjh;

public class EvenDig {
    public static void main(String[] args) {
        int[] nums= {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }


    static int findNumbers(int[] nums){
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
            
        }
        return count;
    }

    static boolean even(int num){
        return digit(num) % 2 == 0;
    }

    static int digit(int n){
        if(n<0){
            n=n*-1;
        }
        if(n==0){
            return 1;
        }
        int c=0;
        while (n>0){
            c++;
            n=n/10;
        }
        return c;
    }
}
