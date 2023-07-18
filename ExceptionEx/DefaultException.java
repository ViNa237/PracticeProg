package ExceptionEx;

public class DefaultException {
    public static void main(String[] args){
        method1();
    }
    static void method1(){
        method2();
    }
    static void method2(){
        System.out.println(100/0 );
    }
}
