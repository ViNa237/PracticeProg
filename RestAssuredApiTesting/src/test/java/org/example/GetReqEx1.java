package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;


public class GetReqEx1 {
    public static void main(String[] args){
        RestAssured.given().log().all()
                    .baseUri("https://restful-booker.herokuapp.com/")
                    .basePath("booking/{id}")
                    .pathParam("id",1)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }
}
