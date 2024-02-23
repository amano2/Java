package com.amanjh;

import java.util.Arrays;
import java.util.Scanner;

public class SLinear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String arr=sc.next();
        char n=sc.next().charAt(0);
        boolean ans=LinearS(arr,n);

        System.out.println(ans);
        System.out.println(Arrays.toString(arr.toCharArray()));
    }

    static boolean LinearS(String str, char target){

          //  if(target == str.charAt(i)){
            //    return true;
            //}
        //}
         for(char ch : str.toCharArray()){
             if(ch==target){
                 return true;
             }
         }

        return false;

    }
}
