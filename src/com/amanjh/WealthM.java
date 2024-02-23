package com.amanjh;

public class WealthM {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println((maximumWealth2(accounts)));
    }
    //public static int maximumWealth(int[][] accounts) {
       // int sum = 0;
        //int max=Integer.MIN_VALUE;
       // for (int[] account : accounts) {
          //  for (int i : account) {
            //    sum += i;
           // }
       // }

       // if(sum >max){
        //    max= sum;
      //  }
       // return max;

//        int ans = Integer.MIN_VALUE;
  //      for (int[] ints : accounts) {
    //        // when you start a new row, take a new sum for that row
   //         int sum = 0;
     //       for (int anInt : ints) {
       //         sum += anInt;
         //   }
            // now we have sum of accounts of person
            // check with overall ans
          //  if (sum > ans) {
         //       ans = sum;
        //    }
      //  }
    //    return ans;
  //  }

    public static int maximumWealth2(int[][] accounts) {

        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
