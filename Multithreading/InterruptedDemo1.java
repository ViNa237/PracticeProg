package Multithreading;

class MyThread4 extends Thread{
      public void run(){
          for(int i=0;i<=2000;i++){
              System.out.println("This is child thread "+i);
          }
          try{
              Thread.sleep(10000);
          }
          catch(InterruptedException e){
              System.out.println("Child thread got an exception");
          }
      }
}
public class InterruptedDemo1 {
    public static void main(String[] args)
    {
       MyThread4 t=new MyThread4();
       t.start();
       t.interrupt();
       System.out.println("This is main thread");
       System.out.println("End of main thread");
    }
}
