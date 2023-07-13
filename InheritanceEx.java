package oopsconcepts;

class Vehicle{

    protected String color,type;
    protected double price;
    protected boolean newOne;
    public int m,c;
    // protected variables can be used with in the same package and to all the child classes in outside package

    public void vehicleType(String type){
        this.type = type;
        System.out.println("Vehicle type is : Motor or Pulled? "+type );
    }
    public void color(String color){
        this.color=color;
        System.out.println("Vehicle color is :  "+color );
    }
    public void price(double price){
        this.price=price;
        System.out.println("Vehicle price is : "+price );

    }
    public void isNew(boolean newOne){
        this.newOne=newOne;
        System.out.println("Vehicle price is : "+newOne );

    }
}
class Automobiles extends Vehicle{
    public void display() {
        System.out.println("This is about Automobiles");
    }
}
class car extends  Automobiles{
    public void setMilage(int milage){
        m=milage;
        System.out.println("Car Milage is : "+m );
    }
}
class bus extends  Automobiles {
    public void capacity(int capacity) {
        c = capacity;
        System.out.println("Bus Capacity is : " + c);
    }
}

    public class InheritanceEx {
        public static void main(String[] args){
            Automobiles a= new Automobiles();
            a.display();
            a.vehicleType("Car");
            a.color("Blue");
            a.isNew(true);
            car c= new car();
            c.setMilage(20500);
            bus b= new bus();
            b.vehicleType("Bus");
            b.capacity(90);

            Automobiles a1=new car();
            a1.display();

            Automobiles a2=new Automobiles();
            // a2.capacity(100); can not access child class methods from super class
        }
    }
