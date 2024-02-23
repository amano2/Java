package com.amanjh;
import java.util.*;
public class Sum {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Numbers to be added: ");
        int a= sc.nextInt();
        int b= sc.nextInt();

        int sum;
        sum=a+b;

        System.out.println("The Sum of the Numbers is "+sum);
    }
}
