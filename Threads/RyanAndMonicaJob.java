class BankAccount {

    private int acc_balance = 100;

    public int getBalance() {
        return acc_balance;
    }

    public void withdraw(int amount) {
        acc_balance = acc_balance - amount;
    }
}

public class RyanAndMonicaJob implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {

        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);

        one.setName("Ryan");
        two.setName("Monica");

        one.start();
        two.start();

    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            makeWithdraw(10);

            if (account.getBalance() < 0) {
                System.out.println("Overdrawn");
            }
        }
    }

    public void makeWithdraw(int amount) {

        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");

            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(Thread.currentThread().getName() + " woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completed the withdraw");

        } else {
            System.out.println("Sorry no enough money for " + Thread.currentThread().getName());
        }
    }
}