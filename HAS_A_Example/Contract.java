package HAS_A_Example;

public class Contract {
    private Name N;
    private Address A;
    //private Date D;

    public Contract(Name name, Address add, Date date){
        N=name;
        A=add;
        //D=date;
        System.out.println("Employee details are : ");

        System.out.println("First Name :"+N.FirstName);
        System.out.println("Middle Name :"+N.MiddleName);
        System.out.println("Last Name :"+N.LastName);

        System.out.println("    Employee Address is ");
        System.out.println("Street Name :"+A.StreetName);
        System.out.println("House Number :"+A.HouseNumber);
        System.out.println("City Name :"+A.CityName);
        System.out.println("State Name :"+A.StateName);
        System.out.println("Zipcode :"+A.Zipcode);
        System.out.println("Date of joining is :" +date.month+"/"+date.day+"/"+date.year);

    }

    public static void main(String[] args){
        Name n1=new Name("Billy","Ray","Johnson");
        Address a1=new Address("Oragon rd","2356","Peoria","IL",61611);
        Date d1=new Date(2,25,2016);

        Contract c1=new Contract(n1,a1,d1);
    }

}
