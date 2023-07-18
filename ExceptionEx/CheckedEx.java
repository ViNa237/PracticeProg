package ExceptionEx;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedEx {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Checked Exceptions are checked by the compiler,The file may not exist");
        PrintWriter pw=new PrintWriter("abc.txt");  // the exception was thrown
        pw.write("Compiler checks whether programmer handled exception or not,it must be thrown ");
    }
}
