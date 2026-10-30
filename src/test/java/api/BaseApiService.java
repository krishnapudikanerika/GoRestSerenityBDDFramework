package api;

import io.restassured.specification.RequestSpecification;
import utils.ConfigReader;

import static io.restassured.RestAssured.given;

public class BaseApiService {

    public RequestSpecification request() {

        return given()
                .header(
                        "Authorization",
                        "Bearer "
                                + ConfigReader.get("token")
                )
                .contentType("application/json");
    }
}