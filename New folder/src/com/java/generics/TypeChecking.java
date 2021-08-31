package com.java.generics;

import java.util.ArrayList;

public class TypeChecking {

    public static void main(String[] args){

        //an array list without type checking
//      ArrayList arrListObj = new ArrayList<>();

        //now compiler/ide knows no others types are accepted
        ArrayList<Integer> arrListObj = new ArrayList<>();
        arrListObj.add(1);
//        arrListObj.add("Nami");

        int sum = 0;

        for(Object o: arrListObj){
            sum += Integer.parseInt(o.toString());
        }

        System.out.println(sum);
    }
}
