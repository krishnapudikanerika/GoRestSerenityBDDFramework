package validations;

import io.restassured.response.Response;
import org.junit.Assert;

public class ResponseValidator {

    public static void validateStatusCode(
            Response response,
            int expectedCode) {

        Assert.assertEquals(
                "Status Code Validation Failed",
                expectedCode,
                response.getStatusCode()
        );
    }

    public static void validateUserCreated(
            Response response,
            String userName,
            String email) {

        Assert.assertNotNull(
                response.jsonPath().get("id"));

        Assert.assertEquals(
                userName,
                response.jsonPath()
                        .getString("name"));

        Assert.assertEquals(
                email,
                response.jsonPath()
                        .getString("email"));
    }
}