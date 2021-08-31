/* 
Threads with Runnable interface

Oops you cant use currentThread().getName() method or start() in child class.
Because we are not extending from Thread class

But how can we do this without start() from Thread class ?
Well, we cant. So we need a intance from Thread class and pass our.
(Since Thread class has multipe contructors its okay)

Summanry:

If you implment from Runnable, Runnable doenst have start() to invoke
So you have to create an instance from Threrad class and pass the runnble
into that.

*/

class Printer implements Runnable {

	public void run(){
    	for(int i=0; i<100; i++){
       		System.out.println("child "+Thread.currentThread().getName()+" "+i);
    	}
    }
}


public class Main{

	public static void main(String[] args){
    
    	Printer printer = new Printer();
        
        Thread thread = new Thread(printer);
        thread.start();
        
        for(int i=0; i<10; i++){
    		System.out.println("main "+Thread.currentThread().getName()+" "+i);
        }
    }
}