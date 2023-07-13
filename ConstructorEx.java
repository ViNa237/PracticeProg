package oopsconcepts;

public class ConstructorEx {
    int empid;
    String empname,dept;

    //default Construcor with no specifier and return type
    ConstructorEx(){

        System.out.println("This is default constructor with no return type");
    }

    //Parameterized Constructor no return type
    public ConstructorEx(int empid, String empname){

        System.out.println("This is parameterized constructor with no return type");
        this.empid=empid;
        this.empname=empname;
    }

    //copy constructor initializes from one object to the other object
    public ConstructorEx(ConstructorEx c){
        empid=c.empid;
        empname=c.empname;
        System.out.println("This is copy constructor");
    }
    //normal method with no specifier
    void show(){

        //
        // System.out.println("This is a normal method calling using object reference ");
        System.out.println("Values of the parameterized constructor are :"+this.empid+", " +this.empname);
    }

    //static method
    static void display(){
        System.out.println("This is a static method can be called directly");
    }

    public static void main(String[] args){

        ConstructorEx c1= new ConstructorEx();
        ConstructorEx c2= new ConstructorEx(10101,"Jake");
        ConstructorEx c3= new ConstructorEx(c2);
        c2.show();
        c3.show();
        display();
    }
}
