package api;

import io.restassured.response.Response;
import models.User;

import static io.restassured.RestAssured.given;

public class UserApi {

    private static final String TOKEN = "32c3e745df9df2ecbec83fe789dc01f31611cf6c4fb1b02f3b24ee9395a27d7b";

    public Response createUser(User user) {

        return given()
                .header("Authorization", "Bearer " + TOKEN)
                .contentType("application/json")
                .body(user)
                .post("https://gorest.co.in/public/v2/users");
    }

    public Response getUser(int userId) {

        return given()
                .header("Authorization", "Bearer " + TOKEN)
                .get("https://gorest.co.in/public/v2/users/" + userId);
    }

    public Response updateUser(int userId, User user) {

        return given()
                .header("Authorization", "Bearer " + TOKEN)
                .contentType("application/json")
                .body(user)
                .put("https://gorest.co.in/public/v2/users/" + userId);
    }

    public Response deleteUser(int userId) {

        return given()
                .header("Authorization", "Bearer " + TOKEN)
                .delete("https://gorest.co.in/public/v2/users/" + userId);
    }
}