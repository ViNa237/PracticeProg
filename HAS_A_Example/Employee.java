package HAS_A_Example;

public class Employee {
    void display(int EmpId,Name n,Address a){
        System.out.println("Employee id is : "+EmpId);

        System.out.println("First Name :"+n.FirstName);
        System.out.println("Middle Name :"+n.MiddleName);
        System.out.println("Last Name :"+n.LastName);

        System.out.println("    Employee Address is ");
        System.out.println("Street Name :"+a.StreetName);
        System.out.println("House Number :"+a.HouseNumber);
        System.out.println("City Name :"+a.CityName);
        System.out.println("State Name :"+a.StateName);
        System.out.println("Zipcode :"+a.Zipcode);
    }

    public static void main(String[] args){
        Employee e= new Employee();
        Name N= new Name("John","Mike","Stock");
        Address A=new Address("SouthParkerRd","3243","Denver","CO",80014);
        e.display(12012,N,A);
    }
}
