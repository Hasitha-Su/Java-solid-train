/*
https://www.youtube.com/watch?v=Bj9Mx_Lx3q4 
https://www.youtube.com/watch?v=to9DPVsdByE
https://www.javatpoint.com/string-pool-in-java
*/

class StringImmute {
    public static void main(String[] args) {

        String fname = "Toby";
        fname = "Andre";
        System.out.println(fname);

        // so, what the hell is string immutability in Java ?

        String first_john = "John";
        String second_john = "John";
        
        String new_john = new String("John");
        
        System.out.println("first_john "+Integer.toHexString(System.identityHashCode(first_john)));
        System.out.println("second_john "+Integer.toHexString(System.identityHashCode(second_john)));
        System.out.println("new_john "+Integer.toHexString(System.identityHashCode(new_john)));
        
        System.out.println("first_john & second_john "+ (first_john == second_john ));
        System.out.println("first_john & new_john "+ (first_john == new_john));
        
    }
}