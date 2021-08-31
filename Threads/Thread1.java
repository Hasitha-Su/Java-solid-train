class Printer extends Thread {

	// run() in Thread class doesnot do anything
    // so we need a override here
    public void run(){
    	System.out.println("From child thread");
    }
}	
    
class Main1{    
    public static void main(String[] args){
    
		Printer print = new Printer();
    	print.start(); //since start calls run method
    
    	System.out.println("From Main thread");
    }
}


