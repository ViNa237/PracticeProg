
abstract class MyTest{
    MyTest(){
        System.out.println("\nThis is default constructor from super abstract class");
    }
    abstract void calculate(int a,int b);

    //final methods can not be modified
    final public void display(){
        System.out.println("This is method from abstract class");
    }

}
class Addition extends MyTest {
    Addition(){
        System.out.println("\nDefault constructor of Addition class");
    }
    public void calculate(int a, int b) {
        System.out.println("The addition of two numbers is:"+(a + b));
    }
}
class Subtraction extends MyTest {
    Subtraction(){
        System.out.println("\nDefault constructor of Subtraction class");
    }
    public void calculate(int a, int b) {
        System.out.println("The addition of two numbers is:"+(a - b));
    }

}
class Multiplication extends MyTest {
    Multiplication(){
        System.out.println("\nDefault constructor of Multiplication class");
    }
    public void calculate(int a, int b) {
        System.out.println("The addition of two numbers is:"+(a * b));
    }

}
public class AbstractEx {
    public static void main(String[] args){
        MyTest m=new Addition();
        // parent abstract class default constructor will be called first and then child class default constructor
        // Parent abstract class methods using child ref
        m.display();
        m.calculate(203,306);

        Subtraction s=new Subtraction();
        s.calculate(568,124);
        s.display();

        Multiplication m1=new Multiplication();
        m.calculate(568,124);

    }
}
