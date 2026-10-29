package steps;

import api.UserApi;
import io.restassured.response.Response;
import models.User;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import testdata.UserFactory;
import utils.TestContext;

public class ApiSteps {

    UserApi userApi = new UserApi();

    Response response;

    @Step
    public void createUser() {

        User user = UserFactory.createUser();

        TestContext.userName = user.getName();
        TestContext.userEmail = user.getEmail();

        response = userApi.createUser(user);

        TestContext.userId =
                response.jsonPath().getInt("id");
    }

    @Step
    public void verifyUserCreated() {

        Assert.assertEquals(
                201,
                response.getStatusCode()
        );
    }

    @Step
    public void getUser() {

        response = userApi.getUser(
                TestContext.userId
        );
    }

    @Step
    public void verifyUserRetrieved() {

        Assert.assertEquals(
                200,
                response.getStatusCode()
        );
    }

    @Step
    public void updateUser() {

        User user = UserFactory.createUser();

        user.setName("Updated Krishna");

        response = userApi.updateUser(
                TestContext.userId,
                user
        );
    }

    @Step
    public void verifyUserUpdated() {

        Assert.assertEquals(
                200,
                response.getStatusCode()
        );
    }

    @Step
    public void deleteUser() {

        response = userApi.deleteUser(
                TestContext.userId
        );
    }

    @Step
    public void verifyUserDeleted() {

        Assert.assertEquals(
                204,
                response.getStatusCode()
        );
    }
}