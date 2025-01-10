package com.piyushdattani.ex_samplecheck;

import io.restassured.RestAssured;

public class APITesting002 {
    public static void main(String[] args) {
        RestAssured
                .given()
                      .baseUri("https://api.zippopotam.us")
                      .basePath("/IN/560016")
                .when()
                   .get()
                .then().log().all().statusCode(200); //log is used for print json response
    }

}
