package com.amanjh;

import java.util.ArrayList;

import java.util.Scanner;

public class Arrlist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc  =new Scanner(System.in);
       // list.add(36);
       // list.add(78);
       // list.add(99);
       // list.add(59);
       //  list.add(20);
        for (int i = 0; i < 5; i++) {

            list.add(sc.nextInt());

        }

        //for (int i =0 ; i<5; i++) {
          //  System.out.println(list.get(i)+" ");
        //}

        System.out.println(list);
    }
}