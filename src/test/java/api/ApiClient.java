package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiClient {

    public Response post(
            String endpoint,
            Object body) {

        return given()
                .contentType("application/json")
                .body(body)
                .post(endpoint);
    }

    public Response get(
            String endpoint) {

        return given()
                .get(endpoint);
    }

    public Response delete(
            String endpoint) {

        return given()
                .delete(endpoint);
    }
}