package com.java.generics;
/**
 * with bounty type parameters we can set limitations for the T(generics type)
 * limitations say only these types are excepted for generics
 * all double, int extends number class so we can limit T to classes that extend Number
 */
public class bGenericsClass<T extends Number> {
    int a;
    T b; //attribute from generic type

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public static void main(String[] args){
        bGenericsClass<Integer> obj = new bGenericsClass<Integer>();
        obj.setB(5);
        System.out.printf("%s\n", obj.getB());

//        bGenericsClass<String> obj2 = new bGenericsClass<String>();
//        obj2.setB("Nami");
//        System.out.printf("%s\n", obj2.getB());


    }
}
