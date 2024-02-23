package com.amanjh;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDdArrlist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array Initialization
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //Array Initialization

        //Adding Array Elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        //Adding Array Elements


        System.out.println(list);

    }
}
