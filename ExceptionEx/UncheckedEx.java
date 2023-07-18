package ExceptionEx;
import java.io.*;
public class UncheckedEx {
    public static void main(String[] args)  {
        System.out.println("Unchecked exceptions are not checked by the compiler they were checked at runtime");
        try {
            System.out.println(120 / 0);
        }
        catch(ArithmeticException e){
            System.out.println("/0 can not be calculated");
        }
        System.out.println("These exceptions are runtime exceptions and all these are not checked by the compiler");
    }
}
