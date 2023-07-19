package ExceptionEx;

//if there are multiple statements in the try block
public class TestEx1 {
    public static void main(String[] args){
        System.out.println("If try block has multiple lines of code");
        try{
            System.out.println("These all are three statements in try block");
            System.out.println("Statement 1");
            System.out.println(100/0);
            System.out.println("Statement3");
        }
        catch(ArithmeticException e){
            System.out.println("This is Arthematic Exception and it is a runtime Exception");
        }
        System.out.println("All the statements after the exception got ignored in try block");
    }
}

