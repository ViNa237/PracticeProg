package HAS_A_Example;

public class Address {
    String StreetName;
    String HouseNumber;
    String CityName;
    String StateName;
    int Zipcode;
    public Address(String StreetName,String HouseNumber,String CityName,String StateName,int Zipcode){
        this.StreetName=StreetName;
        this.HouseNumber=HouseNumber;
        this.CityName=CityName;
        this.StateName=StateName;
        this.Zipcode=Zipcode;
    }
}
