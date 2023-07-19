package HAS_A_Example;

public class Student {
    void show(int id, Name i,Address j){
        System.out.println("Student id is: " +id);
        System.out.println("First Name :"+i.FirstName);
        System.out.println("Middle Name :"+i.MiddleName);
        System.out.println("Last Name :"+i.LastName);

        System.out.println("    Student Address is ");
        System.out.println("Street Name :"+j.StreetName);
        System.out.println("House Number :"+j.HouseNumber);
        System.out.println("City Name :"+j.CityName);
        System.out.println("State Name :"+j.StateName);
        System.out.println("Zipcode :"+j.Zipcode);

    }

    public static void main(String[] args){
        Student s= new Student();
        Name n= new Name("Neel","","Buvanagiri");
        Address a=new Address("PineCreeckRd","1242A","Springs","CO",84201);
        s.show(15242,n,a);
    }
}
