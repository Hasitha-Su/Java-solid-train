// you can override start method 
// but that will prevent a thread start
// so lets call parent class start()

// child gets executed immediately

// you can overload run() but Thread class start() will always invoke run() with no arg
class Printer extends Thread {

 	public void start(){
         super.start();
    }

  	public void run(){
         for(int i=0; i<100; i++){
         	System.out.println("From child thread: "+i);
    	}
    }
    
    public void run(int i){
      System.out.println("Here comes overload");
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



