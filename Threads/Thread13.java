import java.math.BigDecimal;

class BankAccount{
    private BigDecimal acc_balance = new BigDecimal("100.00");
    
    public BigDecimal getBalance(){
        return acc_balance;
    }
    
    public void Withdraw(BigDecimal amount){
        acc_balance = acc_balance.subtract(amount)
}

public class RyanAndMonicaJob implements Runnable {
    
    private BankAcount account = new BankAccount();
    
    public static void main( String[] args){
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        
        one.setName("Ryan");
        two.setName("Monica");
        
        one.start();
        two.start();
        
        public void run(){
            for(int i=0; i<10; i++){
                makeWihdraw("10");
            }
        }
        
        public void makeWithdraw(BigDecimal amount){
            
            if(account.getBalance() >= amount){
                System.out.println(Thread.currentThread().getname()+" is about to withdraw");
                
                try{
                    System.out.println(Thread.currentThread().getname()+" is going to sleep");
                    Thread.sleep(5000); 
                    
                }catch(InterruptedException e){
                    System.out.println(e.printStackTrace());
                }
                
                System.out.println(Thread.currentThread().getName()+" woke up");
                account.winthdraw(amount);
                System.out.println(Thread.currentThread().getName+" completed the withdraw");
            
            }else{
                System.out.println("Sorry no enough money for "+Thread.currentThread.getName());
            }
        }
    }
}