package Multithreading;


class ChildThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("This job is from Child Thread : "+i);
        }
    }
}
public class ThreadEx1 {
    //Every program has main thread
    public static void main(String[] args){
        ChildThread t1=new ChildThread();
        t1.start();
        //After calling start() then only thread will be initialized by calling run() from parent Thread class

        //If we just called t1.run() then it is just a method calling and there would be no initialization of the thread
        for(int i=1;i<=10;i++)
            System.out.println("This job is from Main Thread : "+i);
    }
}

/* There is no guarantee for the output will be the same every time.
   output varies every time
 */