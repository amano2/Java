package com.amanjh;



public class MaxMin {
    public static void main(String[] args) {

        int[] arr={78,89,51,24,34};

        System.out.println(max(arr));
    }

    static int max(int[] A){
        int maxVal= A[0];
        for (int j : A) {
            if (j > maxVal) {
                maxVal = j;
            }

        }
        return maxVal;
    }


}
