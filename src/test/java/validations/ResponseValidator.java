package validations;

import io.restassured.response.Response;
import org.junit.Assert;

public class ResponseValidator {

    public static void validateStatusCode(
            Response response,
            int expectedStatusCode) {

        Assert.assertEquals(
                "Status Code Validation Failed",
                expectedStatusCode,
                response.getStatusCode()
        );
    }

    public static void validateUserName(
            Response response,
            String expectedName) {

        Assert.assertEquals(
                expectedName,
                response.jsonPath()
                        .getString("name")
        );
    }

    public static void validateUserEmail(
            Response response,
            String expectedEmail) {

        Assert.assertEquals(
                expectedEmail,
                response.jsonPath()
                        .getString("email")
        );
    }

    public static void validateUserId(
            Response response) {

        Assert.assertNotNull(
                response.jsonPath()
                        .get("id")
        );
    }
}