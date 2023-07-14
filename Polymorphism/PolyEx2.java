package Polymorphism;


//runtime polymorphism method overriding

class RBI{
    public void InterestRates(int r) {
        //System.out.println("Interest rate is:"+r);
    }
}

class SBI extends RBI{
    @Override
    public void InterestRates(int r) {
        System.out.println("SBI Interest rate is: "+r);
    }
}
class PNB extends RBI{
    @Override
    public void InterestRates(int r) {
        System.out.println("PNB Interest rate is: "+r);
    }
}
class UB extends RBI{
    @Override
    public void InterestRates(int r) {
        System.out.println("UB Interest rate is: "+r);
    }
}
public class PolyEx2 {
    public static void main(String[] args){
        SBI s= new SBI();
        PNB p= new PNB();
        UB u= new UB();
        s.InterestRates(8);
        p.InterestRates(9);
        u.InterestRates(7);
    }
}
