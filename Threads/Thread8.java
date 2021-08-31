// when the main threads finishes its job child thread doest end
class Printer extends Thread {

 	public void start(){
         super.start();
    }

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
        
        System.out.println("==========================================");
    }
}



