/* 
how thread execute is something that depends on jvm
order could be differ
thread schedular decides which order this goes
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
    	print.start();
        
         for(int i=0; i<10; i++){
    		System.out.println("From Main thread: "+i);
        }
    }
}


