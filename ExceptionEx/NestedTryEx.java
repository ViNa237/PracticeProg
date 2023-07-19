package ExceptionEx;

public class NestedTryEx {
    public static void main(String[] args){
        try{
            System.out.println("This is the first try block for AE");
            //int a = 125/0;
                try{
                    System.out.println("This is the second try block for AIOB");
                    int b[]=new int[5];
                    //System.out.println("value at b[10] :"+b[10]);
                        try{
                            System.out.println("This is the third try block for NullPointer ex");
                            String s=null;
                            System.out.println(s.length());
                        }
                        catch(ArrayIndexOutOfBoundsException A){
                            System.out.println("Catch block for inner try block");
                            System.out.println(A);
                            System.out.println("Statements after inner catch block");
                        }

                } catch(ArithmeticException A){
                    System.out.println("Catch block for second try block");
                    System.out.println(A);
                }

        } catch(Exception e){
            System.out.println("Catch block for outer try block,if no corresponding catch exception found" +
                    "so automatically this outer catch block will be executed ");
            System.out.println(e);
            System.out.println("Statements after outer catch exception printed");
        }
        finally{
            System.out.println("\n This is finally block");
        }
    }

}
