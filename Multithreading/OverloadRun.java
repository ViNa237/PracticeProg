package Multithreading;

public class OverloadRun {
    public static void main(String[] args) {
        ChildThread1 t1 = new ChildThread1();
        t1.start();
        for (int i = 1; i <= 10; i++)
            System.out.println("This job is from Main Thread : " + i);
    }
}
    class ChildThread1 extends Thread{
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("This is job from Child Thread : " + i);
            }
        }


        // by default start method call run() only,The overloaded run method will be ignored
        public void run(int j){
                System.out.println("This is overloaded run method");
            }

}
