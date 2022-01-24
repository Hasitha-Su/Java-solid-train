/*

javac Zoo.java 

java Zoo arg_1 arg_2
java Zoo "arg 1" arg_2
java Zoo arg_1 2

java Zoo arg_1

*/

public class Zoo {
    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}