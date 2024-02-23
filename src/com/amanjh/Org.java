package com.amanjh;

public class Org {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int target=1;
        int ans= binaryOSearch(arr,target);
        System.out.println("Element found at Index: "+ans);
    }

    static int binaryOSearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

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
