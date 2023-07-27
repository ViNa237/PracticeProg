package Multithreading;


public class DaemonThreadDemo extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("This is a Daemon Thread ");
        }
        else System.out.println("This is user thread");

    }
    public static void main(String[] args) {
        DaemonThreadDemo t1 = new DaemonThreadDemo();
        DaemonThreadDemo t2 = new DaemonThreadDemo();
        DaemonThreadDemo t3 = new DaemonThreadDemo();
        t1.setDaemon(true);
        //Before start() only we can set the thread as daemon
        t1.start();  t1.setName("Daemon Thread");
        System.out.println(t1.getPriority());
        t2.start();
        System.out.println(t2.getPriority());
        t3.start();
        System.out.println("End of main thread");
    }
}
