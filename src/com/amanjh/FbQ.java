package com.amanjh;

public class FbQ {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans={-1,-1};
        int start=findindex(nums,target,true);
        int end=findindex(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int findindex(int[] arr,int target,boolean firstIndex){
        int ans=-1;
        int start=0;
        int end= arr.length-1;

        while (start <= end){
            int mid=start + (end - start) / 2;

            if(target<arr[mid]){
                end= mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else  {
                ans= mid;
                if(firstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }

        return ans;
    }
}
