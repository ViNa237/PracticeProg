import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class Basics {
    public static void  main(String[] args){
        // given - all input details
        //when - Submit the API , all the resource parameters
        //then - Validate the response

        //this is a post request with the body/payload
        RestAssured.baseURI ="https://reqres.in";
        given().body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").log().all()

        .when().post("api/users")   //this resource get concatenated with the base URL
        .then().log().all().statusCode(201);
    }
}
