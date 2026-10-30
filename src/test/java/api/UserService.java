package api;

import constants.Endpoints;
import io.restassured.response.Response;
import models.User;
import utils.ConfigReader;
import utils.LogUtils;

import static io.restassured.RestAssured.given;

public class UserService {

    private final String baseUrl =
            ConfigReader.get("api.base.url");

    private final String token =
            ConfigReader.get("token");

    public Response createUser(User user) {

        String url = baseUrl + Endpoints.USERS;

        LogUtils.step("CREATE USER API");

        LogUtils.logRequest(
                "POST",
                url,
                user);

        Response response =
                given()
                        .header(
                                "Authorization",
                                "Bearer " + token)
                        .contentType("application/json")
                        .body(user)
                        .post(url);

        LogUtils.logResponse(response);

        return response;
    }

    public Response getUser(int userId) {

        String url =
                baseUrl +
                        String.format(Endpoints.USER_BY_ID,
                                userId);

        LogUtils.step("GET USER API");

        LogUtils.logRequest(
                "GET",
                url,
                null);

        Response response =
                given()
                        .header(
                                "Authorization",
                                "Bearer " + token)
                        .get(url);

        LogUtils.logResponse(response);

        return response;
    }


    public Response deleteUser(int userId) {

        String url =
                baseUrl +
                        String.format(
                                Endpoints.USER_BY_ID,
                                userId);

        LogUtils.step("DELETE USER API");

        LogUtils.logRequest(
                "DELETE",
                url,
                null);

        Response response =
                given()
                        .header(
                                "Authorization",
                                "Bearer " + token)
                        .delete(url);

        LogUtils.logResponse(response);

        return response;
    }

    public Response updateUser(int userId, User user) {

        String url =
                baseUrl +
                        String.format(
                                Endpoints.USER_BY_ID,
                                userId);

        LogUtils.logRequest(
                "PUT",
                url,
                user);

        Response response =

                given()
                        .header(
                                "Authorization",
                                "Bearer " + token)
                        .contentType("application/json")
                        .body(user)
                        .when()
                        .put(url);

        LogUtils.logResponse(response);

        return response;
    }

}