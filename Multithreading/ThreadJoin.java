package Multithreading;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        ChildThread2 t1 = new ChildThread2();
        t1.start(); //After this stmt there will be two threads main,child

        t1.join(); //main thread waits for the child thread execution to be done until run()

        for (int i = 1; i <= 10; i++) {
            System.out.println("This is Main Thread: ");

        }
    }
}
class ChildThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is Child Thread: ");

            try {
                Thread.sleep(2000);   //every time it takes 2sec
            } catch (InterruptedException e) {            }
        }
    }
}
