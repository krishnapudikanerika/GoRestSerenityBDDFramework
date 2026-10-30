package utils;

import io.restassured.RestAssured;

public class RestAssuredConfig {

    public static void initialize() {

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}