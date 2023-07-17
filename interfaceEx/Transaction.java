package interfaceEx;
abstract class Convention implements CreditCard {
    float amt;

    @Override
    public void withdrawrupees(float amt) {
        this.amt = amt;
        if (amt > 0) {
            amt = amt * 80;
            System.out.println("The amount transfer rate from dollars "+this.amt+" to rupees is: " + amt + " Rupees");
        }
    }

    @Override
    public void withdraweuro(float amt) {
        this.amt = amt;
        if (amt > 0) {
            amt = (float) (amt * 0.89);
            System.out.println("The amount transfer rate from dollars "+this.amt+" to Euro is: " + amt + " euros");
        }
    }

}

class Convention1 extends Convention{
        @Override
    public void withdrawpounds(float amt) {
        this.amt=amt;
        if(amt>0){
            amt= (float) (amt*0.76);
            System.out.println("The amount transfer rate from dollars "+this.amt+" to Pound is: "+amt+" pound");
        }
    }
}
public class Transaction{
    public static void main(String[] args){
        //Convention c=new Convention();  abstract method cannot be instantiated
        Convention1 c1=new Convention1();
        c1.withdrawrupees(210.5F);
        c1.withdraweuro(210.5f);
        c1.withdrawpounds(210.5f);
    }

}
