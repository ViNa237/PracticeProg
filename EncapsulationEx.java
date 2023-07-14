package EncapsulationEx;
import java.util.Scanner;
//encapsulated class
class Employee{
    private int Empid;
    private String Empname;
    private String Empcity;
    private int Empsalary;

    //not allowed to set pin
    private int EMPPIN=12243;

    public void setEmpid(int Empid) {
        this.Empid = Empid;
    }

    public void getEmpid() {

        System.out.println("The employee id is:" +Empid);
    }
    public void getEmpname() {
        System.out.println("The employee name is:" +Empname);
    }

    public void setEmpname(String Empname) {
        this.Empname = Empname;
    }

    public void getEmpcity() {
        System.out.println("The employee city is:" +Empcity);

    }

    public void setEmpcity(String Empcity) {
        this.Empcity = Empcity;
    }

    public void getEmpsalary() {
      System.out.println("The employee salary is:"+Empsalary);
    }

    public void setEmpsalary(int Empsalary) {
        this.Empsalary = Empsalary;
    }

    public void getEMPPIN() {
        Scanner s1=new Scanner(System.in);
        System.out.println("\nEnter your verification code:");
        int i= s1.nextInt();
        if(i==123) {
            System.out.println("The employee pin is: " + EMPPIN);
        }
        else System.out.println("You are not authorized");
    }
}

public class EncapsulationEx {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpid(10101);
        e.setEmpname("Jake");
        e.setEmpcity("CA");
        e.setEmpsalary(92000);
        e.getEmpid();
        e.getEmpname();
        e.getEmpcity();
        e.getEmpsalary();
        e.getEMPPIN();
        //e.setEMPPIN(); not possible
    }
}
