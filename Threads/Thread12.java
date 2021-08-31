class Child implements Runnable{
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("child: "+ Thread.currentThread().getName() +" "+i);
            
            try{
                Thread.sleep(250);
            } catch(InterruptedException e){
                System.out.println("Interrupted Exception"+e);
            }
        }
    }
}
 
class Thread12 {
    public static void main(String[] args) throws InterruptedException {
        
        Child thread2 = new Child();
        Thread thread = new Thread(thread2);
        
        thread.start();
        
        try{
            // main thread decides to stay untill child thread completes
            //thread.join();
            
            // main thread stays only 5 secs 
            thread.join(5000);
        }
        
        /* join() will put the current thread on wait until the thread on which it is called is dead. If thread is interrupted then it will throw InterruptedException. */
        catch(InterruptedException e){
            System.out.println("Interrupted Exception"+e);
        }
        
        for(int i=0; i<50; i++){
            System.out.println("main: "+ Thread.currentThread().getName() +" "+i);
        }
        
        System.out.println("====================================================");
    }
}