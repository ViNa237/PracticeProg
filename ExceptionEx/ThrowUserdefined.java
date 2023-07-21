package ExceptionEx;

import java.util.Scanner;

//user defined exceptions MUST extend throwable class

class ThrowUserDefinedEx extends Exception{
    public ThrowUserDefinedEx(String s){
        super(s);
    }
}
public class ThrowUserdefined {
    int balance = 15000;
       void withDraw(int amount) {
          try {
            if (amount > balance) {
                System.out.println("This is user defined exception checking:");
                throw new ThrowUserDefinedEx("Insuffiecient funds");
            }
        } catch (ThrowUserDefinedEx e) {
            System.out.println(e);
        }
    }
        public static void main (String[]args){
            ThrowUserdefined t = new ThrowUserdefined();
            t.withDraw(20000);
            System.out.println("This is main");
        }
}


