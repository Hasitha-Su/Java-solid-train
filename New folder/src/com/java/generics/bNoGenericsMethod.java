package com.java.generics;

public class bNoGenericsMethod {

        public void printArray( int[] arr){
            for( int element : arr){
                System.out.printf("%s \n",element);
            }
        }

        public void printArray( char[] arr){
            for( char element : arr){
                System.out.printf("%s \n",element);
            }
        }

        public static void main(String[] args){

            int[] intArray = {1,2,3};
            char[] charArray = {'a', 'b'};

            bNoGenericsMethod NoGenericsMethod = new bNoGenericsMethod();
            NoGenericsMethod.printArray(intArray);
            NoGenericsMethod.printArray(charArray);
        }
    }