package Multithreading;


    class MyThread3 extends Thread
    {
        public void run()
        {
            try
            {
                for(int i=0;i<10;i++)
                {
                    System.out.println("I am a child thread");
                    Thread.sleep(2000);
                    /*when it goes to sleep mainthread call interrupt child thread,then try raises Exception and exits
                    and catch block gets the Ex and executes and exits the child thread*/
                }
            }
            catch(InterruptedException ie)
            {
                System.out.println("I got Interrupted");
            }
        }
    }

public class InterruptedDemo
    {
        public static void main(String[] args)
        {
            MyThread3 t=new MyThread3();
            t.start();
            t.interrupt();  //this excecuted by main thread
            System.out.println("End of main thread");
        }
    }


