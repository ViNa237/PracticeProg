package ExceptionEx;

public class FinallyEx {
    public static void main(String[] args){
        try{
            System.out.println("This is try block");
            int a=200/0;
        }
        catch (ArithmeticException A){
            System.out.println(A);
        }
        finally{
            System.out.println("Finally block will be executed whether exceptions handled or not");
            System.out.println("All the important terminations have to keep in finally block");
            System.out.println("Like DB connections to close");
        }
    }
}
