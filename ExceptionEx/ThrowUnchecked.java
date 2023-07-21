package ExceptionEx;
import java.util.Scanner;

//for unchecked exceptions it must be thrown or handled using try,catch and we can pass user understandable msg
public class ThrowUnchecked {
     void getaccess(String s) {
         try {
             if (s.isBlank()) {
                 throw new NullPointerException("The username must not empty");
                 //this is unchecked exception and throw should be used inside the method
                 // so that it will compile succesfully. compiler just checks whether it was mentioned or not(i.e.,unchecked)
             }
             else
                 System.out.println("Username: "+s);
         }
             catch(NullPointerException n){
             System.out.println(n);
             }

         }


    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("Enter username");

        String s1=s.nextLine();

        ThrowUnchecked t=new ThrowUnchecked();
        t.getaccess(s1);

    }
}
