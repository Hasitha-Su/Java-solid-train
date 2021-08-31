/* 
Remeber Java program terminates when last non-daemon thread terminates

Since the child thread is a daemon thread its terminated once
main thread ended. Program wont wait untill child thread does its task.

Even after main thread ended you might still see some child thread results. 
reason is it has already processed and print takes time.

*/
class Printer extends Thread {

  	public void run(){
         for(int i=0; i<100; i++){
         	System.out.println("From child thread: "+i);
    	}
    }
}	
    
class Main{    
    public static void main(String[] args){
    
		Printer print = new Printer();
        // hey you are a daemon thread now
        print.setDaemon(true);
    	print.start();
           
         for(int i=0; i<10; i++){
    		System.out.println("From Main thread: "+i);
        }
    }
}



