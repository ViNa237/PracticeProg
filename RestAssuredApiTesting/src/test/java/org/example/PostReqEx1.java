package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;


//to run any test/java files junit dependency is must be added to the pom.xml
@Test
public class PostReqEx1 {
    public static void main(String[] args){
        //this is sample POST request
        RestAssured.given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .body("{\n" +
                        "    \"firstname\" : \"Jim\",\n" +
                        "    \"lastname\" : \"Brown\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .contentType(ContentType.JSON)   //hit the request and get the response
                .post()
                .then()   //validate the response
                .log()
                .all()
                .statusCode(200);
    }
}
