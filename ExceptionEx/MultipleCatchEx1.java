package ExceptionEx;


/* When declaring multiple catch blocks order for catch is the most specific AE,AIOB to most general expection class*/
public class MultipleCatchEx1 {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("This program has multiple catch blocks");
        try {
            a[5]=12/0;     //calculating from right to left so first checks 12/0

          }
        //this is the most specific exception
       catch(ArithmeticException A){
            System.out.println(A.getMessage());
            try {
            System.out.println("This is try block inside the catch block");
                a[5] = 12;
            }
            catch(ArrayIndexOutOfBoundsException a1){
                System.out.println(a1.fillInStackTrace());
                a[0]=12;
            }
        }
        catch(ArrayIndexOutOfBoundsException A){
            System.out.println(A.toString());
        }
        catch(NullPointerException N){
            System.out.println(N.fillInStackTrace());
        }
        //this is just like for default handling for other than these exceptions
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This Finally blocks executes even if exception was not handled");
            for(int i=0;i<a.length-1;i++) {
                System.out.println(a[i]);
            }
        }
    }
}

