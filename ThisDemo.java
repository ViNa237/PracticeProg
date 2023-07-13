public class ThisDemo{
	int id;
	String name;
	public void show(int empid,String empname){
		this.id = empid;
		this.name = empname;
		System.out.println("Employee id is: "+id+"\nEmployee name is : "+name);
	}
	public void showvalues(){

		System.out.println(id+" , "+name);
	}
	public static void main(String[] args){
		ThisDemo t= new ThisDemo();
		t.show(10235, "John");
		t.showvalues();
		}
	}
		
	