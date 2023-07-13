public class ConstEx{
	
	int empid;
	String empname;
	
	//default Construcor with no specifier and return type
	ConstEx(){
		
		System.out.println("This is default constructor with no return type");
	}
	
	//Parameterized Constructor no return type
	public ConstEx(int empid, String empname){
		
		System.out.println("This is parameterized constructor with no return type");
		this.empid=empid;
		this.empname=empname;
	}
	
	//normal method with no specifier
    void show(){
		
		System.out.println("This is a normal method calling using object reference ");
		System.out.println("Values of the parameterized constructor are :"+this.empid+", " +this.empname);
	}
	
	//static method
	static void display(){
		System.out.println("This is a static method can be called directly");
	}
		
		public static void main(String[] args){
			
			ConstEx c1= new ConstEx();
			ConstEx c2= new ConstEx(10101,"Jake");
			c2.show();
			display();
		}
}
