package com.amanjh;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8,9,10};
        int target=6;
        int ans= binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;

        while (start <= end){
            int mid=(start+end)/2;

            if(target<arr[mid]){
                end= mid-1;
            }
            else if (target==arr[mid]) {
                return mid;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
        }

        return arr[start];
    }
}



