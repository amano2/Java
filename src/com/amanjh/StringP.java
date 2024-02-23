package com.amanjh;

public class StringP {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        if (isPalindrome(s)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] ch=s.toCharArray();
        int start=0;
        int end=ch.length-1;

        while(start<=end){
            char first=ch[start];
            char last=ch[end];
            if(!Character.isLetterOrDigit(first)){
                start++;
            }
            else if(!Character.isLetterOrDigit(last)){
                end--;
            }
            else{
                if(first != last){
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;

    }
}
