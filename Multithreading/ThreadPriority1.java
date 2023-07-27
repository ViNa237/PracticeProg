package Multithreading;

class MyThread1 extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
            System.out.println("The child thread: "+i);
    }
}
public class ThreadPriority1 {
    public static void main(String[] args){
        System.out.println("The main thread default priority is: "+Thread.currentThread().getPriority());
        MyThread1 t1=new MyThread1();
        System.out.println("The child thread priority now is:"+Thread.currentThread().getPriority());
        //but the priority is not supported by some Operating Systems
        //so the child thread will not get setPriority
        Thread.currentThread().setPriority(10);
        t1.start();

        System.out.println("Now the child thread priority is set to 10");
        for(int i=1;i<=10;i++) {
            System.out.println("This is main thread: " + i);
        }
    }
}
