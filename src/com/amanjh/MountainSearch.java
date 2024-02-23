package com.amanjh;

public class MountainSearch {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,3,1};
        int target=1;
        System.out.println(Peak(array,target));
    }
    static int Peak(int[] a,int target){
        int peak=peakIndexInMountainArray(a);
        int first=binaryOSearch(a,target,0,peak);
        if(first!=-1){
            return first;
        }
        else{
            return binaryOSearch(a,target,peak+1,a.length-1);
        }
    }

    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int binaryOSearch(int[] arr,int target,int start,int end){


        while(start<=end){

            int mid=(start+end)/2;

            boolean isAc= arr[start]<arr[end];

            if(target==arr[mid]){
                return mid;
            }
            if(isAc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if (target>arr[mid]) {
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if (target<arr[mid]) {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
