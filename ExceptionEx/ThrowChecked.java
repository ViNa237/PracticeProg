package ExceptionEx;


import java.io.FileNotFoundException;
import java.io.FileReader;

//checked exceptions must be handled by the try,catch
public class ThrowChecked {
    void CheckedEx() throws FileNotFoundException {
        System.out.println("This is inside the method");
        FileReader f=new FileReader("abc.txt");
        throw new FileNotFoundException();
        /* after this line catch is going to execute,throw is used to pass exception to JVM explicitly*/
        //System.out.println("Throw have to be the last line");
    }
    public static void main(String[] args){
        ThrowChecked t=new ThrowChecked();
        try{
            System.out.println("This is try block");
            t.CheckedEx();
            //the method will be called
        }
        catch (FileNotFoundException e){
            System.out.println("This is catch block");
            System.out.println(e.fillInStackTrace());
        }
    }
}
