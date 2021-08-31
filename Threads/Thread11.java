/*

Max thread priority is 10
thread priority is not an index. its a value.
So it doesnt start with 0.

Threadds are not ranks
So highest priority is 10 while lowest being 1

Default thread priority is

Main thread created by system has the priority of 5
Any thread created after that inherits the value of parent

if both threads has same priority
*/

class Printer implements Runnable {

  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println("child " + Thread.currentThread().getName() + " " + i);
    }
  }
}

public class Thread11 {

  public static void main(String[] args) {

    Printer printer = new Printer();
    System.out.println("Main before " + Thread.currentThread().getPriority());

    // child threads inherit from main thread
    // Thread.currentThread().setPriority(1);

    // IllegalArgumentException
    // Thread.currentThread().setPriority(11);

    Thread thread = new Thread(printer);
    // thread.setPriority(1);
    // thread.setPriority(10);

    // main thread
    System.out.println("Main Thread Priority:" + Thread.currentThread().getPriority());

    // child thread
    System.out.println("Child Thread Priority: " + thread.getPriority());

    thread.start();

    for (int i = 0; i < 50; i++) {
      System.out.println("main " + Thread.currentThread().getName() + " " + i);
    }
  }
}