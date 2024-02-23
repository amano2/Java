package com.amanjh;

public class Infinity {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};
        int target=90;

        System.out.println(findingRanger(arr,target));
    }

    static int findingRanger(int[] arr, int target){
        int start=0;
        int end= 1;
        while (target>arr[end]){
            int newS= end+1;
            end=end+(end-start+1)*2;
            start=newS;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start, int end){

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

        return -1;
    }
}
