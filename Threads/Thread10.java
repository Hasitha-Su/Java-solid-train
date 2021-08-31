/* 
Threads class and its contructors


 
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