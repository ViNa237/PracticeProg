package oopsconcepts;

public class BankingEx {
    int account_number, balance,deposit,withdraw;
    String account_name,branch_location;
    public void display(int account_number,String account_name,String branch_location){
        this.account_number=account_number;
        this.account_name=account_name;
        this.branch_location=branch_location;
        System.out.println("The account number is :" +account_number+
                           "\nThe account holder name is :" +account_name+
                            "\nThe branch location is :" +branch_location);
    }
    public void showbalance(int bal){
        balance=bal;
        System.out.println("The balance amount is :$"+balance);
    }

    public void deposit(int deposit){
       balance=deposit+balance;
        System.out.println("The balance after deposit of $"+deposit+" is :"+balance);
    }
    public void setWithdraw(int withdrawl){

        if(balance< withdrawl){
            System.out.println("No sufficient funds");
        }
        if(balance>=withdrawl){
            this.withdraw=balance-withdrawl;
        }
        System.out.println("The balance after withdraw of $"+withdrawl+" is :"+withdraw);
    }

    public static void main(String[] args){
        BankingEx b1= new BankingEx();
        b1.display(12345,"John","NY");
        b1.showbalance(25000);
        b1.deposit(10000);
        b1.setWithdraw(15000);
    }
}
