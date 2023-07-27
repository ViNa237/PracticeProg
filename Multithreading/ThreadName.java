package Multithreading;

/* To know Current executing thread object*/
class MyThread extends Thread{
 public void run(){
     System.out.println("The child thread name is:"+Thread.currentThread().getName());
 }
}
public class ThreadName {
    public static void main(String[] args){
        MyThread t=new MyThread();
        t.start();
        System.out.println("The main thread name is:"+Thread.currentThread().getName());
        Thread.currentThread().setName("MyownThread");
        System.out.println("The new thread name is:"+Thread.currentThread().getName());
    }
}
