package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

//the BDD framework uses given when then keywords to do testing
public class RestAssuredBDDEx {
public static void main(String[] args){
    RestAssured.given().log().all()
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
                    .contentType(ContentType.JSON)
            .when()
                     .post()
            .then()
                     .statusCode(200);
}
}
