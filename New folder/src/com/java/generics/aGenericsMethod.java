package com.java.generics;

public class aGenericsMethod {

    /**
     * generic method
     * E represents generic type (can be any letter)
     * if more than 1 type is used you can use like < T, E >
     * when using generics, only non primitive data types should be used
     * there for parameters are passed as objects, so printf should be used
     */
    public <E> void printArray( E[] arr){
        for( E element : arr){
//            System.out.println(element);
            //above cannot be used
            System.out.printf("%s \n",element);
        }
    }

    public static void main(String[] args){

//        int[] intArray = {1,2,3};
//        char[] charArray = {'a', 'b'};

        Integer[] intArray = {1,2,3};
        //should be "" not ''
        String[] charArray = {"a", "b"};

        aGenericsMethod withGenerics = new aGenericsMethod();
        withGenerics.printArray(intArray);
        withGenerics.printArray(charArray);
    }
}
